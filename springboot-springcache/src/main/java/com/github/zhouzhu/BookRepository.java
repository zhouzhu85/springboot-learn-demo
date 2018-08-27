package com.github.zhouzhu;

import com.github.zhouzhu.entity.Book;

public interface BookRepository {
    Book getByIsbn(String isbn);
}
