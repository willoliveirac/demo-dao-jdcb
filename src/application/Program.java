package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public class Program {


    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 2: Seller by Department - Solução do Curso ===");
        List<Seller> list = sellerDao.findByDepartment(new Department(2,null));


        list.forEach(System.out::println);




    }


}
