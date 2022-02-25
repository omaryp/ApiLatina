package pe.myo.api.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import pe.myo.api.model.Formato;

@Mapper
@Repository
public interface FormatoRepository extends IBasicMapper<Formato> {
    
}
