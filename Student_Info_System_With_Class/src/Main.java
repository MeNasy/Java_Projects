/*
 ███▄ ▄███▓▓█████  ███▄    █  ▄▄▄        ██████▓██   ██▓
▓██▒▀█▀ ██▒▓█   ▀  ██ ▀█   █ ▒████▄    ▒██    ▒ ▒██  ██▒
▓██    ▓██░▒███   ▓██  ▀█ ██▒▒██  ▀█▄  ░ ▓██▄    ▒██ ██░
▒██    ▒██ ▒▓█  ▄ ▓██▒  ▐▌██▒░██▄▄▄▄██   ▒   ██▒ ░ ▐██▓░
▒██▒   ░██▒░▒████▒▒██░   ▓██░ ▓█   ▓██▒▒██████▒▒ ░ ██▒▓░
░ ▒░   ░  ░░░ ▒░ ░░ ▒░   ▒ ▒  ▒▒   ▓▒█░▒ ▒▓▒ ▒ ░  ██▒▒▒
░  ░      ░ ░ ░  ░░ ░░   ░ ▒░  ▒   ▒▒ ░░ ░▒  ░ ░▓██ ░▒░
░      ░      ░      ░   ░ ░   ░   ▒   ░  ░  ░  ▒ ▒ ░░
       ░      ░  ░         ░       ░  ░      ░  ░ ░
                                                ░ ░*/
												
public class Main
{
	public static void main(String[] args)
	{
		Teacher t1 = new Teacher("Metin", "7347","FalseCode");
		Teacher t2 = new Teacher("Murat", "3434","PHYSC");
		Teacher t3 = new Teacher("Levent", "4747","MAT");

		// Teacher class info
		System.out.println("=================================");
		t1.printTeacherInfo();
		System.out.println("=================================");
		t2.printTeacherInfo();
		System.out.println("=================================");
		t3.printTeacherInfo();
		System.out.println("=================================\n");

		Course c1 = new Course("English","101" , "ENG", t1);//False code for check else condition
		Course c2 = new Course("Fizik","102" , "PHYSC", t2);
		Course c3 = new Course("Matematik","103" , "MAT", t3);

		//Course info
		c1.printTeacher(); // After false code write else
		System.out.println("=================================");
		c2.printTeacher();
		System.out.println("=================================");
		c3.printTeacher();
		System.out.println("=================================");

		Student stdnt1 = new Student("Ferdi Kadioğlu", "7", 4, c1, c2, c3);
		Student stdnt2 = new Student("Jayden Osterwolde", "24", 2, c1, c2, c3);
		Student stdnt3 = new Student("Fred", "8", 1, c1, c2, c3);

		//Student Notes and notes avarage check
		stdnt1.addExamNote(85, 100, 80, 100, 85, 75);
		System.out.println("\n==================================================================");
		stdnt1.printStudntNote();
		stdnt1.isPassCourse();
		stdnt3.addExamNote(10, 50, 20, 30, 20, 10);
		System.out.println("==================================================================");
		stdnt2.printStudntNote();
		stdnt2.isPassCourse();
		stdnt2.addExamNote(85, 75, 70, 95, 80, 75);
		System.out.println("==================================================================");
		stdnt3.printStudntNote();
		stdnt3.isPassCourse();
		System.out.println("==================================================================");

		//ispass check
		System.out.println(stdnt1.name + " Pass status: " + stdnt1.isPass);
		System.out.println(stdnt2.name + " Pass status: " + stdnt2.isPass);
		System.out.println(stdnt3.name + " Pass status: " + stdnt3.isPass);;
	}
}
