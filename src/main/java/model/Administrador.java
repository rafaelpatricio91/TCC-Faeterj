package model;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Administrador extends Pessoa
{
	private static final long serialVersionUID = 1L;
	
	@NotNull @Size(max=25)
	@Column(nullable=false, length=25)
	private String orgao;
	@NotNull @Size(max=25)
	@Column(nullable=false, length=25)
	private String setor;

	public String getOrgao()
	{
		return orgao;
	}

	public void setOrgao(String orgao)
	{
		this.orgao = orgao;
	}

	public String getSetor()
	{
		return setor;
	}

	public void setSetor(String setor)
	{
		this.setor = setor;
	}
}
