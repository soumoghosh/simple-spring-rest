package com.swayam.demo.web.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.swayam.demo.web.rest.dao.TeacherDao;
import com.swayam.demo.web.rest.model.Teacher;
@Service
public class TeacherServiceImpl implements TeacherService{
	
	private final TeacherDao teacherdao;
	
	@Autowired
	public TeacherServiceImpl(TeacherDao teacherdao) {
        this.teacherdao=teacherdao;
	}
    
	@Override
	@Transactional
	public boolean addTeacher(Teacher teacher) {
		return teacherdao.addTeacher(teacher);
	}

	@Override
	public boolean deleteTeacher(int id) {

		return teacherdao.deleteTeacher(id);
	}

	@Override
	public boolean updateTeacher(Teacher teacher) {
		return teacherdao.updateTeacher(teacher);
	}

	@Override
	public List<Teacher> getAllTeacher() {
		return teacherdao.getAllTeacher();
	}

	@Override
	public Teacher getSingleTeacherDeatils(int id) {
		return teacherdao.getSingleTeacherDeatils(id);
	}

}
