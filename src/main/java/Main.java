import models.Car;
import models.Company;
import models.Employee;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import utils.HibernateSessionFactory;

public class Main {
    public static void main(String[] args) {

        try (Session session = HibernateSessionFactory.getSessionFactory().openSession()) {
            Company company = new Company();
            company.setCompanyName("Company 1");

            Employee employee = new Employee();
            employee.setName("Will Smith");
            employee.setCompanyName("Company 1");

            Car car = new Car();
            car.setBrand("BMW");
            car.setModel("5 G20");
            car.setCompanyName("Company 1");

            session.beginTransaction();
            session.save(company);
            session.save(employee);
            session.save(car);

            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }
}