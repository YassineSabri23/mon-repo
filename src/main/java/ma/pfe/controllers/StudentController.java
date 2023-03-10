package ma.pfe.controllers;

import ma.pfe.dtos.StudentDto;
import ma.pfe.services.StudentServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final static Logger LOG= LoggerFactory.getLogger(StudentController.class);
    private StudentServices service;
    StudentController(StudentServices service){

        this.service=service;
    }
    @PostMapping
    public StudentDto create(@RequestBody StudentDto dto){
        LOG.debug("start save dto:{}",dto);
        return service.create(dto);
    }
    @PutMapping
    public StudentDto update(@RequestBody StudentDto dto){
        LOG.debug("start update dto:{}",dto);
        return service.update(dto);
    }
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") long id){
        LOG.debug("start method delete");
        return service.delete(id);
    }
    @GetMapping
    public List<StudentDto> readAll() {
        LOG.debug("start method readAll");
        return service.readAll();
    }
}
