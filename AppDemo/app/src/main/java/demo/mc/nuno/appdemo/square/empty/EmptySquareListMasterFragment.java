package demo.mc.nuno.appdemo.square.empty;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import demo.mc.nuno.appdemo.R;

/**
 * Created by nuno on 05/02/16.
 */
public class EmptySquareListMasterFragment extends Fragment implements EmptySquareListFragment.Callbacks {
    /**
     * Whether or not the activity is in two-pane mode, i.e. running on a tablet
     * device.
     */
    private boolean mTwoPane;
    FragmentActivity activity;
    View frameLayout;

    public EmptySquareListMasterFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        frameLayout = inflater.inflate(R.layout.fragment_empty_square_master, container, false);

        Fragment listFragment = new EmptySquareListFragment();
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.add(R.id.frame_empty_square_main, listFragment);

        if (frameLayout.findViewById(R.id.frame_empty_square_extra) != null) {
            mTwoPane = true;

            Fragment detailFragment = new EmptySquareDetailFragment();
            transaction.add(R.id.frame_empty_square_extra, detailFragment);
        }

        transaction.commit();

        return frameLayout;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity = getActivity();
    }

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
            activity.getSupportFragmentManager().beginTransaction()
                    .replace(R.id.frame_empty_square_extra, fragment)
                    .commit();

        } else {
            // In single-pane mode, simply start the detail activity
            // for the selected item ID.
            Intent detailIntent = new Intent(activity, EmptySquareDetailActivity.class);
            detailIntent.putExtra(EmptySquareDetailFragment.ARG_ITEM_ID, id);
            startActivity(detailIntent);
        }
    }
}
