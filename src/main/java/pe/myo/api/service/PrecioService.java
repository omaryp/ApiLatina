package pe.myo.api.service;

import org.springframework.stereotype.Service;

import pe.myo.api.model.Precio;
import pe.myo.api.repository.PrecioRepository;

@Service
public class PrecioService extends BasicService<PrecioRepository,Precio> implements IPrecioService {
    
}
