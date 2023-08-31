package com.jpa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jpa.domain.Employee;
import com.jpa.dto.EmployeeDto;
import com.jpa.dto.TeamDto;
import com.jpa.param.EmployeeSearchParam;
import com.jpa.repository.EmployeeRepository;
import com.jpa.service.EmployeeService;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{

	@Resource(name="employeeRepository")
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> selectList(EmployeeSearchParam employeeSearchParam) {
		return employeeRepository.selectList(employeeSearchParam);
	}

	@Override
	public List<TeamDto> selectCountByTeam() {
		return employeeRepository.selectCountByTeam();
	}

	@Override
	public List<Employee> selectListPaging(int pageNum, int pageRow) {
		return employeeRepository.selectListPaging(pageNum, pageRow);
	}

	@Override
	public void insertBatch(List<EmployeeDto> list) {
		employeeRepository.insertBatch(list);
	}
}
