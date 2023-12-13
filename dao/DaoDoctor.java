package dao;

import java.sql.*;
import java.util.*;
import javax.swing.*;
import template.*;

public class DaoDoctor {

    public List<Doctor> getList() {
        String sql = "select * from Doctors";
        List<Doctor> list = new ArrayList<>();
        try {
            PreparedStatement pst = DBConnection.getPreparedStatement(sql);
            ResultSet result = pst.executeQuery();
            while (result.next()) {
                Doctor obj = new Doctor();
                obj.setIdDoctor(result.getInt("id_doctor"));
                obj.setName(result.getString("name"));
                obj.setEmail(result.getString("email"));
                obj.setExpertise(result.getString("expertise"));
                obj.setCpf(result.getString("cpf"));
                obj.setPhone(result.getString("phone"));
                list.add(obj);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de sintaxe: " + e.getMessage());
        }
        return list;
    }

    public Doctor select(Integer id) {
        String sql = "call selectDoctor(?)";
        Doctor obj = new Doctor();
        try {
            PreparedStatement pst = DBConnection.getPreparedStatement(sql);
            pst.setInt(1, id);
            ResultSet result = pst.executeQuery();
            while (result.next()) {
                obj.setIdDoctor(result.getInt("id_doctor"));
                obj.setName(result.getString("name"));
                obj.setEmail(result.getString("email"));
                obj.setExpertise(result.getString("expertise"));
                obj.setCpf(result.getString("cpf"));
                obj.setPhone(result.getString("phone"));
                return obj;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de sintaxe: " + e.getMessage());
        }
        return null;
    }

    public boolean save(Doctor obj) {
        if (obj.getIdDoctor() == 0) {
            return insert(obj);
        } else {
            return update(obj);
        }
    }

    public boolean insert(Doctor obj) {
        String sql = "call insertDoctor(?,?,?,?,?)";
        try {
            PreparedStatement pst = DBConnection.getPreparedStatement(sql);
            pst.setString(1, obj.getName());
            pst.setString(2, obj.getEmail());
            pst.setString(3, obj.getExpertise());
            pst.setString(4, obj.getCpf());
            pst.setString(5, obj.getPhone());
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

    public boolean update(Doctor obj) {
        String sql = "call updateDoctor(?,?,?,?,?,?)";
        try {
            PreparedStatement pst = DBConnection.getPreparedStatement(sql);
            pst.setInt(1, obj.getIdDoctor());
            pst.setString(2, obj.getName());
            pst.setString(3, obj.getEmail());
            pst.setString(4, obj.getExpertise());
            pst.setString(5, obj.getCpf());
            pst.setString(6, obj.getPhone());
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

    public boolean delete(Doctor obj) {
        String sql = "call deleteDoctor(?)";
        try {
            PreparedStatement pst = DBConnection.getPreparedStatement(sql);
            pst.setInt(1, obj.getIdDoctor());
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
