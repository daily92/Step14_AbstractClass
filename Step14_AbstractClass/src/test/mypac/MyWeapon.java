package test.mypac;
//c.f. 
//그냥 extends Weapon 하면 MyWeapon 에 오류 떠
//=> MyWeapon 에 mouseon 하면 뜨는 창 내부에 abstract.. 누르면 자동으로 됨!
public class MyWeapon extends Weapon{
	
	// Weapon 추상클래스에 정의된 추상 메소드를 반드시 재정의(오버라이딩) 해야 한다
	@Override
	public void attack() {
		System.out.println("흰둥이를 공격!");
	}
}
