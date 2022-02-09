package pe.myo.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import pe.myo.api.model.Rol;
import pe.myo.api.service.IRolService;

@RestController
@RequestMapping("/rol")
public class RolApi extends BasicController<Rol, IRolService> {
	
}