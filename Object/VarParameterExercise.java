public class VarParameterExercise{
	public static void main(String[] args){
		HspMethod1 study = new HspMethod1();
		System.out.println(study.showScore("朱涵",134,144,123));
		System.out.println(study.showScore("朱涵",134,144,123,145,134));
		System.out.println(study.showScore("朱涵",134,144));
	}
}
class HspMethod1{
	public String showScore(String name, int...scores){
		int totalScore = 0;
		for ( int i = 0; i < scores.length; i++){
			totalScore += scores[i];
		}
		return name + " 有 " +scores.length + "门课的成绩总分为=" + totalScore;
	}
}