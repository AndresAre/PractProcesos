/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1;

/**
 *
 * @author Asus
 */
public class ProcesoDTO {
    private String nombreImagen;
    private String nombreSesion;
    private String numSesion;
    private String PID;

    public ProcesoDTO(String nombreImagen, String PID, String nombreSesion, String numSesion) {
        this.nombreImagen = nombreImagen;
        this.nombreSesion = nombreSesion;
        this.numSesion = numSesion;
        this.PID = PID;
    }

    public String getNombreImagen() {
        return nombreImagen;
    }

    public void setNombreImagen(String nombreImagen) {
        this.nombreImagen = nombreImagen;
    }

    public String getNombreSesion() {
        return nombreSesion;
    }

    public void setNombreSesion(String nombreSesion) {
        this.nombreSesion = nombreSesion;
    }

    public String getNumSesion() {
        return numSesion;
    }

    public void setNumSesion(String numSesion) {
        this.numSesion = numSesion;
    }

    public String getPID() {
        return PID;
    }

    public void setPID(String PID) {
        this.PID = PID;
    }


    


    
}
