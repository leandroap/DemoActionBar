package br.com.leandroap.demoactionbar.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import br.com.leandroap.demoactionbar.fragment.AndroidFragment;
import br.com.leandroap.demoactionbar.fragment.IosFragment;
import br.com.leandroap.demoactionbar.fragment.WindowsPhoneFragment;

/**
 * Created by leandro on 26/09/15.
 */
public class TabsAdapter extends FragmentStatePagerAdapter {


    public TabsAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                return new AndroidFragment();
            case 1:
                return new IosFragment();
            case 2:
                return new WindowsPhoneFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
