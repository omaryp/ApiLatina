package pe.myo.api.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import pe.myo.api.model.Persona;

@Mapper
@Repository
public interface PersonaRepository extends IBasicMapper<Persona> {


}
