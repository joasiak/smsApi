package com.example.demo;

public class Contact {

    private String name;
    private String number;

    public Contact(String name, String number) {
        this.name=name;
        this.number=number;
    }

    public String numberAdj(String n){
        if (n.length()>9)
            return n.substring(n.length()-9,n.length());
        else
            return n;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode()+this.number.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Contact c = (Contact) obj;
        return (name.equals(c.getName()))&&
                //   (numberAdj(this.number)==numberAdj(c.getNumber()));
                (numberAdj(this.number).equals(numberAdj(c.number)));
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String toString(){
        return name + ", phone: " + number;
    }

}
