

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Students {
	public String fullName;
	public int age;
	
	
	public Students() {
		super();
	}
	public Students(String fullName, int age) {
		super();
		this.fullName = fullName;
		this.age = age;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return fullName +" "+age+" tuoi";
	}
public static void nhapThongTin(ArrayList<Students>o,int n) {
	for(int i = 0 ;i<n;i++) {
		System.out.println("nhap ten");
		String fullName = new Scanner(System.in).nextLine();
		System.out.println("nhap tuoi");
		int age = new Scanner(System.in).nextInt();
		Students std = new Students(fullName, age);
		o.add(std);
	}
}
public static void nhapThongTin(ArrayList<Students>o) {
		System.out.println("nhap ten");
		String fullName = new Scanner(System.in).nextLine();
		System.out.println("nhap tuoi");
		int age = new Scanner(System.in).nextInt();
		Students std = new Students(fullName, age);
		o.add(std);
}
public static void xuatThongTin(ArrayList<Students>o) {
	for(Students std : o) {
		System.out.println(std);
		
	}
	
}
public static void suaThongTin(ArrayList<Students>o) {
	System.out.println("nhap ten student ban muon chinh sua");
	String sua = new Scanner(System.in).nextLine();
	for(Students std : o) {
		if(std.getFullName().equals(sua)) {
			System.out.println("nhap thong tin muon sua");
			System.out.println("nhap ten");
			String ten = new Scanner(System.in).nextLine();
			System.out.println("nhap tuoi");
			int tuoi = new Scanner(System.in).nextInt();
			std.setFullName(ten);
			std.setAge(tuoi);
		}
	}
	
}
public static void xoaThongTin(ArrayList<Students>o) {
	System.out.println("nhap ten student muon xoa");
	String xoa = new Scanner(System.in).nextLine();
	for(int i = 0 ; i<o.size();i++) {
		if(o.get(i).getFullName().equals(xoa))o.remove(i);
	}
	
}
