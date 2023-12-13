package dao;

import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import template.*;

public class DaoAnimal {

    DaoCustomer cus = new DaoCustomer();
    DaoRace rac = new DaoRace();

    public List<Animal> getList() {
        String sql = "select * from Animals";
        List<Animal> list = new ArrayList<>();
        try {
            PreparedStatement pst = DBConnection.getPreparedStatement(sql);
            ResultSet result = pst.executeQuery();
            while (result.next()) {
                Animal obj = new Animal();
                obj.setIdAnimal(result.getInt("id_animal"));
                obj.setIdCustomer(cus.select(result.getInt("id_customer")));
                obj.setName(result.getString("name"));
                obj.setGender(result.getString("gender"));
                obj.setBirthDate(result.getString("birth_date"));
                obj.setIdRace(rac.select(result.getInt("id_race")));
                list.add(obj);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de sintaxe: " + e.getMessage());
        }
        return list;
    }

    public Animal select(Integer id) {
        String sql = "call selectAnimal(?)";
        Animal obj = new Animal();
        try {
            PreparedStatement pst = DBConnection.getPreparedStatement(sql);
            pst.setInt(1, id);
            ResultSet result = pst.executeQuery();
            while (result.next()) {
                obj.setIdAnimal(result.getInt("id_animal"));
                obj.setIdCustomer(cus.select(result.getInt("id_customer")));
                obj.setName(result.getString("name"));
                obj.setGender(result.getString("gender"));
                obj.setBirthDate(result.getString("birth_date"));
                obj.setIdRace(rac.select(result.getInt("id_race")));
                return obj;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de sintaxe: " + e.getMessage());
        }
        return null;
    }

    public boolean save(Animal obj) {
        if (obj.getIdAnimal() == 0) {
            return insert(obj);
        } else {
            return update(obj);
        }
    }

    public boolean insert(Animal obj) {
        String sql = "call insertAnimal(?,?,?,?,?)";
        try {
            PreparedStatement pst = DBConnection.getPreparedStatement(sql);
            pst.setInt(1, obj.getIdCustomer().getIdCustomer());
            pst.setString(2, obj.getName());
            pst.setString(3, obj.getGender());
            pst.setString(4, obj.getBirthDate());
            pst.setInt(5, obj.getIdRace().getIdRace());
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

    public boolean update(Animal obj) {
        String sql = "call updateAnimal(?,?,?,?,?,?)";
        try {
            PreparedStatement pst = DBConnection.getPreparedStatement(sql);
            pst.setInt(1, obj.getIdAnimal());
            pst.setInt(2, obj.getIdCustomer().getIdCustomer());
            pst.setString(3, obj.getName());
            pst.setString(4, obj.getGender());
            pst.setString(5, obj.getBirthDate());
            pst.setInt(6, obj.getIdRace().getIdRace());
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

    public boolean delete(Animal obj) {
        String sql = "call deleteAnimal(?)";
        try {
            PreparedStatement pst = DBConnection.getPreparedStatement(sql);
            pst.setInt(1, obj.getIdAnimal());
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
