package demo.mc.nuno.appdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import demo.mc.nuno.appdemo.square.SquareActivity;
import demo.mc.nuno.appdemo.star.StarListActivity;

public class UserPanelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_panel);
        setTitle("User Panel");
        TextView welcome = (TextView) findViewById(R.id.textView);
        welcome.setText(welcome.getText() + getIntent().getStringExtra(LoginActivity.USER_EXTRA));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.menu_user_panel, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClickStar(View v){
        Intent userPanel = new Intent(UserPanelActivity.this, StarListActivity.class);
        startActivity(userPanel);
    }

    public void onClickSquare(View v){
        Intent userPanel = new Intent(UserPanelActivity.this, SquareActivity.class);
        startActivity(userPanel);
    }

    public void onClickToast(View v){
        Toast.makeText(UserPanelActivity.this, "Try Square or Star!", Toast.LENGTH_SHORT).show();
    }

}
