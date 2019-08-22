package com.company;

public class link <L> implements interfaces<L> {
    node top;
    int size;

    public link() {
        this.top = top;
        this.size = 0;
    }

    @Override
    public void insertdepan(L data) {
        node newnode = new node(data);
        //jika size kosong maka akan di buat node baru tanpa di menyambungkan dengan data lain
        if (size == 0) {
            top = newnode;
            size++;
        } else {
            newnode.setNext(top); //kita buat hubungan antara node baru dengan data lama
            top=newnode; //kita pindahkan top ke node baru
            size++;
        }
        size++; //size kita tambah
    }

    @Override
    public L hapusdepan() {
        node temp = top;
        if (size == 0) {
            System.out.println("data masih kosong");
        } else {
            temp = top; //menempatkan temp di top
            top = top.getNext();//memindahkan top ke data berikutnya
            temp.setNext(null); //membuat data terhapus

            size--; //mengurangi size
        }
        return null;
    }

    @Override
    public boolean isempty() {
        return false;
    }

    @Override
    public L view() {
        node temp = top; // buat temp di tempat top
        if (size == 0) {
            System.out.println("data kosong");
        } else {
            while (temp != null) { //mencari data sampai nilai null
                temp.tampu(); //menagmbill data
                temp = temp.next; //membuat temp bergerak untuk mencari data
            }

        }

        return null;
    }
}
