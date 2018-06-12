package com.tencent.mm.plugin.account.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.al.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.a.f;
import com.tencent.mm.plugin.account.a.g;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.ui.MMActivity;

public class RegByMobileVoiceVerifyUI
  extends MMActivity
  implements e
{
  private String bTi;
  private String eHy;
  private com.tencent.mm.modelfriend.a eNv;
  private TextView ePz;
  private String eQH;
  private String eVK;
  private com.tencent.mm.plugin.account.friend.a.x eVM;
  private int eVN = 0;
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.RegByMobileVoiceVerifyUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
  }
  
  protected final int getLayoutId()
  {
    return a.g.bindmcontact_voice_verify;
  }
  
  protected final void initView()
  {
    setMMTitle(a.j.bind_mcontact_voice_verify_voice_title);
    setBackBtn(new RegByMobileVoiceVerifyUI.1(this));
    this.ePz = ((TextView)findViewById(a.f.languagename));
    Button localButton = (Button)findViewById(a.f.bind_mcontact_voice_verify_btn);
    this.eQH = RegByMobileVoiceVerifySelectUI.pR(this.bTi);
    this.ePz.setText(this.eQH);
    this.eVK = b.mk(this.bTi);
    findViewById(a.f.ll_current_language).setOnClickListener(new RegByMobileVoiceVerifyUI.2(this));
    localButton.setOnClickListener(new RegByMobileVoiceVerifyUI.3(this));
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if ((paramInt1 != 10000) || (paramIntent == null)) {
      return;
    }
    this.eQH = paramIntent.getStringExtra("voice_verify_language");
    this.eVK = paramIntent.getStringExtra("voice_verify_code");
    this.ePz.setText(this.eQH);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.bTi = getIntent().getExtras().getString("bindmcontact_mobile");
    this.eVN = getIntent().getExtras().getInt("voice_verify_type");
    if ((this.eVN == 0) || (this.eVN == 2) || (this.eVN == 3)) {
      g.DF().a(145, this);
    }
    for (;;)
    {
      this.eHy = com.tencent.mm.plugin.c.a.Zu();
      initView();
      return;
      if ((this.eVN == 4) || (this.eVN == 1)) {
        g.DF().a(132, this);
      }
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    g.DF().b(132, this);
    g.DF().b(145, this);
    if ((this.eVN == 0) || (this.eVN == 2) || (this.eVN == 3))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      g.Eg();
      localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",R200_500,");
      g.Eg();
      com.tencent.mm.plugin.c.a.d(false, com.tencent.mm.kernel.a.gd("R200_500") + ",2");
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      com.tencent.mm.plugin.c.a.pU(this.eHy);
      YC();
      finish();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onResume()
  {
    super.onResume();
    if ((this.eVN == 0) || (this.eVN == 2) || (this.eVN == 3))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      g.Eg();
      localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",R200_500,");
      g.Eg();
      com.tencent.mm.plugin.c.a.d(true, com.tencent.mm.kernel.a.gd("R200_500") + ",1");
      com.tencent.mm.plugin.c.a.pT("R200_500");
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/account/ui/RegByMobileVoiceVerifyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */