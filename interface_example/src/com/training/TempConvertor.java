package com.training;

import com.training.intrface.Function;

public class TempConvertor implements Function {

	@Override
	public double apply(double arg) {
		
		return (arg*9/5)+32;
	}

}
