package com.qfguo.study.day19.test;

import java.util.regex.Pattern;

public class BookServiceImpl implements BookService{
    @Override
    public boolean putOnSale(Book book) throws ISBNException, BookNameException, PriceException {
        Pattern pattern = Pattern.compile("[0-9]*");
        String isbn = book.getISBN();
        String name = book.getBookName();
        Integer price = book.getPrice();

        if (isbn.length() != 13 || !pattern.matcher(isbn).matches()){
            throw new ISBNException(name + "ISBN不正确！");
        }else if (name.contains("暴力") || name.contains("恐怖")){
            throw  new BookNameException(name + "书中含有禁词！");
        }else if (price > 100){
            throw new PriceException(name + "价格不正常！");
        }else {
            return true;
        }
    }
}
