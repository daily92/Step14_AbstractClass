package test.mypac;
//c.f. 
//�׳� extends Weapon �ϸ� MyWeapon �� ���� ��
//=> MyWeapon �� mouseon �ϸ� �ߴ� â ���ο� abstract.. ������ �ڵ����� ��!
public class MyWeapon extends Weapon{
	
	// Weapon �߻�Ŭ������ ���ǵ� �߻� �޼ҵ带 �ݵ�� ������(�������̵�) �ؾ� �Ѵ�
	@Override
	public void attack() {
		System.out.println("����̸� ����!");
	}
}
