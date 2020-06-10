package DecoratorPattern;

public class TShirts extends Finery {
	@Override
	public void show() {
		System.out.print("T恤    ");// 在实际开发中，此应该为对人数据进行处理的过程。
		super.show();// 父类处理的过程
	}
}

class BigTrouser extends Finery{
	@Override
	public void show() {
		System.out.print("垮裤    ");
		super.show();
	}
}

class Sneakers extends Finery{
	@Override
	public void show() {
		System.out.print("破球鞋    ");
		super.show();
	}
}

class Suit extends Finery{
	@Override
	public void show() {
		System.out.print("西装    ");
		super.show();
	}
}

class Tie extends Finery{
	@Override
	public void show() {
		System.out.print("领带    ");
		super.show();
	}
}
 
class LeatherShoes extends Finery{
	@Override
	public void show() {
		System.out.print("皮鞋    ");
		super.show();
	}
}