package Modelo;

import include.Academia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ModeloAcademia  extends  Conexion {

    public boolean crearAcademia(Academia i) {
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String sql = "INSERT INTO academia VALUES (?, ?, ?)";
            pst = getConecction().prepareStatement(sql);
            pst.setInt(1, i.getClaveAcade());
            pst.setString(2, i.getNombre());
            pst.setInt(3, i.getDocente_RFC());

            if (pst.executeUpdate() == 1) {
                flag = true;
            }
        } catch (Exception e) {
            System.out.println(e);

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

    public ArrayList<Academia> getAllAcademia() {
        ArrayList<Academia> academia = new ArrayList<>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM academia";
            pst = getConecction().prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                academia.add(new Academia(rs.getInt("Clave"),
                        rs.getString("Nombre"),
                        rs.getInt("Docente_RFC")));
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
        return academia;
    }
    /*
   public static void main(String[] args) {
    ModeloAcademia Aca = new ModeloAcademia();
    System.out.println (Aca.crearAcademia(new Academia(1, "informatica",29)));
    for (Academia i : Aca.getAllAcademia()) {
        System.out.println( i.getClaveAcade());
    }
}*/
}