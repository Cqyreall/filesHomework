package com.codeclan.example.foldersservices.Repositories;

import com.codeclan.example.foldersservices.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
