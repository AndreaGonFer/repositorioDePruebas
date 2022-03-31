package es.iesssanandres.prg.examen;

public class Cocina {
	private int metros;
	private String color;
	private boolean amueblada;
	private int ventanas;
	
	public Cocina(int metros, String color, boolean amueblada, int ventanas) {
		this.metros = metros;
		this.color = color;
		this.amueblada = amueblada;
		this.ventanas = ventanas;
	}

	public int getMetros() {
		return metros;
	}

	public void setMetros(int metros) {
		this.metros = metros;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isAmueblada() {
		return amueblada;
	}

	public void setAmueblada(boolean amueblada) {
		this.amueblada = amueblada;
	}

	public int getVentanas() {
		return ventanas;
	}

	public void setVentanas(int ventanas) {
		this.ventanas = ventanas;
	}
	
}
