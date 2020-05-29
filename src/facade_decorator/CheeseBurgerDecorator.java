package facade_decorator;

public class CheeseBurgerDecorator extends BurgerDecorator {

	public CheeseBurgerDecorator(Food decoratedBurger) {
		super(decoratedBurger);
		
	}

	public void make(){
		decoratedBurger.make();
		addCheese(decoratedBurger);
	}
	
	private void addCheese(Food decoratedBurger) {
		System.out.println("Cheese added to the classic burger");
	}
	
}
