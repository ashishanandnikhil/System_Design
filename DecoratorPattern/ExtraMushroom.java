package DecoratorPattern;

public class ExtraMushroom extends ToppingDecorator{
	
	BasePizza basePizza;
	public ExtraMushroom(BasePizza pizza) {
		this.basePizza = pizza;
	}
	@Override
	public int cost() {
		
		return this.basePizza.cost()+85;
	}

}
