package com.tencent.mm.plugin.account.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.ab.o;
import com.tencent.mm.bg.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.q;
import com.tencent.mm.plugin.account.a.c;
import com.tencent.mm.plugin.account.a.f;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;

public class LoginFaceUI
  extends LoginHistoryUI
{
  protected final void Yz()
  {
    int j = -1;
    super.Yz();
    YA();
    q localq = new q(this.eRg, this.eRp, "", 0);
    int i;
    String str;
    if (this.eRp == null)
    {
      i = -1;
      str = bi.Xf(this.eRp);
      if (this.eQY.eIY != null) {
        break label154;
      }
    }
    for (;;)
    {
      x.d("MicroMsg.LoginFaceUI", "summerauth mAuthPwd len:%d content[%s] logindata.rawPsw len:%d content[%s]", new Object[] { Integer.valueOf(i), str, Integer.valueOf(j), bi.Xf(this.eQY.eIY) });
      getString(a.j.app_tip);
      this.eHw = com.tencent.mm.ui.base.h.a(this, getString(a.j.login_logining), true, new LoginFaceUI.2(this, localq));
      g.DF().a(localq, 0);
      return;
      i = this.eRp.length();
      break;
      label154:
      j = this.eQY.eIY.length();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (this.eRq) {
      return;
    }
    this.eLS = 4;
    this.eRl.setVisibility(0);
    this.eQS.setVisibility(0);
    findViewById(a.f.face_btn_icon).setEnabled(false);
    ((TextView)findViewById(a.f.face_login_btn)).setTextColor(getResources().getColorStateList(a.c.white_text_color_selector));
    ((TextView)findViewById(a.f.face_login_btn)).setBackgroundResource(getResources().getColor(a.c.transparent));
    this.eQS.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        com.tencent.mm.plugin.report.service.h.mEJ.h(11557, new Object[] { Integer.valueOf(2) });
        paramAnonymousView = new Intent();
        paramAnonymousView.putExtra("k_user_name", LoginFaceUI.this.eRg);
        paramAnonymousView.putExtra("k_purpose", 2);
        paramAnonymousView.putExtra("k_need_signature", true);
        d.b(LoginFaceUI.this.mController.tml, "facedetect", ".ui.FaceDetectUI", paramAnonymousView, 1025);
      }
    });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/account/ui/LoginFaceUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */