/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author Emmanuel
 */
public class Usuarios {
    int ID;
    String NOMBRES;
    String APELLIDOS;
    String EMAIL;
    String PASSWORD;
    int TIPO_USUARIO;

    public Usuarios() {
    }

    public Usuarios(int ID, String NOMBRES, String APELLIDOS, String EMAIL, String PASSWORD, int TIPO_USUARIO) {
        this.ID = ID;
        this.NOMBRES = NOMBRES;
        this.APELLIDOS = APELLIDOS;
        this.EMAIL = EMAIL;
        this.PASSWORD = PASSWORD;
        this.TIPO_USUARIO = TIPO_USUARIO;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNOMBRES() {
        return NOMBRES;
    }

    public void setNOMBRES(String NOMBRES) {
        this.NOMBRES = NOMBRES;
    }

    public String getAPELLIDOS() {
        return APELLIDOS;
    }

    public void setAPELLIDOS(String APELLIDOS) {
        this.APELLIDOS = APELLIDOS;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public int getTIPO_USUARIO() {
        return TIPO_USUARIO;
    }

    public void setTIPO_USUARIO(int TIPO_USUARIO) {
        this.TIPO_USUARIO = TIPO_USUARIO;
    }
    
    
}
