
package com.example.pruebanubedos.Controlador;

import com.example.pruebanubedos.Entidad.EntidadesTabla;
import com.example.pruebanubedos.Servicios.ServicioTabla;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conectar")
public class MenuPrincipales {
    
    @Autowired
    ServicioTabla stabla;
    
    @GetMapping("/salto")
    public List<EntidadesTabla> obtenertablas(){
        return stabla.obtenerTabla();
    }
    
    @PostMapping("/datostabla")
    public List<EntidadesTabla>meterdatosTabla(int id, String nombre, String apellido,  int edad){
       EntidadesTabla t = new EntidadesTabla();
       t.setId(id);
       t.setNombre(nombre);
       t.setApellido(apellido);
       t.setEdad(edad);
       
       if(stabla.guardarTabla(t)){
        return stabla.obtenerTabla();
       }
       return null;
    }
    
    @PutMapping("/actualizartabla")
    public List<EntidadesTabla>actualizardatosTabla(int id, String nombre, String apellido,  int edad){
       EntidadesTabla t = new EntidadesTabla();
       t.setId(id);
       t.setNombre(nombre);
       t.setApellido(apellido);
       t.setEdad(edad);
       
       if(stabla.actualizarTabla(t)){
        return stabla.obtenerTabla();
       }
       return null;
    }
    
    
    @DeleteMapping("/eliminartabla")
    public List<EntidadesTabla>elimiardatos(int id){
       EntidadesTabla t = new EntidadesTabla();
      t.setId(id);
       if(stabla.eliminarTabla(t)){
        return stabla.obtenerTabla();
       }
       return null;
    }
    
}
