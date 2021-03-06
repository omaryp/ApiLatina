package pe.myo.api.controller;

import static pe.myo.api.utils.Util.respuestaApi;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.myo.api.model.Usuario;
import pe.myo.api.model.dto.UsuarioSessionDto;
import pe.myo.api.service.IUsuarioService;
import pe.myo.api.utils.ApiException;



@RestController
@RequestMapping("/usuario")
public class 	UsuarioApi extends BasicController<Usuario, IUsuarioService> {

	@GetMapping("/session")
	public ResponseEntity<?> getUsuarioSession() {
		logger.info("Se inicia carga datos de session");
		try {
			UsuarioSessionDto dto = service.getDatosSession();
			return respuestaApi(dto, "Transacción OK.", HttpStatus.OK);
		} catch (ApiException e) {
			logger.error("Error de api al procesar obtención de usuario de session- {} - {}",e.getMessage(),e);
			return respuestaApi(null, e.getMessage(), HttpStatus.ACCEPTED);
		} 
		catch (Exception e) {
			logger.error("Error interno de api al obtención de usuario de session - {}- {}",e.getMessage(),e);
			return respuestaApi(null, e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);	
		}
	}
	
}