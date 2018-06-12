package com.tencent.mm.plugin.account.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.os.Bundle;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.model.at;
import com.tencent.mm.modelsimple.s;
import com.tencent.mm.plugin.account.a.a;
import com.tencent.mm.plugin.account.a.c;
import com.tencent.mm.plugin.account.a.d;
import com.tencent.mm.plugin.account.a.f;
import com.tencent.mm.plugin.account.a.g;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.ui.d.k;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.al.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.c;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.applet.SecurityImage.a;
import com.tencent.mm.ui.base.h;
import java.io.File;

public class RegByMobileSendSmsUI
  extends MMActivity
  implements com.tencent.mm.ab.e
{
  private String bLe;
  private String bgn;
  private int countDown = 15;
  private String ePV = "";
  private g eSA;
  private String eSE = "";
  private String eSH;
  private int eTw;
  private boolean eUM;
  private String eVe = "";
  private String eVf = "";
  private ProgressDialog eVg;
  private int eVh;
  private Button eVi;
  private Button eVj;
  private al eVk;
  private SecurityImage eVl;
  
  private void SO()
  {
    if (this.eVk != null) {
      this.eVk.SO();
    }
    this.eVj.setText(a.j.regbymobile_reg_no_sim_send_sms_btn_title);
    this.eVj.setEnabled(true);
  }
  
  private void goBack()
  {
    h.a(this, getString(a.j.regbymobile_reg_quit_send_sms), "", new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        RegByMobileSendSmsUI.q(RegByMobileSendSmsUI.this);
        RegByMobileSendSmsUI.this.finish();
      }
    }, null);
  }
  
  private k pQ(String paramString)
  {
    k localk = new k(paramString);
    x.d("MicroMsg.RegByMobileSendSmsUI", "content: %s", new Object[] { paramString });
    int i = paramString.indexOf(' ') + 1;
    localk.setSpan(new AbsoluteSizeSpan(getResources().getDimensionPixelSize(a.d.HugersTextSize)), i, paramString.length(), 33);
    localk.setSpan(new ForegroundColorSpan(getResources().getColor(a.c.green_text_color)), i, paramString.length(), 33);
    return localk;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.i("MicroMsg.RegByMobileSendSmsUI", "errType %s, errCode %d, errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (this.eVg != null) {
      this.eVg.dismiss();
    }
    if ((paraml.getType() == 145) && (((com.tencent.mm.modelfriend.a)paraml).Oh() == 15))
    {
      paraml = (com.tencent.mm.modelfriend.a)paraml;
      this.bLe = paraml.Oj();
      if (paramInt2 == 0)
      {
        SO();
        if (this.eTw == 1)
        {
          com.tencent.mm.kernel.g.DF().a(126, this);
          paramString = new s("", this.eSH, this.bgn, 0, "", this.eVe, "", "", this.bLe, 1, "", "", "", true, this.eUM);
          paramString.mX(this.eSE);
          paramString.im(1);
          com.tencent.mm.kernel.g.DF().a(paramString, 0);
          getString(a.j.app_tip);
          this.eVg = h.a(this, getString(a.j.regbyqq_reg_waiting), true, new RegByMobileSendSmsUI.11(this, paramString));
        }
      }
    }
    do
    {
      do
      {
        do
        {
          do
          {
            return;
            paramString = new Intent();
            paramString.putExtra("regsetinfo_ticket", this.bLe);
            paramString.putExtra("regsetinfo_user", this.eVe);
            paramString.putExtra("regsession_id", this.eSE);
            paramString.putExtra("mobile_check_type", 1);
            paramString.putExtra("regsetinfo_ismobile", 4);
            paramString.putExtra("regsetinfo_NextControl", paraml.Op());
            paramString.putExtra("key_reg_style", this.eTw);
            paramString.setClass(this, RegSetInfoUI.class);
            startActivity(paramString);
            return;
            if (paramInt2 == -35)
            {
              SO();
              paramString = com.tencent.mm.h.a.eV(paramString);
              if (paramString != null)
              {
                paramString.a(this, new RegByMobileSendSmsUI.12(this, paraml), new RegByMobileSendSmsUI.13(this));
                return;
              }
              h.a(this, getString(a.j.bind_mcontact_already_bind_relogin), null, new RegByMobileSendSmsUI.14(this, paraml), new RegByMobileSendSmsUI.15(this));
              return;
            }
            if (paramInt2 == 65324)
            {
              SO();
              paramString = new Intent(this, MobileLoginOrForceReg.class);
              paramString.putExtra("ticket", this.bLe);
              paramString.putExtra("moble", this.eVe);
              paramString.putExtra("regsession_id", this.eSE);
              paramString.putExtra("next_controll", paraml.Op());
              paramString.putExtra("username", paraml.getUsername());
              paramString.putExtra("password", this.eSH);
              paramString.putExtra("nickname", paraml.Ov());
              paramString.putExtra("avatar_url", paraml.Ou());
              paramString.putExtra("mobile_check_type", 1);
              paramString.putExtra("kintent_hasavatar", this.eUM);
              paramString.putExtra("kintent_nickname", this.bgn);
              paramString.putExtra("kintent_password", this.eSH);
              paramString.putExtra("key_reg_style", this.eTw);
              startActivity(paramString);
              return;
            }
          } while ((bi.oW(paramString)) || (this.eVh < 4));
          paramString = com.tencent.mm.h.a.eV(paramString);
        } while ((paramString == null) || (!paramString.a(this, null, null)));
        return;
      } while (paraml.getType() != 126);
      s locals = (s)paraml;
      if ((paramInt2 == -6) || (paramInt2 == 65225) || (paramInt2 == 65226))
      {
        if (this.eVl == null)
        {
          this.eVl = SecurityImage.a.a(this, a.j.regbyqq_secimg_title, 0, locals.Rf(), locals.Re(), "", new RegByMobileSendSmsUI.16(this, locals), null, new RegByMobileSendSmsUI.2(this), new RegByMobileSendSmsUI.3(this, locals));
          return;
        }
        this.eVl.a(0, ((s)paraml).Rf(), ((s)paraml).Re(), "");
        return;
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = this.eVe;
        com.tencent.mm.kernel.a.unhold();
        com.tencent.mm.kernel.a.bt(true);
        if (this.eUM)
        {
          paraml = com.tencent.mm.compatible.util.e.dgs + "temp.avatar";
          String str = com.tencent.mm.compatible.util.e.dgs + "temp.avatar.hd";
          new File(paraml).renameTo(new File(str));
          com.tencent.mm.a.e.deleteFile(paraml);
          c.c(str, 96, 96, Bitmap.CompressFormat.JPEG, 90, paraml);
          new com.tencent.mm.aa.o(this, com.tencent.mm.compatible.util.e.dgs + "temp.avatar").a(new RegByMobileSendSmsUI.4(this, locals, paramString), new RegByMobileSendSmsUI.5(this, locals, paramString));
          return;
        }
        this.bLe = locals.Rn();
        at.dBv.T("login_user_name", paramString);
        paramString = com.tencent.mm.plugin.account.a.a.ezn.be(this);
        paramString.addFlags(67108864);
        paramString.putExtra("LauncherUI.enter_from_reg", true);
        startActivity(paramString);
        finish();
        com.tencent.mm.plugin.c.a.pU("RE900_100");
        paramString = new StringBuilder();
        com.tencent.mm.kernel.g.Eg();
        paramString = paramString.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",R200_600,");
        com.tencent.mm.kernel.g.Eg();
        com.tencent.mm.plugin.c.a.d(false, com.tencent.mm.kernel.a.gd("R200_600") + ",4");
        return;
      }
      paramString = com.tencent.mm.h.a.eV(paramString);
    } while (paramString == null);
    paramString.a(this, null, null);
  }
  
  protected final int getLayoutId()
  {
    return a.g.regbymobile_send_sms;
  }
  
  protected final void initView()
  {
    super.initView();
    ((TextView)findViewById(a.f.send_sms_tip)).setText(getString(a.j.regbymobile_reg_send_sms_tip, new Object[] { this.eVe }));
    ((TextView)findViewById(a.f.send_sms_content)).setText(pQ(getString(a.j.regbymobile_reg_send_sms_content, new Object[] { this.ePV })));
    ((TextView)findViewById(a.f.send_sms_to)).setText(pQ(getString(a.j.regbymobile_reg_send_sms_to, new Object[] { this.eVf })));
    this.eVi = ((Button)findViewById(a.f.send_sms_btn));
    this.eVj = ((Button)findViewById(a.f.go_to_reg_btn));
    if (bi.G(new String[] { this.eVe, this.eVf, this.ePV }))
    {
      this.eVi.setEnabled(false);
      this.eVj.setEnabled(false);
      if (!bi.oW(q.getSimCountryIso())) {
        break label236;
      }
      this.eVi.setVisibility(8);
    }
    for (;;)
    {
      setMMTitle(a.j.regbymobile_reg_send_sms_title);
      setBackBtn(new RegByMobileSendSmsUI.10(this));
      return;
      this.eVj.setOnClickListener(new RegByMobileSendSmsUI.1(this));
      break;
      label236:
      this.eVi.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          paramAnonymousView = new Intent();
          paramAnonymousView.setAction("android.intent.action.SENDTO");
          paramAnonymousView.setData(Uri.parse("smsto:" + RegByMobileSendSmsUI.b(RegByMobileSendSmsUI.this)));
          paramAnonymousView.putExtra("sms_body", RegByMobileSendSmsUI.c(RegByMobileSendSmsUI.this));
          try
          {
            RegByMobileSendSmsUI.this.startActivity(paramAnonymousView);
            RegByMobileSendSmsUI.this.overridePendingTransition(a.a.slide_right_in, a.a.slide_left_out);
            return;
          }
          catch (Exception paramAnonymousView)
          {
            x.e("MicroMsg.RegByMobileSendSmsUI", paramAnonymousView.getMessage());
          }
        }
      });
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.eTw = getIntent().getIntExtra("key_reg_style", 1);
    this.eVe = bi.oV(getIntent().getStringExtra("from_mobile"));
    this.eVf = bi.oV(getIntent().getStringExtra("to_mobile"));
    this.ePV = bi.oV(getIntent().getStringExtra("verify_code"));
    this.eSE = bi.oV(getIntent().getStringExtra("regsession_id"));
    this.bgn = bi.oV(getIntent().getStringExtra("kintent_nickname"));
    this.eSH = bi.oV(getIntent().getStringExtra("kintent_password"));
    this.eUM = getIntent().getBooleanExtra("kintent_hasavatar", false);
    initView();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      goBack();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onResume()
  {
    super.onResume();
    com.tencent.mm.kernel.g.DF().a(145, this);
  }
  
  protected void onStop()
  {
    super.onStop();
    SO();
    com.tencent.mm.kernel.g.DF().b(145, this);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/account/ui/RegByMobileSendSmsUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */