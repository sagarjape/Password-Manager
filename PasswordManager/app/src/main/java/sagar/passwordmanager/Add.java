package sagar.passwordmanager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;





public class Add extends Activity {

    Button bt,bt2;EditText ed,e;
    static SharedPreferences sharedpreferences;
    public static final String MyPREFERENCES = "MyPrefs" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_add);
        ed=(EditText)this.findViewById(R.id.editText2);
        e=(EditText)this.findViewById(R.id.editText);
        bt=(Button)this.findViewById(R.id.button);
        bt2=(Button)this.findViewById(R.id.button2);
        bt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //storeValues.setValue(e, ed);
                sharedpreferences=getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString(e.getText().toString(),ed.getText().toString());
                editor.commit();
                bt.setText("Password saved");
                bt.setClickable(false);

                bt2.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                       Intent i = new Intent(Add.this, Input.class);
                   //     i.putExtra("a", u);
                   //   i.putExtra("b", p);
                        Add.this.startActivity(i);

                    }
                });



            }});
        bt2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(Add.this, Input.class);
                //     i.putExtra("a", u);
                //   i.putExtra("b", p);
                Add.this.startActivity(i);

            }
        });

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.add, menu);
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
