package assignment01;

public class Driver {


	public static void main(String[] args) {
		HighSchool BrooklynTech =new HighSchool("Brooklyn Tech");
		HighSchool Stuyvasent =new HighSchool("Stuyvasent");
		HighSchool StatenIslandTech = new HighSchool("Staten Island Tech");
			//end of 3 highschool objects
		Person Michelle = new Person("Michelle", 22, 03, 1998);
		Person Tina = new Person("Tina", 20, 05, 1990);
		Person Ryan = new Person("Ryan", 03, 07, 1995);
		Person Blaine = new Person("Blaine", 10, 12, 1996);
			//end of 4 persons objects

		University Bing= new University("Bing", "Johnson City");
		University BrooklynCollege= new University("Brooklyn College", "Manhattan");
			//end of 2 Universities

		Company Google= new Company("Google","LA");
			//end of 1 company
		HighSchoolStudent hsMichelle= new HighSchoolStudent(BrooklynTech, Michelle);
		HighSchoolStudent hsTina= new  HighSchoolStudent(Stuyvasent, Tina);
		HighSchoolStudent hsRyan= new  HighSchoolStudent(StatenIslandTech, Ryan);
			//end of 3 highschool students

		UniversityStudent uMichelle= hsMichelle.goToUniversity(Bing);
		UniversityStudent uRyan= hsRyan.goToUniversity(BrooklynCollege);
			//end of 2 university student

		Employee eMichelle= uMichelle.getAJob(Google,50000);
			//end of 1 employee

		System.out.println("---------------------");
		Michelle.printHistory();
		System.out.println("---------------------");
		Tina.printHistory();
		System.out.println("---------------------");
		Ryan.printHistory();
		System.out.println("---------------------");
		Blaine.printHistory();

		//HighSchoolStudent hs=Michelle.getHistory()[0];
		//System.out.println(hs.getHighschool().getName());
   }//end of main
}//end of University