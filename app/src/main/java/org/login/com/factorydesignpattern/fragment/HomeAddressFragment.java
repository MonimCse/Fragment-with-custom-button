package org.login.com.factorydesignpattern.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.login.com.factorydesignpattern.R;


public class HomeAddressFragment extends Fragment {
    View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle)
    {
        rootView = inflater.inflate(R.layout.fragment_home,viewGroup,false);
        return rootView;
    }
}
