package country;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import japan.Japan;
public class Country {
	public static void main(String[] args) {
		//クラスの呼び出し
		Japan japan = new Japan("日本","寿司");	
		
		//コンソールに出力する
		System.out.println("こんにちは！ここは" + japan.country + "です！");	
		System.out.println("この" + japan.food + "はうまい");
		System.out.println(japan.food + "和食です");
		
		LocalDateTime nowDate = LocalDateTime.now();	//現在時刻を取得
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd H:m:s");	//表示形式を指定
        String formatNowDate = dtf.format(nowDate);		//現在時刻を指定の表示形式に変換して変数に代入
		System.out.println("今の現在日時は" + formatNowDate + "です");	//コンソールに出力
	}
}