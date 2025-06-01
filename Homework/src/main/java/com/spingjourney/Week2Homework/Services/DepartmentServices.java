package com.spingjourney.Week2Homework.Services;

import com.spingjourney.Week2Homework.DTO.DepartmentDTO;
import com.spingjourney.Week2Homework.Entity.DepartmentEntity;
import com.spingjourney.Week2Homework.Repositories.DepartmentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DepartmentServices {

    private final ModelMapper modelMapper;
    private final DepartmentRepository departmentRepository;


    public DepartmentServices(ModelMapper modelMapper, DepartmentRepository departmentRepository) {
        this.modelMapper = modelMapper;
        this.departmentRepository = departmentRepository;
    }

    public DepartmentDTO addDepartment(DepartmentDTO departmentDTO) {
        DepartmentEntity obj = modelMapper.map(departmentDTO, DepartmentEntity.class);
        DepartmentEntity departmentEntity = departmentRepository.save(obj);
        return modelMapper.map(departmentEntity, DepartmentDTO.class);
    }

    public void isExistById(int deptId) {
        boolean exist = departmentRepository.existsById(deptId);
        if (!exist) throw new NoSuchElementException();
    }

    public DepartmentDTO updateDepartment(int deptId, DepartmentDTO departmentDTO) {
        DepartmentEntity departmentEntity = modelMapper.map(departmentDTO, DepartmentEntity.class);
        isExistById(deptId);
        departmentEntity.setDeptId(deptId);
        departmentRepository.save(departmentEntity);
        return modelMapper.map(departmentEntity, DepartmentDTO.class);
    }

    public List<DepartmentDTO> allDepartments() {
        List<DepartmentEntity> departmentEntities = departmentRepository.findAll();
        return departmentEntities
                .stream()
                .map(departmentEntity -> modelMapper.map(departmentEntity, DepartmentDTO.class))
                .collect(Collectors.toList());
    }

    public ResponseEntity<DepartmentDTO> deleteDepartment(int deptId) {
        Optional<DepartmentEntity> departmentEntity = departmentRepository.findById(deptId);
        if (departmentEntity.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        DepartmentDTO departmentDTO = modelMapper.map(departmentEntity.get(), DepartmentDTO.class);
        departmentRepository.deleteById(deptId);
        return ResponseEntity.ok(departmentDTO);
    }
}
