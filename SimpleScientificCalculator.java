import java.util.Scanner;

public class SimpleScientificCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bem-vindo à Calculadora Científica Simples!");
        
        while (true) {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1. Adição (+)");
            System.out.println("2. Subtração (-)");
            System.out.println("3. Multiplicação (*)");
            System.out.println("4. Divisão (/)");
            System.out.println("5. Raiz Quadrada (√)");
            System.out.println("6. Seno (sin)");
            System.out.println("7. Cosseno (cos)");
            System.out.println("8. Tangente (tan)");
            System.out.println("9. Logaritmo Natural (ln)");
            System.out.println("10. Potência (x^y)");
            System.out.println("11. Fatorial (!)");
            System.out.println("12. Sair");

            int choice = scanner.nextInt();
            
            if (choice == 12) {
                System.out.println("Encerrando a calculadora. Até logo!");
                break;
            }

            double result = 0;

            if (choice >= 1 && choice <= 4) {
                System.out.print("Digite o primeiro número: ");
                double num1 = scanner.nextDouble();
                System.out.print("Digite o segundo número: ");
                double num2 = scanner.nextDouble();

                if (choice == 1) {
                    result = num1 + num2;
                    System.out.println("Resultado: " + num1 + " + " + num2 + " = " + result);
                } else if (choice == 2) {
                    result = num1 - num2;
                    System.out.println("Resultado: " + num1 + " - " + num2 + " = " + result);
                } else if (choice == 3) {
                    result = num1 * num2;
                    System.out.println("Resultado: " + num1 + " * " + num2 + " = " + result);
                } else if (choice == 4) {
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Resultado: " + num1 + " / " + num2 + " = " + result);
                    } else {
                        System.out.println("Erro: Divisão por zero.");
                    }
                }
            } else if (choice == 5) {
                System.out.print("Digite o número: ");
                double num = scanner.nextDouble();
                result = Math.sqrt(num);
                System.out.println("Resultado: √" + num + " = " + result);
            } else if (choice == 6) {
                System.out.print("Digite o ângulo em graus: ");
                double angleSin = scanner.nextDouble();
                result = Math.sin(Math.toRadians(angleSin));
                System.out.println("Resultado: sin(" + angleSin + "°) = " + result);
            } else if (choice == 7) {
                System.out.print("Digite o ângulo em graus: ");
                double angleCos = scanner.nextDouble();
                result = Math.cos(Math.toRadians(angleCos));
                System.out.println("Resultado: cos(" + angleCos + "°) = " + result);
            } else if (choice == 8) {
                System.out.print("Digite o ângulo em graus: ");
                double angleTan = scanner.nextDouble();
                result = Math.tan(Math.toRadians(angleTan));
                System.out.println("Resultado: tan(" + angleTan + "°) = " + result);
            } else if (choice == 9) {
                System.out.print("Digite o número: ");
                double num = scanner.nextDouble();
                result = Math.log(num);
                System.out.println("Resultado: ln(" + num + ") = " + result);
            } else if (choice == 10) {
                System.out.print("Digite a base: ");
                double base = scanner.nextDouble();
                System.out.print("Digite o expoente: ");
                double exponent = scanner.nextDouble();
                result = Math.pow(base, exponent);
                System.out.println("Resultado: " + base + "^" + exponent + " = " + result);
            } else if (choice == 11) {
                System.out.print("Digite um número inteiro para calcular o fatorial: ");
                int num = scanner.nextInt();
                result = 1;
                for (int i = 1; i <= num; i++) {
                    result *= i;
                }
                System.out.println("Resultado: " + num + "! = " + (int)result);
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
        
        scanner.close();
    }
}
