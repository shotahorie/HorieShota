package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		
		//変数を宣言、初期化
		int x = 1;
		int y = 1;
		int z;
		
		//for文でyを9回まわす
		for(y = 1; y <= 9; y++) {
			
			//for文でxを20回まわす
			for(x = 1; x <= 20; x++) {
				
				//zに計算結果を代入
				z = x * y;
				
				//if文を使ってコンソールに出力
				if(x >= 20) {
					System.out.println(String.format("%03d", x) + " * " + String.format("%03d", y) +" = " + String.format("%03d", z));
				} else {
					System.out.print(String.format("%03d", x) + " * " + String.format("%03d", y) +" = " + String.format("%03d", z) +" || ");

				}

			}
		}
		
	}

}