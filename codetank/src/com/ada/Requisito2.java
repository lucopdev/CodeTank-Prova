package com.ada;

import java.util.Scanner;

public class Requisito2 {

  public static String conversorTemperatura() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe a temperatura: ");
    double temperatura = scanner.nextDouble();

    System.out.println("Qual a unidade de origem dessa temperatura? [C, K, F]");
    String unidadeOrigem = scanner.next().toUpperCase();

    System.out.println("Qual a unidade de destino dessa temperatura [C, K, F]");
    String unidadeDestino = scanner.next().toUpperCase();

    double temperaturaConvertida = 0;

    if (unidadeDestino.equals("C") && unidadeOrigem.equals("F")) {
      temperaturaConvertida = (temperatura - 32) * 5 / 9;
    } else if (unidadeDestino.equals("C") && unidadeOrigem.equals("K")) {
      temperaturaConvertida = temperatura - 273.15;
    } else if (unidadeDestino.equals("F") && unidadeOrigem.equals("C")) {
      temperaturaConvertida = (temperatura * 9 / 5) + 32;
    } else if (unidadeDestino.equals("F") && unidadeOrigem.equals("K")) {
      temperaturaConvertida = temperatura * 9 / 5 - 459.67;
    } else if (unidadeDestino.equals("K") && unidadeOrigem.equals("C")) {
      temperaturaConvertida = temperatura + 273.15;
    } else if (unidadeDestino.equals("K") && unidadeOrigem.equals("F")) {
      temperaturaConvertida = (temperatura + 459.67) * 5 / 9;
    } else {
      System.out.println("Entrada especificada não é válida");
    }

    return String.format("%.2f %s = %.2f %s", temperatura, unidadeOrigem, temperaturaConvertida,
        unidadeDestino);
  }
}
