package Interview;
//Constructor
	class Constractor {
	    String model; // Constructor
	    Constractor() {
	        model = "BMW";
	    }
	    void display() {
	        System.out.println("Constractor Model " + model);
	    }
	    public static void main(String[] args) {
	    	Constractor c1 = new Constractor();   // constructor called
	        c1.display();
	    }
	}

