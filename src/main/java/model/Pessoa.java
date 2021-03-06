package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Pessoa implements Serializable {

private static final long serialVersionUID = 1L;
	
	@NotNull @Size(max=35)
	@Column(nullable=false, length=35)
	private String matricula;
	
	
	private String nome;
	
	private String sobrenome;
	
	@NotNull @Size(max=35)
	@Column(nullable=false, length=35)
	//PODE SER UM ENUM
	private String formacao;
	
	public String getMatricula()
	{
		return matricula;
	}
	public void setMatricula(String matricula)
	{
		this.matricula = matricula;
	}
	public String getFormacao()
	{
		return formacao;
	}
	public void setFormacao(String formacao)
	{
		this.formacao = formacao;
	}
}