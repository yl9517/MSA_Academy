package msa06;

class Man{
	String name;
	int age;
	String addr;
	
	void eat(){
		
	}
	boolean sleep(int a) {
		return false;
		
	}
	void walk() {
		
	}
	
	void talk(int b) {
	}
	
}
public class MethodTest {

	public static void main(String[] args) {

		Man m1 = new Man();
		m1.name = "ȫ�浿";
		m1.age = 10;
		m1.addr = "����";
		
		m1.eat();
		m1.sleep(1);
		m1.walk();
		m1.talk(2);
		
		
		Man m2 = new Man();
		m2.name = "ȫ���";
		m2.age = 20;
		m2.addr = "����";
		
		m2.eat();
		m2.sleep(1);
		m2.walk();
		m2.talk(2);
		
		
		System.out.println(m1.name+m1.age+m1.addr);
		System.out.println(m2.name+m2.age+m2.addr);
		
	}

}
