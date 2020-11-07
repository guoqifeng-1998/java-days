package com.qfguo.study.day19.test;

public interface BookService {
    boolean putOnSale(Book book) throws ISBNException,BookNameException,PriceException;
}
