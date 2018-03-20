package FacadePattern.demo;

public class TicketBookerImpl implements TicketBooker {
	private TrainBooker s1;
	private PlaneBooker s2;
	private CarRental s3;

	public TicketBookerImpl() {
		s1 = new TrainBookerImpl();
		s2 = new PlaneBookerImpl();
		s3 = new CarBookerImpl();
	}

	@Override
	public void bookTrain() {
		s1.bookTrain();

	}

	@Override
	public void bookPlane() {
		s2.bookPlane();

	}

	@Override
	public void rentCar() {
		s3.rentCar();

	}

}
