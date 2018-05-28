package org.sopt.jointseminar;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ShopFragmentPagerAdapter extends FragmentPagerAdapter{
    private Context context;
    private String tabTitles[] = new String[] { "메뉴", "정보", "리뷰" };

    public ShopFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return ShopMenuFragment.Companion.newInstance();
        }else if(position==1){
            return ShopInfoFragment.newInstance();
        }else{
            return ShopReviewFragment.Companion.newInstance();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
