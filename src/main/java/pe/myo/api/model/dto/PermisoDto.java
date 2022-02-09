package pe.myo.api.model.dto;

import java.util.List;

import pe.myo.api.model.Modulo;
import pe.myo.api.model.Rol;

public class PermisoDto {

	private Modulo modulo;
	private List<Rol> roles;
	
	public Modulo getModulo() {
		return modulo;
	}
	public void setModulo(Modulo modulo) {
		this.modulo = modulo;
	}
	public List<Rol> getRoles() {
		return roles;
	}
	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}
	
}
