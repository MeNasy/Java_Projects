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
												
public class Course
{
	Teacher teacher;
	String name;
	String code;
	String lesCode;
	int	lesNote;
	int	note;

	Course(String name, String code, String lesCode, Teacher teacher)
	{
		this.name = name;
		this.code = code;
		this.lesCode = lesCode;
		this.note = 0;
		this.lesNote = 0;
		addTeacher(teacher);
	}
	void addTeacher(Teacher teacher)
	{
		if (teacher.branch.equals(this.lesCode))
			this.teacher = teacher;
		else
			System.err.println("Oğretmen bu kursa uygun değildir !");
	}

	void printTeacher()
	{
		if (this.teacher != null)
			System.out.println(this.name + " Dersinin oğretmeni: "+ this.teacher.name);
		else
			System.out.println(this.name + " Dersine Oğretmen atanmamiştir !");
	}
}
