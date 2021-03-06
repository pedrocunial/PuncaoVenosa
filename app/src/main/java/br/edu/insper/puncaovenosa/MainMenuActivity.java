package br.edu.insper.puncaovenosa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainMenuActivity extends AppCompatActivity {

    private LinearLayout playbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        RelativeLayout myLayout = (RelativeLayout) findViewById(R.id.main_menu_activity);

        playbutton = (LinearLayout) findViewById(R.id.play) ;


        assert myLayout != null;
        playbutton.setOnTouchListener(new RelativeLayout.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent m) {
                startActivity(new Intent(MainMenuActivity.this, CharacterSelectionActivity.class));
                return true;
            }
        });
    }
}
