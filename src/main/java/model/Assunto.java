package model;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.NormalScope;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Assunto implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@NotNull @Size(max=25)
	@Column(length=25)
	private String nome;
	@NotNull @Size(max=75)
	@Column(length=75)
	private String descricao;
	@NotNull @Size(max=25)
	//RELACIONAMENTO
	private Materia materia;
	@NotNull @Size(max=25)
	//RELACIONAMENTO
	private List<Tema> temas;
	
	public Integer getId()
	{
		return id;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	public String getNome()
	{
		return nome;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public String getDescricao()
	{
		return descricao;
	}
	public void setDescricao(String descricao)
	{
		this.descricao = descricao;
	}
	public Materia getMateria()
	{
		return materia;
	}
	public void setMateria(Materia materia)
	{
		this.materia = materia;
	}
	public List<Tema> getTemas()
	{
		return temas;
	}
	public void setTemas(List<Tema> temas)
	{
		this.temas = temas;
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
		Assunto other = (Assunto) obj;
		if (id == null)
		{
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
