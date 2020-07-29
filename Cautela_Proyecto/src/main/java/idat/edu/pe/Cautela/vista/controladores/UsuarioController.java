package idat.edu.pe.Cautela.vista.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

	@GetMapping("/inicio")
	public String respuesta(Model model)
	{
		model.addAttribute("ModuloUsuario", "CONSULTA DE USUARIOS");
		
		return "resultado";
	}
	
}
