package com.yhy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yhy.entity.Student;
import com.yhy.mapper.StudentMapper;

@Controller
public class StudentController {
	
	@Autowired
	private StudentMapper studentMapper;
	
	@RequestMapping("/listStudent")
	public String listStudent(Model model) {
		List<Student> students = studentMapper.findAll();
        model.addAttribute("students", students);
        return "listStudent";
	}
}
