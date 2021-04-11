package birdsandsantury;

public class Parrot extends Bird implements Flyable {
	
	static int count;
	
	public  void eat() {
		System.out.println("parrot is eating");
	} 
	
	public void fly() {
		System.out.println("parrot is flying");
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
