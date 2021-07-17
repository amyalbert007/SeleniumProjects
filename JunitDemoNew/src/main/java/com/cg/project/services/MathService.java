package com.cg.project.services;
import com.cg.project.exceptions.InValidNumberRangeException;
public interface MathService {
	int add(int n1, int n2)throws InValidNumberRangeException;
	int sub(int n1, int n2) throws InValidNumberRangeException;
	int multi(int n1, int n2)throws InValidNumberRangeException;
	int div(int n1, int n2)throws InValidNumberRangeException;

}
