 package Interview;
//Single Inheritance:
class Delhi {
    void nation() {
        System.out.println("India is a nation");
    }
}

class Indian extends Delhi {
    void capital() {
        System.out.println("Delhi is the capital of India");
    }
    public static void main(String[] args) {
        Indian r = new Indian();
        r.nation();   // Parent class method
        r.capital();  // Child class method
    }
}