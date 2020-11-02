package br.com.hmsystem.model;

public enum TipoItem {

	PRODUTO("Produto"),
	SERVICO("Serviço");
	
	private String descricao;

	TipoItem(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
}