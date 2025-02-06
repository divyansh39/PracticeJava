
public class LargeSecondLargeInOneLoop {

	public static void main(String[] args) {
		int arr[] = {12, 35, 15, 20, 34, 1};
		int max=-1,secMax=-1;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				secMax=max;
				max=arr[i];
				
			}
			else if(arr[i]<max && arr[i]>secMax){
				secMax=arr[i];
				
			}
		}
		System.out.println("largest: "+max);
		System.out.println("SecondLargest: "+secMax);

	}

}
