import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[8];
        double[] mediasBimestrais = new double[4];
        double semestre1, semestre2, mediaFinal;

        System.out.println("Sistema Escolar - Cálculo de Médias");
        System.out.println("------------------------------------");

        // Recebendo as 8 notas
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // Calculando médias bimestrais (cada bimestre tem 2 notas)
        for (int i = 0; i < 4; i++) {
            mediasBimestrais[i] = (notas[i * 2] + notas[i * 2 + 1]) / 2;
        }

        // Calculando médias semestrais
        semestre1 = (mediasBimestrais[0] + mediasBimestrais[1]) / 2;
        semestre2 = (mediasBimestrais[2] + mediasBimestrais[3]) / 2;

        // Média final
        mediaFinal = (semestre1 + semestre2) / 2;

        // Exibindo os resultados
        System.out.println("\nResultados:");
        System.out.printf("1º Bimestre: %.1f\n", mediasBimestrais[0]);
        System.out.printf("2º Bimestre: %.1f\n", mediasBimestrais[1]);
        System.out.printf("1º Semestre: %.1f\n", semestre1);
        System.out.printf("3º Bimestre: %.1f\n", mediasBimestrais[2]);
        System.out.printf("4º Bimestre: %.1f\n", mediasBimestrais[3]);
        System.out.printf("2º Semestre: %.1f\n", semestre2);
        System.out.printf("Média Final: %.1f\n", mediaFinal);

        scanner.close();
    }
}
