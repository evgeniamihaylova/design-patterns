package facade_decorator;

public class BurgerFacade1 extends BurgerDecorator {

	private Food classicBurger;
	private Food burgerWithEgg;
	private Food burgerWithCheese;
	
	public BurgerFacade1(Food decoratedBurger) {
		super(decoratedBurger);
		this.classicBurger = new Burger();
		this.burgerWithEgg = new EggBurgerDecorator(decoratedBurger);
		this.burgerWithCheese = new CheeseBurgerDecorator(decoratedBurger);
		
	}

	public void MakeClassicBurger() {
		classicBurger.make();
	}

	public void MakeBurgerWithEgg() {
		burgerWithEgg.make();
		
	}
	public void MakeBurgerWithCheese() {
		burgerWithCheese.make();
	
	}
	
	
}
