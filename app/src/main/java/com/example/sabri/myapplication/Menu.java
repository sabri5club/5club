package com.example.mouadh.myapplication;


        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;

        import butterknife.ButterKnife;
        import butterknife.OnClick;
/**
 * Created by Mouadh on 17/10/2015.
 */
public class Menu extends Activity {

    @OnClick(R.id.b_profile) void takeMeToLogin(){
        Intent secondeActivite = new Intent(Menu.this,ProfileActivity.class);
        startActivity(secondeActivite);
    }

    @OnClick(R.id.b_create) void takeMeToMatch(){
        Intent secondeActivite = new Intent(Menu.this,CreateMatchActivity.class);
        startActivity(secondeActivite);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        ButterKnife.bind(this);

    }


}
