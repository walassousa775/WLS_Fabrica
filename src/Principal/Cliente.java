
package Principal;

import Builder.CarroProduct;
import Builder.ConcessionariaDirector;
import Builder.FiatBuilder;
import Builder.VolksBuilder;

import Composite.Carro;
import Composite.Garagem;

import Decorator.Acessorios;
import Decorator.Ar;
import Decorator.Direcao;
import Decorator.Veiculo;

import factory.Car;
import factory.FabricaDeCar;
import factory.FabricaFiat;
import factory.FabricaWolks;


public class Cliente {

        
    public static void main(String[] args) {
        
                   /* Factory */ 
        FabricaDeCar fabrica = new FabricaFiat();
        Car car = fabrica.criarCar();
        car.exibirInformacao();
        System.out.println();
	
        fabrica = new FabricaWolks();
        car = fabrica.criarCar();
        car.exibirInformacao();
        System.out.println();
        
                            /* Builder*/  
        ConcessionariaDirector concessionaria = new ConcessionariaDirector(
	new FiatBuilder());
	 
	concessionaria.construirCarro();
	CarroProduct carro = concessionaria.getCarro();
	System.out.println("Carro: " + carro.modelo + "/" + carro.montadora
	        + "\nAno: " + carro.anoDeFabricacao + "\nMotor: "
	        + carro.dscMotor + "\nValor: " + carro.preco);
	 
	System.out.println();
	 
	concessionaria = new ConcessionariaDirector(new VolksBuilder());
	concessionaria.construirCarro();
	carro = concessionaria.getCarro();
	System.out.println("Carro: " + carro.modelo + "/" + carro.montadora
	        + "\nAno: " + carro.anoDeFabricacao + "\nMotor: "
	        + carro.dscMotor + "\nValor: " + carro.preco);
        System.out.println();
        
                     /* Decorator*/      
        Veiculo veiculo = new Veiculo(35000);
     
        Acessorios comar = new Ar();
        Acessorios comdirecao = new Direcao();
        Acessorios aredirecao = new Ar(new Direcao());
        
        double valor1 = comar.calculavalor(veiculo);
        System.out.println(valor1);
        
        double valor2 = comdirecao.calculavalor(veiculo);
        System.out.println(valor2);
        
        double valor3 = aredirecao.calculavalor(veiculo);
        System.out.println(valor3);
        
        System.out.println();
        
                                
        
                            /* Composite*/ 
        Carro carro1 = new Carro("Gol","VW",2000,"Branco");
        Carro carro2 = new Carro("Corsa","GM",2005,"Preto");
        Carro carro3 = new Carro("Palio","Fiat",2007,"Prata");
        
        Garagem novaGaragem = new Garagem(1);
        novaGaragem.adicionaCarro(carro1);
        novaGaragem.adicionaCarro(carro2);
        novaGaragem.adicionaCarro(carro3);
        
        System.out.println(novaGaragem.getListaCarros().get(1).getNome());
        System.out.println(novaGaragem.getListaCarros().get(2).getNome());
        
        

		

	}
}


