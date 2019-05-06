package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

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
        List<Company> companyList = new ArrayList<>();
        Company company = new Company("Google");
        Company company1 = new Company("hitachi");

        companyDao.save(company);
        companyDao.save(company1);

        try {
            companyList = facade.findCompanyForName("oo");
        } catch (Exception e) {

        }

        //When
        int sizeList = companyList.size();

        //Then
        Assert.assertEquals(1, sizeList);
    }

    @Test
    public void testFindEmployeeForName() {
        //Given
        List<Employee> employeeList = new ArrayList<>();
        Employee employee = new Employee("edward", "acki");
        Employee employee1 = new Employee("natalio", "gonzalez");

        employeeDao.save(employee);
        employeeDao.save(employee1);

        try {
            employeeList = facade.findEmployeeForFirstName("war");
        } catch (Exception e) {

        }

        //When
        int sizeList = employeeList.size();

        //Then
        Assert.assertEquals(1, sizeList);
    }


}
