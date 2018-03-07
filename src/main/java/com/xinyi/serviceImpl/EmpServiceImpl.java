package com.xinyi.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.xinyi.entity.Emp;
import com.xinyi.mapper.EmpMapper;
import com.xinyi.service.EmpService;

@Component("empService")
public class EmpServiceImpl implements EmpService{
	@Resource(name="empMapper")
	private EmpMapper empMapper;
	public Emp queryByEmpno(Integer empno) {
		return empMapper.queryByEmpno(empno);
	}

	public List<Emp> queryAll() {
		return empMapper.queryAll();
	}

	public void insert(Emp emp) {
		empMapper.insert(emp);
	}

	public void update(Emp emp) {
		empMapper.update(emp);
	}

	public void delete(Integer empno) {
		empMapper.delete(empno);
	}

}
