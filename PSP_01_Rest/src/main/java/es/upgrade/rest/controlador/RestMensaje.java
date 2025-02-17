package es.upgrade.rest.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestMensaje {
	private String mensaje = "mensaje inicial";
	
	@GetMapping("/mensaje")
	public String getMensaje() {
		return mensaje;
	}
	@PutMapping("/mensaje")
	public String modificarMensaje(@RequestBody String mensaje) {
		this.mensaje= mensaje;
		return "mensaje modificado";
	}

}
