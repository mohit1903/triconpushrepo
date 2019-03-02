package com.mohit.myapp.modal.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.mohit.myapp.modal.modal;

@Service("service")
@Repository
public class MyService  {
	
	Crud userrepository;
    
	public void savedata(modal m)
	{
		userrepository.save(m);
	}

}
