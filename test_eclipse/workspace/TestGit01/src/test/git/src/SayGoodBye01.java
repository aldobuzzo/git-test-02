package test.git.src;

public class SayGoodBye01 {

	public SayGoodBye01() {
		
	}

	public void sayGoodBye(){
		String goodBye = new TestGitHelper().toUpperCase("good bye!");
		System.out.println(goodBye);
	}
}
