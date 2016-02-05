package demo.mc.nuno.appdemo.square.empty;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import demo.mc.nuno.appdemo.R;
import demo.mc.nuno.appdemo.square.empty.dummy.EmptyContent;

/**
 * A fragment representing a single EmptySquare detail screen.
 * This fragment is either contained in a {@link EmptySquareListActivity}
 * in two-pane mode (on tablets) or a {@link EmptySquareDetailActivity}
 * on handsets.
 */
public class EmptySquareDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The dummy content this fragment is presenting.
     */
    private EmptyContent.EmptyItem mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public EmptySquareDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null && getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mItem = EmptyContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_emptysquare_detail, container, false);

        // Show the dummy content as text in a TextView.
        if (mItem != null) {
            ((TextView) rootView.findViewById(R.id.emptysquare_detail)).setText(mItem.content);
            ((ImageView) rootView.findViewById(R.id.emptysquare_pic)).setImageResource(
                    getContext().getResources().getIdentifier(mItem.pic, "drawable", getContext().getPackageName()));
        }

        return rootView;
    }
}
