package com.devmam.dsvendas2.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devmam.dsvendas2.dto.SellerDTO;
import com.devmam.dsvendas2.entities.Seller;
import com.devmam.dsvendas2.repositories.SellerRepository;

@Service
public class SellerService {
	
	
	@Autowired
	private SellerRepository repository;
	
	
	public List<SellerDTO> findAll() {
		List<Seller> result = repository.findAll();
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}

}
