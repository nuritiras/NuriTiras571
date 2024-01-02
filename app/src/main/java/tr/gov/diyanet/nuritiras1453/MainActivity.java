package tr.gov.diyanet.nuritiras1453; // Cevap 2

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText numberTL,numberDolar,numberEuro,numberAltin,numberGumus;
    Button button;
    TextView sonucText,altinText,gumusText;
    Switch switchMaden;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numberTL=findViewById(R.id.numberTL);
        numberDolar=findViewById(R.id.numberDolar);
        numberEuro=findViewById(R.id.numberEuro);
        numberAltin=findViewById(R.id.numberAltin);
        numberGumus=findViewById(R.id.numberGumus);
        button=findViewById(R.id.button);
        switchMaden=findViewById(R.id.switchMaden);
        altinText=findViewById(R.id.textView6);
        gumusText=findViewById(R.id.textView7);
        sonucText=findViewById(R.id.sonucText);
        // Cevap 7
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double degerTL=Double.parseDouble(numberTL.getText().toString());
                double degerDolar=Double.parseDouble(numberDolar.getText().toString());
                double degerEuro=Double.parseDouble(numberEuro.getText().toString());
                double degerAltin=Double.parseDouble(numberAltin.getText().toString());
                double degerGumus=Double.parseDouble(numberGumus.getText().toString());
                double varlikMiktari=0;
                long zekatMiktari=0;
                if(!switchMaden.isChecked()){
                    varlikMiktari=malVarligi(degerTL,degerDolar,degerEuro);
                } else {
                    varlikMiktari=malVarligi(degerTL,degerDolar,degerEuro,degerAltin,degerGumus);
                }
                if(varlikMiktari<80.18) {
                    sonucText.setText("Size Zekat Düşmemektedir.");
                } else {
                    zekatMiktari=(long)(varlikMiktari*1956.2/40);
                    sonucText.setText("Zekat Miktarı:"+zekatMiktari+"TL");
                }
            }
        });
        if(switchMaden.isChecked()){
            numberAltin.setVisibility(View.VISIBLE);
            altinText.setVisibility(View.VISIBLE);
            numberGumus.setVisibility(View.VISIBLE);
            gumusText.setVisibility(View.VISIBLE);
        } else {
            numberAltin.setVisibility(View.INVISIBLE);
            altinText.setVisibility(View.INVISIBLE);
            numberGumus.setVisibility(View.INVISIBLE);
            gumusText.setVisibility(View.INVISIBLE);
        }

    }
    @Override
    protected void onResume() {
        super.onResume();
        switchMaden.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            //Cevap 4
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(switchMaden.isChecked()){
                    numberAltin.setVisibility(View.VISIBLE);
                    altinText.setVisibility(View.VISIBLE);
                    numberGumus.setVisibility(View.VISIBLE);
                    gumusText.setVisibility(View.VISIBLE);
                } else {
                    numberAltin.setVisibility(View.INVISIBLE);
                    altinText.setVisibility(View.INVISIBLE);
                    numberGumus.setVisibility(View.INVISIBLE);
                    gumusText.setVisibility(View.INVISIBLE);
                }
            }
        });
        //Cevap 8
        for(int i=1;i<=99;i++){
            System.out.println("Zekât vermek farzdır");
        }
    }
    // Cevap 5
    private double malVarligi(double TL,double Dolar,double Euro) {
        return (TL/1956.2+Dolar/66.3+Euro/59.7);
    }
    // Cevap 6
    private double malVarligi(double TL,double Dolar,double Euro, double Altin, double Gumus) {
        return (TL/1956.2+Dolar/66.3+Euro/59.7+Altin+Gumus/1836);
    }
}