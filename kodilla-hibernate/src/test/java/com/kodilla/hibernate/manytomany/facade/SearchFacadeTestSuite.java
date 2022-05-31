package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class SearchFacadeTestSuite {

    @Autowired
    private SearchFacade searchFacade;

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

@Test
    void searchCompanyByNameFragmentTest() {
    //Given
    Employee johnSmith = new Employee("John", "Smith");
    Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
    Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

    Company softwareMachine = new Company("Software Machine");
    Company softwareHouse = new Company("Software House");
    Company greyMatter = new Company("Grey Matter");

    softwareMachine.getEmployees().add(johnSmith);
    softwareHouse.getEmployees().add(stephanieClarckson);
    softwareHouse.getEmployees().add(lindaKovalsky);
    greyMatter.getEmployees().add(johnSmith);
    greyMatter.getEmployees().add(lindaKovalsky);

    johnSmith.getCompanies().add(softwareMachine);
    johnSmith.getCompanies().add(greyMatter);
    stephanieClarckson.getCompanies().add(softwareHouse);
    lindaKovalsky.getCompanies().add(softwareHouse);
    lindaKovalsky.getCompanies().add(greyMatter);

    companyDao.save(softwareMachine);
    companyDao.save(softwareHouse);
    companyDao.save(greyMatter);


    List<Company> companyResultList = new ArrayList<>();
    companyResultList.add(softwareMachine);
    companyResultList.add(softwareHouse);

    List<Employee> employeeResultList = new ArrayList<>();
    employeeResultList.add(lindaKovalsky);
    employeeResultList.add(johnSmith);

    //When
    List<Company> resultList = searchFacade.searchCompanyByNameFragment("oft");

    //Then
    assertEquals(companyResultList.size(), resultList.size());
//CleanUp
    try {
        companyDao.deleteAll();
    } catch (Exception e) {
        //do nothing
    }
}
    @Test
    void searchEmployeeByNameFragmentTest() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company softwareHouse = new Company("Software House");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        softwareHouse.getEmployees().add(stephanieClarckson);
        softwareHouse.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(softwareHouse);
        lindaKovalsky.getCompanies().add(softwareHouse);
        lindaKovalsky.getCompanies().add(greyMatter);

        companyDao.save(softwareMachine);
        companyDao.save(softwareHouse);
        companyDao.save(greyMatter);
        employeeDao.save(johnSmith);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lindaKovalsky);

        List<Company> companyResultList = new ArrayList<>();
        companyResultList.add(softwareMachine);
        companyResultList.add(softwareHouse);

        List<Employee> employeeResultList = new ArrayList<>();
        employeeResultList.add(johnSmith);

        //When
        List<Employee> resultList = searchFacade.searchEmployeeByNameFragment("smith");

        //Then
        assertEquals(employeeResultList.size(), resultList.size());
//CleanUp
    try {
        companyDao.deleteAll();
    } catch (Exception e) {
        //do nothing
    }
    }
}
