package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Instituicao implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@NotNull @Size(max=25)
	@Column(nullable=false, length=25)
	private String numeroInscricao;
	@NotNull @Size(max=25)
	@Column(nullable=false, length=75)
	private String nome;
	@Enumerated(EnumType.STRING)
	@Column(nullable=false)
	private Uf uf;
	@NotNull @Size(max=25)
	@Column(nullable=false, length=35)
	private String municipio;
	
	public Integer getId()
	{
		return id;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	public String getNumeroInscricao()
	{
		return numeroInscricao;
	}
	public void setNumeroInscricao(String numeroInscricao)
	{
		this.numeroInscricao = numeroInscricao;
	}
	public String getNome()
	{
		return nome;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public Uf getUf()
	{
		return uf;
	}
	public void setUf(Uf uf)
	{
		this.uf = uf;
	}
	public String getMunicipio()
	{
		return municipio;
	}
	public void setMunicipio(String municipio)
	{
		this.municipio = municipio;
	}
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Instituicao other = (Instituicao) obj;
		if (id == null)
		{
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
