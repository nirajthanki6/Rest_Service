package com.nvz.courseapp.services;

import java.util.ArrayList;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import com.nvz.courseapp.domain.Student;

@Service
public class StudentServiceMockImpl implements StudentService {
	private ArrayList<Student> studList;
	static int idCnt = 1;
	
	@PostConstruct
	private void initData() {
		studList = new ArrayList<Student>();
	}
	
	public int addNewStudent(Student stud) {
		studList.add(stud);
		/* Simulate getting back the primary id from the database */
		stud.setId(idCnt);
		idCnt++;
		return 1;  /* Simulate 1 row inserted in Database */
	}

}
