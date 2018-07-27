package servico;

import java.io.Serializable;

import javax.inject.Inject;

import model.Pessoa;

public class PessoaServico implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Inject
    Pessoa pessoa;
    
    public Pessoa devolverPessoa(){
        pessoa.setNome("Fulano da Silva");
        pessoa.setIdade("33 Anos");
        System.out.println(pessoa);
        return pessoa;
    }
    
}