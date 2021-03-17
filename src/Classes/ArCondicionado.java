package Classes;

import interfaces.InterfaceAp;

/**
 * @author Aires Ribeiro
 */
public class ArCondicionado extends Acessorios {
    
    protected double precoAr = 2000.0;
    
    public ArCondicionado(InterfaceAp objeto) {
        super(objeto);
    }

    public double getPrecoAr() {
        return this.precoAr;
    }

      @Override
    public String tipoDeApartamento() {
        return this.objeto.tipoDeApartamento() + ", no valor de R$: " + objeto.precoDoApto()
                + "\n+ Acessório: Ar Condicionado"
                + ", no valor de R$: " + this.precoAr + "\n";
    }
    
    @Override
    public double precoDoApto() {
        return this.objeto.precoDoApto() + this.getPrecoAr();
    }
    
      @Override
    public String toString() {
        return "Apartamento Tipo: " + this.tipoDeApartamento() 
                +"\nPreço Total R$: " + this.precoDoApto();
    }
}
