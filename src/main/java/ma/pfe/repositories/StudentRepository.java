package ma.pfe.repositories;

import ma.pfe.entities.StudentEntity;

import java.util.List;

public interface StudentRepository {
    StudentEntity create (StudentEntity e);
    StudentEntity update (StudentEntity e);
    boolean delete (long id);
    List<StudentEntity> readAll();
}
