package it.oztaking.com.a76_menudemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu1,menu);

        menu.add(0,0,0,"前进");
        menu.add(0,1,0,"后退");

        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.add_item:

                Toast.makeText(this,"点击了Add按钮",Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:

                Toast.makeText(this,"点击了remove按钮",Toast.LENGTH_SHORT).show();
                break;
            case 0:
                Toast.makeText(this,"点击了前进按钮",Toast.LENGTH_SHORT).show();
                break;
            case 1:
                Toast.makeText(this,"点击了后退按钮",Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }


        return true;
    }
}
