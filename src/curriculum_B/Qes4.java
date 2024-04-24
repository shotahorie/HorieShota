package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
		
		int x = 1;
		int y = 1;
		int z;
		
		for(x = 1; x <= 9; x++) {
			for(y = 1; y <= 9; y++) {
				z = x * y;
				if(y >= 9) {
					System.out.println(String.format("%02d", x) + " * " + String.format("%02d", y) +" = " + String.format("%02d", z));
				} else {
					System.out.print(String.format("%02d", x) + " * " + String.format("%02d", y) +" = " + String.format("%02d", z) +" || ");

				}

			}
		}
		
		
		

		
		
	}

}