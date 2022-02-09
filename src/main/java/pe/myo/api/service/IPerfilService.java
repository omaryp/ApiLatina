package pe.myo.api.service;

import java.util.List;

import pe.myo.api.model.Perfil;
import pe.myo.api.model.RolPerfil;
import pe.myo.api.utils.ApiException;

public interface IPerfilService extends IBasicService<Perfil> {
	
	void guardarRolesPerfil(List<RolPerfil> entitys) throws ApiException;
	void eliminarRolesPerfil(List<RolPerfil> entitys) throws ApiException;
}
