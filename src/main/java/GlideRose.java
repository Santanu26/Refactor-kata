import java.util.Arrays;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            items[i].doUpdateQuality();
        }
    }

    @Override
    public String toString() {
        return "GildedRose{" +
                "items=" + Arrays.toString(items) +
                '}';
    }
}
