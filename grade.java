package instanceTest;

public class grade {

	public float setScore(float score1,float score2,float score3){
		float totalScore = score1 + score2 + score3;
		return totalScore;
		
	}
	public float setGrade(float total){
		float grade = 0;
		if(total > 100 || total < 0){
			grade = 0;
		}
		else if(total >= 80){
			grade = 1;
		}
		else if(total >= 70){
			grade = 2;
		}
		else if(total >= 60){
			grade = 3;
		}
		else if(total >= 50){
			grade = 4;
		}
		else{
			grade = 5;
		}
		return grade;
	}

}
