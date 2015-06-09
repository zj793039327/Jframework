package com.neo.test.mybatis.local;

import com.neo.test.mybatis.domain.blog.Author;

public interface AuthorMapper {
    public Author findById(String id);
}
