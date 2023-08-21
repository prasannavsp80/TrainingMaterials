package com.java.employ;

import java.util.ArrayList;
import java.util.List;

public class EmployDaoImpl implements EmployDAO {

	static List<Employ> employList;
	
	static {
		employList = new ArrayList<Employ>();
	}
	
	@Override
	public List<Employ> showEmployDao() {
		// TODO Auto-generated method stub
		return employList;
	}

	@Override
	public String addEmployDao(Employ employ) {
		employList.add(employ);
		return "Employ Record Added Successfully...";
	}

}
