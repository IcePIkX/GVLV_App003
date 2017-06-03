package mx.edu.cetis108.gvlv_app003;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnOperacion_click (View v)
    {
        EditText numero1, numero2;
        numero1= (EditText) findViewById(R.id.txtNumero1);
        numero2= (EditText) findViewById(R.id.txtNumero2);
        TextView lblResultado= (TextView) findViewById(R.id.lblResultado);

        double n1= Double.valueOf(numero1.getText().toString());
        double n2= Double.valueOf(numero2.getText().toString());

        if (n1>n2)
        {
            double result= n1 - n2;
            lblResultado.setText("La resta es: "+result);

        }
        else
        {
            double result= n1 + n2;
            lblResultado.setText("la suma es: "+result);
        }



    }
}
