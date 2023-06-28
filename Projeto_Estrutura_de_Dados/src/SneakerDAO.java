import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SneakerDAO {

    private final List<Sneaker> sneakers;
    private int nextId;

    Scanner scanner = new Scanner(System.in);
    Fabricante fabricante = new Fabricante(nextId, null, null, nextId, null);

    public SneakerDAO() {
        sneakers = new ArrayList<>();
        nextId = 1;
    }

    public static boolean isString(String input) {
        return input.matches("[a-zA-Z]+");
    }

    public void addSneaker(String nome, double peso, String descricao, double valor, double valorVenda,
            Fabricante fabricante) {
        Sneaker sneaker = new Sneaker(nextId, nome, peso, descricao, valor, valorVenda, fabricante);
        sneakers.add(sneaker);
        nextId++;
        System.out.println("Sneaker Adicionado com Sucesso!");
    }

    public void getSneaker() {
        for (Sneaker sneaker : sneakers) {
            System.out.println("\n|---------------------------------|");
            System.out.println("|  ID          | " + sneaker.getId());
            System.out.println("|---------------------------------|");
            System.out.println("|  NOME        | " + sneaker.getNome());
            System.out.println("|---------------------------------|");
            System.out.println("|  PESO        | " + sneaker.getPeso());
            System.out.println("|---------------------------------|");
            System.out.println("|  DESCRIÇÃO   | " + sneaker.getDescricao());
            System.out.println("|---------------------------------|");
            System.out.println("|  VALOR       | " + sneaker.getValor());
            System.out.println("|---------------------------------|");
            System.out.println("|  VALOR VENDA | " + sneaker.getValorVenda());
            System.out.println("|---------------------------------|");
            System.out.println("|  LUCRO       | " + sneaker.getValorLucro());
            System.out.println("|---------------------------------|");
            System.out.println("|  LUCRO%      | " + sneaker.getPercentualLucro() + "%");
            System.out.println("|---------------------------------|");
            System.out.println("|  FABRICANTE  | " + sneaker.getFabricante());
            System.out.println("|---------------------------------|\n");

        }
    }

}
