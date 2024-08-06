
package applicationareatrapezio;

import java.util.Scanner;

public class ApplicationAreaTrapezio {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        double bMaior, bMenor, altura, areaT;
        System.out.println("Digite o valor da Base Maior: ");
        bMaior = ler.nextDouble();
        System.out.println("Digite o valor da Base Menor: ");
        bMenor = ler.nextDouble();
        System.out.println("Digite o valor da Altura: ");
        altura = ler.nextDouble();
        
        areaT = (bMaior + bMenor) * altura / 2.0;
        System.out.println("Area do trapezio = %.2f", areaT);
        
        ler.close();
    }
    
}
