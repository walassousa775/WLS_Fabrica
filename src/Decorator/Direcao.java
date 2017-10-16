
package Decorator;


public class Direcao extends Acessorios {
    
    public Direcao(Acessorios outroAcessorio){
        super(outroAcessorio);
    }
    public Direcao(){
    }


    @Override
    public double calculavalor(Veiculo veiculo) {
        System.out.println("Direçao Hidráulica");
        return 700 + calcula(veiculo);
    } 
}
