package birdsandsantury;

public class Penguin extends Bird implements Swimmable{
	static int count;
	
	public void swim() {
		System.out.println("Penguin is swimming");
	}
	
	public void eat() {
		System.out.println("Penguin can eat");
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
