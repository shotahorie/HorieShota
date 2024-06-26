package sub;
public class Sub {
	//フィールド
	private String name;
	private int hp;
	private int mp;
	private int atk;
	private int agi;
	private int def;
	
	//セッター
	public void setName(String name) {
		this.name = name;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public void setAgi(int agi) {
		this.agi = agi;
	}
	public void setDef(int def) {
		this.def = def;
	}

	//ゲッター
	public String getName() {
		return name;
	}
	public int getHp() {
		return hp;
	}
	public int getMp() {
		return mp;
	}
	public int getAtk() {
		return atk;
	}
	public int getAgi() {
		return agi;
	}
	public int getDef() {
		return def;
	}
	
}
