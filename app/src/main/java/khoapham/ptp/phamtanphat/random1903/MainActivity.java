package khoapham.ptp.phamtanphat.random1903;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText edtSomin,edtSomax;
    Button btnRandom , btnAddArray;
    TextView txtKetqua;
    ArrayList<Integer> mangkhoangcach = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Random random = new Random();
////        (max - min + 1) + min;
//        int value = random.nextInt(2000 - 5 + 1) + 5;
//        Log.d("BBB",value + " " );
        edtSomax = findViewById(R.id.edittextSomax);
        edtSomin = findViewById(R.id.edittextSomin);
        btnRandom = findViewById(R.id.buttonRandom);
        txtKetqua = findViewById(R.id.textviewKetqua);
        btnAddArray = findViewById(R.id.buttonAddArray);

        btnAddArray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String somin = edtSomin.getText().toString();
                String somax = edtSomax.getText().toString();

                int smin = Integer.parseInt(somin);
                int smax = Integer.parseInt(somax);
                // phim goi y tham so truyen vao ctrl + P

                mangkhoangcach.clear();

                for (int i = smin ; i<= smax ; i++){
                    mangkhoangcach.add(i);
                }
                for (int value : mangkhoangcach){
                    Log.d("BBB",value + "");
                }

            }
        });



        btnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


//                Random random = new Random();
//
//                int ketqua = random.nextInt(smax - smin + 1) + smin;
////                value += ketqua + " - ";
//                txtKetqua.append(ketqua + " - ");
            }
        });
    }
}
