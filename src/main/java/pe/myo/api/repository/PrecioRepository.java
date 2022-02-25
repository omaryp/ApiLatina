package pe.myo.api.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import pe.myo.api.model.Precio;

@Mapper
@Repository
public interface PrecioRepository extends IBasicMapper<Precio> {
    
}
