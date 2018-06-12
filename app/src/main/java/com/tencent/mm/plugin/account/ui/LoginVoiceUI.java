package com.tencent.mm.plugin.account.ui;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.q;
import com.tencent.mm.plugin.account.a.c;
import com.tencent.mm.plugin.account.a.f;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.h;

public class LoginVoiceUI
  extends LoginHistoryUI
{
  public final boolean YD()
  {
    return false;
  }
  
  protected final void Yz()
  {
    int j = -1;
    super.Yz();
    YA();
    q localq = new q(this.eRg, this.eRp, "", 0);
    localq.mW(this.eRp);
    int i;
    String str;
    if (this.eRp == null)
    {
      i = -1;
      str = bi.Xf(this.eRp);
      if (this.eQY.eIY != null) {
        break label162;
      }
    }
    for (;;)
    {
      x.d("MicroMsg.LoginVoiceUI", "summerauth mAuthPwd len:%d content[%s] logindata.rawPsw len:%d content[%s]", new Object[] { Integer.valueOf(i), str, Integer.valueOf(j), bi.Xf(this.eQY.eIY) });
      getString(a.j.app_tip);
      this.eHw = h.a(this, getString(a.j.login_logining), true, new LoginVoiceUI.2(this, localq));
      g.DF().a(localq, 0);
      return;
      i = this.eRp.length();
      break;
      label162:
      j = this.eQY.eIY.length();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (this.eRq) {
      return;
    }
    this.eLS = 1;
    this.eRj.setVisibility(0);
    this.eQR.setVisibility(0);
    paramBundle = (LinearLayout.LayoutParams)this.eQQ.getLayoutParams();
    paramBundle.gravity = 1;
    paramBundle.leftMargin = 0;
    this.eQQ.setLayoutParams(paramBundle);
    findViewById(a.f.voice_btn_icon).setEnabled(false);
    ((TextView)findViewById(a.f.voice_login_btn)).setTextColor(getResources().getColorStateList(a.c.white_text_color_selector));
    ((TextView)findViewById(a.f.voice_login_btn)).setBackgroundResource(getResources().getColor(a.c.transparent));
    this.eQR.setOnClickListener(new LoginVoiceUI.1(this));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/account/ui/LoginVoiceUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */