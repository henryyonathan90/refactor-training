package com.gdn.training.refactor.first.sample;

import java.util.Iterator;

/**
 * Created by henry.jonathan on 5/23/2017.
 */
public class CustomerServiceImpl {

  //PrintStatement
  public String statement(Customer customer) {
    double d1 = 0;
    int i = 0;

    Iterator<Rental> iterator = customer.getRentals().iterator();

    String result = "Rental Record for " + customer.getName() + "\n";
    while (iterator.hasNext()) {

      double d2 = 0;
      Rental each = iterator.next();
      //determine amounts for each line
      switch (each.getMovie().getPriceCode()) {
        case Movie.REGULAR:
          d2 += 2;
          if (each.getDaysRented() > 2)
            d2 += (each.getDaysRented() - 2) * 1.5;
          break;
        case Movie.NEW_RELEASE:
          d2 += each.getDaysRented() * 3;
          break;
        case Movie.CHILDRENS:
          d2 += 1.5;
          if (each.getDaysRented() > 3)
            d2 += (each.getDaysRented() - 3) * 1.5;
          break;
      }
      // add frequent renter points
      i++;
      // add bonus for a two day new release rental
      if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDaysRented() > 1)
        i++;
      //show figures for this rental
      result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(d2) + "\n";
      d1 += d2;
    }
    //add footer lines
    result += "Amount owed is " + String.valueOf(d1) + "\n";
    result += "You earned " + String.valueOf(i) + " frequent renter points";
    return result;
  }

}
