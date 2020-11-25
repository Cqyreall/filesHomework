package com.codeclan.example.foldersservices.Repositories;

import com.codeclan.example.foldersservices.Models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
