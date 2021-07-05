package p433;

/**
 * 抽象クラス　モンスター
 *
 */
public abstract class Monster {
	int hp;
	int mp;

	// 抽象メソッド 「攻撃」
	public abstract void attack();

	// 抽象メソッド 「逃げる」
	public abstract void run();
}
