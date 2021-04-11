package birdsandsantury;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("wELCOME TO BIRD SANTURY");
		
		BirdSanturyManager birdSanturyManager = new BirdSanturyManager();
		
		Duck duck = new Duck();
		Duck duck2 = new Duck();
		Parrot parrot = new Parrot();
		Crow crow = new Crow();
		Penguin penguin = new Penguin();
		
		birdSanturyManager.add(duck);
		birdSanturyManager.add(parrot);
		birdSanturyManager.add(crow);
		birdSanturyManager.add(penguin);
		birdSanturyManager.add(duck2);
		
		birdSanturyManager.printSwimable();
		birdSanturyManager.printEatable();
		birdSanturyManager.printFlyable();
		
		System.out.println("duck count :"+duck.count);
		System.out.println("duck count :"+parrot.count);
		System.out.println("duck count :"+penguin.count);
		
		birdSanturyManager.remove(penguin);
		birdSanturyManager.remove(parrot);
		birdSanturyManager.remove(duck);
		}
}
