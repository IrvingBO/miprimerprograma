package Modelo;

import include.Departamento;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ModeloDepartamento extends Conexion {

    public boolean crearDepartamento(Departamento i) {
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String sql = "INSERT INTO departamento VALUES (?, ?, ?)";
            pst = getConecction().prepareStatement(sql);
            pst.setString(1, i.getNombreDepar());
            pst.setInt(2, i.getEdificio());
            pst.setInt(3, i.getDocente_RFC());
            if (pst.executeUpdate() == 1) {
                flag = true;
            }
        } catch (Exception e) {

        } finally {
            try {
                if (getConecction() != null)
                    getConecction().close();
                if (pst != null)
                    pst.close();
            } catch (Exception e) {

            }
        }
        return flag;
    }

    public ArrayList<Departamento> getAllDepartamento() {
        ArrayList<Departamento> departamentos = new ArrayList<>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM departamento";
            pst = getConecction().prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                departamentos.add(new Departamento(rs.getString("Nombre"),
                        rs.getInt("Edificio"),
                        rs.getInt("Docente_RFC")));

            }

        } catch (Exception e) {

        } finally {
            try {
                if (getConecction() != null) getConecction().close();
                if (pst != null) pst.close();
                if (rs != null) rs.close();
            } catch (Exception e) {
            }
        }
        return departamentos;
    }
/*
    public static void main(String[] args) {
        ModeloDepartamento Depr = new ModeloDepartamento();
        //System.out.println (Depr.crearDepartamento(new Departamento("dfdfs", 2,13)));
        for (Departamento i : Depr.getAllDepartamento()) {
            System.out.println( i.getNombreDepar());
        }
        }*/
    }
