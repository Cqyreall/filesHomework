package com.codeclan.example.foldersservices;

import com.codeclan.example.foldersservices.Models.File;
import com.codeclan.example.foldersservices.Models.Folder;
import com.codeclan.example.foldersservices.Models.User;
import com.codeclan.example.foldersservices.Repositories.FileRepository;
import com.codeclan.example.foldersservices.Repositories.FolderRepository;
import com.codeclan.example.foldersservices.Repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FoldersservicesApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canAddUserAndOthers(){
		User cyril = new User("Cyril");
		userRepository.save(cyril);

		Folder codeClan = new Folder("Code Clan", cyril);
		folderRepository.save(codeClan);

		File spring = new File("Spring", ".java", 15, codeClan);
		fileRepository.save(spring);

		codeClan.addFiles(spring);
		folderRepository.save(codeClan);

		cyril.addFolder(codeClan);
		userRepository.save(cyril);
	}

}
