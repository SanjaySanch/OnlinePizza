package com.cg.onlinepizza.service;

import java.util.List;

import com.cg.onlinepizza.model.Coupan;



public interface ICoupanService {

	Coupan addCoupans(Coupan coupan);
 
	Coupan editCoupans(Coupan coupan);

	Coupan deleteCoupans(int coupanId);
	
    List<Coupan> viewCoupans();
   
}