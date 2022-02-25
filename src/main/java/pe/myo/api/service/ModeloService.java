package pe.myo.api.service;

import org.springframework.stereotype.Service;

import pe.myo.api.model.Modelo;
import pe.myo.api.repository.ModeloRepository;

@Service
public class ModeloService extends BasicService<ModeloRepository,Modelo> implements IModeloService {
    
}
