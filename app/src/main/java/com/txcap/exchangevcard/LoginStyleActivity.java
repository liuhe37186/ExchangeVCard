package com.txcap.exchangevcard;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;

import net.tsz.afinal.FinalActivity;
import net.tsz.afinal.annotation.view.ViewInject;


public class LoginStyleActivity extends FinalActivity {

    @ViewInject(id=R.id.id_login_style_wechat,click = "loginAsWeChat")
    RelativeLayout loginAsWeChat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_style);
    }

    public void loginAsWeChat(View view){
        switch (view.getId()){
            case R.id.id_login_style_wechat:
                Intent intentWeChat = new Intent(LoginStyleActivity.this,EnsureLoginAsWeChatActivity.class);
                startActivity(intentWeChat);
                break;
        }

    }

}
