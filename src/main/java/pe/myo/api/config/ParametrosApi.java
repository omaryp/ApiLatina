package pe.myo.api.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ParametrosApi {
		
	//PARAMETROS CARGADOS DESDE PROPERTIES
	@Value("${config.myo.log4j2}")
    private String rutaConfigLog4j2;
	
	
	public String getRutaConfigLog4j2() {
		return rutaConfigLog4j2;
	}

}
