package th.ac.ssru.mosquitoapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends BaseActivity {

    CardView cardSearch, cardWhat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardSearch = findViewById(R.id.cardSearch);
        cardWhat = findViewById(R.id.cardWhat);

        cardSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,SearchActivity.class));
                overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
            }
        });

        cardWhat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastShow(MainActivity.this,"ยังไม่เปิดใช้งาน");
            }
        });

    }

}
