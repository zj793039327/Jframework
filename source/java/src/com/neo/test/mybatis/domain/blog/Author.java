package com.neo.test.mybatis.domain.blog;

import java.io.Serializable;

public class Author implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    

    private String id;

    private String name;

    private Integer sex;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Author [id=" + id + ", name=" + name + ", sex=" + sex + "]";
    }

    
}
