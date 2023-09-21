package com.gildedrose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public String getName() {
        return name;
    }

    public Item setName(String name) {
        this.name = name;
        return this;
    }

    public int getSellIn() {
        return sellIn;
    }

    public Item setSellIn(int sellIn) {
        this.sellIn = sellIn;
        return this;
    }

    public int getQuality() {
        return quality;
    }

    public Item setQuality(int quality) {
        this.quality = quality;
        return this;
    }

    public Item() {
    }

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
