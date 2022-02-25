package pe.myo.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.myo.api.model.Modelo;
import pe.myo.api.service.IModeloService;

@RestController
@RequestMapping("/modelo")
public class ModeloApi extends BasicController<Modelo,IModeloService> {
    
}
