package idat.edu.pe.Cautela.vista.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/medotoPago")
public class MetodoPagoController {

	
	@GetMapping("/inicio")
	public String respuesta(Model model)
	{
		model.addAttribute("nombreModulo", "PAGO DE COMPRA");
		
		return "resultado";
	}
	
}
