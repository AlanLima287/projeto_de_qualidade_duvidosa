package dao;

import java.sql.*;
import java.util.*;
import javax.swing.*;
import template.*;

public class DaoRace {

    public List<Race> getList() {
        String sql = "select * from Races";
        List<Race> list = new ArrayList<>();
        try {
            PreparedStatement pst = DBConnection.getPreparedStatement(sql);
            ResultSet result = pst.executeQuery();
            while (result.next()) {
                Race obj = new Race();
                obj.setIdRace(result.getInt("id_race"));
                obj.setName(result.getString("name"));
                obj.setSpecie(result.getString("specie"));
                list.add(obj);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de sintaxe: " + e.getMessage());
        }
        return list;
    }

    public Race select(Integer id){
      String sql = "call selectRace(?)";
        Race obj = new Race();
        try {
            PreparedStatement pst = DBConnection.getPreparedStatement(sql);
            pst.setInt(1, id);
            ResultSet result = pst.executeQuery();
            while (result.next()) {
                obj.setIdRace(result.getInt("id_race"));
                obj.setName(result.getString("name"));
                obj.setSpecie(result.getString("specie"));
                return obj;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de sintaxe: " + e.getMessage());
        }
        return null;
    }

    public boolean save(Race obj) {
        if (obj.getIdRace() == 0) {
            return insert(obj);
        } else {
            return update(obj);
        }
    }

    public boolean insert(Race obj) {
        String sql = "call insertRace(?,?)";
        try {
            PreparedStatement pst = DBConnection.getPreparedStatement(sql);
            pst.setString(1, obj.getName());
            pst.setString(2, obj.getSpecie());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Sucesso");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Erro");
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de sintaxe: " + e.getMessage());
            return false;
        }
    }

    public boolean update(Race obj) {
        String sql = "call updateRace(?,?,?)";
        try {
            PreparedStatement pst = DBConnection.getPreparedStatement(sql);
            pst.setInt(1, obj.getIdRace());
            pst.setString(2, obj.getName());
            pst.setString(3, obj.getSpecie());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Sucesso");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Erro");
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de sintaxe: " + e.getMessage());
            return false;
        }
    }

    public boolean delete(Race obj) {
        String sql = "call deleteRace(?)";
        try {
            PreparedStatement pst = DBConnection.getPreparedStatement(sql);
            pst.setInt(1, obj.getIdRace());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Sucesso");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Erro");
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de sintaxe: " + e.getMessage());
            return false;
        }
    }
}
