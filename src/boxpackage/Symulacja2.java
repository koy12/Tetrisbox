package boxpackage;

public class Symulacja2 {

	
	private static void SymulacjaRecurencja2(Pudlo p1,int[] gdzie,int nrBlock){
		
		if(nrBlock==12){
			for(int a: gdzie){System.out.println(a);}
			Block.getiloscZmianWektorow();
		}
		Block b1=Block.values()[nrBlock];
		for(int i=0;i<24;i++){
			for(int j=0;j<64;j++){			
				gdzie[nrBlock]=j%64;				
				if(p1.wlozKlocekDoPudelka(gdzie[nrBlock], b1)){					
					if(nrBlock==0){System.out.println(nrBlock+"@"+((i+1)*(j+1)));}
					Symulacja2.SymulacjaRecurencja2(p1, gdzie, nrBlock+1);
					p1.wyjmijKlocek(gdzie[nrBlock], b1);
				}			
			}
			b1.obrocKlocek();
		}		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pudlo p1= new Pudlo();
		int[] gdzie=new int[12];
		Symulacja2.SymulacjaRecurencja2(p1, gdzie,0);
	}

}
