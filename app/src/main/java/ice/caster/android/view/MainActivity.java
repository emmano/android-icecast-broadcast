package ice.caster.android.view;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;

import ice.caster.android.R;

public class MainActivity extends FragmentActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}