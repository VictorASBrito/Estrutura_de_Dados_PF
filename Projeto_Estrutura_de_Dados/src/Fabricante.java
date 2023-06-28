public class Fabricante {
    private int idFabricante;
    private String nome_fabricante;
    private String site;
    private int telefone;
    private String UF;

    public Fabricante(int idFabricante, String nome_fabricante, String site, int telefone, String UF) {
        this.idFabricante = idFabricante;
        this.nome_fabricante = nome_fabricante;
        this.site = site;
        this.telefone = telefone;
        this.UF = UF;
    }

    public int getIdFabricante() {
        return idFabricante;
    }

    public void setIdFabricante(int idFabricante) {
        this.idFabricante = idFabricante;
    }

    public String getNome_fabricante() {
        return nome_fabricante;
    }

    public void setNome_fabricante(String nome_fabricante) {
        this.nome_fabricante = nome_fabricante;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String uF) {
        UF = uF;
    }

}
