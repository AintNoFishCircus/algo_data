package hanoi;

public class Hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer N = 3;
		turm(N, 'A', 'B', 'C');
		
		}
	static void turm(int n, char a, char b, char c){
		if (n >0){
			turm(n-1,a,c,b);
			bewege(a,b);
			turm(n-1,c,b,a);
		}
	}
	
	static void bewege(char Quelle, char Senke){
		
		System.out.print("bewege");
		System.out.print(Quelle);
		System.out.print("-->");
		System.out.println(Senke);
	}

}
