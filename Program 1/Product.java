class Product{
	int pcode;
	String pname;
	int price;
	
	Product(int pcode, String pname, int price){
		this.pcode = pcode;
		this.pname = pname;
		this.price = price;
	}
	
	public static void main(String[] args){
		Product p1 = new Product(1, "Laptop", 43000);
		Product p2 = new Product(2, "TV", 20000);
		Product p3 = new Product(3, "Mobile", 18000);
		
		if (p1.price < p2.price && p1.price < p3.price){
			System.out.println("Lowest price  is " + p1.pname + " with cost " + p1.price);
		}
		
		else if (p2.price < p1.price && p2.price < p3.price){
			System.out.println("Lowest price  is " + p2.pname + " with cost " + p2.price);
		}
		
		else {
			System.out.println("Lowest price  is " + p3.pname + " with cost " + p3.price);
		}
	}
}
