package ProxyPattern;
 
public class Test {
	public static void main(String[] args) {
		SchoolGirl girl = new SchoolGirl();
		girl.setName("李娇娇");
		
		Proxy daili = new Proxy(girl);
		daili.giveDolls();
		daili.giveFlowers();
		daili.giveCHocolate();
	}
 }
