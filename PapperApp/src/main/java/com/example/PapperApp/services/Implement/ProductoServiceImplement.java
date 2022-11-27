
package com.example.PapperApp.services.Implement;

import com.example.PapperApp.dao.ProductoDao;
import com.example.PapperApp.modelo.Producto;
import com.example.PapperApp.services.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ProductoServiceImplement implements ProductoService{
    
    @Autowired
    private ProductoDao productodao;
    
    @Override
    @Transactional(readOnly = false)//Puede modificarlos datos
    public Producto save(Producto producto) {
        return productodao.save(producto);
    }

    @Override
    @Transactional(readOnly = false)//Puede modificarlos datos
    public void delete(Integer id) {
        productodao.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true) //La consulta no modifica los datos
    public Producto findById(Integer id) {
        return productodao.findById(id).orElse(null);

    }

    @Override
    @Transactional(readOnly = true) //La consulta de todos los registros de la lista no modifica los datos
    public List<Producto> findAll() {
        return (List<Producto>) productodao.findAll();

    }  
}
