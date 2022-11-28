package com.adv.ecomm.admin.controller;

import com.adv.ecomm.admin.model.Brand;
import com.adv.ecomm.admin.service.BrandService;

public class BrandController {
	
	
	public boolean saveBrand(Brand brand)
	{
		return new BrandService().saveBrand(brand);
	}

}
