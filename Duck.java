package birdsandsantury;

public class Duck extends Bird implements Swimmable,Flyable {
	
	static int count;
	
	public void swim() {
		System.out.println("duck is swimming");
	}
	
	public void eat() {
		System.out.println("duck can eat");
	} 
	
	public void fly() {
		System.out.println("duck is fly but at minimum height");
	}

	@Override
	void incrementcount() {
		count++;
	}

	@Override
	public int getCount() {
		return count;
	}

	@Override
	public void decrementCount() {
		count--;
	}
}
