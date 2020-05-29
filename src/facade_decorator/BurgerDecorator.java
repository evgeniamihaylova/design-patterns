package facade_decorator;

public class BurgerDecorator implements Food {

	protected Food decoratedBurger;
	
	public BurgerDecorator(Food decoratedBurger) {
		this.decoratedBurger = decoratedBurger;
	}

	@Override
	public void make() {
	
		this.decoratedBurger.make();

	}

}
