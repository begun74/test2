package bvv;

 class  Quest3 {
	 
	 public static float coeff = 5;
	 
	 public static void setCoeff(float c)
	 {
		 coeff = (float)c*coeff;
	 }
	 public static void main() {
		 System.out.print("A"); 
	 }
	 public static void main(String args) {
		 System.out.print("D"); 
	 }
	 public static void main(String[] args) {
		 Character ch = new Character('3');
		 int i =128; 
		 int ii = 32565;  int j = '�';

		 Float f = 7f;
		 Integer oa = i;
		 System.out.println(i+" "+ (oa==i)); 
		 System.out.println("f - "+ f); 
		 
		 int aaa[] = new int[3];
		 int arr[] = new int[]{1,34,2,5,12,17,43,56};
		 
		 //bubbleSortRevers(arr);
		 //for(int y=0; y<arr.length;y++)
			// System.out.println(arr[y]+"");
		 Quest3.coeff=7;
		 setCoeff(3);
		 System.out.println(Quest3.coeff);
	 }
	 
	 public static void bubbleSort(int[] arr){
		    /*������� ���� ������ ��� ��������� �������� �������, 
		      ��� ��� ���������� ���� ������ ��� ������ � �����
		      ��������� ������������ �������*/   
		    for(int i = arr.length-1 ; i > 0 ; i--){
		        for(int j = 0 ; j < i ; j++){
		            /*���������� �������� �������, 
		              ���� ��� ����� ������������ �������, 
		              �� ������ ������� */
		            if( arr[j] > arr[j+1] ){
		                int tmp = arr[j];
		                arr[j] = arr[j+1];
		                arr[j+1] = tmp;
		                
		            }
		        }
		    }
		}	 

	 public static void bubbleSortRevers(int[] arr){
		    /*������� ���� ������ ��� ��������� �������� �������, 
	      ��� ��� ���������� ���� ������ ��� ������ � �����
	      ��������� ������������ �������*/   
	    for(int i = arr.length-1 ; i > 0 ; i--){
	        for(int j = 0 ; j < i ; j++){
	            /*���������� �������� �������, 
	              ���� ��� ����� ������������ �������, 
	              �� ������ ������� */
	            if( arr[j] < arr[j+1] ){
	                int tmp = arr[j];
	                arr[j] = arr[j+1];
	                arr[j+1] = tmp;
	                
	            }
	        }
	    }
	}	 
 
 }
