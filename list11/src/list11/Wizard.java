package list11;

/*
 * 魔法使いクラス
 */
public class Wizard extends Character {
	int mp;

	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		m.hp -= 5;
	}
}
