package com.example.mouadh.myapplication;


        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;

        import butterknife.ButterKnife;
        import butterknife.OnClick;


/**
 * Created by Mouadh on 21/11/2015.
 */
public class ProfileActivity extends Activity {


    @OnClick(R.id.b_search) void takeMeToLogin(){
        Intent secondeActivite = new Intent(ProfileActivity.this,Menu.class);
        startActivity(secondeActivite);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        ButterKnife.bind(this);

    }


}
