package edu.ifmt.cobrancaifmt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import edu.ifmt.cobrancaifmt.model.Titulo;

@Controller // anotação controller do Spring
@RequestMapping("/titulos") //Trazendo o mapeamento  /titulos para todo o controller
public class TituloController {
	
	@Autowired
	private Titulos titulos;

	@RequestMapping("/novo") //mapeamento da url
	public String novo( ) { //método que retorna String com nome da view
		return "CadastroTitulo";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String salvar(Titulo titulo) {
		titulos.save(titulo);
		return "CadastroTitulo";
		
	}

	
}
