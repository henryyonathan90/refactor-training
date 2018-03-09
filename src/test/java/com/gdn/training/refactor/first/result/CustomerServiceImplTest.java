package com.gdn.training.refactor.first.result;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by henry.jonathan on 5/25/2017.
 */
public class CustomerServiceImplTest {

  static final String CASE_1_RESULT =
      "Rental Record for Henry\n" + "\tA\t15.0\n" + "\tB\t6.5\n" + "\tC\t4.5\n"
          + "Amount owed is 26.0\n" + "You earned 4 frequent renter points";
  @Test
  public void case1() {
    Movie movie1 = new Movie("A", PriceCodeEnum.NEW_RELEASE);
    Movie movie2 = new Movie("B", PriceCodeEnum.REGULAR);
    Movie movie3 = new Movie("C", PriceCodeEnum.CHILDRENS);

    Rental rental1 = new Rental(movie1, 5);
    Rental rental2 = new Rental(movie2, 5);
    Rental rental3 = new Rental(movie3, 5);

    Customer customer = new Customer("Henry", Arrays.asList(rental1, rental2, rental3));

    CustomerServiceImpl impl = new CustomerServiceImpl();
    String statement = impl.createStatement(customer);

    Assert.assertEquals(CASE_1_RESULT, statement);
  }

}
