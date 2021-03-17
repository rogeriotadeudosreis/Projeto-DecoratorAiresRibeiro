package Classes;

import interfaces.InterfaceAp;

/**
 * @author Aires Ribeiro
 */
public class Apartamento implements InterfaceAp {

    private String tipo = "";
    private double preco = 0.0;

    public Apartamento() {
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String tipoDeApartamento() {
        return this.tipo;
    }

    @Override
    public double precoDoApto() {
        return this.preco;
    }

    @Override
    public String toString() {
        return "Apartamento Tipo: " + this.tipoDeApartamento()
                + "\nPreco R$: " + this.precoDoApto();
    }

}
