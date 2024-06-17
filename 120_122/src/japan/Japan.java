package japan;
import java.util.Objects;
public class Japan {
	//変数を定義
	public String country;
	public String food;
	//受け取った引数を変数にそれぞれ代入する
	public Japan(String kuni,String tabemono){
		//引数がnullではないか判定する
		Objects.requireNonNull(kuni,tabemono);
		this.country = kuni;
		this.food = tabemono;
	}
}