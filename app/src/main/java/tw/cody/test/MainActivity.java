package tw.cody.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.TreeSet;

public class MainActivity extends AppCompatActivity {
    private TextView lottery;
    private Button lotteryClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v("cody","create");

        lottery = findViewById(R.id.lottery);
        lotteryClick = findViewById(R.id.lotteryClick);

        lotteryClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                TreeSet<Integer> Lottery = new TreeSet<>();
//                while (Lottery.size() < 6) {
//                    Lottery.add((int)(Math.random()*49+1));
//                }
//                lottery.setText(Lottery.toString());
                TreeSet<Integer> Lottery = new TreeSet<>();
//                for (int i=0;i<6;i++) {
//                    Lottery.add((int)(Math.random()*49+1));
//                    lottery.setText(Lottery.toString());
//                }
                while (Lottery.size()<6) Lottery.add((int)(Math.random()*49+1));
                lottery.setText("" + Lottery);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("cody","start");
        lottery.setText("" + (int)(Math.random()*49+1));
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("cody","pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("cody","stop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("cody","restart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("cody","resume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("cody","destroy");
    }

    public void gotopage2(View view) {
        Intent intent = new Intent(this,page2.class);
        startActivity(intent);
    }
}