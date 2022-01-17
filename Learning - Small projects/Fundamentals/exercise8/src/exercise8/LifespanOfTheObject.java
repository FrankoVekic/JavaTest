package exercise8;

public class LifespanOfTheObject {

	// 1. svojstvo je deklarirano, vrijednost je null
	private LifespanOfTheObject lifespanOfTheObject;

	// 2. konstruiranje
	
	public LifespanOfTheObject() {
		// izvodi se pri izvođenju linije koda s ključnom rječju new
		System.out.println("U konstruktoru");
	}
	
	public LifespanOfTheObject getLifespanOfTheObject() {
		return lifespanOfTheObject;
	}

	public void setLifespanOfTheObject(LifespanOfTheObject lifespanOfTheObject) {
		this.lifespanOfTheObject = lifespanOfTheObject;
	}
	
	
	public static void main(String[] args) {
		//poziv konstruktora 
		System.out.println("Na početku izvođenja programa");
		LifespanOfTheObject lifespanOfTheObject = new LifespanOfTheObject();
		
		// 3. korištenje
		
		lifespanOfTheObject.setLifespanOfTheObject(null);
		System.out.println("Korištenje objekta");
		// 4. UNIŠTENJE - radi GC Garbagge Collector
		System.out.println("GC ga sam uništi");
	}
	
	
}
