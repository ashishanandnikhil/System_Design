package DecoratorPattern;

public class Cashier {

	public static void main(String[] args) {
		
		BasePizza pizza = new ExtraCheese(new Margherita());
		//System.out.println(pizza.cost());
		
		BasePizza pizza1 = new ExtraCheese(new ExtraMushroom(new Farmhouse()));
		System.out.println(pizza1.cost());
	}

}
