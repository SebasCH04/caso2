package Modelos;

public class Yate {
	private float Velocidad;
	private float PorcentajeSol;
	private boolean Encendido;
	
	public Yate(float velocidad, float porcentajeSol, boolean encendido) {
		super();
		Velocidad = velocidad;
		PorcentajeSol = porcentajeSol;
		Encendido = encendido;
	}
	
	public float getVelocidad() {
		return Velocidad;
	}
	public void setVelocidad(float velocidad) {
		Velocidad = velocidad;
	}
	public float getPorcentajeSol() {
		return PorcentajeSol;
	}
	public void setPorcentajeSol(float porcentajeSol) {
		PorcentajeSol = porcentajeSol;
	}
	public boolean isEncendido() {
		return Encendido;
	}
	public void setEncendido(boolean encendido) {
		Encendido = encendido;
	} 
	
	

}