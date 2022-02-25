package pe.myo.api.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import pe.myo.api.model.Producto;

@Mapper
@Repository
public interface ProductoRepository extends IBasicMapper<Producto> {
    
}
