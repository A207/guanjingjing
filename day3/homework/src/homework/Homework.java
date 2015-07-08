package homework;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Army a = new Army(3);
		a.addWeapon(new Tank());
		a.addWeapon(new Flighter());
		a.addWeapon(new WarShip());
		a.attackAll();
		a.moveAll();
	}
}


	interface Assaultable {
		abstract public void attack();
	}

	interface Mobile {
		abstract public void move();
	}

	abstract class Weapon implements Assaultable, Mobile {}

	class Tank extends Weapon {
		public void attack() {
			System.out.println("̹�˹�����");
		}

		public void move() {
			System.out.println("̹���ƶ���");
		}
	}

	class Flighter extends Weapon {

		public void attack() {
			System.out.println("ս����������");
		}

		public void move() {
			System.out.println("ս�����ƶ���");
		}

	}

	class WarShip extends Weapon {

		public void attack() {
			System.out.println("����������");
		}

		public void move() {
			System.out.println("�����ƶ���");
		}

	}

	class Army {
		private Weapon[] w = null;

		private int size = 0;

		private Army() {}

		public Army(int i) {
			w = new Weapon[i];
		}

		public void addWeapon(Weapon weapon) {
			if (size >= w.length) {
				System.out.println("����װ���㹻��!");
				return;
			}else {
				w[size] = weapon;
				size++;
			}
		}

		public void attackAll() {
			for (Weapon wea : w) {
				if (wea != null) {
					wea.attack();
				}
			}
		}

		public void moveAll() {
			for (Weapon wea : w) {
				if (wea != null) {
					wea.move();
				}
			}
		}
	
	}

