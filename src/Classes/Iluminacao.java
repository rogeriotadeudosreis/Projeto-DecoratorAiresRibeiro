package Classes;

import interfaces.InterfaceAp;

/**
 * @author Aires Ribeiro
 */
public class Iluminacao extends Acessorios {

    protected double precoDaIluminacao = 500.0;

    public Iluminacao(InterfaceAp objeto) {
        super(objeto);
    }

    public double getPrecoDaIluminacao() {
        return this.precoDaIluminacao;
    }
    
    @Override
    public String tipoDeApartamento() {
        return this.objeto.tipoDeApartamento() + ", no valor de R$: " + objeto.precoDoApto()
                 + "\n+ Acessório: Iluminação "
                 + ", no valor de R$: " + this.precoDaIluminacao;
    }

    @Override
    public double precoDoApto() {
        return this.objeto.precoDoApto() + this.getPrecoDaIluminacao();
    }

    @Override
    public String toString() {
        return "Apartamento tipo: " + this.tipoDeApartamento()
                +"\nPreço R$: " + this.precoDoApto();
    }
}
