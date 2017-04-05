package boxpackage;

public enum Block {
	
	BLUE1("Blue",6,new int[][]{{0,1,0},{0,2,0},{1,2,0},{2,2,0},{0,1,1},{0,0,0}}),
	BLUE2("",5,new int[][]{{0,1,0},{1,1,1},{1,1,2},{0,0,0},{0,1,1},{0,0,0}}),
	BLUE3("",5,new int[][]{{0,1,0},{1,1,0},{1,2,0},{1,3,0},{0,0,0},{0,0,0}}),
	BLUE4("",6,new int[][]{{1,0,0},{2,0,0},{2,1,0},{2,2,0},{2,2,1},{0,0,0}}),
	RED1("",5,new int[][]{{0,0,1},{1,0,0},{1,1,0},{0,1,0},{0,0,0},{0,0,0}}),
	RED2("",5,new int[][]{{1,0,0},{2,0,0},{2,1,0},{2,2,0},{0,0,0},{0,0,0}}),
	RED3("",6,new int[][]{{0,1,0},{1,1,0},{1,1,1},{1,1,2},{2,1,1},{0,0,0}}),
	RED4("",5,new int[][]{{0,1,0},{0,2,0},{0,3,0},{1,2,0},{0,0,0},{0,0,0}}),
	YELLOW1("",5,new int[][]{{0,1,0},{0,2,0},{1,1,0},{1,1,1},{0,0,0},{0,0,0}}),
	YELLOW2("",5,new int[][]{{0,1,0},{0,0,1},{1,1,0},{2,1,0},{0,0,0},{0,0,0}}),
	YELLOW3("",5,new int[][]{{0,1,0},{1,1,1},{1,1,0},{1,2,1},{0,0,0},{0,0,0}}),
	YELLOW4("",6,new int[][]{{0,1,0},{1,1,1},{0,1,1},{-1,1,1},{0,2,1},{0,0,0}});
	
	
	int objetosc=0;
	String kolor="";
	int wektory[][]=new int[6][3];
	private int iloscZmianWektora=0;
	public int getiloscZmianWektora(){return iloscZmianWektora;}
	public static void getiloscZmianWektorow(){
		for(Block a:Block.values()){
			System.out.println(a.iloscZmianWektora);
		}
	}
	Block (String c,int o,int[][] w){
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
		case 1:
		case 2:
		case 3:
				obrocWokolY();
				break;
		case 4:
				obrocWokolY();
				obrocWokolZ();
				obrocWokolZ();
				break;
		case 5:
		case 6:
		case 7:
				obrocWokolY();
				break;
		case 8:		
				obrocWokolY();
				obrocWokolZ();
				break;
		case 9:
		case 10:
		case 11:
				obrocWokolX();
				break;
		case 12:
				obrocWokolX();
				obrocWokolZ();
				obrocWokolZ();
				break;
		case 13:
		case 14:
		case 15:
				obrocWokolX();
				break;
		case 16:
				obrocWokolY();
				break;
		case 17:
		case 18:
		case 19:
				obrocWokolZ();
				break;
		case 20:
				obrocWokolZ();
				obrocWokolY();
				obrocWokolY();
				break;
		case 21:
		case 22:
		case 23:
				obrocWokolZ();
				break;
		case 24:
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
