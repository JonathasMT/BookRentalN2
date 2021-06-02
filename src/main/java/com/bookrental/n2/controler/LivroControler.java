package com.bookrental.n2.controler;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.bookrental.n2.model.Livro;
import com.bookrental.n2.repository.LivroRepository;


@Controller
public class LivroControler {
	

	private static final String PAGINA_LIVRO_CADASTRO = "livroCadastro";
	
//	private static final String PAGINA_CLIENTE_CADASTRO = "clienteCadastro";
//	private static final String PAGINA_CLIENTE_UPDATE = "clienteUpdate";
//	private static final String PAGINA_ALUGUEL = "aluguel";
//	private static final String PAGINA_DEVOLUCAO = "devolucao";
	
	private static final String REDIRECT_INICIO = "redirect:/";
	private static final String CADASTRAR = "cadastrarLivro";
	private static final String UPDATE = "/update/{id}";

	
	@Autowired
	private LivroRepository lr;
	
	//Pagina Cadastro-------------------------------------------------------------------------
	@RequestMapping(value=CADASTRAR, method = RequestMethod.GET)
	public String form() {
		return PAGINA_LIVRO_CADASTRO;		
	}
	@RequestMapping(value=CADASTRAR, method = RequestMethod.POST)
	public String form(Livro livro, RedirectAttributes attributes) {
		livro.setDataCadastro(dataAtual());
		lr.save(livro); 
		attributes.addFlashAttribute("mensagem", "Evento cadastrado com sucesso!");
		return REDIRECT_INICIO;		
	}
	//Pagina Update-------------------------------------------------------------------------
    @PostMapping(UPDATE)
    public String livroUpdate(@PathVariable("id") int id, Livro livro) {
    	livro.setDataCadastro(livro.getDataCadastro());
    	livro.setDataUpdate(dataAtual());
    	lr.save(livro);
        return REDIRECT_INICIO;
    }
	//Data Atual------------------------------------------------------------------------------
	public String dataAtual() {
		LocalDateTime agora = LocalDateTime.now();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		String data = formato.format(agora);
		return data;
		
	}
}

