package com.gb.springs.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.gb.springs.dto.Employee;

@Repository
public class EmployeeDao {
@Autowired	
SessionFactory factory;

	public Employee saveEmployee(Employee employee)

	{

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		transaction.begin();

		session.save(employee);
		transaction.commit();
		session.close();

		return employee;
	}

}
