package boxpackage;

public class Symulacja2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pudlo p1= new Pudlo();
		Block a1=Block.BLUE1;
		p1.wlozKlocekDoPudelka(0, a1);
		p1.zajrzyjDoPudelka();
		p1.wlozKlocekDoPudelka(36, a1);
		p1.zajrzyjDoPudelka();
		p1.wyjmijKlocek(36,a1);
		p1.zajrzyjDoPudelka();

	}

}
