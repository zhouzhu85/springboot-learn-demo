package com.github.zhouzhu.entity;

/**
 * @ClassName: Book
 * @author:zhouzhu
 * @Date: 2018/8/27 17:57
 * @Version: V1.0
 */
public class Book {
    private String isbn;
    private String title;

    public Book(String isbn,String title){
        this.isbn=isbn;
        this.title=title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
