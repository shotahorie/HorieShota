package animal;
public class Status {
	public static void main(String[] args) {
		//オブジェクトの生成
		Lion lion = new Lion();
		//セッターに引数を渡す
		lion.setName("ライオン");
		lion.setBodyLength(2.1);
		lion.setSpeed(80);
		//変数にゲッターから代入
		String name = lion.getName();
		double body = lion.getBodyLength();
		int spd = lion.getSpeed();
		//コンソールに出力する
		System.out.println("動物名：" + name);
		System.out.println("体長：" + body + "m");
		System.out.println("速度：" + spd + "km/h");
	}
}
