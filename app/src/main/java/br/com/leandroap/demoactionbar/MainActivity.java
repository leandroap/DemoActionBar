package br.com.leandroap.demoactionbar;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import br.com.leandroap.demoactionbar.adapter.TabsAdapter;

public class MainActivity extends ActionBarActivity implements android.support.v7.app.ActionBar.TabListener {

    private ViewPager tabspager;
    private TabsAdapter tabAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabspager = (ViewPager)findViewById(R.id.tabspager);
        tabAdapter = new TabsAdapter(getSupportFragmentManager());

        tabspager.setAdapter(tabAdapter);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setIcon(getResources().getDrawable(R.drawable.ic_action_android));
        getSupportActionBar().setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        ActionBar.Tab androidTab = getSupportActionBar()
                .newTab()
                .setText("Android")
                .setIcon(R.drawable.ic_action_android)
                .setTabListener(this);

        getSupportActionBar().addTab(androidTab);

        ActionBar.Tab iOSTab = getSupportActionBar()
                .newTab()
                .setText("iOS")
                .setIcon(R.drawable.ic_action_ios)
                .setTabListener(this);

        getSupportActionBar().addTab(iOSTab);

        ActionBar.Tab windowsPhoneTab = getSupportActionBar()
                .newTab()
                .setText("Windows Phone")
                .setIcon(R.drawable.ic_action_windows)
                .setTabListener(this);

        getSupportActionBar().addTab(windowsPhoneTab);

        tabspager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                getSupportActionBar().setSelectedNavigationItem(i);
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });

    }

    @Override
    public void onTabSelected(android.support.v7.app.ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

        tabspager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(android.support.v7.app.ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

    }

    @Override
    public void onTabReselected(android.support.v7.app.ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.action_pesquisar:
                Toast.makeText(this, "Clicou em pesquisar", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_plus:
                Toast.makeText(this, "Clicou em adicionar", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
