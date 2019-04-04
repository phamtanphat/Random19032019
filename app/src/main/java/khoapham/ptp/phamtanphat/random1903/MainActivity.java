package khoapham.ptp.phamtanphat.random1903;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText edtSomin,edtSomax;
    Button btnRandom;
    TextView txtKetqua;

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

    }
}
