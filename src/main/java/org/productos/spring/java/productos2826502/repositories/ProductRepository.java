package org.productos.spring.java.productos2826502.repositories;

import java.util.List;

import org.productos.spring.java.productos2826502.entities.Product;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {
    List<Product> products = List.of(
        Product.builder().id(1L).nombre("Silla Reclinable").precio(345000.23).build(),
        Product.builder().id(2L).nombre("Escritorio").precio(200000.48).build(),
        Product.builder().id(3L).nombre("Ventanal").precio(564000.48).build(),
        Product.builder().id(4L).nombre("Cargador tipo c").precio(30000.98).build(),
        Product.builder().id(5L).nombre("Toma corriente 400V").precio(45900.23).build(),
        Product.builder().id(6L).nombre("Candado").precio(30800.21).build(),
        Product.builder().id(7L).nombre("Mochila").precio(71000.48).build()
    );

    //método(comportamiento) para consultar todos los productos del repositorio
    public List<Product> findAll(){
        return this.products;
    } 
}
