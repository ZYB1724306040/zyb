package DecoratorPattern;

public class Finery extends Person {
	private Person person;
	
	public Person getPerson() {
		return person;
	}
 
	public void setPerson(Person person) {
		this.person = person;
	}
 
	//打扮
	public void Decorate(Person person) {
		this.person = person;
	}
 
	@Override
	public void show() {
		if (person != null) {
			person.show();
		}
	}
 
}