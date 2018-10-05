package th.ac.ssru.mosquitoapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class StaticSelectYearActivity extends BaseActivity implements View.OnClickListener{

    CardView[] cardMount;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_static_select_year);

        cardMount = new CardView[12];

        cardMount[0] = findViewById(R.id.cardMount1);
        cardMount[1] = findViewById(R.id.cardMount2);
        cardMount[2] = findViewById(R.id.cardMount3);
        cardMount[3] = findViewById(R.id.cardMount4);
        cardMount[4] = findViewById(R.id.cardMount5);
        cardMount[5] = findViewById(R.id.cardMount6);
        cardMount[6] = findViewById(R.id.cardMount7);
        cardMount[7] = findViewById(R.id.cardMount8);
        cardMount[8] = findViewById(R.id.cardMount9);
        cardMount[9] = findViewById(R.id.cardMount10);
        cardMount[10] = findViewById(R.id.cardMount11);
        cardMount[11] = findViewById(R.id.cardMount12);

        for (CardView card:cardMount) {
            card.setOnClickListener(this);
        }

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cardMount1:
                startActivity(new Intent(StaticSelectYearActivity.this,StaticActivity.class));
                overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
                break;
                default:
                    ToastShow(StaticSelectYearActivity.this,"ยังไม่เปิดใช้งาน");
                    break;
        }
    }
}
