package dao;

import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import template.*;

public class DaoConsultation {

    DaoAnimal anm = new DaoAnimal();
    DaoCustomer cus = new DaoCustomer();
    DaoDoctor doc = new DaoDoctor();

    public List<Consultation> getList() {
        String sql = "select * from Consultations";
        List<Consultation> list = new ArrayList<>();
        try {
            PreparedStatement pst = DBConnection.getPreparedStatement(sql);
            ResultSet result = pst.executeQuery();
            while (result.next()) {
                Consultation obj = new Consultation();
                obj.setIdConsultation(result.getInt("id_consultation"));
                obj.setIdAnimal(anm.select(result.getInt("id_animal")));
                obj.setIdDoctor(doc.select(result.getInt("id_doctor")));
                obj.setDate(result.getString("date"));
                obj.setDescription(result.getString("description"));
                list.add(obj);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de sintaxe: " + e.getMessage());
        }
        return list;
    }

    public Consultation select(Integer id) {
        String sql = "call selectConsultation(?)";
        Consultation obj = new Consultation();
        try {
            PreparedStatement pst = DBConnection.getPreparedStatement(sql);
            pst.setInt(1, id);
            ResultSet result = pst.executeQuery();
            while (result.next()) {
                obj.setIdConsultation(result.getInt("id_consultation"));
                obj.setIdAnimal(anm.select(result.getInt("id_animal")));
                obj.setIdDoctor(doc.select(result.getInt("id_doctor")));
                obj.setDescription(result.getString("description"));
                return obj;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de sintaxe: " + e.getMessage());
        }
        return null;
    }

    public boolean save(Consultation obj) {
        if (obj.getIdConsultation() == 0) {
            return insert(obj);
        } else {
            return update(obj);
        }
    }

    public boolean insert(Consultation obj) {
        String sql = "call insertConsultation(?,?,?,?,?)";
        try {
            PreparedStatement pst = DBConnection.getPreparedStatement(sql);
            pst.setInt(1, obj.getIdAnimal().getIdAnimal());
            pst.setInt(2, obj.getIdAnimal().getIdCustomer().getIdCustomer());
            pst.setInt(3, obj.getIdDoctor().getIdDoctor());
            pst.setString(4, obj.getDate());
            pst.setString(5, obj.getDescription());
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

    public boolean update(Consultation obj) {
        String sql = "call updateConsultation(?,?,?,?,?,?)";
        try {
            PreparedStatement pst = DBConnection.getPreparedStatement(sql);
            pst.setInt(1, obj.getIdConsultation());
            pst.setInt(2, obj.getIdAnimal().getIdAnimal());
            pst.setInt(3, obj.getIdAnimal().getIdCustomer().getIdCustomer());
            pst.setInt(4, obj.getIdDoctor().getIdDoctor());
            pst.setString(5, obj.getDate());
            pst.setString(6, obj.getDescription());
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

    public boolean delete(Consultation obj) {
        String sql = "call deleteConsultation(?)";
        try {
            PreparedStatement pst = DBConnection.getPreparedStatement(sql);
            pst.setInt(1, obj.getIdConsultation());
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
