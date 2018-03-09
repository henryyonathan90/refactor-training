package com.gdn.training.refactor.first.sample;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by henry.jonathan on 5/25/2017.
 */
public class RefactorTest {

  static final String CASE_1_RESULT =
      "Rental Record for Henry\n" + "\tA\t6.5\n" + "\tB\t15.0\n" + "\tC\t4.5\n"
          + "Amount owed is 26.0\n" + "You earned 4 frequent renter points";

  static final String CASE_2_RESULT =
      "Rental Record for Henry\n" + "\tA\t2.0\n" + "\tB\t3.0\n" + "\tC\t1.5\n"
          + "Amount owed is 6.5\n" + "You earned 3 frequent renter points";


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

    Assert.assertEquals(CASE_1_RESULT, statement);
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

    Assert.assertEquals(CASE_2_RESULT, statement);
  }
}
