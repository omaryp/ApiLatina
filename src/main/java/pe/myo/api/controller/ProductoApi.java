package pe.myo.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.myo.api.model.Producto;
import pe.myo.api.service.IProductoService;

@RestController
@RequestMapping("/producto")
public class ProductoApi extends BasicController<Producto,IProductoService> {
    
}
