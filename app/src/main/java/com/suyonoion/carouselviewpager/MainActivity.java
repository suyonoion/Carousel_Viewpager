package com.suyonoion.carouselviewpager;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;

import com.suyonoion.carouselviewpager.controls.Carousel;
import com.suyonoion.carouselviewpager.controls.CarouselAdapter;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity
{
    ViewPager viewPager;

    public int setResource(String name, String Type)
    {
        return getBaseContext().getResources().getIdentifier(name, Type, getBaseContext().getPackageName());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setResource("main", "layout"));
        VP();
    }

    public void VP()
    {

        final View page1 = LayoutInflater.from(getBaseContext()).inflate(setResource("halaman0","layout"), null);
        final View page2 = LayoutInflater.from(getBaseContext()).inflate(setResource("halaman1","layout"), null);
        final View page3 = LayoutInflater.from(getBaseContext()).inflate(setResource("halaman2","layout"), null);
        final View page4 = LayoutInflater.from(getBaseContext()).inflate(setResource("halaman3","layout"), null);
        final View page5 = LayoutInflater.from(getBaseContext()).inflate(setResource("halaman4","layout"), null);

        Carousel carousel = (Carousel)findViewById(setResource("carousel","id"));
        carousel.setOnItemClickListener(new CarouselAdapter.OnItemClickListener(){

            public void onItemClick(CarouselAdapter<?> parent, View view,
                                    int position, long id) {

                switch(position){
                    case 0:
                        viewPager.setCurrentItem(0);
                        ION.with(Techniques.SlideInFromRight)
                                .duration(700)
                                .playOn(page1);
                        break;
                    case 1:
                        viewPager.setCurrentItem(1);
                        ION.with(Techniques.SlideInFromRight)
                                .duration(700)
                                .playOn(page2);
                        break;
                    case 2:
                        viewPager.setCurrentItem(2);
                        ION.with(Techniques.SlideInFromRight)
                                .duration(700)
                                .playOn(page3);
                        break;
                    case 3:
                        viewPager.setCurrentItem(3);
                        ION.with(Techniques.SlideInFromRight)
                                .duration(700)
                                .playOn(page4);
                        break;
                    case 4:
                        viewPager.setCurrentItem(4);
                        ION.with(Techniques.SlideInFromRight)
                                .duration(700)
                                .playOn(page5);
                        break;
                }
            }

        });

        carousel.setOnItemSelectedListener(new CarouselAdapter.OnItemSelectedListener()
        {

        public void onItemSelected(CarouselAdapter<?> parent, View view, int position, long id) {
            viewPager = (ViewPager) findViewById(setResource("id_viewpager","id"));
            List<View> tampildaftarHalaman = new ArrayList<>();
            tampildaftarHalaman.add(page1);
            tampildaftarHalaman.add(page2);
            tampildaftarHalaman.add(page3);
            tampildaftarHalaman.add(page4);
            tampildaftarHalaman.add(page5);
            MyPagerAdapter adapter = new MyPagerAdapter(tampildaftarHalaman);
            viewPager.setAdapter(adapter);
            viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

                @Override
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {}

                @Override
                public void onPageSelected(int position) {
                switch (position){
                    case 0:
                        ION.with(Techniques.SlideInFromRight)
                                .duration(700)
                                .playOn(page1);
                    case 1:
                        ION.with(Techniques.SlideInFromRight)
                                 .duration(700)
                                 .playOn(page2);
                    case 2:
                        ION.with(Techniques.SlideInFromRight)
                                 .duration(700)
                                 .playOn(page3);
                    case 3:
                        ION.with(Techniques.SlideInFromRight)
                                .duration(700)
                                .playOn(page4);
                    case 4:
                        ION.with(Techniques.SlideInFromRight)
                                .duration(700)
                                .playOn(page5);
                }                                           }

                @Override
                public void onPageScrollStateChanged(int state) {}              });
                switch(position){
                    case 0:
                        viewPager.setCurrentItem(0);
                        ION.with(Techniques.SlideInFromRight)
                                  .duration(700)
                                  .playOn(page1);
                                  break;
                    case 1:
                        viewPager.setCurrentItem(1);
                        ION.with(Techniques.SlideInFromRight)
                                  .duration(700)
                                  .playOn(page2);
                                  break;
                    case 2:
                        viewPager.setCurrentItem(2);
                        ION.with(Techniques.SlideInFromRight)
                                  .duration(700)
                                  .playOn(page3);
                                  break;
                    case 3:
                        viewPager.setCurrentItem(3);
                        ION.with(Techniques.SlideInFromRight)
                                .duration(700)
                                .playOn(page4);
                        break;
                    case 4:
                        viewPager.setCurrentItem(4);
                        ION.with(Techniques.SlideInFromRight)
                                .duration(700)
                                .playOn(page5);
                        break;
                }

        }
        public void onNothingSelected(CarouselAdapter<?> parent) {}
        }
        );
    }
}
