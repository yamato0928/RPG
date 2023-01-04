package monsters;

import bases.Monster;
import utils.Dice;

public class Oak extends Monster{
	
	//コンストラクタ
	//HPと攻撃力は乱数で決定、名前と武器名に関しては引数で指定可能
	public Oak(String name, String weapon) {
		super(name,weapon);
		this.hp = Dice.get(170, 230);
		this.offensive = Dice.get(9, 15);
	}
	
}