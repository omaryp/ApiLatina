package pe.myo.api.service;

import java.util.List;

import pe.myo.api.model.Modulo;
import pe.myo.api.utils.ApiException;

public interface IModuloService extends IBasicService<Modulo> {
	
	List<Modulo> getModulosByUsuario(String usuario) throws ApiException;

}
