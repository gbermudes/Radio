package model;

public class Radio {
	private boolean ligado;
	private int 	volume;
	private float 	estacao;
	
	//Constructor
	public Radio(boolean ligado,int volume,float estacao) {
		this.ligado = ligado;
		this.volume = volume;
		this.estacao = estacao;
		
	}
	
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public float getEstacao() {
		return estacao;
	}
	public void setEstacao(float estacao) {
		this.estacao = estacao;
	}
	
	//Funcoes
	public String mostrarDisplay() {
		return "Estacao: "+estacao+" Volume: "+volume;
	}
	
	public void sintonizar(float novaEstacao) {
		estacao = novaEstacao;
	}
	
	public void aumentarVolume(int novoVolume) {
		volume = volume + novoVolume;
	}
	
	public void diminuirVolume(int novoVolume) {
		volume = volume - novoVolume;
	}
	
	public void ligar() {
		ligado = true;
	}
	
	public void desligar() {
		ligado = false;
	}
	
}
