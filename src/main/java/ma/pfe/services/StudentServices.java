package ma.pfe.services;

import ma.pfe.dtos.StudentDto;
import ma.pfe.entities.StudentEntity;

import java.util.List;

public interface StudentServices {
    StudentDto create (StudentDto dto);
    StudentDto update (StudentDto dto);
    boolean delete (long id);
    List<StudentDto> readAll();
}
