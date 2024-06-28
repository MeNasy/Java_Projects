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
												
public class Student
{
	Course course1;
	Course course2;
	Course course3;
	String name;
	String stdNo;
	int	classes;
	double avarage;
	boolean isPass;

	Student(String name, String stdNo, int classes, Course course1, Course course2, Course course3)
	{
		this.name = name;
		this.stdNo = stdNo;
		this.classes = classes;
		this.course1 = course1;
		this.course2 = course2;
		this.course3 = course3;
		this.isPass = false;
	}

	void addExamNote(int c1Not, int c2Not, int c3Not, int lesNotc1, int lesNotc2, int lesNotc3)
	{
		if (c1Not >= 0 && c1Not <= 100)
			this.course1.note = c1Not;
		if (c2Not >= 0 && c2Not <= 100)
			this.course2.note = c2Not;
		if (c3Not >= 0 && c3Not <= 100)
			this.course3.note = c3Not;
		if (lesNotc1 >= 0 && lesNotc1 <= 100)
			this.course1.lesNote = lesNotc1;
		if (lesNotc2 >= 0 && lesNotc2 <= 100)
			this.course2.lesNote = lesNotc2;
		if (lesNotc3 >= 0 && lesNotc3 <= 100)
			this.course3.lesNote = lesNotc3;
	}

	void calcAvarage()
	{

		double c1Avrg, c2Avrg, c3Avrg;
		double weidthNote, weidhLesNote;

		weidthNote = 0.80;
		weidhLesNote = 0.20;

		c1Avrg = (this.course1.note * weidthNote + this.course1.lesNote * weidhLesNote);
		c2Avrg = (this.course2.note * weidthNote + this.course2.lesNote * weidhLesNote);
		c3Avrg = (this.course3.note * weidthNote + this.course3.lesNote * weidhLesNote);
		this.avarage = (c1Avrg + c2Avrg + c3Avrg) / 3;
	}

	void isPassCourse()
	{
		calcAvarage();
		if (this.avarage > 50 )
		{

			System.out.println("------------------------------------------------------\nOrtalama: " + this.avarage + " Dersi geçtiniz.\n------------------------------------------------------\n");
			this.isPass = true;
		}
		else
			System.out.println("--------------------------------------------------------\nOrtalama: " + this.avarage + " Dersi geçemediniz !\n--------------------------------------------------------\n");
	}
	void	printStudntNote()
	{

		System.out.println("Öğrenci: " + this.name);
		System.out.println("English notu: " + this.course1.note + " Derse katilim notu: " + this.course1.lesNote);
		System.out.println("Matematik notu: " + this.course2.note + " Derse katilim notu: " + this.course2.lesNote );
		System.out.println("Fizik notu: " + this.course3.note + " Derse katilim notu: " + this.course3.lesNote + "\n");
	}
}
