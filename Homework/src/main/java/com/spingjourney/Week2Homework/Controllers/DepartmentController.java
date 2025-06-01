package com.spingjourney.Week2Homework.Controllers;

import com.spingjourney.Week2Homework.DTO.DepartmentDTO;
import com.spingjourney.Week2Homework.DTO.EmployeeDTO;
import com.spingjourney.Week2Homework.Services.DepartmentServices;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/department")
public class DepartmentController {

    private final DepartmentServices departmentServices;

    public DepartmentController(DepartmentServices departmentServices) {
        this.departmentServices = departmentServices;
    }

    @GetMapping(path = "/all")
    public ResponseEntity<List<DepartmentDTO>> allDept(){
        return ResponseEntity.ok(departmentServices.allDepartments());
    }


    @PostMapping(path="/add")
    public ResponseEntity<DepartmentDTO> addDept(@RequestBody @Valid DepartmentDTO departmentDTO){
        DepartmentDTO departmentDTO1=departmentServices.addDepartment(departmentDTO);
        return new ResponseEntity<>(departmentDTO1, HttpStatus.CREATED);
    }

    @PutMapping(path = "/update/{deptId}")
    public ResponseEntity<DepartmentDTO> updateDept(@PathVariable int deptId, @RequestBody @Valid DepartmentDTO departmentDTO){
        return ResponseEntity.ok(departmentServices.updateDepartment(deptId,departmentDTO));
    }

    @DeleteMapping(path = "/delete/{deptId}")
    public ResponseEntity<DepartmentDTO> deleteByDeptID(@PathVariable int deptId) {
        return departmentServices.deleteDepartment(deptId);
    }

}
