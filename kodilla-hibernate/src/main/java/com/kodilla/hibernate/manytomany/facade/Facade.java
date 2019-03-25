package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facade {

    private static final Logger LOGGER = LoggerFactory.getLogger(Facade.class);

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    public void findCompanyForName(String companyName) throws Exception{
        List<Company> listCompany = companyDao.findCompanyForName(companyName);

        LOGGER.info("I find company ... Please wait");
        if (listCompany.isEmpty()) {
            LOGGER.info("Dont find copmany ");
        }
        LOGGER.info("List with your patterns have a " + listCompany.size() + " size");

        LOGGER.info("List company : ");
        for (Company company : listCompany) {
            LOGGER.info(company.getName());
        }
    }

    public void findEmployeeForFirstName(String firstName) throws Exception{
        List<Employee> listEmployee = employeeDao.findForName(firstName);

        LOGGER.info("I find employee ... Please wait");
        if (listEmployee.isEmpty()) {
            LOGGER.info("Dont find empolyee ");
        }
        LOGGER.info("List with your patterns have a " + listEmployee.size() + " size");

        LOGGER.info("List employee : ");
        for (Employee employee : listEmployee) {
            LOGGER.info(employee.getFirstname() + " " + employee.getLastname());
        }
    }

}
