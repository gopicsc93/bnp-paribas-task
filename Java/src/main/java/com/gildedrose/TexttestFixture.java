package com.gildedrose;

import java.util.ArrayList;
import java.util.List;

public class TexttestFixture {
    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item().setName("+5 Dexterity Vest").setSellIn(10).setQuality(20));
        itemList.add(new Item().setName("Aged Brie").setSellIn(2).setQuality(0));
        itemList.add(new Item().setName("Elixir of the Mongoose").setSellIn(5).setQuality(7));
        itemList.add(new Item().setName("Sulfuras, Hand of Ragnaros").setSellIn(0).setQuality(80));
        itemList.add(new Item().setName("Sulfuras, Hand of Ragnaros").setSellIn(-1).setQuality(80));
        itemList.add(new Item().setName("Backstage passes to a TAFKAL80ETC concert").setSellIn(15).setQuality(20));
        itemList.add(new Item().setName("Backstage passes to a TAFKAL80ETC concert").setSellIn(10).setQuality(49));
        itemList.add(new Item().setName("Backstage passes to a TAFKAL80ETC concert").setSellIn(5).setQuality(49));
        // this conjured item does not work properly yet
        itemList.add(new Item().setName("Conjured Mana Cake").setSellIn(3).setQuality(6));

        GildedRose app = new GildedRose(itemList);

        int days = 2;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : itemList) {
                System.out.println(item);
            }
            System.out.println();
            app.updateQuality();
        }
    }

}
