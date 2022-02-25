package pe.myo.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.myo.api.model.PedidoTotal;
import pe.myo.api.service.IPedidoTotalService;

@RestController
@RequestMapping("/pedidototal")
public class PedidoTotalApi extends BasicController<PedidoTotal,IPedidoTotalService> {
    
}
