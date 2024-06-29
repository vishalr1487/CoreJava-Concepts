package polymorphism;

public class Main {
	
	// Polymorphism  : A single object showing different behavior at different stages of its life cycle.

	public static void main(String[] args) {
		
		
		Animal myAnimal = new Animal();
		Pig myPig = new Pig();
		Dog myDog = new Dog();
		Cat myCat = new Cat();
		
		
		myAnimal.animalEat();
		myAnimal.animalSleep();
		myAnimal.animalSound();
		System.out.println();
		
		myPig.animalEat();
		myPig.animalSound();
		System.out.println();
		
		myDog.animalSound();
		System.out.println();
		
		myCat.animalSleep();
		myCat.animalSound();
		
		

	}

}
