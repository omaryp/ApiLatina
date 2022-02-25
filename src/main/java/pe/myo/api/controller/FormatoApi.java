package pe.myo.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.myo.api.model.Formato;
import pe.myo.api.service.IFormatoService;

@RestController
@RequestMapping("/formato")
public class FormatoApi extends BasicController<Formato,IFormatoService> {
    
}
