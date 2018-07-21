package nyc.aisleone.vicemobilechallenge;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class
MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    MovieFragmentPagerAdapter adapter = new MovieFragmentPagerAdapter(this,getSupportFragmentManager());

    ViewPager viewPager = findViewById(R.id.movie_viewpager);
    viewPager.setAdapter(adapter);

    TabLayout tabLayout = findViewById(R.id.movie_tabs);
    tabLayout.setupWithViewPager(viewPager);
  }
}

