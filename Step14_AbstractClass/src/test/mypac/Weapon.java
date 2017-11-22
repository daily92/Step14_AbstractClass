package test.mypac;
/*
 *  [ 추상클래스 (Abstract Class) ]
 *  
 *  - class 예약어 앞에 abstract 를 명시해서 클래스를 정의한다.
 *  - 형태만 정의되고 실제 구현은 되지 않은 메소드가 존재할 수 있다.
 *  - 형태만 정의된 메소드를 만들 때는 abstract 예약어를 붙어서 메소드를 정의한다.
 *  - 생성자는 존재하지만 ★단독으로 객체 생성은 불가★하다 (=> new Weapon(); 안됨)
 *  - 추상클래스 Type 의 id 가 필요하다면, 
 *    추상클래스를 ★상속 받은 자식클래스를 정의해서 객체 생성★한다.
 *  - ★	추상클래스를 상속받은 자식클래스는 
 *    	부모의 추상메소드를 모두 오버라이드(재정의)★ 해야 한다. 
 */

// 추상 메소드를 포함하고 있는 클래스는 abstract 예약어를 붙인다.
public abstract class Weapon {
	
	// 메소드 정의
	public void prepare() {
		System.out.println("무기 작동을 준비 합니다.");
	}
	
	// 추상 (미완성) 메소드 는 abstract 예약어를 붙여서 만들어야 한다.
		//형태는 정확히 정의했으나, 구현{}은 하지 않았음 => 미완성
		/* 
		 * 추상 메소드 만드는 이유?
		 *		누군가 만든 클래스를 import 해서 extends(상속) 해서 많이 써
		 *		누가 Weapon 클래스를 정의를 해 놓은 상태에서,
		 *		내가 MyWeapon extends Weapon{} 클래스 생성
		 *			c.f.얘를 new 하면 부모로부터 물려받은 메소드 사용 가능
		 *		(Weapon 클래스 제작자 :)이거(attack) 외에 나머지 동작은 내가 다 구현 해 놓았으니,
		 *		상속 받아서 쓰는 사람이 상황에 맞게 공격(attack) 기능 쓰삼~ 하고 비워둔 거
		 */
	public abstract void attack();
}
