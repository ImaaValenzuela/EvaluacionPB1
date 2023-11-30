package ar.edu.unlam.pb1.interfaz;

import java.util.Scanner; 

import ar.edu.unlam.pb1.dominio.LataDePintura;
import ar.edu.unlam.pb1.dominio.Pintureria;
import ar.edu.unlam.pb1.interfaz.enums.MenuPrincipal;

public class GestionDePintureria {

	private static final Scanner TECLADO = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO: Escriba el codigo necesario para garantizar el correcto funcionamiento
		// del software. Para armar el menu, se debera utilizar el enum MenuPrincipal,
		// buscando llevar el codigo a ejecutarse (en cada caso del menu) a un metodo
		// apropiado (Ver los métodos incluídos a continuación).Es necesario solicitar
		// la cantidad de latas posibles de almacenar en una pinturería.
	}

	private static void agregarLataDePintura(Pintureria pintureria) {
		// TODO: El usuario debera ingresar los datos de una lata de pintura para que
		// sea agregada a las latas que posee la pintureria.
		// Cuando se agrega una lata, no debe tener el mismo codigo de una lata ya
		// existente. Es necesario validar el codigo que se ingresa. En caso existir en
		// la pintureria, una lata con el codigo ingresado, se debera mostrar un mensaje
		// apropiado y seguir solicitando el ingreso de un nuevo codigo, hasta obtener
		// un codigo no existente. Para los tipos de pintura se debera ingresar la
		// palabra MATE o SATINADA, sin importar si es en mayusculas o minusculas (o
		// mixto). El stock ingresado debe ser mayor a cero y se debe seguir solicitando
		// en caso de ingresar un valor invalido.
		// Si se agrega correctamente la lata de pintura a la pintureria, mostrar un
		// mensaje de exito, caso contrario, uno de error.
	}

	private static void venderLatasDePintura(Pintureria pintureria) {
		// TODO: Se deberan mostrar las latas de pintura ordenadas por nombre
		// ascendente, que dispone la pintureria para
		// que el usuario pueda ingresar el codigo y la cantidad de latas que desea
		// vender. Solo se puede vender si tenemos en stock la cantidad de latas de
		// pintura ingresada.
		// En caso de ingresar un numero de latas de pintura a vender, mayor al stock de
		// esa lata de pintura,
		// mostrar un mensaje acorde y no procesar la venta. Si la cantidad es valida,
		// proceder a realizar la venta y mostrar un mensaje de exito.
	}

	private static void mostrarLatasDePinturaMasBarataPorTipoDePintura(Pintureria pintureria) {
		// TODO: Deberan mostrarse las latas de pintura mas baratas para cada tipo de
		// pintura (SATINADA o MATE) de la pintureria. Cabe destacaer que solo se puede
		// mostrar una lata por tipo de pintura. Si no existe al menos una lata para el
		// tipo, mostrar un mensaje apropiado.
		// Ejemplo: Pintura SATINADA mas barata: <pintura>
		// Ejemplo: Pintura MATE mas barata: <pintura>
	}

	private static void mostrarCantidadDeLatasEnStockPorTipoDePintura(Pintureria pintureria) {
		// TODO: Mostrar la cantidad de latas de pinturas satinadas y la cantidad de
		// latas de pinturas mate que tiene la pintureria.
		// Ejemplo: Pinturas SATINADAS: 10 - Pinturas MATE: 5
	}

	private static void mostrarResumenPintureria(Pintureria pintureria) {
		// TODO: Se debera mostrar como resumen, las latas de pintura que tiene
		// actualmente la pintureria (con stock actualizado y precio), ordenadas por
		// nombre ascendente.
		// Ademas, debe mostrarse la cantidad de latas de pintura vendidas y el saldo
		// actual de la pintureria.
	}

	private static void mostrarMenuPrincipal() {

		String menu = "";

		for (int i = 0; i < MenuPrincipal.values().length; i++) {
			menu += "\n" + (i + 1) + ") " + MenuPrincipal.values()[i];
		}

		mostrarPorPantalla(menu);
	}

	private static MenuPrincipal obtenerOpcionDeEnumParaMenuPrincipal() {
		int opcion = 0;

		do {
			mostrarMenuPrincipal();
			opcion = ingresarNumeroEntero("\nIngrese opcion: ");
		} while (opcion < 1 || opcion > MenuPrincipal.values().length);

		MenuPrincipal menuPrincipal = MenuPrincipal.values()[opcion - 1];

		return menuPrincipal;
	}

	private static int ingresarNumeroEntero(String mensaje) {
		mostrarPorPantalla(mensaje);
		return TECLADO.nextInt();
	}

	private static String ingresarString(String mensaje) {
		mostrarPorPantalla(mensaje);
		return TECLADO.next();
	}

	private static double ingresarDouble(String mensaje) {
		mostrarPorPantalla(mensaje);
		return TECLADO.nextDouble();
	}

	private static void mostrarPorPantalla(String mensaje) {
		System.out.println(mensaje);
	}

	private static void mostrarLatasDePintura(LataDePintura[] latasDePintura) {
		for (int i = 0; i < latasDePintura.length; i++) {
			if (latasDePintura[i] != null) {
				mostrarPorPantalla(latasDePintura[i].toString());
			}
		}
	}
}
