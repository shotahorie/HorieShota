package prefecture;

public class Prefecture {
	
	//フィールド
	private String name;
	private String capital;
	private double area;
	
	//コンストラクター
	public Prefecture(String name, String capital, double area) {
		this.name = name;
		this.capital = capital;
		this.area = area;
	}
	
	//ゲッター
	public String getName() {
		return name;
	}
	public String getCapital() {
		return capital;
	}
	public double getArea() {
		return area;
	}
	
	//toStringメソッド
	@Override
	public String toString() {
		return "都道府県名：" + name + "\n県庁所在地：" + capital +"\n面積：" + area + "km2\n";

	}
}
