package birdsandsantury;

public class Crow extends Bird implements Flyable{
	
	static int count;
	
	public void eat() {
		System.out.println("crow can eat");
	} 
	
	public void fly() {
		System.out.println("crow is fly ");
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
