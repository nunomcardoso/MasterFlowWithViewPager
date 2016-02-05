package demo.mc.nuno.appdemo.square.empty;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;


import demo.mc.nuno.appdemo.R;

/**
 * An activity representing a list of EmptySquares. This activity
 * has different presentations for handset and tablet-size devices. On
 * handsets, the activity presents a list of items, which when touched,
 * lead to a {@link EmptySquareDetailActivity} representing
 * item details. On tablets, the activity presents the list of items and
 * item details side-by-side using two vertical panes.
 * <p/>
 * The activity makes heavy use of fragments. The list of items is a
 * {@link EmptySquareListFragment} and the item details
 * (if present) is a {@link EmptySquareDetailFragment}.
 * <p/>
 * This activity also implements the required
 * {@link EmptySquareListFragment.Callbacks} interface
 * to listen for item selections.
 */
public class EmptySquareListActivity extends FragmentActivity
        implements EmptySquareListFragment.Callbacks {

    /**
     * Whether or not the activity is in two-pane mode, i.e. running on a tablet
     * device.
     */
    private boolean mTwoPane;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emptysquare_list);

        if (findViewById(R.id.emptysquare_detail_container) != null) {
            // The detail container view will be present only in the
            // large-screen layouts (res/values-large and
            // res/values-sw600dp). If this view is present, then the
            // activity should be in two-pane mode.
            mTwoPane = true;

            // In two-pane mode, list items should be given the
            // 'activated' state when touched.
            ((EmptySquareListFragment) getSupportFragmentManager()
                    .findFragmentById(R.id.emptysquare_list))
                    .setActivateOnItemClick(true);
        }

        // TODO: If exposing deep links into your app, handle intents here.
    }

    /**
     * Callback method from {@link EmptySquareListFragment.Callbacks}
     * indicating that the item with the given ID was selected.
     */
    @Override
    public void onItemSelected(String id) {
        if (mTwoPane) {
            // In two-pane mode, show the detail view in this activity by
            // adding or replacing the detail fragment using a
            // fragment transaction.
            Bundle arguments = new Bundle();
            arguments.putString(EmptySquareDetailFragment.ARG_ITEM_ID, id);
            EmptySquareDetailFragment fragment = new EmptySquareDetailFragment();
            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.emptysquare_detail_container, fragment)
                    .commit();

        } else {
            // In single-pane mode, simply start the detail activity
            // for the selected item ID.
            Intent detailIntent = new Intent(this, EmptySquareDetailActivity.class);
            detailIntent.putExtra(EmptySquareDetailFragment.ARG_ITEM_ID, id);
            startActivity(detailIntent);
        }
    }
}
