package Application;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();

        double media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;

        System.out.println("Media: " + df.format(media));

        if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        } else if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media >= 5.0 && media < 7) {
            System.out.println("Aluno em exame.");

            double nExame = sc.nextDouble();

            System.out.println("Nota do exame: " + df.format(nExame));

            media = (media + nExame) / 2;

            if (media >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }

            System.out.println("Media final: " + df.format(media));
        }

        sc.close();
    }

}
