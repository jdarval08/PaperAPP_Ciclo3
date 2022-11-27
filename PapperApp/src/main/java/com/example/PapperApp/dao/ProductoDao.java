
package com.example.PapperApp.dao;

import com.example.PapperApp.modelo.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoDao extends CrudRepository<Producto, Integer> {
    
}
