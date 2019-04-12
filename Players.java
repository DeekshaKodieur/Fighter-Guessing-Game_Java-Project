import java.util.*;
public class Players
{
	private int bullet=3;
	private int sword;
	private int power=10;
	
	public int get_bullet()
	{
		bullet=bullet-1;
		return bullet;
	}
	public int get_power()
	{
		
		return power;
	}
	public int init_bullet()
	{
		
		return bullet;
	}
	
	public void power_left_bullet()
	{
		power=power-5;
		
	}
	public void power_left_sword()
	{
		power=power-2;
		
	}	
	
	public static void main(String [] args) throws Exception
	{
		Players p1= new Players();
		Players p2= new Players();
		
		
		Random rand = new Random();
		while(p1.power > 0 || p2.power>0)
		{
			System.out.println();
			System.out.println("PLAYER 1 ---> ");
			System.out.println();
			System.out.println("	"+"POWER      : " + p1.get_power());
			System.out.println();
			System.out.println("	"+"BULLETS    : " + p1.init_bullet());
			System.out.println();
			
			System.out.println("PLAYER 2 ---> ");
			System.out.println();
			System.out.println("	"+"POWER      : " + p2.get_power());
			System.out.println();
			System.out.println("	"+"BULLETS    : " + p2.init_bullet());
			System.out.println();
			
			Scanner sc = new Scanner(System.in);
			
			//player 1
			
			System.out.println();
			System.out.println("----------------------------------------------------");
			System.out.println("		"+"PLAYER 1");
			System.out.println("----------------------------------------------------");
			
			
			System.out.println();
			System.out.println("	"+"PRESS 1             : BULLETS");
			System.out.println();
			System.out.println("	"+"PRESS 2             : SWORD");
			System.out.println();
			System.out.print("	"+"CHOOSE YOUR WEAPON  : ");
			
			int w = sc.nextInt();
			System.out.println();
			if(w==1)
			if(p1.bullet == 0)
			{
				System.out.println("No Bullets left!");
				System.out.println();
				w=2;
			}		
			
			int rand_no = rand.nextInt(6);				// generate random number by computer 
					
			System.out.print("	"+"GUESS YOUR NUMBER - RANGE  1 TO 5 : ");
			int n = sc.nextInt();
			System.out.println();
			if(rand_no!=n)
			{
				System.out.println("***************** TARGET MISSED! ****************");
				System.out.println();
				if(w==1)
				{
					p1.get_bullet();
				}
			}
			else
			{
				System.out.println("************ TARGET HIT! ***************************");
				System.out.println();
				if(w==1)
				{
					//System.out.println("POWER LEFT : "+ p2.power_left_bullet());
					p2.power_left_bullet();
					p1.get_bullet();
				}
				if(w==2)
				{
					//System.out.println("POWER LEFT  : "+ p2.power_left_sword());
					p2.power_left_sword();
				}
				System.out.println();
					
			}
			
			//player 2
			
			System.out.println();
			System.out.println("----------------------------------------------------");
			System.out.println("		"+"PLAYER 2");
			System.out.println("----------------------------------------------------");
			
			System.out.println();
			System.out.println("	"+"PRESS 1              : BULLETS");
			System.out.println();
			System.out.println("	"+"PRESS 2              : SWORD");
			System.out.println();
			System.out.print("	"+"CHOOSE YOUR WEAPON   : ");
			
			w = sc.nextInt();
			System.out.println();
			if(w==1)
			if(p2.bullet == 0)
			{
				System.out.println("No Bullets left!");
				System.out.println();
				w=2;
			}		
			
			int rand_num = rand.nextInt(6);				// generate random number by computer 
					
			System.out.print("	"+"GUESS YOUR NUMBER - RANGE 1 TO 5 : ");
			int num = sc.nextInt();
			System.out.println();
			if(rand_num!=num)
			{
				System.out.println("***************** TARGET MISSED! ******************");
				System.out.println();
				if(w==1)
				{
					p2.get_bullet();
				}
			}
			else
			{
				System.out.println("****************** TARGET HIT! *******************");
				System.out.println();
				if(w==1)
				{
					//System.out.println("POWER LEFT : "+ p1.power_left_bullet());
					p1.power_left_bullet();
					p2.get_bullet();
				}
				if(w==2)
				{
					//System.out.println("POWER LEFT : "+ p1.power_left_sword());
					 p1.power_left_sword();
				}
				System.out.println();
				
			}
				 for( int i=0;i<=25;i++)
				 {
					 System.out.println();
				 }
			
			
				
				System.out.println("------------------NEXT TURN------------------------");
				//System.out.println("---------------------------------------------------");
			
			
		}
		
	}
}