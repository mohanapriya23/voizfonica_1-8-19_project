package com.example.voizfonica.data;

import com.example.voizfonica.model.DonglePlans;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DongleRepository   extends MongoRepository<DonglePlans, String> {

}
