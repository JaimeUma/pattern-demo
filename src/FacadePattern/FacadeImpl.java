package FacadePattern;

public class FacadeImpl implements ServiceFacade {
	private Subsystem1 s1;
	private Subsystem2 s2;
	private Subsystem3 s3;

	public FacadeImpl() {
		s1 = new Subsystem1Impl();
		s2 = new Subsystem2Impl();
		s3 = new Subsystem3Impl();
	}

	@Override
	public void doSomething() {
		s1.doSomething();

	}

	@Override
	public void doSomethingElse() {
		s2.doSomethingElse();

	}

	@Override
	public void doSomethingElseToo() {
		s3.doSomethingElseToo();

	}

}
