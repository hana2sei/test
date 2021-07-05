package p433;

/**
 * ゴブリン クラス
 *
 */
public class Goblin extends WalkingMonster {

	// 抽象メソッド「戦う」をオーバーライドし
	// 処理を実装する。
	public void attack() {
		System.out.println("ナイフで切りつけた。");
	}
}
