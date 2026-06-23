package Interview;
abstract class vehicle{
abstract void start();
  void fuel(){
	  System.out.println("Filling fuel");
  }
}
 class mycar extends  vehicle{
   void start() {
  System.out.println("vehicle Start");
 }
 }
 public  class abbs{
  public static void main(String[] agrs) {
  mycar R = new mycar();
	  R.start();
     R.fuel();
}}
