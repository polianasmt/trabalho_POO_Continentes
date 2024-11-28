import java.util.ArrayList;
import java.util.List;

public class Continente {
    private String nome;
    private List<Pais> paises;

    public Continente(String nome) {
        this.nome = nome;
        this.paises = new ArrayList<>();
    }

    public void adicionaPais(Pais pais){
        paises.add(pais);
    }

    public double dimensaoTotal(){
        double dimensaoTotal = 0;
        for(Pais p: paises){
            dimensaoTotal += p.getArea();
        }
        return dimensaoTotal;
    }

    public double populacaoTotal(){
        double populacaoTotal = 0;
        for(Pais p: paises){
            populacaoTotal += p.getPopulacao();
        }
        return populacaoTotal;
    }

    public double densidadePopulacional(){
        return dimensaoTotal() / populacaoTotal();
    }

    public Pais menorPopulacao(){
        Pais menorPopulacao = null;
        long menor = Integer.MAX_VALUE;
        for(Pais p: paises){
            if(p.getPopulacao() < menor){
                menor = p.getPopulacao();
                menorPopulacao = p;
            }
        }
        return menorPopulacao;
    }

    public Pais maiorPopulacao(){
        Pais maiorPopulacao = null;
        long maior = Integer.MIN_VALUE;
        for(Pais p: paises){
            if(p.getPopulacao() > maior){
                maior = p.getPopulacao();
                maiorPopulacao = p;
            }
        }
        return maiorPopulacao;
    }

    public Pais maiorDimensao(){
        Pais maiorDimensao = null;
        long maior = Integer.MIN_VALUE;
        for(Pais p: paises){
            if(p.getArea() > maior){
                maior = p.getPopulacao();
                maiorDimensao = p;
            }
        }
        return maiorDimensao;
    }

    public Pais menorDimensao(){
        Pais menorDimensao = null;
        long menor = Integer.MAX_VALUE;
        for(Pais p: paises){
            if(p.getArea() < menor){
                menor = p.getPopulacao();
                menorDimensao = p;
            }
        }
        return menorDimensao;
    }

    public double razaoTerritorial(){
        Pais maiorDimensao = maiorDimensao();
        Pais menorDimensao = menorDimensao();

        return maiorDimensao().getArea() / menorDimensao().getArea();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Pais> getPaises() {
        return paises;
    }

    public void setPaises(List<Pais> paises) {
        this.paises = paises;
    }
}
