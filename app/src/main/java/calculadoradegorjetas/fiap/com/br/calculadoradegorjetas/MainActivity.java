package calculadoradegorjetas.fiap.com.br.calculadoradegorjetas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

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
    }


}
