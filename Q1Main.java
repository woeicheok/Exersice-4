class QuestionOne {
	private int count;
	
	public void QuestionOne(){  //replace init() method with a constructor 		
      count = 1;
	}
	public void increment(){
		count = count + 1;
	}
	public int getCount(){
		return count;
	}
}
public class Q1Main{
	public static void main (String []arg){
   	QuestionOne q1;
   	q1 = new QuestionOne();
      q1.QuestionOne(); //Modify the main() method 
      q1.increment();
   	q1.increment();
   	System.out.println(q1.getCount());
	}
}