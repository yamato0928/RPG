package humans;

import bases.Human;
import utils.Dice;

public class Brave  extends Human{
	
	//コンストラクタ
	//HPと攻撃力は乱数で決定、名前と武器名に関しては引数で指定可能
	public Brave(String name, String weapon) {
		super(name,weapon);
		this.hp = Dice.get(170, 230);
		this.offensive = Dice.get(7, 13);
	}
	
}
