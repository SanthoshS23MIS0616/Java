/*
Question:
How can you create a Java program to rotate an array right by K positions using the reverse technique with O(1) extra space?
*/
class RotateArray{
    public static void main (String []args)
    {
        int A[]={1,2,3,4,5,6,7,8};
        
        int temp;
        temp = A[A.length-1];
        for(int i= A.length-2; i>=0;i--)
        {
            A[i+1]=A[i];
        }
        A[0]=temp;
        for (int x:A)
        {
            System.out.print(x +"");
            System.out.println(" ");
     
       }

    }
}