package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
@Transactional
@SpringBootTest
public class FacadeTestSuite {

    @Autowired
    private Facade facade;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void testFindCompanyForName() {
        Company company = new Company("Google");
        companyDao.save(company);

        try {
            facade.findCompanyForName("oo");
        } catch (Exception e){

        }
    }

    @Test
    public void testFindEmployeeForName(){
        Employee employee = new Employee("edward","acki");
        employeeDao.save(employee);

        try{
            facade.findEmployeeForFirstName("war");
        } catch (Exception e){

        }


    }


}
