
public class s15loops {

	public static void main(String[] args) {
		/*for(int i=0;i<10;i++) {
			System.out.println("H");}
			for(int i=1;i<=10;i++) {
				System.out.println("value of i="+i);
	
			}*/
		/*for(int i=22;i<=98;i++) {
			if(i%2==0) {
				System.out.println(i);

			}
			
		}*/
		int sum=0;
		int count=0;
		for(int i=1;i<100;i++) {
			if((i%3==0)&&(i%5==0)) {
				sum+=i;
				count++;
			}
			if(count==5) {
				break;
			}else {
				continue;
			}
		}
		System.out.println("sum="+sum);
		System.out.println("");


		
	}

}
