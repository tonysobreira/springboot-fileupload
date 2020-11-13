package com.devglan.dao;

import com.devglan.service.Document;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentDao extends CrudRepository<Document, Long>{
    
}
