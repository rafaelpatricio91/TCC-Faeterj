package model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.ejb.Timeout;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Prova implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@NotNull @Size(max=35)
	@Column(nullable=false, length=35)
	private String nome;
	@Size(max=180)
	@Column(length=180)
	private String descricao;
	@NotNull
	//RELACIONAMENTO*********************
	private Professor professor;
	@NotNull
	//RELACIONAMENTO*********************
	private List<Materia> materias;
	@NotNull
	//RELACIONAMENTO*********************
	private List<Questao> questoes;
	@Column(nullable=false) @Temporal(TemporalType.TIMESTAMP)
	private Date dataCriacao;
	
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
	public Professor getProfessor()
	{
		return professor;
	}
	public void setProfessor(Professor professor)
	{
		this.professor = professor;
	}
	public List<Materia> getMaterias()
	{
		return materias;
	}
	public void setMaterias(List<Materia> materias)
	{
		this.materias = materias;
	}
	public List<Questao> getQuestoes()
	{
		return questoes;
	}
	public void setQuestoes(List<Questao> questoes)
	{
		this.questoes = questoes;
	}
	public Date getDataCriacao()
	{
		return dataCriacao;
	}
	public void setDataCriacao(Date dataCriacao)
	{
		this.dataCriacao = dataCriacao;
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
		Prova other = (Prova) obj;
		if (id == null)
		{
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
