package pe.myo.api.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import pe.myo.api.model.Catalogo;

@Mapper
@Repository
public interface CatalogoRepository extends IBasicMapper<Catalogo> {
    
}
