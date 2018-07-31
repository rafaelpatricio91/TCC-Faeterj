package model;

public enum Materia
{
	PORTUGUES("Português"), MATEMATICA("Matemática"), HISTORIA("História"), GEOGRAFIA("Geografia"), ARTES("Artes"), 
	MUSICA("Música"), BIOLOGIA("Biologia"), FISICA("Física"), QUIMICA("Química"), LITERATURA("Literatura"), 
	CIENCIAS("Ciências"), ED_FISICA("Educação Física"), INGLES("Inglês"), ESPANHOL("Espanhol"), 
	FILOSOFIA("Filosofia"), SOCIOLOGIA("Sociologia");
	
	private String descricao;

	private Materia(String descricao)
	{
		this.descricao = descricao;
	}
	
	public String getDescricao()
	{
		return descricao;
	}
}
