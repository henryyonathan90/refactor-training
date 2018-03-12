package com.gdn.training.refactor.first.sample;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by henry.jonathan on 5/25/2017.
 */
public class RefactorTest {

  @Test
  public void case1() {
    Movie movie1 = new Movie("A", 0);
    Movie movie2 = new Movie("B", 1);
    Movie movie3 = new Movie("C", 2);

    Rental rental1 = new Rental(movie1, 5);
    Rental rental2 = new Rental(movie2, 5);
    Rental rental3 = new Rental(movie3, 5);

    Customer customer = new Customer("Henry", Arrays.asList(rental1, rental2, rental3));

    CustomerServiceImpl impl = new CustomerServiceImpl();
    String statement = impl.statement(customer);

    System.out.println(statement);
  }


  @Test
  public void case2() {
    Movie movie1 = new Movie("A", 0);
    Movie movie2 = new Movie("B", 1);
    Movie movie3 = new Movie("C", 2);

    Rental rental1 = new Rental(movie1, 1);
    Rental rental2 = new Rental(movie2, 1);
    Rental rental3 = new Rental(movie3, 1);

    Customer customer = new Customer("Henry", Arrays.asList(rental1, rental2, rental3));

    CustomerServiceImpl impl = new CustomerServiceImpl();
    String statement = impl.statement(customer);

    System.out.println(statement);
  }
}
