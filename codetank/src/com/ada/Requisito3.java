package com.ada;

import java.util.Scanner;

public class Requisito3 {

  public static String triangulo() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o tamanho da base da pirâmide [número impar]: ");
    int base = scanner.nextInt();

    if (base % 2 == 0) {
        base++;
    }

    System.out.println();

    int meio = (base / 2) + 1;

    for (int i = 1; i <= meio; i++) {
      for (int j = 1; j <= meio - i; j++) {
        System.out.print(" ");
      }

      for (int k = 1; k <= (2 * i) - 1; k++) {
        System.out.print("*");
      }
      System.out.println();
    }

    System.out.println();
    return String.format("Primrâmide de base %d", base);
  }
}



