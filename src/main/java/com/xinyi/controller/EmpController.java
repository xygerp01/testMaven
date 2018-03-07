package com.xinyi.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xinyi.entity.Emp;
import com.xinyi.service.EmpService;

@Controller
@RequestMapping("/emp")
public class EmpController {
	@Resource(name="empService")
	private EmpService empService;
	
	@RequestMapping("/queryByEmpno")
	public String queryByEmpno(Map<String,Object> model,Integer empno){
		Emp emp=empService.queryByEmpno(empno);
		model.put("emp",emp);
		return "emp";
	}
	
	@RequestMapping("/queryAll")
	public String queryAll(Map<String,Object> model){
		List<Emp> empList=empService.queryAll();
		model.put("empList",empList);
		return "empAll";
	}
	
	@RequestMapping("/insert")
	public void insert(Emp emp){
		empService.insert(emp);
	}
	
	@RequestMapping("/update")
	public void update(Emp emp){
		empService.update(emp);
	}
	
	@RequestMapping("/delete")
	public void delete(Integer empno){
		empService.delete(empno);
	}
}
