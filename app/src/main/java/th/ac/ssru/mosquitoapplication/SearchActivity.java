package th.ac.ssru.mosquitoapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class SearchActivity extends BaseActivity {

    CardView cardMenu1,cardMenu2,cardMenu3,cardMenu4,cardMenu5,cardMenu6, cardMenu7;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        cardMenu1 = findViewById(R.id.cardMenu1);
        cardMenu2 = findViewById(R.id.cardMenu2);
        cardMenu3 = findViewById(R.id.cardMenu3);
        cardMenu4 = findViewById(R.id.cardMenu4);
        cardMenu5 = findViewById(R.id.cardMenu5);
        cardMenu6 = findViewById(R.id.cardMenu6);
        cardMenu7 = findViewById(R.id.cardMenu7);

        cardMenu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SearchActivity.this,StaticYearActivity.class));
                overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
            }
        });

        cardMenu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastShow(SearchActivity.this,"ยังไม่เปิดใช้งาน");
            }
        });

        cardMenu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastShow(SearchActivity.this,"ยังไม่เปิดใช้งาน");
            }
        });

        cardMenu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastShow(SearchActivity.this,"ยังไม่เปิดใช้งาน");
            }
        });

        cardMenu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastShow(SearchActivity.this,"ยังไม่เปิดใช้งาน");
            }
        });

        cardMenu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastShow(SearchActivity.this,"ยังไม่เปิดใช้งาน");
            }
        });

        cardMenu7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastShow(SearchActivity.this,"ยังไม่เปิดใช้งาน");
            }
        });
        
    }

}
