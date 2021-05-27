package com.bookrental.n2.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bookrental.n2.repository.BibliotecaRepository;


@Controller
public class BibliotecaControler {
	
	private static final String PAGINA_INICIO = "index";
	private static final String PAGINA_LIVRO_CADASTRO = "livroCadastro";
	private static final String PAGINA_LIVRO_UPDATE = "livroUpdate";	
	private static final String PAGINA_CLIENTE_CADASTRO = "clienteCadastro";
	private static final String PAGINA_CLIENTE_UPDATE = "clienteUpdate";
	private static final String PAGINA_ALUGUEL = "aluguel";
	private static final String PAGINA_DEVOLUCAO = "devolucao";
	private static final String PAGINA_SOBRE = "sobreSistema";
	
	private static final String REDIRECT_INICIO = "redirect:/";
	private static final String CADASTRAR = "cadastrar";
	private static final String DELETE = "/delete/{id}";
	private static final String EDIT = "/edit/{id}";
	private static final String UPDATE = "/update/{id}";
	private static final String SOBRE = "sobre";
	
	
	@Autowired
	private BibliotecaRepository pr;
	
	//PaginaListar---------------------------------------------------------------------------
	@RequestMapping("/")
	public ModelAndView listarProdutos() {
		ModelAndView mv = new ModelAndView(PAGINA_LISTAR);
		Iterable<Produto> listaProdutos = pr.findAll();
		mv.addObject("lista", listaProdutos);
		return mv;
	}
	@GetMapping(DELETE)
	public String DeletarProdutor(@PathVariable("id") int id) {
		Produto prod = pr.findById(id);
		pr.delete(prod);
		return REDIRECT_INICIO;
	}
	
	//PaginaCadastro-------------------------------------------------------------------------
	@RequestMapping(value=CADASTRAR, method = RequestMethod.GET)
	public String form() {
		return PAGINA_CADASTRO;		
	}
	@RequestMapping(value=CADASTRAR, method = RequestMethod.POST)
	public String form(Produto prod) {
		prod.setDataFab(formatarData(prod.getDataFab()));
		prod.setDataVenc(formatarData(prod.getDataVenc()));
		pr.save(prod); 
		return REDIRECT_INICIO;		
	}
	//PaginaEditarCadastro-------------------------------------------------------------------
    @GetMapping(EDIT)
    public String showUpdateForm(@PathVariable("id") int id, Model model) {
    	Produto prod = pr.findById(id);
        model.addAttribute("prod", prod);
		prod.setDataFab(desformatarData(prod.getDataFab()));
		prod.setDataVenc(desformatarData(prod.getDataVenc()));
        return PAGINA_EDITAR;
    }
    
    @PostMapping(UPDATE)
    public String updateProd(@PathVariable("id") int id, Produto prod) {
		prod.setDataFab(formatarData(prod.getDataFab()));
		prod.setDataVenc(formatarData(prod.getDataVenc()));
    	pr.save(prod);
        return REDIRECT_INICIO;
    }
	//PaginaSobre----------------------------------------------------------------------------
	@RequestMapping(SOBRE)	
	public String sobre() {
		return PAGINA_SOBRE;		
	}
	//Desformatar Data--------------------------------------------------------------------------
	public String desformatarData(String data) {
		return (data.substring(6, 10)+"-"+
				data.substring(3, 5)+"-"+
				data.substring(0, 2));
	}
	//Formatar Data--------------------------------------------------------------------------
	public String formatarData(String data) {
		return (data.substring(8, 10)+"/"+
				data.substring(5, 7)+"/"+
				data.substring(0, 4));
	}
}

