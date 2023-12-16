package com.ada;

import java.util.Scanner;

public class Requisito1 {

  public static String calculoEmprestimo() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o valor do empréstimo: R$ ");
    double valorEmprestimo = scanner.nextDouble();

    System.out.print("Digite a taxa de juros: ");
    double taxaMensal = scanner.nextDouble();

    System.out.print("Digite o prazo para pagamento (meses): ");
    int totalDeMeses = scanner.nextInt();
    System.out.println();

    double amortizasao = valorEmprestimo / totalDeMeses;

    System.out.println(String.format(
        "Valor fixo da amortização R$ %.2f, Saldo devedor total R$ %.2f com um juros de %.1f%% ao mês",
        amortizasao, valorEmprestimo, taxaMensal));

    double saldoDevedorAtual = valorEmprestimo;
    double totalPrestacao = 0;
    double totalJuros = 0;

    for (int i = 1; i <= totalDeMeses; i++) {
      double jurosMensal = saldoDevedorAtual * taxaMensal / 100;
      double parcelaMensal = jurosMensal + amortizasao;
      saldoDevedorAtual -= amortizasao;
      System.out.println(
          String.format("Parcela %d | Juros: R$ %.2f | Prestação: R$ %.2f | Saldo devedor: R$ %.2f",
              i, jurosMensal, parcelaMensal, saldoDevedorAtual));

      totalPrestacao += parcelaMensal;
      totalJuros += jurosMensal;
    }

    String resultado = String.format("Total: Prestação R$ %.2f, Juros R$ %.2f, Amortização R$ %.2f", totalPrestacao, totalJuros, amortizasao * 12);
    return resultado;
  }
}
