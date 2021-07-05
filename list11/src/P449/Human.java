package P449;

/*
 * 人間　インタフェース
 */
public interface Human extends Creature {
	void talk();	// 「話す」抽象メソッド
	void watch();	// 「見る」抽象メソッド
	void hear();	// 「聞く」抽象メソッド
}
