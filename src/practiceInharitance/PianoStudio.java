package practiceInharitance;

public class PianoStudio {
int teachers=8;
int morningClass=5;}
class AfterScoolPr extends PianoStudio{
	double age1=4.5;
double age2=7.5;
}
class GroupProgramm extends AfterScoolPr{
	int numbersGroups=2;
	public static void main(String[] args) {
		GroupProgramm obj=new GroupProgramm();
		System.out.println(obj.teachers+obj.morningClass);
	}
	
	
}
