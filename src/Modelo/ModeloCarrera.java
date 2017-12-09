package Modelo;
import include.Carrera;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ModeloCarrera extends  Conexion{

    public boolean crearCarrera(Carrera i){
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String sql = "INSERT INTO carrera VALUES (?, ?)";
            pst = getConecction().prepareStatement(sql);
            pst.setInt(1, i.getClaveCarre());
            pst.setString(2, i.getNombre());

            if (pst.executeUpdate() == 1) {
                flag = true;
            }
        } catch (Exception e){

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


    public ArrayList<Carrera> getAllCarrera(){
        ArrayList<Carrera> carreras = new ArrayList<>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM carrera";
            pst = getConecction().prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()){
                carreras.add(new Carrera(rs.getInt("Clavecarrera"),
                        rs.getString("Nombre")));
            }
        } catch (Exception e) {

        }finally {
            try {
                if(getConecction() != null)getConecction().close();
                if(pst != null)pst.close();
                if(rs !=null)rs.close();
            } catch (Exception e) {

            }
        }
        return carreras;
    }
       /*
    public static void main(String[] args) {
        ModeloCarrera Carre = new ModeloCarrera();
        System.out.println (Carre.crearCarrera(new Carrera(1, "matematicas")));
        for (Carrera i : Carre.getAllCarrera()) {
            System.out.println( i.getClaveCarre());
    }*/

}
