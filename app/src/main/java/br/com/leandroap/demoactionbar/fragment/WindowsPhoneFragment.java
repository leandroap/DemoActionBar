package br.com.leandroap.demoactionbar.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.leandroap.demoactionbar.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class WindowsPhoneFragment extends Fragment {


    public WindowsPhoneFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_windows_phone, container, false);
    }


}
