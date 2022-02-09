package pe.myo.api.repository;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import pe.myo.api.model.Perfil;
import pe.myo.api.model.RolPerfil;

@Mapper
@Repository
public interface PerfilRepository extends IBasicMapper<Perfil> {
	
	void guardarRolesPerfil(List<RolPerfil> entitys) throws SQLException,SQLIntegrityConstraintViolationException;
	void deleteRolPerfil(RolPerfil entity) throws SQLException,SQLIntegrityConstraintViolationException ;

}
