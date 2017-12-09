package Modelo;

import include.CicloEscolar;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ModeloCicloEscolar extends  Conexion {

    public boolean crearCiclo(CicloEscolar i) {
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String sql = "INSERT INTO cicloescolar  VALUES (?, ?)";
            pst = getConecction().prepareStatement(sql);
            pst.setInt(1, i.getClaveCiclo());
            pst.setString(2, i.getNombre());

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

    public ArrayList<CicloEscolar> getAllCiclo() {
        ArrayList<CicloEscolar> Ciclo = new ArrayList<>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM cicloescolar";
            pst = getConecction().prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                Ciclo.add(new CicloEscolar(rs.getInt("Clave"),
                        rs.getString("Nombre")));
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
        return Ciclo;
    }
    /*
    public static void main(String[] args) {
        ModeloCicloEscolar Ciclo = new ModeloCicloEscolar();
        System.out.println(Ciclo.crearCiclo(new CicloEscolar(1, "matematicas")));
        for (CicloEscolar i : Ciclo.getAllCiclo()) {
            System.out.println(i.getClaveCiclo());
        }
    }*/
}
