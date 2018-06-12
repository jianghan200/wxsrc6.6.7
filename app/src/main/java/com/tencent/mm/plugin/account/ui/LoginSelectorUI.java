package com.tencent.mm.plugin.account.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.a.b;
import com.tencent.mm.plugin.account.a.f;
import com.tencent.mm.plugin.account.a.g;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.e;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.b;
import com.tencent.mm.ui.s;

@Deprecated
public class LoginSelectorUI
  extends MMActivity
  implements View.OnClickListener
{
  private TextView eRS;
  private View eRT;
  
  protected final int getLayoutId()
  {
    return a.g.select_login_reg;
  }
  
  protected final void initView()
  {
    Button localButton1 = (Button)findViewById(a.f.select_login_btn);
    Button localButton2 = (Button)findViewById(a.f.select_register_btn);
    this.eRS = ((TextView)findViewById(a.f.select_country));
    this.eRT = findViewById(a.f.select_country_ly);
    localButton1.setOnClickListener(this);
    localButton2.setOnClickListener(this);
    this.eRS.setText(w.h(this.mController.tml, a.b.language_setting, a.j.app_lang_sys));
    this.eRT.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        paramAnonymousView = new Intent();
        paramAnonymousView.putExtra("not_auth_setting", true);
        com.tencent.mm.plugin.account.a.a.ezn.p(paramAnonymousView, LoginSelectorUI.this.mController.tml);
      }
    });
    if (e.sFE)
    {
      com.tencent.mm.plugin.account.a.a.ezo.g(this);
      return;
    }
    com.tencent.mm.plugin.account.a.a.ezo.bb(this);
  }
  
  public void onClick(View paramView)
  {
    if (a.f.select_login_btn == paramView.getId())
    {
      paramView = new Intent(this, MobileInputUI.class);
      paramView.putExtra("mobile_input_purpose", 1);
      startActivity(paramView);
    }
    while (a.f.select_register_btn != paramView.getId()) {
      return;
    }
    if (d.qVQ)
    {
      paramView = getString(a.j.create_forbiden_uri, new Object[] { "0x" + Integer.toHexString(d.qVN), w.chP() });
      Intent localIntent = new Intent();
      localIntent.putExtra("rawUrl", paramView);
      localIntent.putExtra("showShare", false);
      localIntent.putExtra("show_bottom", false);
      localIntent.putExtra("needRedirect", false);
      localIntent.putExtra("neverGetA8Key", true);
      localIntent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.qWa);
      localIntent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.qVX);
      com.tencent.mm.plugin.account.a.a.ezn.j(localIntent, this);
      return;
    }
    paramView = new Intent(this, RegByMobileRegAIOUI.class);
    paramView.putExtra("login_type", 0);
    startActivity(paramView);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setTitleVisibility(8);
    com.tencent.mm.plugin.account.a.a.ezo.vo();
    g.Eg();
    com.tencent.mm.kernel.a.DB();
    initView();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      Intent localIntent = com.tencent.mm.plugin.account.a.a.ezn.be(this);
      localIntent.addFlags(67108864);
      localIntent.putExtra("can_finish", true);
      startActivity(localIntent);
      finish();
      b.gF(this);
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void onResume()
  {
    super.onResume();
    g.Eg();
    com.tencent.mm.kernel.a.DB();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/account/ui/LoginSelectorUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */