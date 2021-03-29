package com.addressbookmgmt;

	import java.util.Map;
	import java.util.Scanner;

	public class Contacts {
		private String firstName;
		private String lastName;
		private String address;
		private String city;
		private String state;
		private int zip;
		private String mobNo;
		private String email;
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public int getZip() {
			return zip;
		}
		public void setZip(int zip) {
			this.zip = zip;
		}
		public String getMobNo() {
			return mobNo;
		}
		public void setMobNo(String mobNo) {
			this.mobNo = mobNo;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		@Override
		public String toString() {
			return "Contacts [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
					+ ", state=" + state + ", zip=" + zip + ", mobNo=" + mobNo + ", email=" + email + "]";
		}
		public Contacts(String firstName, String lastName, String address, String city, String state, int zip, String mobNo,
				String email) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.address = address;
			this.city = city;
			this.state = state;
			this.zip = zip;
			this.mobNo = mobNo;
			this.email = email;
		}
		public Contacts() {
			// TODO Auto-generated constructor stub
		}

		public void addContact()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter  First Name");
			firstName = sc.nextLine();
			System.out.println("Enter  Last Name");
			lastName = sc.nextLine();
			System.out.println("Enter Address");
			address = sc.nextLine();
			System.out.println("Enter City Name");
			city = sc.nextLine();
			System.out.println("Enter State Name");
			state = sc.nextLine();
			System.out.println("Enter Zip");
			zip = sc.nextInt();

		}
		public Contacts search(String searchByFirstName,Map<String, Contacts> mapVariable)
		{
			return mapVariable.get(searchByFirstName);


		}




	}



