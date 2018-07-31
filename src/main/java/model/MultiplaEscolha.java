package model;

import java.util.List;

public class MultiplaEscolha extends Questao
{
	private static final long serialVersionUID = 1L;
	
	private List<String> listaQuestoes;

	public List<String> getListaQuestoes()
	{
		return listaQuestoes;
	}

	public void setListaQuestoes(List<String> listaQuestoes)
	{
		this.listaQuestoes = listaQuestoes;
	}
	
	
}
