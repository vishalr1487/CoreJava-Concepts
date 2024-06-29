package stringsPackage;

public class Sample {

	public static void main(String[] args) {
		
		
		// String is a sequence of characters and  STRING IS A CLASS AND ALSO A NON PRIMITIVE DATA TYPE.
		
		// WE CAN CREATE STRING IN 2 WAYS:
		
		
		String s1 ="hello";     //  here this memory will store in STRING POOL AREA.
		String s2 = new String("hello");  // here THIS MEMORY WILL STORED IN HEAP AREA.
		String s3="hello";
		
//		System.out.println(s1==s2);
//		System.out.println(s1==s3);
//		System.out.println(s1.equals(s2));   // here EQUALS METHOD WILL COMPARE THE DATA AND S1==S2 WILL COMPARE THE ADDRESS OF THAT VARAIBLE.
		
		String s4 ="java";
		String s5="abcdef";
		String s6="java";
		String s11="python";
		
		String s7 = new String("java");
		String s8= new String("ruby");
		String s9= new String("python");
		
		System.out.println(s4==s5);   // false
		System.out.println(s4==s6);   // true
		
		System.out.println(s4.equals(s5));   // false
		System.out.println(s4.equals(s6));    // true
		
		System.out.println(s4==s7);   /// false
		System.out.println(s4.equals(s7));  // true
		
		System.out.println(s4==s6);  // true
		System.out.println(s4==s11);  //false
		System.out.println(s11==s7);	//false
		System.out.println(s11==s9);	//false
		 
		System.out.println(s4.equals(s11));   //false
		System.out.println(s4.equals(s9));		//false
		System.out.println(s4.equals(s7));		//true
		System.out.println(s11.equals(s9));		//true
		
		

	}

}
