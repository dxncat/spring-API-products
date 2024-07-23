package org.productos.spring.java.productos2826502.controllers;

import java.util.List;

import org.productos.spring.java.productos2826502.entities.Product;
import org.productos.spring.java.productos2826502.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/products")
public class ProductController {

    private ProductService service = new ProductService();

    //primer endpoint
    //EndPoint: un método en un controlador
    @GetMapping("/saludo")
    public String saludo(){
        return "Hola ... 2826502";
    }
    //segundo endpoint
    //Get: Obtener información sin alterarla
    @GetMapping("/{idproducto}")
    public String findProductByProduct(@PathVariable String idproducto) {
        return "aquí se mostrara el producto No" + idproducto;
    }
    
    @GetMapping
    public List<Product> findAllProducts() {
        return service.findAllProducts();
    }
    
}
