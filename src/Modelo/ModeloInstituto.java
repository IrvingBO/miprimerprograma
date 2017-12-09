package Modelo;


import include.Instituto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class ModeloInstituto  extends Conexion {


    public boolean crearInstituto(Instituto i) {
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String sql = "INSERT INTO instituto VALUES (?, ?, ?)";
            pst = getConecction().prepareStatement(sql);
            pst.setInt(1, i.getClaveInst());
            pst.setString(2, i.getNombreInst());
            pst.setString(3, i.getDireccionInst());
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

    public ArrayList<Instituto> getAllInstituto() {
        ArrayList<Instituto> institutos = new ArrayList<>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM instituto";
            pst = getConecction().prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                institutos.add(new Instituto(rs.getInt("clave"),
                        rs.getString("Nombre"),
                        rs.getString("Direccion")));
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                if (getConecction() != null) getConecction().close();
                if (pst != null) pst.close();
                if (rs != null) rs.close();
            } catch (Exception e) {

            }
        }
        return institutos;
    }
/*
    public static void main(String[] args) {
        ModeloInstituto ins=  new ModeloInstituto();
        System.out.println (ins.crearInstituto(new Instituto(1, "informatica","29")));
        for (Instituto i : ins.getAllInstituto()) {
            System.out.println( i.getClaveInst());
        }
    }*/
}