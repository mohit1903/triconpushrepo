package com.mohit.myapp.modal.services;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mohit.myapp.modal.modal;

@Repository("userrepository")
public interface Crud extends CrudRepository<modal, Long> {

	

}
