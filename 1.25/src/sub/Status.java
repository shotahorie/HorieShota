package sub;

public class Status extends Sub{
	
	//superクラスからデータを受け取ってコンソールに出力する
	public void print(){
				
		System.out.println("こんにちは 「 " + super.getName() + " 」 さん");
		System.out.println("ステータス");
		System.out.println("HP：" + super.getHp());
		System.out.println("MP：" + super.getMp());
		System.out.println("攻撃力：" + super.getAtk());
		System.out.println("素早さ：" + super.getAgi());
		System.out.println("防御力：" + super.getDef());
		System.out.println("");
		System.out.println("さあ冒険に出かけよう！");

	}

}