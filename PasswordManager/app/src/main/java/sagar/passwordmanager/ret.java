package sagar.passwordmanager;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class ret extends Activity {
    EditText e;Button bt,bt2;String s,a[],b[];int k=0;storeValues getVal;
    static SharedPreferences sharedpreferences;
    public static final String MyPREFERENCES = "MyPrefs" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getVal =new storeValues();
        super.onCreate(savedInstanceState);

        sharedpreferences=getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);




        setContentView(R.layout.activity_ret);
        e = (EditText) this.findViewById(R.id.editText);

                bt = (Button) this.findViewById(R.id.button);
        bt2 = (Button) this.findViewById(R.id.button2);
        bt.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                String s=sharedpreferences.getString(e.getText().toString(),"Wrong Username");





               // String result = getVal.getValue(s);

               bt2.setText(s);

            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.ret, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
