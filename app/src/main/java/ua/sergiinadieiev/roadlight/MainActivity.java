package ua.sergiinadieiev.roadlight;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import static android.view.View.*;


public class MainActivity extends Activity implements OnClickListener {

    private TextView mTextViewInfo;
    private RelativeLayout mRelativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextViewInfo = (TextView)findViewById(R.id.textView);
        mRelativeLayout = (RelativeLayout)findViewById(R.id.relativeLayout);

        final Button redButton = (Button)findViewById(R.id.buttonRed);
        final Button yellowButton = (Button)findViewById(R.id.buttonYellow);
        final Button greenButton = (Button)findViewById(R.id.buttonGreen);

        redButton.setOnClickListener(this);
        yellowButton.setOnClickListener(this);
        greenButton.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.buttonRed: {
                mTextViewInfo.setText(R.string.red);
                mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.redColor));
            }
            break;
            case R.id.buttonYellow: {
                mTextViewInfo.setText(R.string.yellow);
                mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.yellowColor));
            }
            break;
            case R.id.buttonGreen: {
                mTextViewInfo.setText(R.string.green);
                mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.greenColor));
            }
            break;
        }
    }
}
