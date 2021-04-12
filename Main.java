
public class Main {
	public static void main(String[] args) {
		Laptop X = new Laptop();
		
		System.out.println("----------------- Laptop X------------------");
		System.out.println();
		X.setName("Samsung");
		X.setProcessor("Windows");
		X.setColour("Blue");
		X.setMemoryGB(500);
		X.setWeight(2);
		X.setPrice(1700);
		
		System.out.println("Name " + X.getName());
		System.out.println("Colour  " + X.getColour());
		System.out.println("Processor " + X.getProcessor());
		System.out.println("MemoryGB  " + X.getMemoryGB() + " GB Memory Capasity ");
		System.out.println("Weight  " + X.getWeight() + "KG  " );
		System.out.println("Price  RM " + X.getPrice());
		

		System.out.println();

		System.out.println("----------------- Laptop Y------------------");
		System.out.println();
		Laptop Y = new Laptop();
		Y.setName("Apple");
		Y.setProcessor("iOS");
		Y.setColour("Grey");
		Y.setMemoryGB(600);
		Y.setWeight(2.5);
		Y.setPrice(2500.00);
		
		System.out.println("Name " + Y.getName());
		System.out.println("Colour  " + Y.getColour());
		System.out.println("Processor " + Y.getProcessor());
		System.out.println("MemoryGB  " + Y.getMemoryGB() + " GB Memory Capasity ");
		System.out.println("Weight  " + Y.getWeight() + "KG  " );
		System.out.println("Price  RM " + Y.getPrice());
		
	}

}
