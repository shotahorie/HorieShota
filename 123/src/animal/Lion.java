package animal;
import java.util.Objects;
public class Lion {
	
	//フィールド
	private String name;
	private double bodyLength;
	private int speed;
	//セッター
	public void setName(String n) {
		//引数がnullではないか判定する
		Objects.requireNonNull(n);
		this.name = n;
	}
	
	public void setBodyLength(double body) {
		//引数がnullではないか判定する
		Objects.requireNonNull(body);
		this.bodyLength = body;
	}
	
	public void setSpeed(int spd) {
		//引数がnullではないか判定する
		Objects.requireNonNull(spd);
		this.speed = spd;
	}
	
	
	//ゲッター
	public String getName() {
		
		return this.name;
	}
	
	public double getBodyLength() {
		return this.bodyLength;
	}
	
	public int getSpeed() {
		return this.speed;
	}
}