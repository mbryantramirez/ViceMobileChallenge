package nyc.aisleone.vicemobilechallenge;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

public class
MainActivity extends AppCompatActivity {

  private ActionBar actionBar;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    actionBar = getSupportActionBar();

    MovieFragmentPagerAdapter adapter = new MovieFragmentPagerAdapter(this,getSupportFragmentManager());

    ViewPager viewPager = findViewById(R.id.movie_viewpager);
    viewPager.setAdapter(adapter);

    TabLayout tabLayout = findViewById(R.id.movie_tabs);
    tabLayout.setupWithViewPager(viewPager);
  }
}

