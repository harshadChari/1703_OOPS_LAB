import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		
		/*System.out.println(DB_Handler_User.getUserbyId(1).getName());
		User u1 = new User(4,"abc");
		//DB_Handler_User.insertUser(u1);
		u1.setName("maria");
		/*DB_Handler_User.updateUser(u1);
		System.out.println(DB_Handler_User.getUserbyId(u1.getId()).getName());
*/
		DB_Handler_User.deleteUser(4);
		
		
		int choice,id;
		User tuser;
		int rep =1 ;
		do {
			
			
			System.out.println("Enter:");
			System.out.println("1:Select User By Id");
			System.out.println("2:Insert New User");
			System.out.println("3:Update User By Id");
			System.out.println("4:Delete User By Id");
			System.out.println("5:Select all Users");
			choice = sc.nextInt();
			
			switch(choice)
			{
			 
			case 1:
				tuser = new User();
				System.out.print("Id:");
				id = sc.nextInt();
				tuser = DB_Handler_User.getUserbyId(id);
				System.out.println(tuser.getName());
				break;
				
			case 2:
				tuser = new User();	
				System.out.print("Id:");
				tuser.setId(sc.nextInt());
				sc.nextLine();
				System.out.print("Name:");
				tuser.setName(sc.nextLine());
				DB_Handler_User.insertUser(tuser);
				break;
				
			case 3:
				tuser = new User();	
				System.out.print("Id:");
				tuser.setId(sc.nextInt());
				sc.nextLine();
				System.out.print("Name:");
				tuser.setName(sc.nextLine());
				DB_Handler_User.updateUser(tuser);
				break;
				
			case 4:
				tuser = new User();	
				System.out.print("Id:");
				tuser.setId(sc.nextInt());			
				DB_Handler_User.deleteUser(tuser.getId());
				break;
			case 5:
					
				ArrayList<String> list = DB_Handler_User.getAllUsers();
				System.out.println("Id\tName\n");
				 Iterator itr=list.iterator();  
				  while(itr.hasNext()){  
					  tuser = (User) itr.next();	
				   System.out.print(tuser.getId().toString() + "\t");
				   System.out.print(tuser.getName());
				   System.out.println();
				  }  
				  
				break;
				
			}
			System.out.println();
			System.out.println("Repeat ? 1/0 :");
			rep = sc.nextInt();
			
		}while(rep==1);	
		
	}

}
