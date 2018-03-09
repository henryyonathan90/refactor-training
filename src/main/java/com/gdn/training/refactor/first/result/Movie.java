package com.gdn.training.refactor.first.result;

/**
 * Created by henry.jonathan on 4/25/2017.
 */
public class Movie {
  private String title;
  private PriceCodeEnum priceCode;

  public Movie(String title, PriceCodeEnum priceCode) {
    this.title = title;
    this.priceCode = priceCode;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public PriceCodeEnum getPriceCode() {
    return priceCode;
  }

  public void setPriceCode(PriceCodeEnum priceCode) {
    this.priceCode = priceCode;
  }
}
