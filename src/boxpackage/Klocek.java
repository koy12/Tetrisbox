package boxpackage;

class Klocek{
	int objetosc=0;
	String kolor="";
	int wektory[][]=new int[6][3];
	private int iloscZmianWektora=0;
	public int getiloscZmianWektora(){return iloscZmianWektora;}
	Klocek(String c,int o,int[][] w){
		this.kolor=c;
		this.objetosc=o;
		for(int i=0;i<18;i++){
			//System.out.println(i);
			wektory[i%6][(i/6)]=w[i%6][(i/6)];
		}
	}	
	public String toString(){
	String a="";
	for(int[] b1: wektory){
		for(int b2: b1){
			a+=Integer.toString(b2);
			}
		a+="\n";
	}		
	return a;
}
	public void pokazKlocek(){
		System.out.println(this);		
	}
	private void obrocWokolX(){//dodatnio z=y;y=-z...
		for(int k=0;k<6;k++){
			int temp=wektory[k][1];
			wektory[k][1]=-wektory[k][2];
			wektory[k][2]=temp;
		}
	}
	private void obrocWokolY(){//z=x; x=-z
		for(int k=0;k<6;k++){
			int temp=wektory[k][0];
			wektory[k][0]=-wektory[k][2];
			wektory[k][2]=temp;
		}
	}
	private void obrocWokolZ(){//x=-y; y=x
		for(int k=0;k<6;k++){
			int temp=wektory[k][0];
			wektory[k][0]=-wektory[k][1];
			wektory[k][1]=temp;
		}
	}
	public void obrocKlocek(){//zmiana 
		iloscZmianWektora++;		
		switch(iloscZmianWektora){
		case 1:System.out.println("1");
		case 2:System.out.println("2");
		case 3:System.out.println("3");
				obrocWokolY();
				break;
		case 4:System.out.println("4");
				obrocWokolY();
				obrocWokolZ();
				obrocWokolZ();
				break;
		case 5:System.out.println("5");
		case 6:System.out.println("6");
		case 7:System.out.println("7");
				obrocWokolY();
				break;
		case 8:System.out.println("8");		
				obrocWokolY();
				obrocWokolZ();
				break;
		case 9:System.out.println("9");
		case 10:System.out.println("10");
		case 11:System.out.println("11");
				obrocWokolX();
				break;
		case 12:System.out.println("12");
				obrocWokolX();
				obrocWokolZ();
				obrocWokolZ();
				break;
		case 13:System.out.println("13");
		case 14:System.out.println("14");
		case 15:System.out.println("15");
				obrocWokolX();
				break;
		case 16:System.out.println("16");
				obrocWokolY();
				break;
		case 17:System.out.println("17");
		case 18:System.out.println("18");
		case 19:System.out.println("19");
				obrocWokolZ();
				break;
		case 20:System.out.println("20");
				obrocWokolZ();
				obrocWokolY();
				obrocWokolY();
				break;
		case 21:System.out.println("21");
		case 22:System.out.println("22");
		case 23:System.out.println("23");
				obrocWokolZ();
				break;
		case 24:System.out.println("24");
				obrocWokolY();
				obrocWokolZ();
				obrocWokolZ();
				obrocWokolZ();
				iloscZmianWektora=0;
				break;
		default:System.out.println("default");	
		}
	}
	
}