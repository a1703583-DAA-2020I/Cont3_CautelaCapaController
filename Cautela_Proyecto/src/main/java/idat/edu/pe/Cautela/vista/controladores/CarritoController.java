package idat.edu.pe.Cautela.vista.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/carrito")
public class CarritoController {

	
	
	@GetMapping("/inicio")
	public String respuesta(Model model)
	{
		model.addAttribute("carritoCompra", "CARRITO DE COMPRA");
		
		return "resultado";
	}}
