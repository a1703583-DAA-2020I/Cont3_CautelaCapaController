package idat.edu.pe.Cautela.vista.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ordenDetalle")
public class OrdenDetalleController {

	
	@GetMapping("/inicio")
	public String respuesta(Model model)
	{
		model.addAttribute("nombreModulo", "DETALLES DE LA ORDEN DE COMPRA");
		
		return "resultado";
	}
}
