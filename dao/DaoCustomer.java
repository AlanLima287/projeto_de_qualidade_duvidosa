package dao;

import java.sql.*;
import java.util.*;
import javax.swing.*;
import template.*;

public class DaoCustomer {

    public List<Customer> getList() {
        String sql = "select * from Customers";
        List<Customer> list = new ArrayList<>();
        try {
            PreparedStatement pst = DBConnection.getPreparedStatement(sql);
            ResultSet result = pst.executeQuery();
            while (result.next()) {
                Customer obj = new Customer();
                obj.setIdCustomer(result.getInt("id_customer"));
                obj.setName(result.getString("name"));
                obj.setEmail(result.getString("email"));
                obj.setCpf(result.getString("cpf"));
                obj.setPhone(result.getString("phone"));
                obj.setBirthDate(result.getString("birth_date"));
                list.add(obj);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de sintaxe: " + e.getMessage());
        }
        return list;
    }

    public Customer select(Integer id) {
        String sql = "call selectCustomer(?)";
        Customer obj = new Customer();
        try {
            PreparedStatement pst = DBConnection.getPreparedStatement(sql);
            pst.setInt(1, id);
            ResultSet result = pst.executeQuery();
            while (result.next()) {
                obj.setIdCustomer(result.getInt("id_customer"));
                obj.setName(result.getString("name"));
                obj.setEmail(result.getString("email"));
                obj.setCpf(result.getString("cpf"));
                obj.setPhone(result.getString("phone"));
                obj.setBirthDate(result.getString("birth_date"));
                return obj;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de sintaxe: " + e.getMessage());
        }
        return null;
    }

    public boolean save(Customer obj) {
        if (obj.getIdCustomer() == 0) {
            return insert(obj);
        } else {
            return update(obj);
        }
    }

    public boolean insert(Customer obj) {
        String sql = "call insertCustomer(?,?,?,?,?)";
        try {
            PreparedStatement pst = DBConnection.getPreparedStatement(sql);
            pst.setString(1, obj.getName());
            pst.setString(2, obj.getEmail());
            pst.setString(3, obj.getCpf());
            pst.setString(4, obj.getPhone());
            pst.setString(5, obj.getBirthDate());
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

    public boolean update(Customer obj) {
        String sql = "call updateCustomer(?,?,?,?,?,?)";
        try {
            PreparedStatement pst = DBConnection.getPreparedStatement(sql);
            pst.setInt(1, obj.getIdCustomer());
            pst.setString(2, obj.getName());
            pst.setString(3, obj.getEmail());
            pst.setString(4, obj.getCpf());
            pst.setString(5, obj.getPhone());
            pst.setString(6, obj.getBirthDate());
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

    public boolean delete(Customer obj) {
        String sql = "call deleteCustomer(?)";
        try {
            PreparedStatement pst = DBConnection.getPreparedStatement(sql);
            pst.setInt(1, obj.getIdCustomer());
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
