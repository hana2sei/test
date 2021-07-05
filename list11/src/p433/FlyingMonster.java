package p433;

/**
 * 抽象クラス　飛行モンスター
 *
 */
public abstract class FlyingMonster extends Monster {

	// 抽象メソッド「逃げる」をオーバーライドし
	// 処理を実装する。
	public void run() {
		System.out.println("バサバサ飛んで逃げた。");
	}
}
