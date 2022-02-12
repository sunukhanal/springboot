package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.EmployeeRepository;
import com.dto.EmployeeDTO;
import com.entity.EmployeeEntity;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	
	
	
	  @Override
	  public EmployeeDTO authenticate(String emailId, String password) {
		  
		  Optional<EmployeeEntity>optional=employeeRepository.findByEmailIdAndPassword(emailId,password);
		  EmployeeDTO employeeDTO=null;
		  if(optional.isPresent()) {
			  EmployeeEntity employeeEntity=optional.get();
			  employeeDTO=new EmployeeDTO();
			  BeanUtils.copyProperties(employeeEntity, employeeDTO);
		  }
		  
		  return employeeDTO;
	  
	  }
	 
	
	
		/*
		 * public List<EmployeeDTO> FetchAllEmployee(){
		 * 
		 * List<EmployeeEntity> entityList=employeeRepository.findAll();
		 * List<EmployeeDTO> dtoList=new ArrayList<>();//blank list for( EmployeeEntity
		 * entity: entityList){
		 * 
		 * EmployeeDTO dto=new EmployeeDTO();//blank object
		 * BeanUtils.copyProperties(entity, dto); dtoList.add(dto);
		 * 
		 * }
		 * 
		 * return dtoList; }
		 * 
		 * 
		 * 
		 * 
		 * @Override public void deleteEmp(int employeeId) {
		 * 
		 * employeeRepository.deleteById(employeeId); }
		 * 
		 * 
		 * 
		 * @Override public void saveEmp(EmployeeDTO empDTO) { EmployeeEntity
		 * employeeEntity=new EmployeeEntity(); BeanUtils.copyProperties(empDTO,
		 * employeeEntity); employeeRepository.save(employeeEntity);
		 * 
		 * }
		 */
	

}
