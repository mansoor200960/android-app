package com.appshed.appstore.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.appshed.appstore.R;
import com.appshed.appstore.activities.MainActivityNew;
import com.appshed.appstore.utils.SystemUtils;

/**
 * Created by Anton Maniskevich on 8/21/14.
 */
public class CategoriesFragment extends Fragment implements View.OnClickListener {

	public static CategoriesFragment newInstance() {
		CategoriesFragment fragment = new CategoriesFragment();
		return fragment;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_categories, null);
		view.findViewById(R.id.general_container).setOnClickListener(this);
		view.findViewById(R.id.education_container).setOnClickListener(this);
		view.findViewById(R.id.business_container).setOnClickListener(this);
		view.findViewById(R.id.fun_container).setOnClickListener(this);
		view.findViewById(R.id.events_container).setOnClickListener(this);
		view.findViewById(R.id.other_container).setOnClickListener(this);
		return view;
	}

	@Override
	public void onClick(View v) {
		AppsByCategoryFragment fragment = null;
		switch (v.getId()) {
			case R.id.general_container:
				fragment = AppsByCategoryFragment.newInstance(R.drawable.general_bg, SystemUtils.GENERAL, R.drawable.general_mini_icon);
				break;
			case R.id.education_container:
				fragment = AppsByCategoryFragment.newInstance(R.drawable.education_bg, SystemUtils.EDUCATION, R.drawable.education_mini_icon);
				break;
			case R.id.business_container:
				fragment = AppsByCategoryFragment.newInstance(R.drawable.business_bg, SystemUtils.BUSINESS, R.drawable.business_mini_icon);
				break;
			case R.id.fun_container:
				fragment = AppsByCategoryFragment.newInstance(R.drawable.fun_bg, SystemUtils.FUN, R.drawable.fun_mini_icon);
				break;
			case R.id.events_container:
				fragment = AppsByCategoryFragment.newInstance(R.drawable.events_bg, SystemUtils.EVENTS, R.drawable.events_mini_icon);
				break;
			case R.id.other_container:
				fragment = AppsByCategoryFragment.newInstance(R.drawable.other_bg, SystemUtils.OTHER, R.drawable.other_mini_icon);
				break;
		}
		if (fragment != null) {
			((MainActivityNew) getActivity()).pushFragment(fragment);
		}
	}
}
