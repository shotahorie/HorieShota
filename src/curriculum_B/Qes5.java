package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		
		int x = 1;
		int y = 1;
		int z;
		
		for(y = 1; y <= 9; y++) {
			for(x = 1; x <= 20; x++) {
				z = x * y;
				if(x >= 20) {
					System.out.println(String.format("%03d", x) + " * " + String.format("%03d", y) +" = " + String.format("%03d", z));
				} else {
					System.out.print(String.format("%03d", x) + " * " + String.format("%03d", y) +" = " + String.format("%03d", z) +" || ");

				}

			}
		}
		
	}

}
