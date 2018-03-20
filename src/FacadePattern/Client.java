package FacadePattern;

public class Client {

	public static void main(String args[]) {
		Subsystem1 s1 = new Subsystem1Impl();
		Subsystem2 s2 = new Subsystem2Impl();
		Subsystem3 s3 = new Subsystem3Impl();
				
		System.out.println("Accesing subsystems without facade");
		s1.doSomething();
		s2.doSomethingElse();
		s3.doSomethingElseToo();
		
		
		
		FacadeImpl s = new FacadeImpl();
		
		System.out.println("accesing subsystems with facade");
		s.doSomething();
		s.doSomethingElse();
		s.doSomethingElseToo();
		
	}
	
	
}
