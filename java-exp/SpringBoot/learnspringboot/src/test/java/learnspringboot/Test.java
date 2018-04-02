package learnspringboot;

public class Test {

	public static void main(String[] args) {
		try {
			  Class.forName("org.postgresql.Driver");
			  //on classpath
			} catch(ClassNotFoundException e) {
			  System.out.println("not");
			}

	}

}
