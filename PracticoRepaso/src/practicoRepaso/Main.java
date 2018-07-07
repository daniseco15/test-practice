package practicoRepaso;

//Hola

public class Main {

	public static void doSomething(){
		System.out.println("I do something else");
	}

	public static void main(String[] args) {
		//listarRec(10);
		int[] n= {5,36,63,23,1,6};
		System.out.println(minRec(n,0,3));
	}


	public static void listarRec(int n){
		if(n==1){
			System.out.println(n);
		}
		else{
			listarRec(n-1);
			System.out.println(n);
		}
	}

	public static int factorialRec(int n){
		if(n==0 || n==1){
			return n;
		}
		else{
			return n*factorialRec(n-1);
		}
	}


	public static int minRec(int[] n, int a, int b){
		if(a==b){
			return n[a];
		}
		else{
			int minIzq=minRec(n,a,(a+b)/2);
			int minDer=minRec(n,(a+b)/2+1,b);
			if(minIzq<minDer)
				return minIzq;
			else
				return minDer;
		}
	}


}
