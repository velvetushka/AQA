package ua.org.oa.violetta.practice3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

    public class Company {


        private List<Employee> companyList = new ArrayList<>();
        private double totalSalary;

        public void addEmployee(Employee employee) {
            companyList.add(employee);
        }
        public void deleteEmployee(Employee employee) {
            companyList.remove(employee);
        }

        public List<Employee> getCompanyList() {
            return companyList;
        }

        public void setCompanyList(List<Employee> companyList) {
            this.companyList = companyList;
        }

        public Employee getEmployee(Employee employee) {
            int indexOfEmployee = companyList.indexOf(employee);
            companyList.get(indexOfEmployee);
            return employee;
        }

        public void calculateTotalSalary() {
            Comparator<Employee> comp = (b, a) -> Double.compare(a.calculateSalary(), b.calculateSalary());
            companyList.sort(comp);
            for (Employee worker : companyList) {
                totalSalary += worker.calculateSalary();
            }
        }
        

        @Override
        public String toString() {
            return "Company:" +"\n" + companyList +
                    " totalSalary=" + totalSalary +
                    '}';
        }
    }

