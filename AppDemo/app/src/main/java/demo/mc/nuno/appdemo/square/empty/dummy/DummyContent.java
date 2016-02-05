package demo.mc.nuno.appdemo.square.empty.dummy;

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
        addItem(new DummyItem("Empty1", "Item Empty 1"));
        addItem(new DummyItem("Empty2", "Item Empty 2"));
        addItem(new DummyItem("Empty3", "Item Empty 3"));
        addItem(new DummyItem("Empty4", "Item Empty 4"));
        addItem(new DummyItem("Empty5", "Item Empty 5"));
        addItem(new DummyItem("Empty6", "Item Empty 6"));
        addItem(new DummyItem("Empty7", "Item Empty 7"));
        addItem(new DummyItem("Empty8", "Item Empty 8"));
        addItem(new DummyItem("Empty9", "Item Empty 9"));
        addItem(new DummyItem("Empty10", "Item Empty 10"));
        addItem(new DummyItem("Empty11", "Item Empty 11"));
        addItem(new DummyItem("Empty12", "Item Empty 12"));
        addItem(new DummyItem("Empty13", "Item Empty 13"));
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
