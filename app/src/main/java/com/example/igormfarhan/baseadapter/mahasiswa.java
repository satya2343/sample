package com.example.igormfarhan.baseadapter;

/**
 * Created by Igor M Farhan on 04/06/2016.
 */
public class mahasiswa {
    String[] namaMhs,nimMhs;

    public mahasiswa(String[] namaMhs, String[] nimMhs) {
        this.namaMhs = namaMhs;
        this.nimMhs = nimMhs;
    }

    public String[] getNamaMhs() {
        return namaMhs;
    }

    public void setNamaMhs(String[] namaMhs) {
        this.namaMhs = namaMhs;
    }

    public String[] getNimMhs() {
        return nimMhs;
    }

    public void setNimMhs(String[] nimMhs) {
        this.nimMhs = nimMhs;
    }
}
