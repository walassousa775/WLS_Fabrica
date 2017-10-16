
package factory;


public class FabricaFiat implements FabricaDeCar {

	@Override
	public Car criarCar() {
		return new Palio();
	}

}
  
