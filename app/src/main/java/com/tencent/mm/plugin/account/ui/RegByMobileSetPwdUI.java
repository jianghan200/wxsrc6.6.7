package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.av;
import com.tencent.mm.model.q;
import com.tencent.mm.modelsimple.r;
import com.tencent.mm.modelsimple.y;
import com.tencent.mm.plugin.account.a.f;
import com.tencent.mm.plugin.account.a.g;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.em;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import java.io.IOException;

public class RegByMobileSetPwdUI
  extends SetPwdUI
{
  private String bLe = null;
  private TextView eSV;
  public View eVA;
  public EditText eVB;
  private String eVC = null;
  private boolean eVD = false;
  public boolean eVE;
  private int eVF = 0;
  private bhy eVG = null;
  private TextView eVw;
  private View eVx;
  private View eVy;
  private TextView eVz;
  
  protected final l YR()
  {
    if (bi.oW(this.bLe)) {
      this.bLe = ((String)g.Ei().DT().get(77830, null));
    }
    return new y(this.eWT, this.bLe, this.eVF, this.eVG);
  }
  
  protected final String YS()
  {
    return ((EditText)findViewById(a.f.regbymobilereg_pass_et)).getText().toString();
  }
  
  protected final String YT()
  {
    return ((EditText)findViewById(a.f.regbymobilereg_pass_again_et)).getText().toString();
  }
  
  protected final void Za()
  {
    if ((bi.oW(this.bLe)) && (this.eVE))
    {
      com.tencent.mm.modelsimple.ab localab = new com.tencent.mm.modelsimple.ab(this.eVB.getText().toString(), "", "", "");
      g.DF().a(localab, 0);
      getString(a.j.app_tip);
      this.eHw = h.a(this, getString(a.j.app_sending), false, null);
      return;
    }
    super.Za();
  }
  
  public final boolean Zb()
  {
    return true;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicorMsg.RegByMobileSetPwdUI", "errorCode %d, errorMsg %s, scene %s", new Object[] { Integer.valueOf(paramInt2), paramString, paraml });
    super.a(paramInt1, paramInt2, paramString, paraml);
    if (paraml.getType() == 255) {
      if (((r)paraml).efY == 1)
      {
        if ((paramInt1 != 0) || (paramInt2 != 0)) {
          break label89;
        }
        this.eVA.setVisibility(0);
        this.eVx.setVisibility(0);
        this.eVE = true;
      }
    }
    label89:
    while (paraml.getType() != 384)
    {
      do
      {
        return;
        if ((paramInt2 == -3) && (paramInt1 == 4))
        {
          this.eVE = false;
          return;
        }
        this.eVA.setVisibility(0);
        this.eVx.setVisibility(0);
        paramString = com.tencent.mm.h.a.eV(paramString);
      } while (paramString == null);
      com.tencent.mm.sdk.platformtools.x.i("MicorMsg.RegByMobileSetPwdUI", "summertips errCode[%d], showType[%d], url[%s], desc[%s]", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramString.showType), paramString.url, paramString.desc });
      h.a(this, paramString.desc, paramString.bHD, false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          RegByMobileSetPwdUI.this.finish();
        }
      });
      return;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      g.Ei().DT().set(77830, ((com.tencent.mm.modelsimple.ab)paraml).Oj());
      Zo();
      return;
    }
    h.i(this, a.j.regbymobile_reg_setpwd_old_pwd_alert, a.j.app_tip);
  }
  
  protected final boolean f(int paramInt1, int paramInt2, String paramString)
  {
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      finish();
      return true;
    }
    return e(paramInt1, paramInt2, paramString);
  }
  
  protected final int getLayoutId()
  {
    return a.g.regbymobilesetpwd_reg;
  }
  
  protected final void initView()
  {
    if (!this.eWV) {
      cqi();
    }
    setMMTitle(a.j.regbymobile_reg_setpwd_title);
    this.eVw = ((TextView)findViewById(a.f.username_tv));
    this.eVy = findViewById(a.f.account_container);
    this.eSV = ((TextView)findViewById(a.f.regbymobilerag_pass_hint));
    this.eVz = ((TextView)findViewById(a.f.account_wording));
    if ((this.eVC != null) && (this.eVC.length() > 0)) {
      this.eSV.setText(this.eVC);
    }
    this.eVA = findViewById(a.f.regbymobile_reg_old_pwd_container);
    this.eVB = ((EditText)this.eVA.findViewById(a.f.regbymobilereg_old_pwd_et));
    this.eVx = findViewById(a.f.forgot_old_password);
    this.eVx.setOnClickListener(new RegByMobileSetPwdUI.1(this));
    if ((this.eVD) || (!g.Eg().Dx()))
    {
      this.eVy.setVisibility(8);
      localObject1 = (TextView)findViewById(a.f.old_password_wording);
      localObject2 = (TextView)findViewById(a.f.password_wording);
      TextView localTextView = (TextView)findViewById(a.f.confirm_wording);
      EditText localEditText1 = (EditText)findViewById(a.f.regbymobilereg_pass_et);
      EditText localEditText2 = (EditText)findViewById(a.f.regbymobilereg_pass_again_et);
      if (!w.chL())
      {
        ((TextView)localObject1).setTextSize(1, 14.0F);
        ((TextView)localObject2).setTextSize(1, 14.0F);
        localTextView.setTextSize(1, 14.0F);
        localEditText1.setTextSize(1, 14.0F);
        localEditText2.setTextSize(1, 14.0F);
      }
      float f1 = this.eVz.getPaint().measureText(this.eVz.getText().toString());
      float f2 = ((TextView)localObject1).getPaint().measureText(((TextView)localObject1).getText().toString());
      float f3 = ((TextView)localObject2).getPaint().measureText(((TextView)localObject2).getText().toString());
      float f4 = localTextView.getPaint().measureText(localTextView.getText().toString());
      f1 = Math.max(Math.max(Math.max(f1, f3), f4), f2);
      ((TextView)localObject1).setWidth((int)f1);
      this.eVz.setWidth((int)f1);
      ((TextView)localObject2).setWidth((int)f1);
      ((TextView)localObject2).setWidth((int)f1);
      return;
    }
    this.eVy.setVisibility(0);
    Object localObject2 = q.GG();
    Object localObject1 = localObject2;
    if (bi.oW((String)localObject2))
    {
      localObject2 = q.GF();
      localObject1 = localObject2;
      if (com.tencent.mm.storage.ab.XT((String)localObject2)) {
        localObject1 = null;
      }
    }
    if (bi.oW((String)localObject1))
    {
      localObject2 = (String)g.Ei().DT().get(6, null);
      localObject1 = (String)g.Ei().DT().get(5, null);
      if (!bi.oW((String)localObject2)) {
        if (bi.Xd((String)localObject2).booleanValue())
        {
          new ap();
          localObject1 = "86";
          if (!((String)localObject2).startsWith("+")) {
            break label699;
          }
          localObject2 = ((String)localObject2).replace("+", "");
          localObject1 = ap.Fp((String)localObject2);
          if (localObject1 == null) {
            break label696;
          }
          localObject2 = ((String)localObject2).substring(((String)localObject1).length());
        }
      }
    }
    label696:
    label699:
    for (;;)
    {
      localObject1 = ap.formatNumber((String)localObject1, (String)localObject2);
      this.eVz.setText(a.j.settings_mobile);
      this.eVw.setText((CharSequence)localObject1);
      this.eSV.setText(a.j.regbymobile_reg_setpwd_title_mobile);
      break;
      if (!bi.oW((String)localObject1))
      {
        this.eVw.setText((CharSequence)localObject1);
        this.eVz.setText(a.j.settings_email_addr);
        this.eSV.setText(a.j.regbymobile_reg_setpwd_title_email);
        break;
      }
      this.eVy.setVisibility(8);
      break;
      this.eVz.setText(a.j.settings_username);
      this.eVw.setText((CharSequence)localObject1);
      break;
    }
  }
  
  protected final void jo(int paramInt)
  {
    switch (RegByMobileSetPwdUI.3.evn[(paramInt - 1)])
    {
    default: 
      return;
    case 1: 
      h.i(this, a.j.regbymobile_reg_setpwd_alert_diff, a.j.regbymobile_reg_setpwd_alert_title);
      return;
    case 2: 
      h.i(this, a.j.regbymobile_reg_setpwd_alert_more_byte, a.j.regbymobile_reg_setpwd_alert_title);
      return;
    case 3: 
      h.i(this, a.j.verify_password_all_num_tip, a.j.regbymobile_reg_setpwd_alert_title);
      return;
    }
    h.i(this, a.j.verify_password_tip, a.j.regbymobile_reg_setpwd_alert_title);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramInt1 == 10001) && (paramInt2 == -1))
    {
      paramIntent = paramIntent.getStringExtra("setpwd_ticket");
      com.tencent.mm.sdk.platformtools.x.i("MicorMsg.RegByMobileSetPwdUI", "get reset pwd ticket %s", new Object[] { paramIntent });
      if (!bi.oW(paramIntent))
      {
        this.bLe = paramIntent;
        this.eVF = 6;
        this.eVA.setVisibility(8);
        this.eVx.setVisibility(8);
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.eVC = getIntent().getStringExtra("kintent_hint");
    this.eWV = getIntent().getBooleanExtra("kintent_cancelable", true);
    this.eVD = getIntent().getBooleanExtra("from_unbind", false);
    g.DF().a(384, this);
    g.DF().a(255, this);
    initView();
    paramBundle = bi.WP(av.Ib().getString("_auth_key", ""));
    em localem = new em();
    if (!bi.bC(paramBundle)) {}
    for (this.eVG = new bhy().bq(paramBundle);; this.eVG = new bhy().bq(new byte[0])) {
      try
      {
        localem.aG(paramBundle);
        paramBundle = new r(1);
        g.DF().a(paramBundle, 0);
        getString(a.j.app_tip);
        this.eHw = h.a(this, getString(a.j.app_loading), false, null);
        return;
      }
      catch (IOException paramBundle)
      {
        for (;;)
        {
          com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicorMsg.RegByMobileSetPwdUI", paramBundle, "summersetpwd Failed parse autoauthkey buf", new Object[0]);
        }
      }
    }
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    g.DF().b(384, this);
    g.DF().b(255, this);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    paramIntent = paramIntent.getStringExtra("setpwd_ticket");
    com.tencent.mm.sdk.platformtools.x.i("MicorMsg.RegByMobileSetPwdUI", "onNewIntent get reset pwd ticket %s", new Object[] { paramIntent });
    if (!bi.oW(paramIntent))
    {
      this.bLe = paramIntent;
      this.eVF = 4;
      this.eVA.setVisibility(8);
      this.eVx.setVisibility(8);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */