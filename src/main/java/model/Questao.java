package model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.ejb.Timeout;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Questao implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@NotNull
	@Column(nullable=false)
	private String enunciado;
	//NAO SEI FAZER - PESQUISAR
	private byte[] ilustracao;
	//RELACIONAMENTO **************
	private Professor autor;
	//RELACIONAMENTO **************
	private Materia materia;
	//RELACIONAMENTO **************
	private Tema tema;
	//RELACIONAMENTO **************
	private Assunto assunto;
	@NotNull
	@Column(nullable=false) @Temporal(TemporalType.TIMESTAMP)
	private Date dataCriacao;
	@Column(nullable=false) @Temporal(TemporalType.TIMESTAMP)
	private Date dataUltimaModificacao;
	
	public Integer getId()
	{
		return id;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	public String getEnunciado()
	{
		return enunciado;
	}
	public void setEnunciado(String enunciado)
	{
		this.enunciado = enunciado;
	}
	
	public byte[] getIlustracao()
	{
		return ilustracao;
	}
	public void setIlustracao(byte[] ilustracao)
	{
		this.ilustracao = ilustracao;
	}
	public Professor getAutor()
	{
		return autor;
	}
	public void setAutor(Professor autor)
	{
		this.autor = autor;
	}
	public Materia getMateria()
	{
		return materia;
	}
	public void setMateria(Materia materia)
	{
		this.materia = materia;
	}
	public Tema getTema()
	{
		return tema;
	}
	public void setTema(Tema tema)
	{
		this.tema = tema;
	}
	public Assunto getAssunto()
	{
		return assunto;
	}
	public void setAssunto(Assunto assunto)
	{
		this.assunto = assunto;
	}
	public Date getDataCriacao()
	{
		return dataCriacao;
	}
	public void setDataCriacao(Date dataCriacao)
	{
		this.dataCriacao = dataCriacao;
	}
	public Date getDataUltimaModificacao()
	{
		return dataUltimaModificacao;
	}
	public void setDataUltimaModificacao(Date dataUltimaModificacao)
	{
		this.dataUltimaModificacao = dataUltimaModificacao;
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
		Questao other = (Questao) obj;
		if (id == null)
		{
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
