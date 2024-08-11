package com.n1nt3nd0.springreactwebsocketchatapp.repository;


import com.n1nt3nd0.springreactwebsocketchatapp.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, UUID> {

  Optional<UserEntity> findByUsername(String username);

  Boolean existsByUsername(String username);

  Boolean existsByEmail(String email);

  List<UserEntity> findAllByUsernameIn(Set<String> usernames);
}
