package CapaDatos;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import Entidades.postulante;
import Conexion.ConexionBD;
import javax.swing.JLabel;
public class postulanteDAO {
    PreparedStatement  pt=null;
    ResultSet  rs=null;
    Connection  cn=null;
    postulante objPostu = null;
    
    ArrayList lista=null;
    
    public ArrayList getAllPostulantes(){
        try {
            ConexionBD objC=new ConexionBD();
            cn = objC.getConexion();
            pt = cn.prepareStatement("SELECT * FROM POSTULANTE");
            rs = pt.executeQuery();
            lista = new ArrayList();
            while(rs.next()) {
                objPostu = new postulante();
                objPostu.setID(rs.getInt(1));
                objPostu.setAPELLIDOP(rs.getString(2).trim());
                objPostu.setAPELLIDOM(rs.getString(3).trim());
                objPostu.setNOMBRE(rs.getString(4).trim());
                objPostu.setEDAD(rs.getInt(5));
                objPostu.setSEXO(rs.getString(6).trim());
                objPostu.setCARRERA(rs.getString(7).trim());

                lista.add(objPostu);
            }
            pt.close();
            rs.close();
            cn.close();
        }
        catch(SQLException e) {
            System.out.println("PROBLEMS");
        }
        return lista;        
    }
    
    public int agregarPostu(postulante objPostu,JLabel lblmsj){
        int i=-1;
        try {
            ConexionBD  objC=new ConexionBD();
            cn=objC.getConexion();
            pt=cn.prepareStatement("INSERT INTO POSTULANTE VALUES(?,?,?,?,?,?,?)");
            pt.setInt(1,objPostu.getID());
            pt.setString(2,objPostu.getAPELLIDOP().trim());
            pt.setString(3,objPostu.getAPELLIDOM().trim());
            pt.setString(4,objPostu.getNOMBRE().trim());
            pt.setInt(5,objPostu.getEDAD());
            pt.setString(6,objPostu.getSEXO().trim());
            pt.setString(7,objPostu.getCARRERA().trim());
            lblmsj.setText(" POSTULANTE AGREGADO !!");
            i=pt.executeUpdate();
            pt.close();
            cn.close();
        } catch (Exception e)  {
            i=0;
        }            
        return i;
    }       
    
    public int GenerarID(){
        ArrayList list= getAllPostulantes();
        int i=list.size()-1;
        postulante objP;   // = new EmpleadoBean();
        objP = (postulante)list.get(i);
        int id=objP.getID();
        return id+1;
    }
        
    public ArrayList Buscar(int opc,String dato){
        boolean estado=false;
        String sql="";
        switch(opc){
            case 0: JOptionPane.showMessageDialog(null,"ELIJA UNA OPCION !!","ERROR !!",JOptionPane.INFORMATION_MESSAGE);break;
            case 1: int ID=Integer.parseInt(dato);
                    sql="SELECT * FROM POSTULANTE WHERE ID="+ID;break;
            case 2: sql="SELECT * FROM POSTULANTE WHERE APELLIDOP="+"'"+dato+"'";break;
            case 3: sql="SELECT * FROM POSTULANTE WHERE APELLIDOM="+"'"+dato+"'";break;
            case 4: int EDAD=Integer.parseInt(dato);
                    sql="SELECT * FROM POSTULANTE WHERE EDAD="+EDAD;break;
            case 5: sql="SELECT * FROM POSTULANTE WHERE CARRERA="+"'"+dato+"'";break;
        }
        
        try{
            ConexionBD objC=new ConexionBD();
            
            cn = objC.getConexion();
            pt = cn.prepareStatement(sql);
            rs = pt.executeQuery();
            lista = new ArrayList();
            while(rs.next()){
                objPostu = new postulante();
                objPostu.setID(rs.getInt(1));
                objPostu.setAPELLIDOP(rs.getString(2).trim());
                objPostu.setAPELLIDOM(rs.getString(3).trim());
                objPostu.setNOMBRE(rs.getString(4).trim());
                objPostu.setEDAD(rs.getInt(5));
                objPostu.setSEXO(rs.getString(6).trim());
                objPostu.setCARRERA(rs.getString(7).trim());

                lista.add(objPostu);
                estado=true;
            }
            if(!estado)
                JOptionPane.showMessageDialog(null,"EL DATO NO EXISTE !!","ERROR !!",JOptionPane.INFORMATION_MESSAGE);  
                
            pt.close();
            rs.close();
            cn.close();
        } catch(SQLException e){
            System.out.println("problems search..");
        }
        return lista;            
     }
    
    public int GrabarPostuModificado(postulante objPostu){
        int i=-1;
        try {
            ConexionBD  objC=new ConexionBD();
            cn=objC.getConexion();
            pt=cn.prepareStatement("UPDATE POSTULANTE SET APELLIDOP=?,APELLIDOM=?,NOMBRE=?,EDAD=?,SEXO=?,CARRERA=? WHERE ID=?");
            pt.setString(1,objPostu.getAPELLIDOP().trim());
            pt.setString(2,objPostu.getAPELLIDOM().trim());
            pt.setString(3,objPostu.getNOMBRE().trim());
            pt.setInt(4,objPostu.getEDAD());
            pt.setString(5,objPostu.getSEXO().trim());
            pt.setString(6,objPostu.getCARRERA().trim());
            pt.setInt(7,objPostu.getID());
            JOptionPane.showMessageDialog(null,"DATO GRABADO !!","OK !!",JOptionPane.INFORMATION_MESSAGE);  
            i=pt.executeUpdate();
            pt.close();
            cn.close();
        } catch (Exception e) {
            i=0;
        }
        return i;
    }  
    
    public int BorrarPostu(postulante objP){
        int i=-1;
        try {
            ConexionBD  objC=new ConexionBD();
            cn=objC.getConexion();
            pt=cn.prepareStatement("DELETE FROM POSTULANTE WHERE ID=?");            
            pt.setInt(1,objP.getID());
            JOptionPane.showMessageDialog(null,"DATO BORRADO !!","OK !!",JOptionPane.INFORMATION_MESSAGE);  
            i=pt.executeUpdate();
            pt.close();
            cn.close();
        } catch (Exception e)  {
            i=0;
        }
        return i;
    }
            
            
    
//    public boolean validando(postulante objP){
//        boolean estado=true;
//        if(objP.getAPELLIDOP().equals("")){
//            JOptionPane.showInputDialog(null,"ESCRIBA EL APELLIDO PATERNO ","ERROR !!",JOptionPane.INFORMATION_MESSAGE);
//            estado=false;
//        }
//        if(objP.getAPELLIDOM().equals("")){
//            JOptionPane.showInputDialog(null,"ESCRIBA EL APELLIDO MATERNO ","ERROR !!",JOptionPane.INFORMATION_MESSAGE);             
//            estado=false;
//        }
//        if(objP.getNOMBRE().equals("")){
//            JOptionPane.showInputDialog(null,"ESCRIBA EL NOMBRE ","ERROR !!",JOptionPane.INFORMATION_MESSAGE);             
//            estado=false;
//        }
//        if(objP.getEDAD()<15){
//            JOptionPane.showInputDialog(null,"ESCRIBA EDAD MAYOR a 14 ","ERROR !!",JOptionPane.INFORMATION_MESSAGE);             
//            estado=false;
//        }
//        if(objP.getCARRERA().equals("Seleccione una opcion")){
//            JOptionPane.showInputDialog(null,"SELECCIONES UNA CARRERA ","ERROR !!",JOptionPane.INFORMATION_MESSAGE);             
//            estado=false;
//        }
//        return estado;
//    }
}