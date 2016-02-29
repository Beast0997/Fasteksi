package android.deroid.com.fasteksi.Fragment;


import android.deroid.com.fasteksi.Adapter.AutoCompleteTextForArea;
import android.deroid.com.fasteksi.R;
import android.deroid.com.fasteksi.Services.AddressResultReceiver;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by gulshank on 19-02-2016.
 */
public class LaterFragment extends Fragment implements AdapterView.OnItemClickListener{

    View view;
    TextView currentLocation;
    AutoCompleteTextView droparea;
    String results;
    AddressResultReceiver addressResultReceiver;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (view == null){
            view = inflater.inflate(R.layout.fragment_later ,container ,false);
            initViews();
            currentLocation.setText(MapsFragment.results);
            droparea.setAdapter(new AutoCompleteTextForArea(getActivity(), android.R.layout.simple_list_item_1));
            droparea.setOnItemClickListener(this);
            return view;
        }else
            return view;
    }

    private void initViews() {
        currentLocation = (TextView)view.findViewById(R.id.location);
        droparea = (AutoCompleteTextView) view.findViewById(R.id.edittxt_droparea);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String str = (String) parent.getItemAtPosition(position);
        Toast.makeText(getContext() ,str ,Toast.LENGTH_SHORT).show();
    }

}
