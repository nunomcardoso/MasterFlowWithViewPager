package demo.mc.nuno.appdemo.square.full.dummy;

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
public class FullContent {

    /**
     * An array of sample (dummy) items.
     */
    public static List<FullItem> ITEMS = new ArrayList<FullItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, FullItem> ITEM_MAP = new HashMap<String, FullItem>();

    static {
        // Add 3 sample items.
        addItem(new FullItem("Full1", "Full Black", "black"));
        addItem(new FullItem("Full2", "Full Cyan", "cyan"));
        addItem(new FullItem("Full3", "Full Green", "green"));
        addItem(new FullItem("Full4", "Full Red", "red"));
        addItem(new FullItem("Full5", "Full Yellow", "yellow"));
        addItem(new FullItem("Full6", "Full 6", "black"));
        addItem(new FullItem("Full7", "Full 7", "black"));
        addItem(new FullItem("Full8", "Full 8", "black"));
        addItem(new FullItem("Full9", "Full 9", "black"));
        addItem(new FullItem("Full10", "Full 10", "black"));
        addItem(new FullItem("Full11", "Full 11", "black"));
        addItem(new FullItem("Full12", "Full 12", "black"));
        addItem(new FullItem("Full13", "Full 13", "black"));
    }

    private static void addItem(FullItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class FullItem {
        public String id;
        public String content;
        public String t2 = "T2";
        public String t3 = "T3";
        public String pic;

        public FullItem(String id, String content, String color) {
            this.id = id;
            this.content = content;
            this.pic = "square_"+color;
        }

        @Override
        public String toString() {
            return id;
        }
    }
}
