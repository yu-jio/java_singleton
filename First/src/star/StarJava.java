package star;

public class StarJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<3-i;j++)
				System.out.print(' ');
			for(int k=0;k<1+i*2;k++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
