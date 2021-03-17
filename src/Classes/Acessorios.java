package Classes;

import interfaces.InterfaceAp;

/**
 * @author Aires Ribeiro
 */
public abstract class Acessorios implements interfaces.InterfaceAp {

    protected InterfaceAp objeto;
    
    public Acessorios(InterfaceAp objeto) {
        this.objeto = objeto;
    }

    @Override
    public String tipoDeApartamento() {
        return this.objeto.tipoDeApartamento();
    }

    @Override
    public double precoDoApto() {
        return this.objeto.precoDoApto();
    }
    
}
