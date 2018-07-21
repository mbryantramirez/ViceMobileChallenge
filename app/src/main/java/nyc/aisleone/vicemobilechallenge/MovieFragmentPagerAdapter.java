package nyc.aisleone.vicemobilechallenge;

import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import androidx.fragment.app.FragmentManager;

public class MovieFragmentPagerAdapter extends PagerAdapter {


  MovieFragmentPagerAdapter(MainActivity mainActivity,
      FragmentManager supportFragmentManager) {

  }

  @Override public int getCount() {
    return 0;
  }

  @Override public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
    return false;
  }
}
