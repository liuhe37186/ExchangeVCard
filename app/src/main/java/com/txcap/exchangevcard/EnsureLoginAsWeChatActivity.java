package com.txcap.exchangevcard;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;

import net.tsz.afinal.annotation.view.ViewInject;


public class EnsureLoginAsWeChatActivity extends ActionBarActivity {

    @ViewInject(id = R.id.id_login_style_wechat,click = "ensureLoginAsWeChat")
    RelativeLayout ensureLoginAsWeChat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ensure_login_as_we_chat);
    }

    public void ensureLoginAsWeChat(){
        startActivity(new Intent(EnsureLoginAsWeChatActivity.this,BindPhoneNumActivity.class));
    }
}
