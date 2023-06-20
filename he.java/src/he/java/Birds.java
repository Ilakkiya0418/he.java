package he.java;

abstract class Birds {
	
  abstract void fly();
  abstract void eat();
}


abstract class Eagle extends Birds{
  void fly() {
	 
   System.out.println("great height");
  } 
}
class Serpent extends Eagle{
   void eat() {
	   System.out.println("snacks");
   }
}
class Golden extends Eagle{
	   void eat() {
		   System.out.println("fish");
	   }
}
class Forest{
 static void permit(Eagle ref)
 {
	 ref.fly();
	 ref.eat();
 }
 }
 class Main{
	public  void main(String[] args) {
		
		Serpent s=new Serpent();
		Golden g=new Golden();	
		Forest.permit(g);
		Forest.permit(s);
	}
 }

