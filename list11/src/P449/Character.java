package P449;

/*
 * 味方の戦う登場人物　クラス
 */
public abstract class Character {
	String name;
	int hp;

	// 逃げる
	public abstract void run();

	// 戦う
	public abstract void attack(Matango m);
}
