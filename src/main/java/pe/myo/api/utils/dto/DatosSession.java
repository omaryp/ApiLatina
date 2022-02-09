package pe.myo.api.utils.dto;

import pe.myo.api.model.dto.UsuarioDto;

public class DatosSession {

    private String token;
    private UsuarioDto user;
   
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

	public UsuarioDto getUser() {
		return user;
	}

	public void setUser(UsuarioDto user) {
		this.user = user;
	}


}