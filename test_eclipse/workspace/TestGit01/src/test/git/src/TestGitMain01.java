package test.git.src;

public class TestGitMain01 {

	public static void main(String[] args) {
		System.out.println("Start Main program");
		SayHello01 sayHello = new SayHello01();
		sayHello.sayHello();
		System.out.println("Call Hello2");
		SayHello02 sayHello2 = new SayHello02();
		sayHello2.sayHello();
		System.out.println("Call Good Bye");
		SayGoodBye01 sayGoodBye = new SayGoodBye01();
		sayGoodBye.sayGoodBye();
		
		SayGoodNight sayGoodNight = new SayGoodNight();
		sayGoodNight.sayGoodNight();
		sayGoodNight.sayGoodNightToFriend();
		
		AmStillAwake amStillAwake = new AmStillAwake();
		amStillAwake.stillAwaked();
		System.out.println("End Main program");
	}

}
