package pe.myo.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.myo.api.model.Precio;
import pe.myo.api.service.IPrecioService;

@RestController
@RequestMapping("/precio")
public class PrecioApi extends BasicController<Precio,IPrecioService> {
    
}
