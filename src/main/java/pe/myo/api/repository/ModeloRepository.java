package pe.myo.api.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import pe.myo.api.model.Modelo;

@Mapper
@Repository
public interface ModeloRepository extends IBasicMapper<Modelo> {
    
}
