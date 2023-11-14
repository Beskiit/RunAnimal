package OOPactivity;

class Bird extends Animal{
	@Override
	public void eat() {
		System.out.println("Birds love to eat");
	}
	
	@Override
	public void sleep() {
		System.out.println("Birds love to sleep for 10-12hrs a day.");
	}
	
	@Override
	public void makeSound() {
		System.out.println("Tweet tweet.");
	}
}
