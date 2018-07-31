package model;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;

public class Discursiva extends Questao
{
	private static final long serialVersionUID = 1L;
	
	@NotNull
	@Column(nullable=false)
	private String respostaDiscursiva;

	public String getRespostaDiscussiva()
	{
		return respostaDiscursiva;
	}

	public void setRespostaDiscussiva(String respostaDiscussiva)
	{
		this.respostaDiscursiva = respostaDiscussiva;
	}

}
