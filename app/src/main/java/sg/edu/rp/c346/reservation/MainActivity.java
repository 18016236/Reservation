package sg.edu.rp.c346.reservation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CheckBox cbEnabled;
    Button btnCheck;
    TextView tvDisplay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cbEnabled=findViewById(R.id.checkBox);
        btnCheck=findViewById(R.id.button);

        btnCheck.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                if(cbEnabled.isChecked()){

                }
            }
        });
        btnDisplayTime.setOnCickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
               tvDisplay.setText("Time is "+tp.getCurrentHour()+":"+tp.getCurrentMinute());
            }
        });
    }
}
