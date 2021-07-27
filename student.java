package instanceTest;
import java.util.Scanner;
public class student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		float score1 , score2 , score3;
		System.out.print("Enter score 1 (30 point) : ");
		score1 = input.nextFloat();
		System.out.print("Enter score 2 (30 point) : ");
		score2 = input.nextFloat();
		System.out.print("Enter score 3 (40 point) : ");
		score3 = input.nextFloat();
		
		if(score1>30 || score2>30 || score3>40){
			System.out.print("Score over limit");
		}
		else if(score1<0 || score2<0 || score3<0){
			System.out.print("Score over limit");
		}
		else{
			grade p = new grade();
			float total = p.setScore(score1,score2,score3);
			float grade = p.setGrade(total);
			String gr = null;
			if(grade == 0){
				gr = "Score Error";
			}
			else if(grade == 1){
				gr = "A";
			}
			else if(grade == 2){
				gr = "B";
			}
			else if(grade == 3){
				gr = "C";
			}
			else if(grade == 4){
				gr = "D";
			}
			else if(grade == 5){
				gr = "Not Pass";
			}
			System.out.println("Total Score = " + total);
			System.out.println("Grade = " + gr);
		}
		
		
		
	
	}

}
