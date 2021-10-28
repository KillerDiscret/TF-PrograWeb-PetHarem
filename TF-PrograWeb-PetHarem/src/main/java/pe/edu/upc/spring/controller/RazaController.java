package pe.edu.upc.spring.controller;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sun.el.parser.ParseException;

import pe.edu.upc.spring.model.Raza;
import pe.edu.upc.spring.service.IRazaService;

@Controller
@RequestMapping("/raza")
public class RazaController {
	
	@Autowired
	private IRazaService rService;
	
	/*@RequestMapping("/inicio")
	public String irPaginaBienvenida() {
		return "inicio";
	}
	*/
	
	@RequestMapping("/")
	public String irPaginaListadoRazas(Map<String, Object> model) {
		model.put("listaRazas", rService.listar());
		return "listRaza";
	}
	
	
	@RequestMapping("/irRegistrar")
	public String irPaginaRegistrar(Model model) {
		model.addAttribute("raza", new Raza());
		return "raza";
		
	}
	
	@RequestMapping("/registrar")
	public String registrar(@ModelAttribute Raza objRaza, BindingResult binRes, Model model)
		throws ParseException
	{
		if(binRes.hasErrors())	
			return "raza";
		else {
			boolean flag = rService.insertar(objRaza);
			if(flag)
				return "redirect:/raza/listar";
			else {
				model.addAttribute("mensaje", "Ocurrio un error");
				return "redirect:/raza/irRegistrar"; /*redirecciona al mapping*/
			}
		}		
	}
	
	@RequestMapping("/modificar/{id}")
	public String modificar(@PathVariable int id, Model model, RedirectAttributes objRedir)
	throws ParseException
	{
		Optional<Raza> objRaza = rService.listarId(id);
		if(objRaza == null)
		{
			objRedir.addFlashAttribute("mensaje", "Ocurrio n error");
			return "redirect:/raza/listar";
		}
		else {
			model.addAttribute("raza", objRaza);
			return "raza";
		}
		
	}
	
	@RequestMapping("/eliminar")
	public String eliminar(Map<String, Object> model, @RequestParam(value="id") Integer id) {
		
		try {
			if(id!=null && id>0) 
			{
				rService.eliminar(id);
				model.put("listaRazas", rService.listar());
			}
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
			model.put("mensaje", "Ocurrio un roche");
			model.put("listaRazas", rService.listar());
		}
		return "listRace";
	}
	
	@RequestMapping("/listar")
	public String listar(Map<String, Object > model)
	{
		model.put("listaRazas", rService.listar());
		return "listRace";
		
		
	}
	
}
