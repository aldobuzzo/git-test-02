package test.git.src;

public class SayGoodBye01 {

	public SayGoodBye01() {
		
	}

	public void sayGoodBye(){
		//TestRebase Collaudo inizio
//		String goodBye = new TestGitHelper().toUpperCase("good bye!");
		String goodBye = new TestGitHelper().toLowerCase("good bye!");
		//TestRebase Collaudo inizio
		System.out.println(goodBye);
	}
}
