package es.iesssanandres.prg.examen;

public class Main {

	public static void main(String[] args) {
		Cocina cocina1 = new Cocina (35,"Azul",true,2);
	
		System.out.println("Color "+cocina1.getColor());
	
		cocina1.setMetros(60);
		System.out.println(cocina1.getMetros()+" metros cuadrados.");
		
		cocina1.setColor("Amarillo");
		
		String colorAImprimir = cocina1.getColor();
		System.out.println(colorAImprimir);
	}
}
