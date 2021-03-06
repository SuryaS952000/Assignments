package assignment;
class Problem{
	int credits;
	String type;
	public Problem(int credits,String type) {
		this.credits=credits;
		this.type=type;
	}
}

class Checker{
	public String checkProblem(Problem p) throws Exception{
		if(p.credits<10) {
			throw new ProblemException("Insufficient credits");
		}
		else if(p.type.equals("String")){
			throw new ProblemException("String problem found");
		}
		else if(p.type.equals("Generic")) {
			throw new ProblemException("Generic problem found");
		}
		else if(p.type.equals("I/O")) {
			throw new ProblemException("I/O problem found");
		}
		else {
			return "Exception problem found";
		}
	}
	public String approveProblem(Problem p) throws Exception{
		try {
			checkProblem(p);
		} 
		catch (ProblemException e) {
			return "Not approved";
		}
		catch(Exception e) {
			return "Other exception";
		}
		return "Problem approved";
	}
}

class ProblemException extends Exception{
	public ProblemException(String msg) {
		super(msg);
	}
}

public class Question3 {

	public static void main(String[] args) throws Exception{
		Problem p=new Problem(41, "Exception");
		Checker c=new Checker();
		String s=c.checkProblem(p);
		String t=c.approveProblem(p);
		System.out.println(s);
		System.out.println(t);
		
	}

}
