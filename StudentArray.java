package SortingArray;

import java.util.Scanner;

public class StudentArray implements Comparable {

	
		
   private int id;
   private String name;
   private int age;

   public int getId() {
	return id;
 }
   public void setId(int id) {
	this.id = id;
 }
   public String getName() {
	return name;
 }
   public void setName(String name) {
	this.name = name;
 }
   public int getAge() {
	return age;
 }
   public void setAge(int age) {
	this.age = age;
 }
@Override
public int compareTo(Object o) {
	StudentArray s=(StudentArray)o;
	
	if(this.age==s.getAge()) {
		return 0;
		
	}else if(this.age>s.getAge()) {
		return 1;
	}else {
		return -1;
	}
	
}
   
   
			
	
}
