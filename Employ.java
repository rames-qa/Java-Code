package Interview;

class Employeee {

    int id;

    Employeee(int id) {
        this.id = id;
    }
}

public class Employ {
    public static void main(String[] args) {

        Employeee e1 = new Employeee(101);
        Employeee e2 = new Employeee(101);

        System.out.println(e1 == e2);
        System.out.println(e1.equals(e2));
    }
}