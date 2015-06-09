package com.neo.clockbear.web;

public class Pet {
    private String nininame;

    @Override
    public String toString() {
        return "Pet [nininame=" + nininame + "]";
    }

    public String getNininame() {
        return nininame;
    }

    public void setNininame(String nininame) {
        this.nininame = nininame;
    }

}
