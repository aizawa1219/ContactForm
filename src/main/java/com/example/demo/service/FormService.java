package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Form;
import com.example.demo.repository.FormRepository;

@Service
public class FormService {
	@Autowired
	private FormRepository repository;

	public void save(Form form) {
		repository.save(form);
	}
}