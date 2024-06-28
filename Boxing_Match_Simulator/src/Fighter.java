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
												
public class Fighter
{
	String	name;
	Ring	hackCheck;
	int		damage;
	int		health;
	int		weight;
	double	dodge;

	Fighter(String name, int damage, int health, int weight)
	{
		this.name = name;
		this.health = health;
		this.weight = weight;
		if (damage > 100)
		{
			System.out.println("\n---Hile yapanlar yenilmeye mahkumdur !---\n--Vurulacak hasar 100 den fazla olamaz !--");
			this.health = 0;
		}
		else
			this.damage = damage;
	}
	int hit(Fighter defender)
	{
		System.out.println(this.name + " => " + defender.name + " " + this.damage + " Hasar vurdu !");
		if (isDodge())
		{
			System.out.println(defender.name + " Gelen hasari savuşturdu !");
			return (defender.health);
		}
		if (defender.health - this.dodge <= 0)
			return (0);
		return (defender.health - this.damage);
	}

	boolean isDodge()
	{
		double randomVal;

		randomVal = Math.random() * 100;
		return (this.damage <= randomVal);

	}
}
