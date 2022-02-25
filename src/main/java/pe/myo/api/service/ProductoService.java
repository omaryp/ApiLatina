package pe.myo.api.service;

import org.springframework.stereotype.Service;

import pe.myo.api.model.Producto;
import pe.myo.api.repository.ProductoRepository;

@Service
public class ProductoService extends BasicService<ProductoRepository,Producto> implements IProductoService {
    
}
