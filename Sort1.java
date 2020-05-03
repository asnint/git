
public class Sort1 {
//	public Sort1(int[] b) {
//  
//	}
	public static void Sort(int a[],int m,int n,int b[]) {
		if(n-m>1) {
			int x= m+(n-m)/2;
			int p=m,q=x,i=m;
			Sort (a,m,x,b);
			Sort (a,x,n,b);
			while (p < x||q < n) {
				if(q>=n||(p<x&&a[p]<=a[q]))
					b[i++]=a[p++];
				else b[i++] = a[q++];
			}
			for(i=m;i<n;i++)a[i] = b[i];
		}
		 
	}
   public static void main(String[] args) {
	  int a[] = {4,8,9,7,6,3,1,2,10,5};
//	  int b[] = {4,8,9,7,6,3,1,2,10,5};
//	 Sort1 b[10]=new Sort1(b); 
//	  int c[];
	  int b[]=new int[10];
	  int m=0,n=10;
	  Sort(a,m,n,b);
	  for(int i=0;i<10;i++)
			     System.out.println(a[i]);	 
}
}
