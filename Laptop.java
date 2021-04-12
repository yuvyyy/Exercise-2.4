
public class Laptop {
	String name;
	String processor;
	String colour;
	double memoryGB;
	double weight;
	double price;
	
		public void setName(String name) {
			this.name = name;
		}
		
		public void setProcessor(String processor) {
			this.processor = processor;
		}
		
		public void setColour(String colour) {
			this.colour = colour;
		}
		
		public void setMemoryGB(double memoryGB) {
			this.memoryGB = memoryGB;
		}
		
		public void setWeight(double weight) {
			this.weight = weight;
		}
		
		
		public void setPrice(double price) {
			this.price = price;
		}
		//Create Getter Method
		public String getName() {
			return this.name;
		}
		
		public String getProcessor() {
			return this.processor;
		}
		
		public String getColour() {
			return this.colour;
		}

		public double getMemoryGB() {
			return this.memoryGB;
		}
		
		public double getWeight() {
			return this.weight;
		}

		public double getPrice() {
			return this.price;
		}
}
