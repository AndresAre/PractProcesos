/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class ProcesoCRUD implements CRUD{
    private File archivo;
    
    public ProcesoCRUD(){
        this.archivo = Singleton.getInstance();
    }
    
    public String registrarProceso(ProcesoDTO x){
        String salida = "";

        FileWriter archEscr;
        try {
            archEscr = new FileWriter(archivo,true);
            BufferedWriter bw = new BufferedWriter(archEscr);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(x.getNombreImagen()+","+x.getPID()+","+x.getNombreSesion()+","+x.getNumSesion()+"\n");
            salida = "Se creo un registro";
            bw.close();
            pw.close();
        } catch (IOException ex) {
            salida="No se pudo crear el registro";
        }
       
        return salida;
    }
    
    @Override
    public String actualizar(ProcesoDTO x){
        Scanner sca = new Scanner(System.in);
        System.out.println("Digite nombre Imagen: ");
        String texto = sca.nextLine();
        x.setNombreImagen(texto);
    }
    
    public String eliminar(ProcesoDTO x){
        
    }

    @Override
    public List<ProcesoDTO> ListarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ProcesoDTO listarById(ProcesoDTO x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
