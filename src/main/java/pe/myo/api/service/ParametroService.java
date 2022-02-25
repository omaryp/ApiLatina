package pe.myo.api.service;

import org.springframework.stereotype.Service;

import pe.myo.api.model.Parametro;
import pe.myo.api.repository.ParametroRepository;

@Service
public class ParametroService extends BasicService<ParametroRepository,Parametro> implements IParametroService {
    
}
