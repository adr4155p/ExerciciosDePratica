package ExerciciosDiversificados;/*Baseado nas fórmulas abaixo, desenvolva uma rotina que calcule o salário líquido de um funcionário. Após o cálculo o programa deve apresentar o salário base e o salário líquido calculado.

        SB = HT * VH
        TD = (PD / 100) * SB
        SL = SB  - TD

        Onde:
        SB =  Salário Base
        HT = Horas Trabalhadas
        VH = Valor Hora de trabalho
        TD = Total de Descontos
        PD = Percentual de Desconto
        SL = Salário Líquido
*/


import java.util.Scanner;

public class CalculoSalarioLiquido {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Horas trabalhadas: ");
        double HT = input.nextDouble();
        System.out.print("Valor Hora de trabalho: ");
        double VH = input.nextDouble();
        System.out.print("Percentual de desconto: ");
        double PD = input.nextDouble();

        input.close();

        System.out.println("------------------------------------------------------");

        double SB = HT * VH;
        double TD = (PD / 100) * SB;
        double SL = SB - TD;


        System.out.printf("Horas Trabalhadas: R$ %.2f%n" + "Valor Hora de Trabalho: R$ %.2f%n" + "Salário base: R$ %.2f%n", HT, VH, SB);
        System.out.println("------------------------------------------------------");
        System.out.printf("Percentual de Descontos: %.2f%%%n" + "Total de Desconto: R$ %.2f%n" + "Salário Líquido: R$ %.2f%n",PD, TD, SL);
    }
}
