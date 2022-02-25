package pe.myo.api.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import pe.myo.api.model.Parametro;

@Mapper
@Repository
public interface ParametroRepository extends IBasicMapper<Parametro> {
    
}
