package com.jbk.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.Employee;
@Repository
public class EmpDao_Impl implements EmpDao {
@Autowired 
private SessionFactory sf;

	@Override
	public Employee saveEmployee(Employee employee) {
		Session session = sf.openSession();
		Transaction transaction=session.beginTransaction();
		try {
			session.save(employee);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		finally {
			session.close();
		}
				
		return employee;
	}

	@Override
	public Employee getEmployeeById(String id) {
		Session session = sf.openSession();
		Employee employee=null;
		try {
			 employee =session.get(Employee.class, id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally
		{
			
		}
		
		return employee;
	}

	@Override
	public List<Employee> getAllEmployee() {
		Session session =sf.openSession();
		List<Employee>list=null;
		try {
			Criteria criteria=session.createCriteria(Employee.class);
			list=criteria.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public boolean deleteEmployee(String id) {
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		boolean b=false;
		try {
			Employee employee =session.load(Employee.class, id);
			if(employee!=null) {
				session.delete(employee);
				transaction.commit();
				b=true;
				
			}
			 
		} catch (Exception e) {
			e.printStackTrace();
		b=false;
		}
		finally {
			session.close();
		}
		return b;
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		Session session =sf.openSession();
		Transaction transaction=session.beginTransaction();
		boolean b=false;
		
		try {
			session.update(employee);
			 transaction.commit();
			b=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		return b;
	}




public Employee updatEmployee(Employee employee) {
	Session session =sf.openSession();
	Transaction transaction=session.beginTransaction();
	Employee emp=null;
	
	try {
		session.update(employee);
		 transaction.commit();
		return emp;
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally {
		session.close();
	}
	return emp;}}

