
public class Cat {
	
	private String catName;
	private boolean isMeowing;
		
	public void meowing() {
		System.out.println(catName + " is meowing? " + isMeowing);		
	}
	
	public void wantsAttention() {
		if (isMeowing) {
			System.out.println(catName + " wants attention.");			
		} else {
			System.out.println(catName + " is content.");
		  }
	}
	public void seeSquirrel() {		
		if(isMeowing) {
			System.out.println("See's a squirrel & is on the Prowl.");			
		} 
		else if(!isMeowing) {
			System.out.println("Taking a cat nap.");
	 	 }	
	}
	public void wantsOutside() {
		if (isMeowing) {		
			System.out.println("Let " + catName + " outside." );
			System.out.println();
			}
	}
			
//	public void displayBehavior() {
//		System.out.println(catName + " is meowing? " + isMeowing+ "\n");
//		System.out.println(catName + " wants attention? " + isMeowing);
//		System.out.println();
////		if (isMeowing = true) {
////			System.out.println(catName + " is on the Prowl.");	
////		} else (isMeowing = false) {
////			System.out.println(catName + " is content.");
////		  } 
//	}
//	
	
	
	public Cat() {
		super();
	}

	public Cat(String catName, boolean isMeowing) {
		super();
		this.catName = catName;
		this.isMeowing = isMeowing;
	}
	
	
	



	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

}
