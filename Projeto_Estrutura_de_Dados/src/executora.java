import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class executora {

    public static boolean isString(String input) {
        return input.matches("[a-zA-Z]+");
    }

    public static void main(String[] args) {
        List<Sneaker> sneakers = new ArrayList<>();
        SneakerDAO sneaker = new SneakerDAO();
        Scanner scanner = new Scanner(System.in);
        FabricanteDAO fabricante = new FabricanteDAO();

        boolean switchOn;

        while (switchOn = true) {
            System.out.println("\n|-------------------------------------------------|");
            System.out.println("|          MENU INICIAL - [SNEAKERS]              |");
            System.out.println("|-------------------------------------------------|");
            System.out.println("|  01   |    Cadastrar Fabricante                 |");
            System.out.println("|-------------------------------------------------|");
            System.out.println("|  02   |    Cadastrar Produto                    |");
            System.out.println("|-------------------------------------------------|");
            System.out.println("|  03   |    Entrar como cliente                  |");
            System.out.println("|-------------------------------------------------|");
            System.out.println("|  99   |    Sair do programa                     |");
            System.out.println("|-------------------------------------------------|\n");
            System.out.println("Digite uma opção");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome da Fabricante: ");
                    String nome_fabri = scanner.nextLine();
                    while (!isString(nome_fabri)) {
                        System.out.println("Entrada invalida!. Por favor digite novamente!");
                        nome_fabri = scanner.next();
                    }

                    System.out.println("Digite o URL do site: ");
                    String site = scanner.nextLine();
                    while (!isString(site)) {
                        System.out.println("Entrada invalida!. Por favor digite novamente!");
                        site = scanner.next();
                    }

                    System.out.println("Digite o telefone: ");
                    int telefone;
                    do {
                        while (!scanner.hasNextInt()) {
                            System.out.println("Valor invalido!");
                        }
                        telefone = scanner.nextInt();
                    } while (telefone <= 0);
                    scanner.nextLine();

                    System.out.println("Digite o UF da : ");
                    String UF = scanner.nextLine();
                    while (!isString(UF)) {
                        System.out.println("Entrada invalida!. Por favor digite novamente!");
                        UF = scanner.next();
                    }

                    fabricante.addFabricante(nome_fabri, site, telefone, UF);

                    break;

                case 2:
                    System.out.println("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    while (!isString(nome)) {
                        System.out.println("Entrada invalida!. Por favor digite novamente!");
                        nome = scanner.next();
                    }

                    System.out.println("Digite o peso do produto: ");
                    double peso;
                    do {
                        while (!scanner.hasNextFloat()) {
                            System.out.println("Valor invalido!");
                        }
                        peso = scanner.nextDouble();
                    } while (peso <= 0);
                    scanner.nextLine();

                    System.out.println("Digite a descrição do produto: ");
                    String descricao = scanner.nextLine();
                    while (!isString(descricao)) {
                        System.out.println("Entrada invalida!. Por favor digite novamente!");
                        descricao = scanner.next();
                    }

                    System.out.println("Digite o valor do produto: ");
                    double valor;
                    do {
                        while (!scanner.hasNextFloat()) {
                            System.out.println("Valor invalido!");
                        }
                        valor = scanner.nextDouble();
                    } while (valor <= 0);
                    scanner.nextLine();

                    System.out.println("Digite o valor de venda do produto: ");
                    double valorVenda;
                    do {
                        while (!scanner.hasNextFloat()) {
                            System.out.println("Valor invalido!");
                        }
                        valorVenda = scanner.nextDouble();
                    } while (valorVenda <= 0);
                    scanner.nextLine();

                    System.out.println("Escolha a fabricante do produto: ");
                    int buscaId;
                    Fabricante criador;
                    fabricante.getFabricantes();
                    buscaId = scanner.nextInt();
                    criador = fabricante.getFabricanteId(buscaId);

                    sneaker.addSneaker(nome, peso, descricao, valor, valorVenda, criador);

                    break;

                case 3:
                    while (opcao != 0) {
                        System.out.println("\n|-------------------------------------------------|");
                        System.out.println("|          MENU INICIAL - [SNEAKERS]              |");
                        System.out.println("|-------------------------------------------------|");
                        System.out.println("|  04   |    Listar Fabricantes                   |");
                        System.out.println("|-------------------------------------------------|");
                        System.out.println("|  05   |    Listar Produtos                      |");
                        System.out.println("|-------------------------------------------------|");
                        System.out.println("|  06   |    Listar Produtos de Determinado UF    |");
                        System.out.println("|-------------------------------------------------|");
                        System.out.println("|  07   |    Listar Produtos de Determinada Marca |");
                        System.out.println("|-------------------------------------------------|");
                        System.out.println("|  08   |    Produto mais cara                    |");
                        System.out.println("|-------------------------------------------------|");
                        System.out.println("|  09   |    Produto mais barato                  |");
                        System.out.println("|-------------------------------------------------|");
                        System.out.println("|  10   |    Produtos em ordem crescente de valor |");
                        System.out.println("|-------------------------------------------------|");
                        System.out.println("|  11   |    Listar produtos de maior lucro       |");
                        System.out.println("|-------------------------------------------------|");
                        System.out.println("|  00    |    Retorna                             |");
                        System.out.println("|-------------------------------------------------|\n");
                        System.out.println("Digite uma opção");
                        opcao = scanner.nextInt();
                        scanner.nextLine();
                        switch (opcao) {
                            case 4:
                                fabricante.getFabricantes();
                                break;
                            case 5:
                                sneaker.getSneaker();
                                break;

                            case 6:
                                System.out.println("Digite a sigla UF a ser procurada: ");
                                String sigla;
                                sigla = scanner.nextLine();
                                for (Sneaker s : sneakers) {
                                    Fabricante f = s.getFabricante();
                                    if (f.getUF().equals(sigla)) {
                                        System.out.println(s.getId() + s.getNome());
                                    }
                                }
                                break;

                            case 7:

                                break;

                            case 8:

                                break;

                            case 9:

                                break;

                            case 10:

                                break;

                            case 11:

                                break;

                            case 0:

                                break;
                            default:
                                break;
                        }
                    }

                default:
                    break;
            }
        }
    }
}
