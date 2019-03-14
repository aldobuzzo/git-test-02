package test.git.src;

public class SayHello {

	public SayHello() {
		super();
	}
	public void sayHelloToMother(){
		System.out.println("Hello Mumm");
	}
	public void sayHello(String who){
		String hello = who != null && who.length() > 0 ? "Hello " + who: "Hello";
		System.out.println(hello);
	}
}
