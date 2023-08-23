import java.util.Scanner;

public class Operations {
    public static Scanner mainScanner = new Scanner(System.in);
    public static Double saldo = 0.00;
    public static void main() {
        System.out.println("Olá, bem vindo ao banco Dio, por favor digite a opção desejada:" +
                "\n1: Inserir saldo" +
                "\n2: Verificar saldo" +
                "\n3: Levantar quantia" +
                "\n4: Sair\n");

        Integer selectedOption = Integer.parseInt(mainScanner.nextLine());

        switch(selectedOption) {
            case 1:
                System.out.println("Qual o valor que deseja depositar? \n");
                String depositAmount = mainScanner.nextLine();
                saldo += Double.parseDouble(depositAmount);
                System.out.println("Dinheiro depositado com sucesso! \nSeu saldo atual é de \" + saldo");
                main();
                break;
            case 2:
                System.out.println("O seu saldo é:" + saldo + "\n");
                main();
                break;
            case 3:
                System.out.println("Qual o valor que deseja Levantar? \n");
                String withdrawAmount = mainScanner.nextLine();
                saldo -= Double.parseDouble(withdrawAmount);
                System.out.println("Dinheiro levantado com sucesso! \nSeu saldo atual é de " + saldo);
                main();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Opção desconhecida, por favor digite uma opção valida.");
                main();
                break;
        }
    }


}
