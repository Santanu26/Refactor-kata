import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;


class GildedRoseTest {

    @Test
    void updateQuality() {
        Item[] items = new Item[]{new Item("foo", 0, 0)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        //assertEquals("foo", app.items[0].name);
        Approvals.verify(app.items[0].name);
    }

}