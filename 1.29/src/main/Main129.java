package main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import prefecture.Prefecture;

public class Main129 {
	public static void main(String[] args) {
		
		//データを格納する
        Map<Integer, Prefecture> prefectureMap = new HashMap<>();
        
        prefectureMap.put(0, new Prefecture("北海道", "札幌市", 83424));
        prefectureMap.put(1, new Prefecture("青森県", "青森市", 9646));
        prefectureMap.put(2, new Prefecture("岩手県", "盛岡市", 15275));
        prefectureMap.put(3, new Prefecture("宮城県", "仙台市", 7282));
        prefectureMap.put(4, new Prefecture("秋田県", "秋田市", 11638));
        prefectureMap.put(5, new Prefecture("山形県", "山形市", 9323));
        prefectureMap.put(6, new Prefecture("福島県", "福島市", 13784));
        prefectureMap.put(7, new Prefecture("茨城県", "水戸市", 6097));
        prefectureMap.put(8, new Prefecture("栃木県", "宇都宮市", 6408));
        prefectureMap.put(9, new Prefecture("群馬県", "前橋市", 6362));
        prefectureMap.put(10, new Prefecture("埼玉県", "さいたま市", 3798));
		
		//scannerで文字列入力
		Scanner scanner = new Scanner(System.in);
		System.out.println("都道府県番号を「,」区切りで入力してください(0～10)");
		String input = scanner.nextLine();
		
		//文字列を「,」区切りで配列に格納
		String[] part = input.split(",");
		
		//文字列から前後の空白を除去する
		String[] parts = new String[part.length];
		for(int i = 0; i < part.length; i++) {
			parts[i] = part[i].trim();
		}
		
		//sortにasc,descを代入する
		String sort = null;
		System.out.println("asc,descを入力してください");
		sort = scanner.nextLine();
		
		//昇順,降順に並べ替える
		if (sort.equalsIgnoreCase("asc")) {
			Arrays.sort(parts);
		} else if (sort.equalsIgnoreCase("desc")) {
			Arrays.sort(parts, Comparator.reverseOrder());
		} else {
			System.out.println("無効なソート順です。");
		}
		
		//String型からint型に変換する
		int[] sortedParts = new int[parts.length];
		for(int j = 0; j < part.length; j++) {
			sortedParts[j] = Integer.parseInt(parts[j]);
		}
		
		//コンソールに出力する
		for(int num : sortedParts) {
			System.out.println(prefectureMap.get(num));
		}
		
		//scannerを閉じる
		scanner.close();
	}
}