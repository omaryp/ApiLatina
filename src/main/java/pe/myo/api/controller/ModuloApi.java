package pe.myo.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.myo.api.model.Modulo;
import pe.myo.api.service.IModuloService;

@RestController
@RequestMapping("/modulo")
public class ModuloApi extends BasicController<Modulo, IModuloService> {

}