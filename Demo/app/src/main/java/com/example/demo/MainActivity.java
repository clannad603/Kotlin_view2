package com.example.demo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.example.demo.fragmant.BlankFragment;
import com.example.demo.fragmant.BlankFragment2;
import com.example.demo.fragmant.BlankFragment3;
import com.example.demo.fragmant.BlankFragment4;
import com.example.demo.reviewcycel.Ultiman;
import com.example.demo.reviewcycel.UltimanAdapter;

import com.example.demo.viewpage.VpAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

    public class MainActivity extends AppCompatActivity {
            List<Fragment> fragmentList = new ArrayList<>();
            List<String> fragmentTitle = new ArrayList<>();
            private TabLayout mTabLayout;
            private ViewPager mViewPager;
            private ViewPagerAdapter mAdapter;
            private int mCurrentSelect = 0;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            mTabLayout = findViewById(R.id.tl_1);
            mViewPager = findViewById(R.id.vp_demo);
            fragmentList.add(new BlankFragment());
            fragmentList.add(new BlankFragment2());
            fragmentList.add(new BlankFragment3());
           // fragmentList.add(new BlankFragment4());

           fragmentTitle.add("微信");
            fragmentTitle.add("通讯录");
            fragmentTitle.add("发现");
            //fragmentTitle.add("我");

            if (Build.VERSION.SDK_INT >= 21) {
                View decorView = getWindow().getDecorView();
                int option = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
                decorView.setSystemUiVisibility(option);
                getWindow().setStatusBarColor(Color.TRANSPARENT);
            }
            Window window = getWindow();
            View decor = window.getDecorView();
            int ui = decor.getSystemUiVisibility();
                ui |=View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;
            decor.setSystemUiVisibility(ui);

            FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    decFragment(4,0);
                }
            });
            FloatingActionButton fab2 = (FloatingActionButton) findViewById(R.id.fab2);
            fab2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    addFragment(4,0);
                }
            });



            mAdapter= new ViewPagerAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT, fragmentList);
            mViewPager.setAdapter(mAdapter);
            mTabLayout.setupWithViewPager(mViewPager);
            mViewPager.setOffscreenPageLimit(fragmentList.size());
            mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));
            mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                @Override
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                }

                @Override
                public void onPageSelected(int position) {
                    mCurrentSelect = position;
                }

                @Override
                public void onPageScrollStateChanged(int state) {
                }
            });

            mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
                @Override
                public void onTabSelected(TabLayout.Tab tab) {
                    mViewPager.setCurrentItem(tab.getPosition(), false);
                }

                @Override
                public void onTabUnselected(TabLayout.Tab tab) {

                }

                @Override
                public void onTabReselected(TabLayout.Tab tab) {

                }
            });
            mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
                @Override
                public void onTabSelected(TabLayout.Tab tab) {

                }

                @Override
                public void onTabUnselected(TabLayout.Tab tab) {
                    //当选项卡变成未选中状态时调用
                }

                @Override
                public void onTabReselected(TabLayout.Tab tab) {

                }
            });
        }

        class ViewPagerAdapter extends FragmentStatePagerAdapter {
            private List<Fragment> mFragmentList = new ArrayList<>();

            ViewPagerAdapter(FragmentManager fm, int behavior, List<Fragment> fragmentList) {

                super(fm, behavior);
                updateFragmentList(fragmentList);
            }
            public void updateFragmentList(List<Fragment> fragmentList) {
                if (!mFragmentList.isEmpty()) {
                    mFragmentList.clear();
                }
                mFragmentList.addAll(fragmentList);
                notifyDataSetChanged();
                mViewPager.setOffscreenPageLimit(mFragmentList.size());
            }

            @Override
            public void notifyDataSetChanged() {
                super.notifyDataSetChanged();
            }

            @Override
            public int getCount() {
                return fragmentList.size();
            }

            @NonNull
            @Override
            public Fragment getItem(int position) {
                return fragmentList.get(position);
            }

            @Nullable
            @Override
            public CharSequence getPageTitle(int position) {
                return fragmentTitle.get(position);
            }
            @Override
            public int getItemPosition(Object object) {
                // TODO Auto-generated method stub
                return PagerAdapter.POSITION_NONE;
            }
        }
        private void addFragment(int pos, int count) {
            if (pos > fragmentList.size()) {
                pos = fragmentList.size();
            }
            if (pos < 0) {
                pos = 0;
            }
            if (count <= 0) {
                count = 1;
            }
            for (int i = pos; i < pos + count; i++) {
                fragmentTitle.add("我");
                fragmentList.add(pos,new BlankFragment4());
            }
            if (mViewPager.getAdapter() instanceof ViewPagerAdapter) {
                ((ViewPagerAdapter) mViewPager.getAdapter()).updateFragmentList(fragmentList);
            }
            mViewPager.post(new Runnable() {
                @Override
                public void run() {
                    mTabLayout.selectTab(mTabLayout.getTabAt(mCurrentSelect));
                }
            });
        }
        private void decFragment(int pos, int count) {
            if (pos > fragmentList.size() - 1) {
                pos = fragmentList.size() - 1;
            }
            if (pos < 0) {
                pos = 0;
            }
            if (count <= 0) {
                count = 1;
            }
            for (int i = pos; i < pos + count; i++) {
                fragmentTitle.remove(pos);
               fragmentList.remove(pos);
            }
            if (mViewPager.getAdapter() instanceof ViewPagerAdapter) {
                ((ViewPagerAdapter) mViewPager.getAdapter()).updateFragmentList(fragmentList);
            }

            mViewPager.post(new Runnable() {
                @Override
                public void run() {
                    mTabLayout.selectTab(mTabLayout.getTabAt(mCurrentSelect), false);
                }
            });
        }

    }
