//Find the largest and second largest number in an array
public class LargestAndSecondLargest {

	public static void main(String[] args) {
		int arr[] = {12, 35, 1, 10, 34, 1};
		int max=0,secMax=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
			max=arr[i];
		}
		System.out.println("---------");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>secMax && arr[i]!=max) {
				secMax=arr[i];
			}
		}
		
			System.out.println(max+" "+secMax);
		
		

	}

}
