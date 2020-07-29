package idat.edu.pe.Cautela.vista.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/orden")
public class OrdenController {

	
	@GetMapping("/inicio")
	public String respuesta(Model model)
	{
		model.addAttribute("ordenUsuario", "ORDEN DE COMPRA");
		
		return "resultado";
	}
}
