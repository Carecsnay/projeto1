package dominio;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import entidade.Pessoa;

@Named
@RequestScoped
// Para Fazer o AutoComplete segure Ctrl + Espaço.
public class CadastrarMBean {
	private Pessoa pes = new Pessoa();

	public Pessoa getPes() {
		return pes;
	}

	public void setPes(Pessoa pes) {
		this.pes = pes;
	}
	
	public String salvarDados() {
		
		System.out.println(pes.getNome());
		System.out.println(pes.getCpf());
		System.out.println(pes.getRg());
		System.out.println(pes.getNascimento());
		System.out.println(pes.getEndereco());
		System.out.println(pes.getTelefone());
		System.out.println(pes.getSexo());
		
		return"";	
	}	
}
