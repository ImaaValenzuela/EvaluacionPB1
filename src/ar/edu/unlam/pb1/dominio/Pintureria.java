package ar.edu.unlam.pb1.dominio;

import java.util.Arrays;

import ar.edu.unlam.pb1.dominio.enums.TipoDePintura;

public class Pintureria {
	
	// TODO: Completar getters, setters, constructor y metodos necesarios para garantizar el correcto funcionamiento.

    private String nombre;
    private LataDePintura[] latasDePintura;
    private double saldo = 0;
    private int cantidadLatasVendidas = 0;

	public Pintureria(String nombre, int cantidadLatasPintura) {
		this.nombre = nombre;
		latasDePintura = new LataDePintura[cantidadLatasPintura];
	}

	public LataDePintura obtenerLataDePinturaPorCodigo(int codigo) {
		// TODO: Se debe buscar una lata de pintura por codigo entre las latas de
		// pintura que tiene la pintureria y devolverla. En caso de no existir alguna
		// que cumpla con el codigo, devolver null.
		int n = latasDePintura.length;
		for(int i = 0; i < n; i++ ) {
		    LataDePintura lata = latasDePintura[i];
			if(lata != null && lata.getCodigo() == codigo) {
				return lata;
			}
		}
		return null;
	}

	public boolean agregarLataDePintura(int codigo, String nombre, double porcentajeGanancia,
			TipoDePintura tipoDePintura, int stock) {
		// TODO: Se debera instanciar una lata de pintura y agregarla al array de latas
		// de pintura.
		LataDePintura lata = new LataDePintura(codigo, nombre, tipoDePintura, stock, porcentajeGanancia);
		int n = latasDePintura.length;
		for(int i = 0; i < n; i++ ) {
			if (latasDePintura[i] == null) {
				latasDePintura[i] = lata;
				return true;
			}
		}
		return false;
	}

	public boolean hayStock(int codigo, int cantidadDeLatas) {
		// TODO: Se debera verificar si la pintureria cuenta con stock suficiente segun
		// el codigo de la lata de pintura solicitado. Se debe devolver verdadero en
		// caso de que el stock de la lata de pintura (que cumpla con el codigo), sea
		// mayor o igual a la cantidadDeLatas deseada.
		LataDePintura lata = obtenerLataDePinturaPorCodigo(codigo);
		return lata != null && lata.getStock() >= cantidadDeLatas;
	}

	public void venderLatasDePintura(int codigo, int cantidadDeLatas) {
		// TODO: Se debera actualizar el stock de la lata de pintura, debiendo buscarla
		// por codigo, y luego restando la cantidad de latas a vender, al stock actual
		// de la lata de pintura.
		// Tambien es necesario contabilizar cuantas latas se vendieron y acumular el
		// precio total (precio de la lata por cantidad a vender) al saldo de la
		// pintureria.
		LataDePintura lata = obtenerLataDePinturaPorCodigo(codigo);
		if (lata != null && lata.getStock() >= cantidadDeLatas) {
			lata.setStock(lata.getStock() - cantidadDeLatas);
			cantidadLatasVendidas += cantidadDeLatas;
			saldo += lata.obtenerPrecio() * cantidadDeLatas;
		}
	}

	public int obtenerCantidadDeLatasDePinturasEnStockPorTipo(TipoDePintura tipoDePintura) {
		// TODO: Se debera obtener el numero (cantidad) de latas de pintura en stock
		// (considerando el stock de cada lata de pintura) que sean del tipo de pintura
		// especificado.
		int cantidad = 0;
		int n = latasDePintura.length;
		for(int i = 0; i < n; i++ ) {
		    LataDePintura lata = latasDePintura[i];
		    if (lata != null && lata.getTipoDePintura() == tipoDePintura) {
		        cantidad += lata.getStock();
		    }
		}
		return cantidad;
	}

	public LataDePintura obtenerLataDePinturaMasBarataPorTipo(TipoDePintura tipoDePintura) {
		// TODO: Se debera obtener la lata de pintura mas barata que aplique al tipo de
		// pintura especificado.
		LataDePintura lataMasBarata = null;
		int n = latasDePintura.length;
		for(int i = 0; i < n; i++ ) {
		    LataDePintura lata = latasDePintura[i];
		    if (lata != null && lata.getTipoDePintura() == tipoDePintura
		            && (lataMasBarata == null || lata.obtenerPrecio() < lataMasBarata.obtenerPrecio())) {
		        lataMasBarata = lata;
		    }
		}
		return lataMasBarata;
	}

	public LataDePintura[] obtenerLatasDePinturaOrdenadasPorNombreAscendente() {
		// TODO: Se debera devolver un array de latas de pintura ordenados por el nombre
		// de la lata de pintura de manera ascendente.
		// Ejemplo: nombre "Azul" antes que "Rojo".
		int n = latasDePintura.length;
		for(int i = 0; i < n; i++ ) {
			for (int j = i + 1; j < n; j++) {
				if (latasDePintura[i] != null && latasDePintura[j] != null
						&& latasDePintura[i].getNombre().compareToIgnoreCase(latasDePintura[j].getNombre()) > 0) {
					LataDePintura temp = latasDePintura[i];
					latasDePintura[i] = latasDePintura[j];
					latasDePintura[j] = temp;
				}
			}
		}
		return latasDePintura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LataDePintura[] getLatasDePintura() {
		return latasDePintura;
	}

	public void setLatasDePintura(LataDePintura[] latasDePintura) {
		this.latasDePintura = latasDePintura;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getCantidadLatasVendidas() {
		return cantidadLatasVendidas;
	}

	public void setCantidadLatasVendidas(int cantidadLatasVendidas) {
		this.cantidadLatasVendidas = cantidadLatasVendidas;
	}

	@Override
	public String toString() {
	    return String.format("Nombre: %s\nSaldo: $%.2f\nCant. Vendidas: %d\nLatas: %s",
	            nombre, saldo, cantidadLatasVendidas, Arrays.toString(latasDePintura));
	}
	
	
	
}
