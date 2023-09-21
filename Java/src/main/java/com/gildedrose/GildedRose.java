package com.gildedrose;

import java.util.List;

class GildedRose {
    List<Item> itemList;

    public GildedRose(List<Item> itemList) {
        this.itemList = itemList;
    }

    private void increaseItemQuality(Item item) {
        if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);
        }
    }

    private void decreaseItemQuality(Item item) {
        if (item.getQuality() > 0) {
            if (!item.getName().equals("Sulfuras, Hand of Ragnaros")) {
                item.setQuality(item.getQuality() - 1);
            }
        }
    }

    private void decreaseItemSelling(Item item) {
        if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
            item.sellIn = item.sellIn - 1;
        }
    }

    public void updateQuality() {
        for (Item item : itemList) {
            if (!item.name.equals("Aged Brie") && !item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                decreaseItemQuality(item);
            } else {
                increaseItemQuality(item);
                if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                    if (item.sellIn < 11) {
                        increaseItemQuality(item);
                    }
                    if (item.sellIn < 6) {
                        increaseItemQuality(item);
                    }
                }

            }

            decreaseItemSelling(item);

            if (item.sellIn < 0) {
                if (!item.name.equals("Aged Brie")) {
                    if (!item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        decreaseItemQuality(item);
                    } else {
                        item.quality = 0;
                    }
                } else {
                    increaseItemQuality(item);
                }
            }
        }
    }
}
