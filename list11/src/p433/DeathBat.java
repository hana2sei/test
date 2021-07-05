package p433;

/**
 * デスバット クラス
 *
 */
public class DeathBat extends FlyingMonster {

	// 抽象メソッド「戦う」をオーバーライドし
	// 処理を実装する。
	public void attack() {
		System.out.println("突っついた。");
	}
}
