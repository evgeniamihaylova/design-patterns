package facade_decorator;

public class EggBurgerDecorator extends BurgerDecorator {

	public EggBurgerDecorator(Food decoratedBurger) {
		super(decoratedBurger);
		
	}
	
	public void make(){
		decoratedBurger.make();
		addEgg(decoratedBurger);
	}
	
	private void addEgg(Food decoratedBurger) {
		System.out.println("Egg added to the classic burger");

	}
	
}
