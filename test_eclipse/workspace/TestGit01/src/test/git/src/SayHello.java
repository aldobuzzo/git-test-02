package test.git.src;

public class SayHello {

	public SayHello() {
		super();
	}
	public void sayHelloToMother(){
		System.out.println("Hello Mumm");
	}
	public void sayHello(String who){
		//Fix who is he? inizio 
		//String hello = who != null && who.length() > 0 ? "Hello " + who: "Hello";
		String hello = "Hello ";
		if (who != null && who.length() > 0 ){
			hello = hello + who;
		} else {
			hello = hello + ".... What is your name?";
		}
		// //Fix who is he? fine
		System.out.println(hello);
	}
	
}
