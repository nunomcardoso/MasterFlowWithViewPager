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
public class EmptyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static List<EmptyItem> ITEMS = new ArrayList<EmptyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, EmptyItem> ITEM_MAP = new HashMap<String, EmptyItem>();

    static {
        // Add 3 sample items.
        addItem(new EmptyItem("Empty1", "Empty Black", "black"));
        addItem(new EmptyItem("Empty2", "Empty Cyan", "cyan"));
        addItem(new EmptyItem("Empty3", "Empty Green", "green"));
        addItem(new EmptyItem("Empty4", "Empty Red", "red"));
        addItem(new EmptyItem("Empty5", "Empty Yellow", "yellow"));
        addItem(new EmptyItem("Empty6", "Empty 6", "black"));
        addItem(new EmptyItem("Empty7", "Empty 7", "black"));
        addItem(new EmptyItem("Empty8", "Empty 8", "black"));
        addItem(new EmptyItem("Empty9", "Empty 9", "black"));
        addItem(new EmptyItem("Empty10", "Empty 10", "black"));
        addItem(new EmptyItem("Empty11", "Empty 11", "black"));
        addItem(new EmptyItem("Empty12", "Empty 12", "black"));
        addItem(new EmptyItem("Empty13", "Empty 13", "black"));
    }

    private static void addItem(EmptyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class EmptyItem {
        public String id;
        public String content;
        public String t2 = "T2";
        public String t3 = "T3";
        public String pic;

        public EmptyItem(String id, String content, String color) {
            this.id = id;
            this.content = content;
            this.pic = "square_outline_"+color;
        }

        @Override
        public String toString() {
            return id;
        }
    }
}
