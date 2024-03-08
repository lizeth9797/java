import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		String [] meses= 				{"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		System.out.println(meses[2]);
		System.out.println(meses.length);		
		System.out.println("============================");
		meses[11]="December";

		for(int i=0; i< meses.length; i++) {	
			//System.out.println(meses[i]);
		}
		System.out.println("============================");
		//forEach
		for (String m : meses) {
			//System.out.println(m.toUpperCase());
		}
		System.out.println("============================");

		int [] nums= new int[5];
		nums[0]=1;
		nums[1]=2;
		nums[2]=4;
		nums[3]=8;
		nums[4]=16;
		for (int num : nums) {
			System.out.println(num);
		}
		nums=Arrays.copyOf(nums,6);
		nums[5]=32;
		System.out.println(nums.length);//6
		System.out.println("============================");
		for (int num : nums) {
			System.out.println(num);
		}

		
		
		
	}

}
