package monsters;

import bases.Monster;
import utils.Dice;

public class Dragon extends Monster{
	
	//コンストラクタ
	//HPと攻撃力は乱数で決定、名前と武器名に関しては引数で指定可能
	public Dragon(String name, String weapon) {
		super(name,weapon);
		this.hp = Dice.get(270, 330);
		this.offensive = Dice.get(12, 18);
	}
	
}