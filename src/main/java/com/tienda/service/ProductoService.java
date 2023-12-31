package com.tienda.service;

import com.tienda.domain.Producto;
import java.util.List;

public interface ProductoService {

    public List<Producto> getProductos(boolean activo);

    // Se obtiene un Producto, a partir del id de un producto
    public Producto getProducto(Producto producto);

    // Se inserta un nuevo producto si el id del producto esta vacÃ­o
    // Se actualiza un producto si el id del producto NO esta vacÃ­o
    public void save(Producto producto);

    // Se elimina el producto que tiene el id pasado por parÃ¡metro
    public void delete(Producto producto);

    public List<Producto> consultaQuery(double precioInf,double precioSup);
    
    //Ejemplo de una consulta con JPQL
    public List<Producto> consultaJPQL(double precioInf,double precioSup);
    
}
