package az.shafag.testapp.service;

import az.shafag.testapp.dao.repository.FileRepository;
import az.shafag.testapp.exception.FileStorageException;
import az.shafag.testapp.model.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileService {

    @Autowired
    private FileRepository repository;


    public File storeFile(MultipartFile file){

        String fileName = StringUtils.cleanPath(file.getOriginalFilename());

        if(fileName.contains("..")){
            throw new FileStorageException("Sorry! Filename contains invalid characters: " + fileName);
        }

        File responseFile =  new File(fileName, )
    }

}
