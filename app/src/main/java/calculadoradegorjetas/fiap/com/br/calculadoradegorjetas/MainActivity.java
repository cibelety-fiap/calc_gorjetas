package calculadoradegorjetas.fiap.com.br.calculadoradegorjetas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    private EditText amountEditText;

    private TextView amountTextView;

    private TextView percentTextView;

    private SeekBar percentSeekBar;

    private TextView tipTextView;

    private TextView totalTextView;

    private NumberFormat currencyFormat =
            NumberFormat.getCurrencyInstance();

    private NumberFormat percentFormat =
            NumberFormat.getPercentInstance();

    private double billAmount;

    private double percent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //inflando a view
        setContentView(R.layout.activity_main);

        amountEditText = findViewById(R.id.amountEditText);
        amountTextView = findViewById(R.id.amountTextView);
        percentTextView = findViewById(R.id.percentTextView);
        percentSeekBar = findViewById(R.id.percentSeekBar);
        tipTextView = findViewById(R.id.tipTextView);
        totalTextView = findViewById(R.id.totalTextView);


    }
}
