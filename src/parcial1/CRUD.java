/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1;

import java.util.List;

/**
 *
 * @author Asus
 */
public interface CRUD {
    public String registrarProceso(ProcesoDTO x);
    public String actualizar(ProcesoDTO x);
    public String eliminar(ProcesoDTO x);
    public List<ProcesoDTO>ListarTodos();
    public ProcesoDTO listarById(ProcesoDTO x);
    
}
