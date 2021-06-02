package com.bookrental.n2.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bookrental.n2.model.Livro;
import com.bookrental.n2.repository.LivroRepository;

@Controller
public class IndexController {
	private static final String PAGINA_INICIO = "index";
	private static final String PAGINA_LIVRO_UPDATE = "livroUpdate";
	
	private static final String REDIRECT_INICIO = "redirect:/";
	private static final String EXCLUIR = "/delete/{id}";
	private static final String EDITAR = "/edit/{id}";
	
	@Autowired
	private LivroRepository lr;
	
	//Pagina Index---------------------------------------------------------------------------
	@RequestMapping("/")
	public ModelAndView listarLivros() {
		ModelAndView mv = new ModelAndView(PAGINA_INICIO);
		Iterable<Livro> listaLivros = lr.findAll();
		mv.addObject("lista", listaLivros);
		return mv;
	}
	//Botoões de acão Index-------------------------------------------------------------------
    @GetMapping(EDITAR)
    public String showLivroUpdate(@PathVariable("id") int id, Model model) {
    	Livro livro = lr.findById(id);
        model.addAttribute("livro", livro);
        return PAGINA_LIVRO_UPDATE;
    }
	@GetMapping(EXCLUIR)
	public String DeletarLivro(@PathVariable("id") int id) {
		Livro livro = lr.findById(id);
		lr.delete(livro);
		return REDIRECT_INICIO;
	}

}
