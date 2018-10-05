package th.ac.ssru.mosquitoapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class StaticActivity extends BaseActivity {

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_static);

    }

}
