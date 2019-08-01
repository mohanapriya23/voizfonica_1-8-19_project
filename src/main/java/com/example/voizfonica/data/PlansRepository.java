package com.example.voizfonica.model;

import com.example.voizfonica.Plans;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlansRepository extends MongoRepository<Plans,String> {

}
