import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pais {
    private String codigoISO, nome;
    private long populacao;
    private double area;
    private List<Pais> listaFronteiras;

    public Pais(String codigoISO, String nome, long populacao, long area) {
        this.codigoISO = codigoISO;
        this.nome = nome;
        this.populacao = populacao;
        this.area = area;
        this.listaFronteiras = new ArrayList<>();
    }

    //não permite a criação de dois países com o mesmo código ISO, por meio de uma verificação via equals/hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pais pais = (Pais) o;
        return Objects.equals(codigoISO, pais.codigoISO);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigoISO);
    }

    public boolean ehLimitrofe(Pais pais){
        return listaFronteiras.contains(pais);
    }

    public double densidadePopulacional() {
        return populacao / area;
    }

    public List<Pais> vizinhosComuns(Pais outroPais){
        List<Pais> vizinhosComuns = new ArrayList<>();

        for (Pais p: listaFronteiras) {
            if(outroPais.getListaFronteiras().contains(p)){
                vizinhosComuns.add(p);
            }
        }

        return vizinhosComuns;
    }

    public String getCodigoISO() {
        return codigoISO;
    }

    public void setCodigoISO(String codigoISO) {
        this.codigoISO = codigoISO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getPopulacao() {
        return populacao;
    }

    public void setPopulacao(long populacao) {
        this.populacao = populacao;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public List<Pais> getListaFronteiras() {
        return listaFronteiras;
    }

    public void setListaFronteiras(List<Pais> listaFronteiras) {
        this.listaFronteiras = listaFronteiras;
    }
}
