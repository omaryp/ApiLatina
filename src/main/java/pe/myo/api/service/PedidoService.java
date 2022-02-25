package pe.myo.api.service;

import org.springframework.stereotype.Service;

import pe.myo.api.model.Pedido;
import pe.myo.api.repository.PedidoRepository;

@Service
public class PedidoService extends BasicService<PedidoRepository,Pedido> implements IPedidoService {
    
}
