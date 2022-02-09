package pe.myo.api.service;

import java.util.List;

import pe.myo.api.model.Rol;
import pe.myo.api.utils.ApiException;

public interface IRolService extends IBasicService<Rol>{
	
	List<Rol> getRolesByPerfil(int perfil) throws ApiException;
	
	List<Rol> getRolesByUsuario(String usuario) throws ApiException;
	
	List<Rol> getRolesByUsuarioModulo(String usuario,int modulo) throws ApiException;
	
	List<String> getAuthorities(String usuario) throws ApiException;
	
}
