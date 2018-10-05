package th.ac.ssru.mosquitoapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class StaticYearActivity extends BaseActivity {

    CardView cardYear1, cardYear2;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_static_year);

        cardYear1 = findViewById(R.id.cardYear1);
        cardYear2 = findViewById(R.id.cardYear2);

        cardYear1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StaticYearActivity.this,StaticSelectYearActivity.class));
                overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
            }
        });

        cardYear2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastShow(StaticYearActivity.this,"ยังไม่เปิดใช้งาน");
            }
        });
    }

}
