package com.company;

public class inputan <L> {
String nama;
String nim;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    @Override
    public String toString() {
        return "inputan" +"\n" +
                "nama=\t" + nama + "\n" +
                " nim=\t" + nim
                ;
    }
}
