package ma.pfe.mappers;

import ma.pfe.dtos.StudentDto;
import ma.pfe.entities.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StudentMapper {
    public StudentDto convertToDto(StudentEntity entity) {
        StudentDto so = new StudentDto();
        so.setId(entity.getId());
        so.setName(entity.getName());
        return so ;
    }

    public StudentEntity converttoEntity(StudentDto dto){
        StudentEntity en = new StudentEntity();
        en.setId(dto.getId());
        en.setName(dto.getName());
        return en ;
    }

    public List<StudentEntity> convertToEntitres (List<StudentDto> dtos){
        return dtos.stream().map(dto -> converttoEntity(dto)).collect(Collectors.toList());
    }

    public List<StudentDto> convertToDtos (List<StudentEntity> entities){
        return entities.stream().map(entity -> convertToDto(entity)).collect(Collectors.toList());
    }
}
