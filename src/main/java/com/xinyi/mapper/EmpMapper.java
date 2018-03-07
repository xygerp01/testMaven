package com.xinyi.mapper;

import java.util.List;

import com.xinyi.entity.Emp;

public interface EmpMapper {
	public Emp queryByEmpno(Integer empno);
	public List<Emp> queryAll();
	public void insert(Emp emp);
	public void update(Emp emp);
	public void delete(Integer empno);
}
