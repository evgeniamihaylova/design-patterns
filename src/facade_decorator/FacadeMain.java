package facade_decorator;

public class FacadeMain {

	public static void main(String[] args) {
		
		BurgerFacade1 burgerFacade = new BurgerFacade1(BurgerFacade);
		
		burgerFacade.MakeClassicBurger();
		burgerFacade.MakeBurgerWithEgg();
		burgerFacade.MakeBurgerWithCheese();
		

	}

}


// Доста неща сменях, пробвах и променях, в крайна сметка накрая се оплетох :D