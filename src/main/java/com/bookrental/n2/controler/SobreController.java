package com.bookrental.n2.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SobreController {
	private static final String PAGINA_SOBRE = "sobreSistema";
	private static final String SOBRE = "sobre";
	
	//Pagina Sobre----------------------------------------------------------------------------
	@RequestMapping(SOBRE)	
	public String sobre() {
		return PAGINA_SOBRE;		
	}

}
