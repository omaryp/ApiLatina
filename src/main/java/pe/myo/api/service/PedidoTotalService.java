package pe.myo.api.service;

import org.springframework.stereotype.Service;

import pe.myo.api.model.PedidoTotal;
import pe.myo.api.repository.PedidoTotalRepository;

@Service
public class PedidoTotalService extends BasicService<PedidoTotalRepository,PedidoTotal> implements IPedidoTotalService {
    
}
