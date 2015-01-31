package Conexion;
import javax.swing.JOptionPane;
import java.sql.*;
public class ConexionBD {
    public Connection  getConexion() {
        Connection  cn=null;
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            cn=DriverManager.getConnection("jdbc:odbc:conexionBD");
            System.out.println("CONEXION CORRECTA !!");
        } catch (Exception e) {
            JOptionPane.showInputDialog(null,"CONEXION INCORRECTA","INFORME",JOptionPane.INFORMATION_MESSAGE);            
        }
        return  cn;
    }
    
    public static void main(String[] args) {
        ConexionBD  objC=new ConexionBD();
        objC.getConexion();
    }    
}