import java.util.Arrays;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            doUpdateQuality(items[i]);
        }
    }

    private void doUpdateQuality(Item item) {
        if (item.name.equals("Aged Brie")) {
            if (item.quality < 50) {
                item.quality = item.quality + 1;
            }

            item.sellIn = item.sellIn - 1;

            if (item.sellIn < 0) {
                if (item.quality < 50) {
                    item.quality = item.quality + 1;
                }
            }
        } else {
            if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (item.quality < 50) {
                    item.quality = item.quality + 1;

                    if (item.sellIn < 11) {
                        if (item.quality < 50) {
                            item.quality = item.quality + 1;
                        }
                    }

                    if (item.sellIn < 6) {
                        if (item.quality < 50) {
                            item.quality = item.quality + 1;
                        }
                    }
                }

                item.sellIn = item.sellIn - 1;

                if (item.sellIn < 0) {
                    item.quality = 0;
                }

            } else {
                if (item.name.equals("Sulfuras, Hand of Ragnaros")) {

                } else {

                    if (item.quality > 0) {
                        item.quality = item.quality - 1;
                    }

                    item.sellIn = item.sellIn - 1;

                    if (item.sellIn < 0) {
                        if (item.quality > 0) {
                            item.quality = item.quality - 1;
                        }
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        return "GildedRose{" +
                "items=" + Arrays.toString(items) +
                '}';
    }
}
