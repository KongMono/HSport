package com.truelife.mobile.android.hsport.Adapter;

import com.truelife.mobile.android.hsport.Fragment.Tap1Fragment;
import com.truelife.mobile.android.hsport.Fragment.Tap2Fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsPagerAdapter extends FragmentPagerAdapter {

	public TabsPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			// Top Rated fragment activity
			return new Tap1Fragment();
		case 1:
			// Top Rated fragment activity
			return new Tap2Fragment();
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 2;
	}

}
