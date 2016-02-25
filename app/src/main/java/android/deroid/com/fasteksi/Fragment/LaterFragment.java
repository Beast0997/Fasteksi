package android.deroid.com.fasteksi.Fragment;


import android.deroid.com.fasteksi.R;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by gulshank on 19-02-2016.
 */
public class LaterFragment extends Fragment {

    View view;
    TextView currentLocation;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_later ,container ,false);
        initViews();
        return view;
    }

    private void initViews() {
        currentLocation = (TextView)view.findViewById(R.id.location);
    }
}
