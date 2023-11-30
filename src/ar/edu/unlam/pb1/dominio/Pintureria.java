package ar.edu.unlam.pb1.dominio;

import ar.edu.unlam.pb1.dominio.enums.TipoDePintura;

public class Pintureria {
	
	// TODO: Completar getters, setters, constructor y metodos necesarios para garantizar el correcto funcionamiento.

	private String nombre;
	private LataDePintura[] latasDePintura;
	private double saldo;
	private int cantidadLatasVendidas;

	public Pintureria(String nombre, int cantidadLatasPintura) {
	}

	public LataDePintura obtenerLataDePinturaPorCodigo(int codigo) {
		// TODO: Se debe buscar una lata de pintura por codigo entre las latas de
		// pintura que tiene la pintureria y devolverla. En caso de no existir alguna
		// que cumpla con el codigo, devolver null.
		return null;
	}

	public boolean agregarLataDePintura(int codigo, String nombre, double porcentajeGanancia,
			TipoDePintura tipoDePintura, int stock) {
		// TODO: Se debera instanciar una lata de pintura y agregarla al array de latas
		// de pintura.

		return false;
	}

	public boolean hayStock(int codigo, int cantidadDeLatas) {
		// TODO: Se debera verificar si la pintureria cuenta con stock suficiente segun
		// el codigo de la lata de pintura solicitado. Se debe devolver verdadero en
		// caso de que el stock de la lata de pintura (que cumpla con el codigo), sea
		// mayor o igual a la cantidadDeLatas deseada.
		return false;
	}

	public void venderLatasDePintura(int codigo, int cantidadDeLatas) {
		// TODO: Se debera actualizar el stock de la lata de pintura, debiendo buscarla
		// por codigo, y luego restando la cantidad de latas a vender, al stock actual
		// de la lata de pintura.
		// Tambien es necesario contabilizar cuantas latas se vendieron y acumular el
		// precio total (precio de la lata por cantidad a vender) al saldo de la
		// pintureria.
	}

	public int obtenerCantidadDeLatasDePinturasEnStockPorTipo(TipoDePintura tipoDePintura) {
		// TODO: Se debera obtener el numero (cantidad) de latas de pintura en stock
		// (considerando el stock de cada lata de pintura) que sean del tipo de pintura
		// especificado.
		return 0;
	}

	public LataDePintura obtenerLataDePinturaMasBarataPorTipo(TipoDePintura tipoDePintura) {
		// TODO: Se debera obtener la lata de pintura mas barata que aplique al tipo de
		// pintura especificado.

		return null;
	}

	public LataDePintura[] obtenerLatasDePinturaOrdenadasPorNombreAscendente() {
		// TODO: Se debera devolver un array de latas de pintura ordenados por el nombre
		// de la lata de pintura de manera ascendente.
		// Ejemplo: nombre "Azul" antes que "Rojo".

		return null;
	}

}

