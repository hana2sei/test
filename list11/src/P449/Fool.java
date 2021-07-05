package P449;

/*
 * 遊び人　クラス
 */
public class Fool extends Character implements Human {

	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		m.hp -= 2;
		System.out.println("2ポイントのダメージを与えた");
	}

	public void talk() {
		System.out.println(this.name + "は会話した");
	}

	public void watch() {
		System.out.println(this.name + "は見た");
	}

	public void hear() {
		System.out.println(this.name + "は聞いた");
	}

	public void run() {
		System.out.println(this.name + "は逃げた");
	}
}
