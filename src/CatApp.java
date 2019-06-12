import java.util.ArrayList;
import java.util.List;

public class CatApp {

	public static void main(String[] args) {
		
		Cat c1 = new Cat("Sammy", true);
		Cat c2 = new Cat("Garfield", false);
		Cat c3 = new Cat("Smokey", true);
		Cat c4 = new Cat("Cupcake", false);
		
		List<Cat> cats = new ArrayList<>();
		cats.add(c1);
		cats.add(c2);
		cats.add(c3);
		cats.add(c4);
	
		for(int i=0; i <= cats.size() -1; i++) {
			cats.get(i).meowing();
			cats.get(i).seeSquirrel();
			cats.get(i).wantsAttention();
			cats.get(i).wantsOutside();			
		}
			
		for(Cat c: cats) {
			c.meowing();
			c.seeSquirrel();
			c.wantsAttention();
			c.wantsOutside();				
		}
		
//		c1.meowing();
//		c1.seeSquirrel();		
//		c1.wantsAttention();
//		c1.wantsOutside();
//		
//		c2.meowing();
//		c2.seeSquirrel();	
//		c2.wantsAttention();
//		c2.wantsOutside();
//		
//		c3.meowing();
//		c3.seeSquirrel();		
//		c3.wantsAttention();
//		c3.wantsOutside();
//		
//		c4.meowing();
//		c4.seeSquirrel();		
//		c4.wantsAttention();
//		c4.wantsOutside();
//		

	}

}
