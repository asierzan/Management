package com.company;

public class Boots extends Product {
    private int size;
    private boolean isNaturalSkin;

    public int getSize(){
        return size;
    }

    public Boots(Long id, String productName, double price, float weight, String color, int productCount, int size, boolean isNaturalSkin){
        super(id, productName,price,weight,color,productCount);
        this.size=size;
        this.isNaturalSkin=isNaturalSkin;
    }

    public String toString(){
        return super.toString()+ "Produkt ten to buty o rozmiarze "+size+ ". Czy są one z naturalnej skóry: "+isNaturalSkin;
    }

}
