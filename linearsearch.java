class Example1
{
 public static void main(String args[])
 {
 int i,key=9;
 int a[]={1,4,7,9,10}; 
 for (i= 0; i < a.length; i++)
 {
 if (a[i] == key) 
 {
 System.out.println(key+" is present at location "+(i+1));
 break;
 }
 }
 if (i == a.length)
 System.out.println(key + " doesn't exist in array.");
 }
}

// example 2 

class Example2 
{ 
 public static void main(String args[]) 
 { 
 int i,len, key, array[]; 
 
 Scanner input = new Scanner(System.in); 
 
 System.out.println("Enter Array length:"); 
 
 len = input.nextInt(); 
 
 array = new int[len]; 
 
 System.out.println("Enter " + len + " elements"); 
 
 for (i = 0; i < len; i++) 
 { 
 array[i] = input.nextInt(); 
 } 
 System.out.println("Enter the search key value:"); 
 key = input.nextInt(); 
 for (i = 0; i < len; i++) 
 { 
 if (array[i]== key) 
 { 
 System.out.println(key+" is present at location "+(i+1)); 
 break; 
 } 
 } 
 if (i == len) 
 System.out.println(key + " doesn't exist in array."); 
 } 
} 
