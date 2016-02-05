package demo.mc.nuno.appdemo.star.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    static {
        // Add 3 sample items.
        addItem(new DummyItem("Star1", "Item Star 1"));
        addItem(new DummyItem("Star2", "Item Star 2"));
        addItem(new DummyItem("Star3", "Item Star 3"));
        addItem(new DummyItem("Star4", "Item Star 4"));
        addItem(new DummyItem("Star5", "Item Star 5"));
        addItem(new DummyItem("Star6", "Item Star 6"));
        addItem(new DummyItem("Star7", "Item Star 7"));
        addItem(new DummyItem("Star8", "Item Star 8"));
        addItem(new DummyItem("Star9", "Item Star 9"));
        addItem(new DummyItem("Star10", "Item Star 10"));
        addItem(new DummyItem("Star11", "Item Star 11"));
        addItem(new DummyItem("Star12", "Item Star 12"));
        addItem(new DummyItem("Star12", "Item Star 13"));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public String id;
        public String content;

        public DummyItem(String id, String content) {
            this.id = id;
            this.content = content;
        }

        @Override
        public String toString() {
            return id;
        }
    }
}
