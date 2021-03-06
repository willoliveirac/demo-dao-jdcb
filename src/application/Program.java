package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {


    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: Seller find by Id ===");
        System.out.println(sellerDao.findById(3));

        System.out.println("=== TEST 2: Seller by Department - Solução do Curso ===");
        List<Seller> list = sellerDao.findByDepartment(new Department(2,null));
        list.forEach(System.out::println);

        System.out.println("=== TEST 3: Find All ===");
        list = sellerDao.findAll();
        list.forEach(System.out::println);

        /*
        System.out.println("=== TEST 4: Seller Insert ===");
        Seller s1 = new Seller(null,"Greg","Greg@gmail.com", new Date(),4000.0,new Department(2,null));
        sellerDao.insert(s1);
        list = sellerDao.findAll();
        System.out.println(s1.getId());
        list.forEach(System.out::println);
        */

        System.out.println("=== TEST 5: Seller Update ===");
        Seller  s1 = sellerDao.findById(2);
        s1.setName("Martha Wayne");

        sellerDao.update(s1);
        list = sellerDao.findAll();
        System.out.println(s1.getId());
        list.forEach(System.out::println);


        System.out.println("=== TEST 6: Seller Delete ===");
        s1 = sellerDao.findById(2);

        sellerDao.deleteById(s1.getId());
        list = sellerDao.findAll();
        System.out.println(s1.getId());
        list.forEach(System.out::println);




    }


}
