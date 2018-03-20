package FacadePattern.demo;

public class Client {

	public static void main(String args[]) {
		TrainBooker trainSystem = new TrainBookerImpl();
		PlaneBooker planeSystem = new PlaneBookerImpl();
		CarRental carSystem = new CarBookerImpl();
				
		System.out.println("Accesing subsystems without facade");
		trainSystem.bookTrain();
		planeSystem.bookPlane();
		carSystem.rentCar();
		
		
		
		TicketBookerImpl system = new TicketBookerImpl();
		
		System.out.println("accesing subsystems with facade");
		system.bookTrain();
		system.bookPlane();
		system.rentCar();
		
	}
	
	
}
