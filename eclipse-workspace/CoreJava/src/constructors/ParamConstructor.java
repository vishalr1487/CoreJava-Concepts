package constructors;

public class ParamConstructor {

	String movieName;
	int Duration;
	double Collection;

	public ParamConstructor(String name, int dur, double col) {

		movieName = name;
		Duration = dur;
		Collection = col;

	}

	public static void main(String[] args) {

		ParamConstructor pc = new ParamConstructor("KGF", 3, 5089000);
		System.out.println(pc.movieName);
		System.out.println(pc.Duration);
		System.out.println(pc.Collection);

		ParamConstructor pc2 = new ParamConstructor("MAAHI", 5, 60987990);
		System.out.println(pc2.movieName);
		System.out.println(pc2.Duration);
		System.out.println(pc2.Collection);

	}

}
