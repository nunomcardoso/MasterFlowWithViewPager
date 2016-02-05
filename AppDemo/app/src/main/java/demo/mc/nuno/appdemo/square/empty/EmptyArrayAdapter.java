package demo.mc.nuno.appdemo.square.empty;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import demo.mc.nuno.appdemo.R;
import demo.mc.nuno.appdemo.square.empty.dummy.EmptyContent;
import demo.mc.nuno.appdemo.square.empty.dummy.EmptyContent.EmptyItem;


/**
 * Created by nuno on 29/10/15.
 */
public class EmptyArrayAdapter extends ArrayAdapter<EmptyItem> {

    /** Thumbnail image view */
    private ImageView pic = null;

    /** Movie title view */
    private TextView id = null;

    /** Movie rating view */
    private TextView t2 = null;
    private TextView t3 = null;

    public EmptyArrayAdapter(Context context, List<EmptyItem> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        EmptyItem item = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.empty_item, parent, false);
        }
        // Lookup view
        pic = (ImageView) convertView.findViewById(R.id.pic_empty);
        id = (TextView) convertView.findViewById(R.id.id_empty);
        t2 = (TextView) convertView.findViewById(R.id.t2_empty);
        t3 = (TextView) convertView.findViewById(R.id.t3_empty);

        pic.setImageResource(
                getContext().getResources().getIdentifier(item.pic, "drawable", getContext().getPackageName()));
        id.setText(item.id);
        t2.setText(item.t2);
        t3.setText(item.t3);

        // Return the completed view to render on screen
        return convertView;
    }
}