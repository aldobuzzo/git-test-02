package test.git.src;

public class TestGitMain01 {

	public static void main(String[] args) {
		//Test Tag
		//Test Merge from Tag
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
		//Test Merge Manually again
		sayGoodNight.sayGoodNightAgain();
		//Test Merge Manually Again
		sayGoodNight.sayGoodNightToFriend();
		
		//hotfix 20190226-01 inizio
		sayGoodNight.sayGoodNightToFather();
		//hotfix 20190226-01 fine
		AmStillAwake amStillAwake = new AmStillAwake();
		amStillAwake.stillAwaked();
		System.out.println("End Main program");
	}

}
