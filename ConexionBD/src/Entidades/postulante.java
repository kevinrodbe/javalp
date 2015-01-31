package Entidades;
public class postulante {
        private int ID;
        private String APELLIDOP;
        private String APELLIDOM;
        private String NOMBRE;
        private int EDAD;
        private String SEXO;
        private String CARRERA;    

    public postulante() {
    }

    public postulante(int ID,String APELLIDOP, String APELLIDOM, String NOMBRE, int EDAD, String SEXO, String CARRERA) {
        this.ID = ID;
        this.APELLIDOP = APELLIDOP;
        this.APELLIDOM = APELLIDOM;
        this.NOMBRE = NOMBRE;
        this.EDAD = EDAD;
        this.SEXO = SEXO;
        this.CARRERA=CARRERA;
    }

    public int getID() {
        return ID;
    }
    
    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAPELLIDOM() {
        return APELLIDOM;
    }

    public void setAPELLIDOM(String APELLIDOM) {
        this.APELLIDOM = APELLIDOM;
    }

    public String getAPELLIDOP() {
        return APELLIDOP;
    }

    public void setAPELLIDOP(String APELLIDOP) {
        this.APELLIDOP = APELLIDOP;
    }

    public int getEDAD() {
        return EDAD;
    }

    public void setEDAD(int EDAD) {
        this.EDAD = EDAD;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getSEXO() {
        return SEXO;
    }

    public void setSEXO(String SEXO) {
        this.SEXO = SEXO;
    }
    
    public String getCARRERA() {
        return CARRERA;
    }

    public void setCARRERA(String CARRERA) {
        this.CARRERA = CARRERA;
    }
}