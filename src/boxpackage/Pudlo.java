package boxpackage;

public class Pudlo {	
	boolean[][][] pudlo=new boolean[4][4][4];	
	public void wysypKlockiZPudla(){
		for(int i=0;i<64;i++){
			//System.out.println(i);
			pudlo[i%4][(i/4)%4][i/16]=false;
		}
	}
	public void zajrzyjDoPudelka(){
		System.out.println(this);		
	}
	public String toString(){
		String a="";
		int spacje=4;
		for(boolean[][] b1: pudlo){
			spacje--;
			for(boolean[] b2: b1){				
				for(int k=0;k<spacje;k++)a+="   ";
				for(boolean b3: b2){
					a+=b3?"1":"0";
				}
				a+="\n";
			}
			a+="";
		}
		return a;
	}
	public boolean wlozKlocekDoPudelka(int gdzie,Block k){
		boolean b=false;
		for(int[] a:k.wektory){
			if((a[0]==0)&&(a[1]==0)&&(a[2]==0)) {continue;}//przypadek pustego wektora
			try{b=(pudlo[((gdzie%4)+a[0])][(gdzie/4)%4+a[1]][gdzie/16+a[2]]==true);}
			catch(ArrayIndexOutOfBoundsException e){return false;}
			finally{}				
			if(b){return false;}	//brak miejsca w pudelku				
		}
		pudlo[gdzie%4][(gdzie/4)%4][gdzie/16]=true;//punkt startowy
		for(int[] a:k.wektory){//wektory
			//System.out.println(a[0]+" "+a[1]+" "+a[2]+" ");	
			if((a[0]==0)&&(a[1]==0)&&(a[2]==0)) {continue;}//przypadek pustego wektora//	int przesun=(gdzie+ws[0]*a[0]+ws[1]*a[1]+ws[2]*a[2]);//pudlo[przesun%4][(przesun/4)%4][przesun/16]=true;
			pudlo[((gdzie%4)+a[0])][(gdzie/4)%4+a[1]][gdzie/16+a[2]]=true;
		}
		return true;
	}

	public void wyjmijKlocek(int gdzie,Block k){
		for(int[] a:k.wektory){
			if((a[0]==0)&&(a[1]==0)&&(a[2]==0)) {continue;}//przypadek pustego wektora
			pudlo[((gdzie%4)+a[0])][(gdzie/4)%4+a[1]][gdzie/16+a[2]]=false;
		}
	}

}
