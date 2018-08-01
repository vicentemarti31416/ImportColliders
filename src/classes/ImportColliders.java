package classes;

import java.util.Date;
//import java.sql.Date; Genera colisión
//import java.sql.*; No se utiliza ya que usamos el fully qualified name

public class ImportColliders {
    
    private static Date date1 = new Date();
    private static Date date2 = new java.sql.Date(0);
    
    public static void main(String[] args) {
        System.out.println("El tipo de date1 es " + date1.getClass());
        System.out.println("El tipo de date2 es " + date2.getClass());
    }
}
