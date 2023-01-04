package monsters;

import bases.Monster;
import utils.Dice;

public class Slime extends Monster{
	
	//コンストラクタ
	//HPと攻撃力は乱数で決定、名前と武器名に関しては引数で指定可能
	public Slime(String name, String weapon) {
		super(name,weapon);
		this.hp = Dice.get(70, 130);
		this.offensive = Dice.get(5, 11);
	}
	
}