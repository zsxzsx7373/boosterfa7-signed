
package com.valiant.boosterfa7;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView text = new TextView(this);
        text.setText("BoosterFA7: Калькулятор окупаемости");
        text.setTextSize(20);
        text.setPadding(40, 200, 40, 40);
        setContentView(text);
    }
}
