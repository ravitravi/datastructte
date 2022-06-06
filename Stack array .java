import java.util.Scanner;

//Main class

    class Stack 
    {
        static final int size=4;
        static int arr[]= new int [size];
       static int top=-1;

//Push
    
    static void push(int a)
    {
        if(top==(size-1))System.out.println("Stack is FUll");
        else
        {
            ++top;
            arr[top]=a;
             System.out.println("Pushed element ="+arr[top]);
        }
    }
    
//Pop
      static void pop()
      {
          if(top==-1)System.out.println("Stack is Empty");
          else
          {
              System.out.println("Popped element ="+arr[top]);
              top--;
          }
      }

//Peek

      static void peek()
      {
          if(top==-1)System.out.println("Stack is Empty");
          else{
              System.out.println("Peek element is "+arr[top]);
          }
      }
    
//Main
    
    public static void main(String args[])
    {
        Stack s=new Stack();
        Scanner sc=new Scanner (System.in);
        while(true)
        {
            int n=sc.nextInt();
            switch(n)
            {
                case 1:
                    int a=sc.nextInt();
                    push(a);
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    peek();
                    break;
                case 4:
                    sc.close();
                    break;
            }
        }
    }
}
