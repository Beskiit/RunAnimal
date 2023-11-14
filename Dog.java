package OOPactivity;

class Dog extends Animal{
	@Override
	public void eat() {
		System.out.println("Dogs loves to eat.");
	}
	
	@Override
	public void sleep() {
		System.out.println("Dog sleeps whenever they want.");
	}
	
	@Override
	public void makeSound() {
		System.out.println("Arf arf.");
	}
}
