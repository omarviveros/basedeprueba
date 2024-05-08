
package com.example.pruebanubedos.Repositorio;

import com.example.pruebanubedos.Entidad.EntidadesTabla;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioTabla extends JpaRepository <EntidadesTabla, Integer> {
    
}
