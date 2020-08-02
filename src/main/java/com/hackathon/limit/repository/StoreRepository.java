package com.hackathon.limit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hackathon.limit.model.Store;

@Repository
public interface StoreRepository extends JpaRepository<Store,Long>{
	
	public Store findByCnpj(String cnpj);

}
