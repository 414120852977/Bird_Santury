package birdsandsantury;

import java.util.List;
import java.util.ArrayList;

public class BirdSanturyManager {
	List <Bird> birdlist = new ArrayList<Bird>();
	
	public void add(Bird bird) {
		birdlist.add(bird);
		bird.incrementcount();
	}
	
	public void remove(Bird bird) {
		birdlist.remove(bird);
		bird.decrementCount();
	}
	
	public void printSwimable() {
		for(Bird bird : birdlist)	{
			if(bird instanceof Swimmable) {
				((Swimmable)bird).swim();
			}
		 }
	}
	
	public void printEatable() {
		for(Bird bird : birdlist)	{
			 bird.eat();
		}
	}
	
	public void printFlyable(){
		for(Bird bird : birdlist)	{
			if(bird instanceof Flyable){
				((Flyable)bird).fly();
			}
		 }
	}
	
}
