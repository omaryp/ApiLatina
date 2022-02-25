package pe.myo.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.myo.api.model.Catalogo;
import pe.myo.api.service.ICatalogoService;

@RestController
@RequestMapping("/catalogo")
public class CatalogoApi extends BasicController<Catalogo,ICatalogoService> {
    
}
