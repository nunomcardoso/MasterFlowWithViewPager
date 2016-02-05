package demo.mc.nuno.appdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText user,pw;
    public static final String USER_EXTRA = "USER_LOGIN";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setTitle("Login Screen");
        user   = (EditText)findViewById(R.id.user);
        pw   = (EditText)findViewById(R.id.pw);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.f
        //getMenuInflater().inflate(R.menu.menu_login, menu);
        return true;
    }

    public void onClickUserPanel(View v){
        Intent userPanel = new Intent(LoginActivity.this, UserPanelActivity.class);
        String username = user.getText().toString();
        Log.v("NAME", username);
        String password = pw.getText().toString();

        userPanel.putExtra(USER_EXTRA,username);
        Toast.makeText(LoginActivity.this, "Password: " + password, Toast.LENGTH_SHORT).show();

        startActivity(userPanel);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        /*noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }
}
