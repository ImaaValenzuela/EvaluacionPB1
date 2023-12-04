package ar.edu.unlam.pb1.dominio;

import ar.edu.unlam.pb1.dominio.enums.TipoDePintura;

public class LataDePintura {
	
	// TODO: Completar getters, setters, constructor y metodos necesarios para garantizar el correcto funcionamiento.

	private static final double PRECIO_BASE = 1000;

	private int codigo;
	private String nombre;
	private TipoDePintura tipoDePintura;
	private int stock;
	private double porcentajeDeGanancia;
	

	public LataDePintura(int codigo, String nombre, TipoDePintura tipoDePintura, int stock,
			double porcentajeDeGanancia) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.tipoDePintura = tipoDePintura;
		this.stock = stock;
		this.porcentajeDeGanancia = porcentajeDeGanancia;
	}


	public double obtenerPrecio() {
		// TODO: Calcular y obtener el precio de la lata de pintura, el cual se calcula
		// segun su TipoDePintura.
		// Todas las latas de pinturas son blancas y tienen un precio base. En caso de
		// ser satinadas, tonalizar la pintura blanca cuesta un 15% extra. En cambio,
		// tonalizar las pinturas mate, cuesta un 5%, pero incluye otro 3% de impuestos
		// (calculado sobre el precio base) que se debe agregar al precio final. No
		// olvidar agregar el porcentaje de ganancia, tambien calculado sobre el precio
		// base.
		double precio = PRECIO_BASE * ( 1 + porcentajeDeGanancia / 100);
		if(tipoDePintura == TipoDePintura.SATINADA) {
			precio *= 1.15;
		} else if(tipoDePintura == TipoDePintura.MATE) {
			precio *= 1.05;
			precio += precio * 0.03;
		}
		return precio;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TipoDePintura getTipoDePintura() {
		return tipoDePintura;
	}

	public void setTipoDePintura(TipoDePintura tipoDePintura) {
		this.tipoDePintura = tipoDePintura;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPorcentajeDeGanancia() {
		return porcentajeDeGanancia;
	}

	public void setPorcentajeDeGanancia(double porcentajeDeGanancia) {
		this.porcentajeDeGanancia = porcentajeDeGanancia;
	}

	public double getPRECIO_BASE() {
		return PRECIO_BASE;
	}


	@Override
	public String toString() {
	    return String.format("Código: %d\nNombre: %s\nTipo: %s\nStock: %d\nGanancia: %.2f%%\nPrecio: $%.2f",
	            codigo, nombre, tipoDePintura, stock, porcentajeDeGanancia, obtenerPrecio());
	}
	
	
	

}
