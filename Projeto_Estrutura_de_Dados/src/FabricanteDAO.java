import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class FabricanteDAO {

    private final List<Fabricante> fabricantes;
    private int nextId = 1;

    Scanner scanner = new Scanner(System.in);

    public FabricanteDAO() {
        fabricantes = new ArrayList<>();
    }

    public static boolean isString(String input) {
        return input.matches("[a-zA-Z]+");
    }

    public void addFabricante(String nome, String site, int telefone, String UF) {
        Fabricante fabricante = new Fabricante(nextId, nome, site, telefone, UF);
        fabricantes.add(fabricante);
        nextId++;
        System.out.println("Fabricante adicionado");
    }

    public void getFabricantes() {
        for (Fabricante fabricante : fabricantes) {
            System.out.println("\n|---------------------------------|");
            System.out.println("|  ID          | " + fabricante.getIdFabricante());
            System.out.println("|---------------------------------|");
            System.out.println("|  NOME        | " + fabricante.getNome_fabricante());
            System.out.println("|---------------------------------|");
            System.out.println("|  SITE        | " + fabricante.getSite());
            System.out.println("|---------------------------------|");
            System.out.println("|  TELEFONE    | " + fabricante.getTelefone());
            System.out.println("|---------------------------------|");
            System.out.println("|  UF          | " + fabricante.getUF());
            System.out.println("|---------------------------------|\n");
        }
    }

    public Fabricante getFabricanteId(int id) {
        for (Fabricante fabricante : fabricantes) {
            if (fabricante.getIdFabricante() == id) {
                System.out.println("|---------------------------------|");
                System.out.println("|  ID          | " + fabricante.getUF());
                System.out.println("|---------------------------------|");
                System.out.println("|  Nome        | " + fabricante.getUF());
                System.out.println("|---------------------------------|\n");
                return fabricante;
            } else {
                System.out.println("Esse fabricante não existe!");
                return null;
            }
        }
        return null;
    }
}
