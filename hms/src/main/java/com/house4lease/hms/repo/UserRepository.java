package com.house4lease.hms.repo;

import com.house4lease.hms.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    @Query(value = "SELECT u FROM user u WHERE u.userID = :userID AND u.password = :password")
    Optional<User> findUserByLoginMethod(@Param("userID") Integer UserID, @Param("password") String password );
}
