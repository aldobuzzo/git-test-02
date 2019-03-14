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
		//Feature20190310-01 Commit Feature Having Lunch
		 new  SayHavingLunch().sayHavingLunch();
		//Feature20190310-01 fine
		//Feature20190310-01 Commit Feature Having Lunch with Sister
		 new  SayHavingLunch().sayHavingLunchWithSister();
		//Feature20190310-01 fine
		SayGoodBye01 sayGoodBye = new SayGoodBye01();
		sayGoodBye.sayGoodBye();
		
		SayGoodNight sayGoodNight = new SayGoodNight();
		sayGoodNight.sayGoodNight();
		//Test Merge Manually again
		sayGoodNight.sayGoodNightAgain();
		//Test Merge Manually Again
		sayGoodNight.sayGoodNightToFriend();
		// hotfix 20190301-01 inizio
		if (Father.isFatherAwaked()) {
			// hotfix 20190301-01 fine
			// hotfix 20190226-01 inizio
			sayGoodNight.sayGoodNightToFather();
			// hotfix 20190301-01 inizio
		}
		// hotfix 20190301-01 fine
		// hotfix 20190226-01 fine
		
		//Feature 20190301-01 Syster GoodByte inizio
		if (Sister.isSisterAwaked()){
			sayGoodNight.sayGoodNightSister();
		}
		//Feature 20190301-01 Syster GoodByte fine		
		AmStillAwake amStillAwake = new AmStillAwake();
		amStillAwake.stillAwaked();
		System.out.println("End Main program");
	}

}
