package CapaDatos;
import java.util.ArrayList;
import Entidades.postulante;
import javax.swing.JTextArea;
import javax.swing.JLabel;
//import javax.swing.JTextField;
//import GUI.Interfaz;
public class PrgPostulante {
    
    public void Grabar(postulante objPostu,JLabel lblmsj){
        postulanteDAO objDAO = new postulanteDAO();
        objDAO.agregarPostu(objPostu,lblmsj);        
    }
    public void Listar(JTextArea txtArea) {
        ArrayList list;
        postulanteDAO objDAO = new postulanteDAO();
        list = objDAO.getAllPostulantes();
        txtArea.setText("");
        String titulo="ID\tAPELlIDOPAT\tAPELLIDOMAT\tNOMBRE\tEDAD\tSEXO\tCARRERA\n"
                + "---------------------------------------------------------------------------------------------------"
                + "----------------------------------------------------------------------\n";
        txtArea.setText(titulo);
        for(int i=0; i<list.size(); ++i) {
            postulante objP;   // = new EmpleadoBean();
            objP = (postulante)list.get(i);
            String linea = 
                           objP.getID()+"\t" +
                           objP.getAPELLIDOP()+"\t"+
                           objP.getAPELLIDOM()+"\t"+
                           objP.getNOMBRE()+"\t"+
                           objP.getEDAD()+"\t"+
                           objP.getSEXO()+"\t"+
                           objP.getCARRERA()+"\n";
            
            txtArea.append(linea);
        }        
    }
    
    public void busqueda(int opc,String dato,JTextArea txtArea){
        ArrayList list;
        postulanteDAO objDAO = new postulanteDAO();
        list=objDAO.Buscar(opc, dato);
        txtArea.setText("");
        String titulo="ID\tAPELlIDOPAT\tAPELLIDOMAT\tNOMBRE\tEDAD\tSEXO\tCARRERA\n"
                + "---------------------------------------------------------------------------------------------------"
                + "----------------------------------------------------------------------\n";
        txtArea.setText(titulo);
        for(int i=0; i<list.size(); ++i) {
            postulante objP;   // = new EmpleadoBean();
            objP = (postulante)list.get(i);
            String linea = 
                           objP.getID()+"\t" +
                           objP.getAPELLIDOP()+"\t"+
                           objP.getAPELLIDOM()+"\t"+
                           objP.getNOMBRE()+"\t"+
                           objP.getEDAD()+"\t"+
                           objP.getSEXO()+"\t"+
                           objP.getCARRERA()+"\n";
            
            txtArea.append(linea);
        }     
    }
    
    public postulante busquedaM(int opc,String dato){
        ArrayList list;  
        postulanteDAO objDAO = new postulanteDAO();
        list=objDAO.Buscar(opc, dato);
        postulante objR=new postulante();
//        Interfaz inter= new Interfaz();
        for(int i=0; i<list.size(); ++i) {
            postulante objP;   // = new EmpleadoBean();
            objP = (postulante)list.get(i);
                           objR.setID(objP.getID());
                           objR.setAPELLIDOP(objP.getAPELLIDOP());
                           objR.setAPELLIDOM(objP.getAPELLIDOM());
                           objR.setNOMBRE(objP.getNOMBRE());
                           objR.setEDAD(objP.getEDAD());
                           objR.setSEXO(objP.getSEXO());
                           objR.setCARRERA(objP.getCARRERA());            
        }        
        return objR;
    }
    
    public void PonerFoto(String dato,JLabel FOTO){
        FOTO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/9999.jpg")));
        String fotex="/Imagenes/"+dato+".jpg";
        FOTO.setIcon(new javax.swing.ImageIcon(getClass().getResource(fotex)));
    }
    
    public void GrabarM(postulante objPos){
        postulanteDAO objDAO = new postulanteDAO();
        objDAO.GrabarPostuModificado(objPos); 
    }
    
    public void Borrar(postulante objPos){
        postulanteDAO objDAO=new postulanteDAO();
        objDAO.BorrarPostu(objPos);        
    }
    
    public int ColocarID(){
        postulanteDAO objDAO = new postulanteDAO();
        int newID=objDAO.GenerarID();
        System.out.println(newID);
        return newID;
    }
//    public boolean validar(postulante objP){
//        postulanteDAO objDAO = new postulanteDAO();
//        boolean estado=objDAO.validando(objP);
//        return estado;
//    }
}