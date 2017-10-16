
package factory;


public class FabricaWolks implements FabricaDeCar {

	@Override
	public Car criarCar() {
		return new Gol();
	}

}
   
