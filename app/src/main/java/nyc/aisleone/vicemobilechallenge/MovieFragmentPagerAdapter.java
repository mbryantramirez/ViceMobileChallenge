package nyc.aisleone.vicemobilechallenge;


import android.view.View;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.PagerAdapter;

public class MovieFragmentPagerAdapter extends PagerAdapter {


  MovieFragmentPagerAdapter(MainActivity mainActivity,
      FragmentManager supportFragmentManager) {

  }

  @Override public int getCount() {
    return 0;
  }

  @Override public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
    return false;
  }
}
