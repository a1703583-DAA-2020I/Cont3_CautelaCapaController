package idat.edu.pe.Cautela.vista.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/principal")
public class PrincipalController {

	@RequestMapping(value = "inicio", method = RequestMethod.GET)
	public ModelAndView login() {
		ModelAndView vistaModelo = new ModelAndView();
		vistaModelo.setViewName("principal");
		return vistaModelo ;	
	}
}
