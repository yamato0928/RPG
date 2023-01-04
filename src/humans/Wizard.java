package humans;

import bases.Human;
import utils.Dice;

public class Wizard  extends Human{
	
	//コンストラクタ
	//HPと攻撃力は乱数で決定、名前と武器名に関しては引数で指定可能
	public Wizard(String name, String weapon) {
		super(name,weapon);
		this.hp = Dice.get(120, 180);
		this.offensive = Dice.get(12, 18);
	}
	
}