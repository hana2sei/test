package p433;

/**
 * 抽象クラス　歩行モンスター
 *
 */
public abstract class WalkingMonster extends Monster {

	// 抽象メソッド「逃げる」をオーバーライドし
	// 処理を実装する。
	public void run() {
		System.out.println("トコトコ走って逃げた。");
	}

}
