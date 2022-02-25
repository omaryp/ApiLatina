package pe.myo.api.service;

import org.springframework.stereotype.Service;

import pe.myo.api.model.Formato;
import pe.myo.api.repository.FormatoRepository;

@Service
public class FormatoService extends BasicService<FormatoRepository,Formato> implements IFormatoService {
    
}
