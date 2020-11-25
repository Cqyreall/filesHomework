package com.codeclan.example.foldersservices.Components;

import com.codeclan.example.foldersservices.Models.File;
import com.codeclan.example.foldersservices.Models.Folder;
import com.codeclan.example.foldersservices.Models.User;
import com.codeclan.example.foldersservices.Repositories.FileRepository;
import com.codeclan.example.foldersservices.Repositories.FolderRepository;
import com.codeclan.example.foldersservices.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args){

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


        User john = new User("John");
        userRepository.save(john);

        Folder data = new Folder("Data", john);
        folderRepository.save(data);

        File java = new File("Employee", ".java", 15, data);
        fileRepository.save(java);

        data.addFiles(java);
        folderRepository.save(data);

        john.addFolder(data);
        userRepository.save(john);


        Folder dataAnalysis = new Folder("Data Analysis", john);
        folderRepository.save(dataAnalysis);

        File react = new File("react", ".json", 15, dataAnalysis);
        fileRepository.save(react);

        dataAnalysis.addFiles(react);
        folderRepository.save(dataAnalysis);

        john.addFolder(dataAnalysis);
        userRepository.save(john);






    }


}
