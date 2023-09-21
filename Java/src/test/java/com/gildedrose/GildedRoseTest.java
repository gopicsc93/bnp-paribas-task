package com.gildedrose;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void foo() {
        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item().setName("fixme"));
        GildedRose app = new GildedRose(itemList);
        app.updateQuality();
        assertEquals("fixme", app.itemList.get(0).name);
    }

}
