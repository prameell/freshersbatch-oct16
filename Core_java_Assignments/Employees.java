package EmployeeObjectsHashset;

import java.util.ArrayList;
import java.util.HashSet;

public class Employees {
	public static void main(String[] args) {
	HashSet<Data> set=new HashSet<Data>();
	Data d1=new Data(101,"Prameela","MECH",10000);
	Data d2=new Data(102,"Prema","CIVIL",20000);
	Data d3=new Data(103,"Pavani","CSE",20000);
	Data d4=new Data(101,"Madhuri","EEE",10000);

	set.add(d1);
	set.add(d2);
	set.add(d3);
	set.add(d4);
	for(Data d:set)
	{
	System.out.println("id:"+d.id+" name:"+d.name+" Department: "+d.department+" Salary:"+d.salary);
	}
	}

	}
	class Data
	{
	int id;
	String name,department;
	double salary;
	public Data(int id, String name, String department, double salary)
	{
	this.id=id;
	this.name=name;
	this.department=department;
	this.salary=salary;
	}
	}


