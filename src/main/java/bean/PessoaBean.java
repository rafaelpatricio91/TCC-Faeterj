package bean;

import java.io.Serializable;

import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import model.Pessoa;
import servico.PessoaServico;

	@Named
	@ViewScoped
	public class PessoaBean implements Serializable {

	    private static final long serialVersionUID = 1L;
	    
	    @Inject
	    PessoaServico pessoaServico;
	    
	    @Inject
	    Pessoa pessoa;

	    public Pessoa getPessoa() {
	        return pessoa;
	    }

	    public void setPessoa(Pessoa pessoa) {
	        this.pessoa = pessoa;
	    }
	    
	    public void exibirPessoa(){
	        pessoa = pessoaServico.devolverPessoa();
	    }
}
