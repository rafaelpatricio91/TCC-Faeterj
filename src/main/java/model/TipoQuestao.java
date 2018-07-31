package model;

public enum TipoQuestao 
{
	MULTIPLA_ESCOLHA("Múltipla Escolha"), DISCURSIVA("Discursiva");
	
	private String descricao;

	public String getDescricao() 
	{
		return descricao;
	}

	private TipoQuestao(String descricao) 
	{
		this.descricao = descricao;
	}
}
