package com.house4lease.hms.repo;

import com.house4lease.hms.entity.Phone;
import com.house4lease.hms.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PhoneRepository extends CrudRepository<Phone, Integer> {

}
