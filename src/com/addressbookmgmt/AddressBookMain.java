package com.addressbookmgmt;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class AddressBookMain {


	public static void main(String[] args) {

		System.out.println("Welcome To Address Book Program");
		Scanner sc = new Scanner(System.in);
		int exit = 0;
		Map<String, Contacts> mapVariable = new HashMap<String, Contacts>();
		int answer;
		//we will loop until user wants to exit the application
		do {
			System.out.println("--------Welcome to Address Book---------");
			System.out.println("Enter '1' to Add contact");
			System.out.println("Enter '2' to Search contact");
			System.out.println("Enter '3' to Print contact");
			System.out.println("Enter '4' to Edit contact");
			System.out.println("Enter '5' to Delete contact");
			System.out.println("Enter '0' to Exit");
			System.out.println("Do you want to print contacts, add contact, search for contact, edit contact or delete contact?");
			System.out.println("Answer with '1', '2', '3', '4', '5' or '0' to exit application.");	
			try {//we handle the input of the user
				answer = sc.nextInt();
			} catch (NumberFormatException e) {
				//e.printStackTrace();
				answer = -1;
			}
			if(answer != -1) {
				 mapVariable=localMethod( mapVariable,answer);
			}

		}while(answer != exit);
		System.out.println("Application terminating...");
		
	}
		
		
		private static  Map<String, Contacts> localMethod(Map<String, Contacts> mapVariable,int answer) {
			Scanner sc = new Scanner(System.in);
			Contacts contacts=new Contacts();
			//
			if(answer == 1) {
				contacts.addContact();				
				mapVariable.put(contacts.getFirstName(), contacts);
				//System.out.println("Entered Contact"+mapVariable.get(contacts.getFirstName()));
				return mapVariable;
			}
			else if(answer == 2) {
				System.out.println("Enter the name by which you want to search contac Object");
				String searchByFirstName = sc.nextLine();
				contacts=contacts.search( searchByFirstName, mapVariable);
				System.out.println("Searched contact"+contacts );
				return mapVariable;
			}
			else if(answer == 3) {
				mapVariable.entrySet().forEach(entry->{
					System.out.println("Key:->"+entry.getKey()+ "	Contacts are :-> "+ entry.getValue());	
				});				
				return mapVariable;
			}
			else if(answer == 4){
				System.out.println("enter the first name which u want to edit");
				String updat_name = sc.nextLine();
				Contacts upDatedObj = contacts.search(updat_name, mapVariable);
				mapVariable.remove(upDatedObj.getFirstName(),upDatedObj);
				upDatedObj.addContact();
				System.out.println("Searched contact"+upDatedObj + "First name:"+upDatedObj.getFirstName());		
				mapVariable.put(upDatedObj.getFirstName(), upDatedObj);
				return mapVariable;
			}
			else if(answer == 5)
			{
				System.out.println("enter the first name which u want to delete : ");
				String dName = sc.nextLine();
				mapVariable.remove(dName);	
				return mapVariable;
			}
			else {
				System.out.println("Please Enter valid number");
				return mapVariable;
				
			}
			}
					
		
	}
	



