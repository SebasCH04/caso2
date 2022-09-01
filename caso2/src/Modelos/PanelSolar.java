package Modelos;

public class PanelSolar {
	private float CargaBateria;
	private float PorcentajeSol;
	private float MaxCantidadCarga;
	
	public PanelSolar(float cargaBateria, float porcentajeSol, float maxCantidadCarga) {
		super();
		CargaBateria = cargaBateria;
		PorcentajeSol = porcentajeSol;
		MaxCantidadCarga = maxCantidadCarga;
	}

	public float getCargaBateria() {
		return CargaBateria;
	}

	public void setCargaBateria(float cargaBateria) {
		CargaBateria = cargaBateria;
	}

	public float getPorcentajeSol() {
		return PorcentajeSol;
	}

	public void setPorcentajeSol(float porcentajeSol) {
		PorcentajeSol = porcentajeSol;
	}

	public float getMaxCantidadCarga() {
		return MaxCantidadCarga;
	}

	public void setMaxCantidadCarga(float maxCantidadCarga) {
		MaxCantidadCarga = maxCantidadCarga;
	}
}
