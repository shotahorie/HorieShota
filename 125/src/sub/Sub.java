package sub;
import java.util.Random;
public class Sub {
	public String name;
	
	public int hp;
	public int mp;
	public int atk;
	public int agi;
	public int def;
	Random rnd = new Random();
//	int hp = rnd.nextInt(1000);
//	int mp = rnd.nextInt(1000);
//	int atk = rnd.nextInt(1000);
//	int agi = rnd.nextInt(1000);
//	int def = rnd.nextInt(1000);
	
	
	
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
	
//	public void setName(String name, int hp, int mp, int atk, int agi, int def){
//		this.name = name;
//		this.hp = hp;
//		this.mp = mp;
//		this.atk = atk;
//		this.agi = agi;
//		this.def = def;
//		
//	}

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