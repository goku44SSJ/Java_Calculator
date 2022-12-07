import java.util.Scanner;

public class calcu 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);double a=0,b=0,c=0,res=0;int count=0;
		System.out.println("Enter no.");
		for(int i=1;i>=0;i++)
		{
			a=sc.nextDouble();
			if(a%1.0==0 || a%1>0 || a%1<0)
				break;
			else
				System.out.println("Invalid Input, Retry");
		}
        for(int j=1;j>=0;j++)
        {
        	System.out.println("Enter function '+' for additon '-' for subtraction '*' for multiplication and '/' for division");
        	char ch=sc.next().charAt(0);
        	if(ch=='+')
        	{
        		System.out.println("Enter the number");
        		for(int k=1;k>=0;k++)
        		{
        			b=sc.nextDouble();
        			if(b%1.0==0 || b%1>0 || b%1<0)
        				break;
        			else
        				System.out.println("Invalid Input, Retry");
        	    }
        		if(count==0)
        		{
        			res=a+b;
        			count++;
        		}
        		else if(count==1)
        		{
        			c=res+b;
        			count++;
        		}
        		else if(count>1)
        		{
        			c=c+b;
        		}
        	}
        	
        	if(ch=='-')
        	{
        		System.out.println("Enter the number");
        		for(int k=1;k>=0;k++)
        		{
        			b=sc.nextDouble();
        			if(b%1.0==0 || b%1>0 || b%1<0)
        				break;
        			else
        				System.out.println("Invalid Input, Retry");
        	    }
        		if(count==0)
        		{
        			res=a-b;
        			count++;
        		}
        		else if(count==1)
        		{
        			c=res-b;
        			count++;
        		}
        		else if(count>1)
        		{
        			c=c-b;
        		}
        	}
        	
        	if(ch=='*')
        	{
        		System.out.println("Enter the number");
        		for(int k=1;k>=0;k++)
        		{
        			b=sc.nextDouble();
        			if(b%1.0==0 || b%1>0 || b%1<0)
        				break;
        			else
        				System.out.println("Invalid Input, Retry");
        	    }
        		if(count==0)
        		{
        			res=a*b;
        			count++;
        		}
        		else if(count==1)
        		{
        			c=res*b;
        			count++;
        		}
        		else if(count>1)
        		{
        			c=c*b;
        		}
        	}
        	
        	if(ch=='/')
        	{
        		System.out.println("Enter the number");
        		for(int k=1;k>=0;k++)
        		{
        			b=sc.nextDouble();
        			if(b%1.0==0 || b%1>0 || b%1<0)
        				break;
        			else
        				System.out.println("Invalid Input, Retry");
        	    }
        		if(count==0)
        		{
        			res=a/b;
        			count++;
        		}
        		else if(count==1)
        		{
        			c=res/b;
        			count++;
        		}
        		else if(count>1)
        		{
        			c=c/b;
        		}
        	}
        	else if(ch=='=')
        	{
        		if(count==0)
        		{
        			System.out.println(res);
        			break;
        		}
        		else if(count>0)
        		{
        			System.out.println(c);
        			break;
        		}
        	}
        }
	}

}

