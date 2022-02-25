package pe.myo.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.myo.api.model.Pedido;
import pe.myo.api.service.IPedidoService;

@RestController
@RequestMapping("/pedido")
public class PedidoApi extends BasicController<Pedido,IPedidoService> {
    
}
