package com.example.narroju.flexibleuifragments;


import android.content.res.Resources;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentB extends Fragment {

    TextView textView;

    String data;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_b, container, false);

        if (savedInstanceState==null){


        }
        else {

            data = savedInstanceState.getString("description");
            TextView mytext = (TextView) view.findViewById(R.id.TextView);
            mytext.setText(data);

        }

        return view;

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        textView = getActivity().findViewById(R.id.TextView);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("desctiption",data);
    }

    public void changeData(int i){

        Resources resources = getResources();
        String[] description = resources.getStringArray(R.array.description);
        textView.setText(description[i]);
        this.data = textView.toString();
    }
}
