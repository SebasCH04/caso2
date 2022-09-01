package Modelos;

public class Constantes {
	
	private float CargaBateriaInicial;
	private float PorcentajeSolInicial;
	private float VelocidadInicial;
	private float CapacidadCargaBateria;
	private int CantidadBaterias;
	private int CantidadPaneles;
	
	public Constantes(float cargaBateriaInicial, float porcentajeSolInicial, float velocidadInicial,
			float capacidadCargaBateria, int cantidadBaterias, int cantidadPaneles) {
		super();
		CargaBateriaInicial = cargaBateriaInicial;
		PorcentajeSolInicial = porcentajeSolInicial;
		VelocidadInicial = velocidadInicial;
		CapacidadCargaBateria = capacidadCargaBateria;
		CantidadBaterias = cantidadBaterias;
		CantidadPaneles = cantidadPaneles;
	}

	public int getCantidadBaterias() {
		return CantidadBaterias;
	}

	public void setCantidadBaterias(int cantidadBaterias) {
		CantidadBaterias = cantidadBaterias;
	}

	public int getCantidadPaneles() {
		return CantidadPaneles;
	}

	public void setCantidadPaneles(int cantidadPaneles) {
		CantidadPaneles = cantidadPaneles;
	}

	public float getCargaBateriaInicial() {
		return CargaBateriaInicial;
	}

	public void setCargaBateriaInicial(float cargaBateriaInicial) {
		CargaBateriaInicial = cargaBateriaInicial;
	}

	public float getPorcentajeSolInicial() {
		return PorcentajeSolInicial;
	}

	public void setPorcentajeSolInicial(float porcentajeSolInicial) {
		PorcentajeSolInicial = porcentajeSolInicial;
	}

	public float getVelocidadInicial() {
		return VelocidadInicial;
	}

	public void setVelocidadInicial(float velocidadInicial) {
		VelocidadInicial = velocidadInicial;
	}

	public float getCapacidadCargaBateria() {
		return CapacidadCargaBateria;
	}

	public void setCapacidadCargaBateria(float capacidadCargaBateria) {
		CapacidadCargaBateria = capacidadCargaBateria;
	}
}