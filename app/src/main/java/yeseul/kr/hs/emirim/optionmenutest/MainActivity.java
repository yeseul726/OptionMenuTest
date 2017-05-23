package yeseul.kr.hs.emirim.optionmenutest;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout Linear;
    Button but;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Linear = (LinearLayout) findViewById(R.id.linear);
        but = (Button) findViewById(R.id.but_ok);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
        switch(item.getItemId()){
            case R.id.item_blue:
                Linear.setBackgroundColor(Color.BLUE);
                return true; //선택된 사항이 있을 경우 true를 반환 (return true를 만나면 빠져나감)
            case R.id.item_red:
                Linear.setBackgroundColor(Color.RED);
                return true;
            case R.id.item_yellow:
                Linear.setBackgroundColor(Color.YELLOW);
                return true;
            case R.id.item_but_rotate:
                but.setRotation(but.getRotation() + 45);
                return true;
            case R.id.item_but_size:
                but.setScaleX(but.getScaleX() + 1.5f);
                return true;
        }
        return false; //선택된 사항이 없을 경우 false를 반환해주는 것이 좋음
    }
}
