package Classes;

import interfaces.InterfaceAp;

/**
 * @author Aires Ribeiro
 */
public class Porta extends Acessorios {

    protected double precoDaPorta = 1500.0;

    public Porta(InterfaceAp objeto) {
        super(objeto);
    }

    public double getPrecoDaPorta() {
        return this.precoDaPorta;
    }

    @Override
    public String tipoDeApartamento() {
        return this.objeto.tipoDeApartamento() + ", no valor de R$: " + objeto.precoDoApto()
                + "\n+ Acessório: Porta"
                + " no valor de R$: " + this.precoDaPorta+ "\n";
    }

    @Override
    public double precoDoApto() {
        return this.objeto.precoDoApto() + this.getPrecoDaPorta();
    }

    @Override
    public String toString() {
        return "Apartamento tipo: " + this.tipoDeApartamento()
                + "\nPreco Total R$: " + this.precoDoApto();
    }
}
