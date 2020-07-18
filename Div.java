package epamtask3;

public class Div extends Operations{
		public int op(int a, int b){
			int div=0;
			if(b == 0)
				System.out.println("Division can't be performed");
			else 
		       div = a/b;
		 return div;
		}
}
