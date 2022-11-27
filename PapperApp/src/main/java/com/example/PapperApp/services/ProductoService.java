
package com.example.PapperApp.services;

import com.example.PapperApp.modelo.Producto;
import java.util.List;


public interface ProductoService {
    
    public Producto save(Producto producto);
    public void delete(Integer id);
    public Producto findById (Integer Id);
    public List<Producto> findAll();
    
}
