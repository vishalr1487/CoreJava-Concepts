package abstraction2;

public class Game {

	public static void main(String[] args) {
		
		Player p1= new Player();
		Player p2= new Player();

		
		p1.accept("Virat", 500);
		p1.show();
		p2.accept("Vishal", 200);
		p2.show();
		if(p1.Score>p2.Score){
			System.out.println("Virat is Winner");
			
		}else{
			System.out.println("Vishal is winner");
		}
	}

}
