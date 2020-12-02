package com.cg.onlinepizza.service;

import com.cg.onlinepizza.model.Admin;

public interface IAdminService {

		public Admin  addNewAdmin(Admin admin);

		public  Admin signIn(Admin admin);

		public Admin  signOut(Admin admin);
		
	}