package he.java;
class Animal{
	void eat(){
		System.out.println("Animal is eaten");
	}
	void breath(){
		System.out.println("breath is normal");
	}
	void foodhabit(){
		System.out.println("FoodHabit is different");
	}
}
class Dear extends Animal{
	void eat(){
		System.out.println("Dear are grasses");
	}
	void foodhabit(){
		System.out.println("Herbivourus");
	}
	void nature(){
		System.out.println("soft");
	}
}
class Tiger extends Animal{
	void eat(){
		System.out.println("Dear are hunt and eat");
	}
	void foodhabit(){
		System.out.println("carnivourus");
	}
	void nature(){
		System.out.println("fire");
	}
}
class Monkey extends Animal{
	void eat(){
		System.out.println("Dear are steal and eat");
	}
	void foodhabit(){
		System.out.println("omminivourus");
	}
	void nature(){
		System.out.println("cute");
	}
}
public class A1 {

	public static void main(String[] args) {
		Dear d=new Dear();
		d.eat();
		d.breath();
		d.foodhabit();
		Tiger t=new Tiger();
		t.eat();
		t.breath();
		t.foodhabit();
		Monkey m=new Monkey();
			m.eat();
			m.breath();
			m.foodhabit();
		
	}

}
