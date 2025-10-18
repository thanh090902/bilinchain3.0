package com.BC3.BilinChain30.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BC3.BilinChain30.enitys.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
