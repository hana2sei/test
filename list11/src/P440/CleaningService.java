package P440;

public interface CleaningService {

	/*（抽象メソッド）シャツを洗う */
	Shirt washShirt(Shirt s);

	/*（抽象メソッド）タオルを洗う */
	Towl washTowl(Towl t);

	/* （抽象メソッド）コートを洗う */
	Coat washCoat(Coat c);

	static void a() {
		System.out.println("a");
	}
}
