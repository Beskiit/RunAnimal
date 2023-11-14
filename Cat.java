package OOPactivity;

class Cat extends Animal{
	@Override
	public void eat() {
		System.out.println("Cat hates to eat too much.");
	}
	
	@Override
	public void sleep() {
		System.out.println("Cats sleep for 5-6hrs a day.");
	}
	
	@Override
	public void makeSound() {
		System.out.println("Meow");
	}
}
