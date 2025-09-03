package Practica;

import java.util.Scanner;

class Menu {
  public static void mostrarMenu() {
    System.out.println(
        "Seleccione la operación a realizar\n 1. Sumar\n 2. Restar\n 3. Multiplicar\n 4. Dividir\n 0. Salir");
  }
}

class Calculadora {

  private int nro1, nro2;

  public Calculadora(int nro1, int nro2) {
    this.nro1 = nro1;
    this.nro2 = nro2;
  }

  public int sumar() {
    return this.nro1 + this.nro2;
  }

  public void restar() {
    int resultado = this.nro1 - this.nro2;
    String mensaje = (this.nro1 > this.nro2) ? ("Resultado:" + resultado) : "El resultado es negativo";
    System.out.println(mensaje);
  }

  public void multiplicar() {
    System.out.println("Multiplicar: " + (this.nro1 * this.nro2));
  }

  public void dividir() {
    if ((double) this.nro1 == 0 && (double) this.nro2 == 0) {
      System.out.println("El resultado es indeterminado");
    } else {
      if (this.nro2 == 0) {
        System.out.println("No se puede dividir por cero");
      } else {
        double resultado = (double) this.nro1 / (double) this.nro2;
        System.out.println("Dividir: " + resultado);
      }
    }
  }

  public int getNro1() {
    return nro1;
  }

  public int getNro2() {
    return nro2;
  }

}

public class Operadores {
  public static void main(String[] args) {
    int nro1 = 0;
    int nro2 = 0;
    int opcion = 0;
    Scanner entrada = new Scanner(System.in);
    Menu menuObjeto = new Menu();
    do {
      menuObjeto.mostrarMenu();
      opcion = entrada.nextInt();
      if (opcion != 0) {
        System.out.print("Ingrese el primer número: ");
        nro1 = entrada.nextInt();
        System.out.print("Ingrese el segundo número: ");
        nro2 = entrada.nextInt();
      }
      Calculadora calculadoraObjeto = new Calculadora(nro1, nro2);
      switch (opcion) {
        case 1:
          System.out.println(
              calculadoraObjeto.getNro1() + "+" + calculadoraObjeto.getNro2() + " = " + calculadoraObjeto.sumar());
          break;
        case 2:
          calculadoraObjeto.restar();
          break;
        case 3:
          calculadoraObjeto.multiplicar();
          break;
        case 4:
          calculadoraObjeto.dividir();
          break;
        case 0:
          System.out.println("FIN");
          break;
        default:
          System.out.println("Opción no válida");
      }
    } while (opcion != 0);
    entrada.close();
  }

}