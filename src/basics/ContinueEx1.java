package basics;

public class ContinueEx1 {
	public static void main(String[] args) {
	
		int num;
		for(num=1; num<=50; num++){
			if(num%5==0){
				System.out.println(num);
				num++;
				break;		
			}else if(num%3==0){
				System.out.println(num);
				num++;
				break;
			}else
				System.out.println(num);
				num++;
				break;
			}
			System.out.println(num);
		}

}