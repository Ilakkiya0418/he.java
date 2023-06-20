package he.java;
class Heart{
	private int weight; //private solanum
	private int bp;
	public Heart(int weight, int bp) {
		super();
		this.weight = weight;
		this.bp = bp;
	}
	public int getWeight() {
		return weight;
	}
	
	public int getBp() {
		return bp;
	}
	
}
class Brain{
	private String color;
	private int weight;
	public Brain(String color, int weight) {
		super();
		this.color = color;
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
}
class Bike{
	private String brand;
	private int milage;
	public Bike(String brand, int milage) {
		super();
		this.brand = brand;
		this.milage = milage;
	}
	public String getBrand() {
		return brand;
	}
	public int getMilage() {
		return milage; 
	}
}
class Book{
	private String author;
	private String bookname;
	public Book(String author, String bookname) {
		super();
		this.author = author;
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public String getBookname() {
		return bookname;
	}
}
class Student{
  Heart h=new Heart(745,99);
  Brain b=new Brain("gray",522);
  void hasA(Bike bi) {
	  System.out.println(bi.getBrand());
	  System.out.println(bi.getMilage());
  }
  void hasA(Book bo) {
	  System.out.println(bo.getAuthor());
	  System.out.println(bo.getBookname());
  }
}

public class A2 {

	public static void main(String[] args) {
		Student s=new Student();
		Bike bi=new Bike("tata",425);
		Book bo=new Book("ilak","goodness");
	System.out.println(s.b.getWeight());
	System.out.println(s.b.getColor());
	System.out.println(s.h.getWeight());
	System.out.println(s.h.getBp());
	s.hasA(bi);
	s.hasA(bo);
	s=null;   //student died when we can access his bike
	System.out.println(bi.getBrand()); //bike
	//System.out.println(s.h.getWeight());// student dead so heart acces pana mudila so error
	
	}

}
