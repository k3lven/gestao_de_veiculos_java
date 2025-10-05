import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Cadastro de Veículos ---");
            System.out.println("1. Carro");
            System.out.println("2. Moto");
            System.out.println("3. Caminhão");
            System.out.println("4. Mostrar todos");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 0) break;

            System.out.print("Placa: ");
            String placa = sc.nextLine();
            System.out.print("Marca: ");
            String marca = sc.nextLine();
            System.out.print("Preço: ");
            double preco = sc.nextDouble();

            switch (opcao) {
                case 1:
                    System.out.print("Número de portas: ");
                    int portas = sc.nextInt();
                    veiculos.add(new Carro(placa, marca, preco, portas));
                    break;
                case 2:
                    System.out.print("Cilindradas: ");
                    int cilindradas = sc.nextInt();
                    veiculos.add(new Moto(placa, marca, preco, cilindradas));
                    break;
                case 3:
                    System.out.print("Capacidade de carga (toneladas): ");
                    double carga = sc.nextDouble();
                    veiculos.add(new Caminhao(placa, marca, preco, carga));
                    break;
                case 4:
                    System.out.println("\n--- Veículos cadastrados ---");
                    for (Veiculo v : veiculos) {
                        System.out.println("-----------------------------");
                        v.mostrarDados();
                    }
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        sc.close();
        System.out.println("Programa encerrado.");
    }
}