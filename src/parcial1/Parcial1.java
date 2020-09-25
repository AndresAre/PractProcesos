/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Asus
 */
public class Parcial1 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        try{
            ProcesoCRUD pc = new ProcesoCRUD();
            Process process =  Runtime.getRuntime().exec("tasklist /fo csv");
            BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String resultOfExecution = null;
            while((resultOfExecution = br.readLine()) != null){
                String[] datos=resultOfExecution.split(",");
                System.out.println(""+datos[0]+" "+datos[1]+" "+datos[2]+" "+datos[3]);
                ProcesoDTO pdt = new ProcesoDTO(datos[0],datos[1],datos[2],datos[3]);
                pc.registrarProceso(pdt);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        
        }
    
}
