package Modelos;

public class Bateria {
	private float CapacidadMaxima;
	private float CargaActual;
	private float NivelConsumo;
	
	
	public Bateria(float capacidadMaxima, float cargaActual, float nivelConsumo) {
		super();
		CapacidadMaxima = capacidadMaxima;
		CargaActual = cargaActual;
		NivelConsumo = nivelConsumo;
	}


	public float getCapacidadMaxima() {
		return CapacidadMaxima;
	}


	public void setCapacidadMaxima(float capacidadMaxima) {
		CapacidadMaxima = capacidadMaxima;
	}


	public float getCargaActual() {
		return CargaActual;
	}


	public void setCargaActual(float cargaActual) {
		CargaActual = cargaActual;
	}


	public float getNivelConsumo() {
		return NivelConsumo;
	}


	public void setNivelConsumo(float nivelConsumo) {
		NivelConsumo = nivelConsumo;
	}
}
