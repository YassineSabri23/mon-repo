package ma.pfe.services;

import ma.pfe.dtos.StudentDto;
import ma.pfe.entities.StudentEntity;
import ma.pfe.mappers.StudentMapper;
import ma.pfe.repositories.StudentRepository;
import ma.pfe.repositories.StudentRepositoryImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentServices{

    private final static Logger LOG = LoggerFactory.getLogger(StudentServiceImpl.class);

    private StudentRepository repository;

    private StudentMapper mapper;

    public StudentServiceImpl(@Qualifier("RepoStudentImpl1") StudentRepository repository, StudentMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }


    @Override
    public StudentDto create(StudentDto dto) {
        LOG.debug(("Start methode name"));
        StudentDto resault = mapper.convertToDto(repository.create(mapper.converttoEntity(dto)));
        LOG.debug("end methode name");
        return  resault;
    }

    @Override
    public StudentDto update(StudentDto dto) {

        LOG.debug(("Start methode name"));
        StudentDto resault = mapper.convertToDto(repository.update(mapper.converttoEntity(dto)));
        LOG.debug("end methode name");
        return resault;
    }

    @Override
    public boolean delete(long id) {
        LOG.debug(("Start methode name"));
        boolean resault = repository.delete(id);
        LOG.debug("end methode name");
        return resault;
    }

    @Override
    public List<StudentDto> readAll() {
        LOG.debug(("Start methode name"));
        List<StudentDto> resault = mapper.convertToDtos(repository.readAll());
        LOG.debug("end methode name");
        return resault;
    }
}
