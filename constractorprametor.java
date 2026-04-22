package Interview;
//Parameterized Constructor
public class constractorpra {
	    String name;
	    int age;
	    // Parameterized Constructor
	    constractorpra(String n, int a) {
	        name = n;
	        age = a;
	    }
	    void display() {
	        System.out.println(name + " " + age);
	    }
	    public static void main(String[] args) {
	    	constractorpra s1 = new constractorpra("Ramesh", 25);
	        s1.display();
	    }
	}

