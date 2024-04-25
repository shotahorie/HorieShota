package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
<<<<<<< HEAD

		//変数を宣言、初期化
		int x = 1;
		int y = 1;
		int z = 0;

		//for文でxを9回まわす
		for(x = 1; x <= 9; x++) {

			//for文でyを9回まわす
			for(y = 1; y <= 9; y++) {

				//zに計算結果を代入
				z = x * y;

				//if文を使ってコンソールに出力
				if(y >= 9) {
					System.out.println(String.format("%02d", x) + " * " + String.format("%02d", y) +" = " + String.format("%02d", z));
				} else {
					System.out.print(String.format("%02d", x) + " * " + String.format("%02d", y) +" = " + String.format("%02d", z) +" || ");

				}

			}
		}

=======
		
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
		
		
		

		
		
>>>>>>> branch 'master' of https://github.com/shotahorie/HorieShota.git
	}

}