
package com.example.pruebanubedos.Servicios;

import com.example.pruebanubedos.Entidad.EntidadesTabla;
import com.example.pruebanubedos.Repositorio.RepositorioTabla;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class ServicioTabla {
    
    @Autowired
    RepositorioTabla rtabla;
    
     public List<EntidadesTabla> obtenerTabla(){
    return rtabla.findAll();
    } 
    
    public boolean guardarTabla(EntidadesTabla t){
        boolean respuesta= false;
        try{
            rtabla.save(t);
            respuesta =true;
        }catch(Exception error){
            System.out.println("el error es"+error);
            respuesta=false;
        }
        
        return respuesta;
        
        
    }
    
    public boolean actualizarTabla(EntidadesTabla t){
        boolean respuesta= false;
        try{
            rtabla.save(t);
            respuesta =true;
        }catch(Exception error){
            System.out.println("el error es"+error);
            respuesta=false;
        }
        
        return respuesta;
        
        
    }
    
    
    public boolean eliminarTabla(EntidadesTabla t){
        boolean respuesta= false;
        try{
            rtabla.delete(t);
            respuesta =true;
        }catch(Exception error){
            System.out.println("el error es"+error);
            respuesta=false;
        }
        
        return respuesta;
        
        
    }
    
}
