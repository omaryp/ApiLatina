package pe.myo.api.service;

import org.springframework.stereotype.Service;

import pe.myo.api.model.Catalogo;
import pe.myo.api.repository.CatalogoRepository;

@Service
public class CatalogoService extends BasicService<CatalogoRepository,Catalogo> implements ICatalogoService {
    
}
