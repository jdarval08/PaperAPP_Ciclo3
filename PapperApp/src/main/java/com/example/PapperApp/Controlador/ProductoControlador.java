package com.example.PapperApp.Controlador;

import com.example.PapperApp.modelo.Producto;
import com.example.PapperApp.services.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/tabla_productos")
public class ProductoControlador {
    
    @Autowired
    private ProductoService productoservice;
    
    @PostMapping(value = "/")
    public ResponseEntity <Producto> agregar (@RequestBody Producto producto){
        Producto obj = productoservice.save(producto);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
    
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Producto> eliminar (@PathVariable Integer id){
        Producto obj = productoservice.findById(id);
        
        if (obj != null){
            productoservice.delete(id);
        }
        
        else{
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
    
    @PutMapping(value = "/")
    public ResponseEntity<Producto> editar (@RequestBody Producto producto){
        Producto obj = productoservice.findById(producto.getIdProducto());
        
        if (obj != null){
            
            obj.setIdProducto(producto.getIdProducto());
            obj.setNombreProducto(producto.getNombreProducto());
            obj.setPrecioProducto(producto.getPrecioProducto());
            obj.setDisponibilidadProducto(producto.getDisponibilidadProducto());
            productoservice.save(obj);
        }
        else{
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
            
        }
        
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
    
    @GetMapping("/list")
    public List<Producto> consultarTodo(){
        return productoservice.findAll();
    }
    
    @GetMapping("/list/{id}")
    public Producto consultarPorId (@PathVariable Integer id){
        return productoservice.findById(id);
    }
 
}
