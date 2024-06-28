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
												
public class Ring
{
	Fighter	fighter1;
	Fighter	fighter2;
	int		minWeight;
	int		maxWeight;

	Ring(Fighter fighter1, Fighter fighter2)
	{
		if (whoStart())
		{
			this.fighter1 = fighter1;
			this.fighter2 = fighter2;
		}
		else
		{
			this.fighter1 = fighter2;
			this.fighter2 = fighter1;
		}
		this.maxWeight = 120;
		this.minWeight = 90;
	}
	void	startFight()
	{
		if (!((this.fighter1.weight > 90 && this.fighter1.weight <= maxWeight)
			&& (this.fighter2.weight > 90 && this.fighter2.weight <= maxWeight)))
		{
			System.err.println("\nDövüşçüler ayni siklette olmadiği için dövüş yapilamadi !");
			return ;
		}
		if (this.fighter1.health > 0 && this.fighter2.health > 0)
			System.out.println("\n********** Ilk hasari " + this.fighter1.name +" vuracak ! *******\n");
		while (this.fighter1.health > 0 && this.fighter2.health > 0)
		{
			System.out.println("-------------------NEW RAUND--------------------");
			this.fighter2.health = this.fighter1.hit(this.fighter2);
			if (isFinish())
				return ;
			this.fighter1.health = this.fighter2.hit(this.fighter1);
			if (isFinish())
				return ;
			printScore();
		}
		isFinish();
	}

	boolean isFinish()
	{
		if (this.fighter1.health <= 0)
		{
			System.out.println("\nMaçi kazanan >>>>>>>>>> " + this.fighter2.name + " <<<<<<<<<<<<<<\n");
			printScore();
			return(true);
		}
		if (this.fighter2.health <= 0)
		{
			System.out.println("\nMaçi kazanan  >>>>>>>>>> " + this.fighter1.name + " <<<<<<<<<<<<<<\n");
			printScore();
			return(true);
		}
		return(false);
	}

	boolean whoStart()
	{
		double randNum;

		randNum = Math.random() * 100;
		if (randNum >= 50)
			return (true);
		return (false);
	}
	public void	printScore()
	{
		System.out.println("================================================");
		System.out.println(this.fighter1.name + " Kalan can: " + this.fighter1.health);
		System.out.println(this.fighter2.name + " Kalan can: " + this.fighter2.health);
		System.out.println("================================================");
	}
}
