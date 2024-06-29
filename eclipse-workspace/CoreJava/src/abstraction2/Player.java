package abstraction2;

public class Player {

	String Playername;
	int Score;
	
	public void accept(String Playername, int Score)
	{
		
		 this.Playername=Playername;
		 this.Score=Score;
		 
	}
	// Default constructor
	Player(){
		
	}
	// Parameterized constructor
	Player(String Playername, int Score){
		this.Playername=Playername;
		 this.Score=Score;
		
		
	}
	

	public void show(){
		System.out.println("Playername :"+ this.Playername );
		System.out.println("Score :" + this.Score );
		
	}
	
	
}

	

