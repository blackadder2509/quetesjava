public class Arena{
	public static void main(String []arg) {	
		Monster clement= new Monster("clement", 5, 22);
		Monster romain= new Monster("romain", 7, 42);
	while (!clement.isKO() && !romain.isKO()){
	clement.takeHit(romain.getAttack());
	romain.takeHit(clement.getAttack());
		}	
	}
}
