package com.adv.ecomm.admin.dao;

import com.adv.ecomm.admin.model.Brand;

public class BrandDao {

	public boolean saveBrand(Brand brand)
	{
		System.out.println(brand.toString());
		return true;
	}
}
