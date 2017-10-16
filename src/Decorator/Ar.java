
package Decorator;


public class Ar extends Acessorios {
    
    public Ar(Acessorios outroAcessorio){
        super(outroAcessorio);
    }
    public Ar(){
    }

    @Override
    public double calculavalor(Veiculo veiculo) {
        System.out.println("Ar-Condicionado");
        return 2000 + calcula(veiculo);
    } 
}
