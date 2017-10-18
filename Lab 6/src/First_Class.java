
public class First_Class extends Vehicle {

	
	public static void main(String []args) {
		
		Car objCar = new Car();
		Bus objBus = new Bus();
		Ship objShip = new Ship();
		Boat objBoat = new Boat();
		Airplane objAirplane = new Airplane();
		Helicopter objJHelicopter = new Helicopter();
		
		
		objCar.speed(10);
		objCar.isRunning();
		
		objBoat.speed(6);
		objBoat.isRunning();
		
		objBus.speed(15);
		objBus.isRunning();
		
		objJHelicopter.speed(100);
		objJHelicopter.isRunning();
		
		Vehicle objVehicle = new Boat();
		
		try {
			
			if(objVehicle instanceof Car) {
				System.out.println("Instance of Car");
			}
		}catch (Exception e) {
				System.out.println("Not instance of Car");
				
			}
		}

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void isRunning() {
		// TODO Auto-generated method stub
		
	}
	}
	
