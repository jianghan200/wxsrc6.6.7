package com.tencent.mm.plugin.account.bind.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.account.a.f;
import com.tencent.mm.plugin.account.a.g;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.a;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.c.xt;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.MMSwitchBtn;
import com.tencent.mm.ui.widget.MMSwitchBtn.a;

public class BindLinkedInUI
  extends MMActivity
  implements com.tencent.mm.ab.e
{
  private String csV;
  private String csW;
  private ProgressDialog dId;
  private boolean eFA = false;
  private TextView eFB;
  private TextView eFC;
  private View eFD;
  private MMSwitchBtn eFE;
  private TextView eFF;
  private TextView eFG;
  private TextView eFH;
  private String eFI;
  private String eFJ;
  private String eFK;
  private String eFL;
  private boolean eFt = false;
  private String eFu;
  private boolean eFv = false;
  private boolean eFw = false;
  private boolean eFx = false;
  private Bundle eFy;
  private boolean eFz = false;
  private String name;
  private int status;
  
  private void Wj()
  {
    boolean bool2 = true;
    this.eFu = ((String)com.tencent.mm.kernel.g.Ei().DT().get(286721, null));
    if (!bi.oW(this.eFu))
    {
      bool1 = true;
      this.eFt = bool1;
      this.name = ((String)com.tencent.mm.kernel.g.Ei().DT().get(286722, null));
      this.status = q.GJ();
      if ((this.status & 0x400000) == 0) {
        break label87;
      }
    }
    label87:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.eFv = bool1;
      return;
      bool1 = false;
      break;
    }
  }
  
  private void a(boolean paramBoolean1, boolean paramBoolean2, String paramString, boolean paramBoolean3)
  {
    this.eFH.setVisibility(8);
    if (paramBoolean1)
    {
      this.eFC.setVisibility(8);
      this.eFB.setVisibility(0);
      ph(paramString);
      this.eFD.setVisibility(0);
      this.eFF.setVisibility(8);
      if (paramBoolean2) {
        this.eFG.setVisibility(0);
      }
      this.eFE.setCheck(paramBoolean3);
      this.eFE.setSwitchListener(new BindLinkedInUI.3(this));
      return;
    }
    this.eFB.setVisibility(8);
    this.eFB.setText(getString(a.j.contact_info_linkedin_account_info_unbind));
    this.eFC.setVisibility(0);
    this.eFD.setVisibility(8);
    this.eFF.setVisibility(0);
    this.eFG.setVisibility(8);
  }
  
  private void aL()
  {
    int i = 1;
    if ((this.eFw) && (this.eFy == null))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BindLinkedInUI", "bindBundle is null");
      return;
    }
    if (this.eFx)
    {
      a(this.eFt, false, this.name, this.eFv);
      return;
    }
    if (this.eFw)
    {
      if ((this.eFt) && (this.eFu.equals(this.csV))) {}
      boolean bool;
      for (;;)
      {
        String str = this.csW;
        bool = this.eFv;
        this.eFB.setVisibility(0);
        ph(str);
        this.eFD.setVisibility(0);
        this.eFG.setVisibility(8);
        if (i == 0) {
          break;
        }
        this.eFC.setVisibility(8);
        this.eFF.setVisibility(8);
        this.eFH.setVisibility(8);
        this.eFE.setCheck(bool);
        this.eFE.setSwitchListener(new MMSwitchBtn.a()
        {
          public final void cf(boolean paramAnonymousBoolean)
          {
            BindLinkedInUI.a(BindLinkedInUI.this, paramAnonymousBoolean, true);
          }
        });
        return;
        i = 0;
      }
      this.eFC.setVisibility(0);
      this.eFF.setVisibility(0);
      this.eFH.setVisibility(0);
      this.eFE.setCheck(bool);
      this.eFE.setSwitchListener(new BindLinkedInUI.2(this));
      return;
    }
    a(this.eFt, true, this.name, this.eFv);
  }
  
  private void ce(boolean paramBoolean)
  {
    if (this.eFy == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BindLinkedInUI", "bindBundle is null !!");
      return;
    }
    if (this.eFE.uGQ) {}
    for (int i = 1;; i = 2)
    {
      final com.tencent.mm.plugin.account.bind.a.a locala = new com.tencent.mm.plugin.account.bind.a.a(i, this.csV, this.csW, "", this.eFI, this.eFJ, this.eFK, this.eFL);
      if (!paramBoolean) {
        this.dId = h.a(this, getString(a.j.loading_tips), false, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            com.tencent.mm.kernel.g.DF().c(locala);
          }
        });
      }
      com.tencent.mm.kernel.g.DF().a(locala, 0);
      return;
    }
  }
  
  private void goBack()
  {
    if (this.eFw)
    {
      if (this.eFA)
      {
        Intent localIntent = com.tencent.mm.plugin.account.a.a.ezn.be(this);
        localIntent.addFlags(603979776);
        localIntent.putExtra("preferred_tab", 2);
        startActivity(localIntent);
        return;
      }
      setResult(-1);
      finish();
      return;
    }
    setResult(-1);
    finish();
  }
  
  private void m(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1)
    {
      this.status |= 0x400000;
      if (!paramBoolean1) {
        break label119;
      }
    }
    label119:
    for (int i = 1;; i = 2)
    {
      com.tencent.mm.kernel.g.Ei().DT().set(7, Integer.valueOf(this.status));
      if (paramBoolean2)
      {
        xt localxt = new xt();
        localxt.rDz = 33;
        localxt.rDA = i;
        ((i)com.tencent.mm.kernel.g.l(i.class)).FQ().b(new h.a(23, localxt));
        com.tencent.mm.plugin.account.a.a.ezo.vl();
      }
      return;
      this.status &= 0xFFBFFFFF;
      break;
    }
  }
  
  private void ph(String paramString)
  {
    int i = getString(a.j.contact_info_linkedin_account_info_binded).indexOf("%s");
    Object localObject = getString(a.j.contact_info_linkedin_account_info_binded, new Object[] { paramString });
    localObject = Spannable.Factory.getInstance().newSpannable((CharSequence)localObject);
    ((Spannable)localObject).setSpan(new BindLinkedInUI.12(this), i, paramString.length() + i, 33);
    this.eFB.setText((CharSequence)localObject);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    if (this.dId != null)
    {
      this.dId.dismiss();
      this.dId = null;
    }
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      if (paraml.getType() == 549) {
        if (paramInt2 == 1) {
          paramInt1 = a.j.contact_info_linkedin_err_bound;
        }
      }
      for (;;)
      {
        h.b(this, getString(paramInt1), null, true);
        do
        {
          return;
          paramInt1 = a.j.contact_info_linkedin_err_bind_failed;
          break;
        } while (paraml.getType() != 550);
        paramInt1 = a.j.contact_info_linkedin_err_unbind_failed;
      }
    }
    if (paraml.getType() == 549)
    {
      this.eFA = true;
      if (!this.eFz) {
        paramInt1 = a.j.contact_info_linkedin_bind_ok;
      }
    }
    for (;;)
    {
      paramString = getString(paramInt1);
      new BindLinkedInUI.5(this);
      h.bA(this, paramString);
      Wj();
      this.eFv = this.eFE.uGQ;
      aL();
      return;
      paramInt1 = a.j.contact_info_linkedin_bind_update_ok;
      continue;
      if (paraml.getType() != 550) {
        break;
      }
      paramInt1 = a.j.contact_info_linkedin_unbind_ok;
    }
  }
  
  protected final int getLayoutId()
  {
    return a.g.bindlinkedin;
  }
  
  protected final void initView()
  {
    if (this.eFw) {
      setMMTitle(a.j.contact_info_linkedin_qrcode_title);
    }
    for (;;)
    {
      this.eFB = ((TextView)findViewById(a.f.setting_bind_linkedin_account));
      this.eFC = ((TextView)findViewById(a.f.setting_bind_linkedin_brief));
      this.eFD = findViewById(a.f.show_name_option);
      this.eFE = ((MMSwitchBtn)findViewById(a.f.show_name_checkbox));
      this.eFF = ((TextView)findViewById(a.f.bind_linkedin_btn));
      this.eFG = ((TextView)findViewById(a.f.unbind_linkedin_btn));
      this.eFH = ((TextView)findViewById(a.f.cancel_bind_linkedin_btn));
      this.eFB.setOnClickListener(new BindLinkedInUI.6(this));
      this.eFF.setOnClickListener(new BindLinkedInUI.7(this));
      this.eFG.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          h.a(BindLinkedInUI.this, BindLinkedInUI.this.getString(a.j.contact_info_linkedin_account_unbind_alert), null, new BindLinkedInUI.8.1(this), new BindLinkedInUI.8.2(this));
        }
      });
      this.eFH.setOnClickListener(new BindLinkedInUI.9(this));
      setBackBtn(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          BindLinkedInUI.a(BindLinkedInUI.this);
          return true;
        }
      });
      aL();
      return;
      if (this.eFx) {
        setMMTitle(a.j.contact_info_linkedin_title);
      } else {
        setMMTitle(a.j.contact_info_linkedin_bind_info);
      }
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.BindLinkedInUI", "onActivityResult . requestCode:" + paramInt1 + "  resultCode:" + paramInt2);
    if (paramIntent == null) {
      return;
    }
    switch (paramInt1)
    {
    default: 
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BindLinkedInUI", "onActivityResult unknow request");
      return;
    }
    Object localObject = paramIntent.getBundleExtra("result_data");
    paramIntent = ((Bundle)localObject).getString("ret");
    String str1 = ((Bundle)localObject).getString("limid");
    String str2 = ((Bundle)localObject).getString("liname");
    String str3 = ((Bundle)localObject).getString("liurl");
    localObject = ((Bundle)localObject).getString("liswitch");
    if (bi.oW(paramIntent))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BindLinkedInUI", "linkedin oauth ret is null, maybe canceled");
      return;
    }
    paramInt1 = bi.WU(paramIntent);
    if (paramInt1 != 0)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BindLinkedInUI", "linkedin oauth bind failed ret %s ", new Object[] { Integer.valueOf(paramInt1) });
      if (paramInt1 == 1) {}
      for (paramInt1 = a.j.contact_info_linkedin_err_bound;; paramInt1 = a.j.contact_info_linkedin_err_bind_failed)
      {
        h.b(this, getString(paramInt1), null, true);
        return;
      }
    }
    if (bi.oW(str1))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BindLinkedInUI", "linkedin member id is null");
      return;
    }
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.BindLinkedInUI", "%s, %s, %s, %s", new Object[] { str1, str2, str3, localObject });
    com.tencent.mm.kernel.g.Ei().DT().set(286722, str2);
    com.tencent.mm.kernel.g.Ei().DT().set(286721, str1);
    com.tencent.mm.kernel.g.Ei().DT().set(286723, str3);
    if (!bi.oW((String)localObject)) {
      if (bi.WU((String)localObject) != 1) {
        break label344;
      }
    }
    label344:
    for (boolean bool = true;; bool = false)
    {
      m(bool, false);
      Wj();
      aL();
      paramIntent = getString(a.j.contact_info_linkedin_bind_ok);
      new BindLinkedInUI.4(this);
      h.bA(this, paramIntent);
      return;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    com.tencent.mm.kernel.g.DF().a(549, this);
    com.tencent.mm.kernel.g.DF().a(550, this);
    this.eFy = getIntent().getBundleExtra("qrcode_bundle");
    if (this.eFy != null) {}
    for (boolean bool = true;; bool = false)
    {
      this.eFw = bool;
      if (this.eFy != null)
      {
        this.csV = this.eFy.getString("i");
        this.csW = this.eFy.getString("n");
        this.eFI = this.eFy.getString("t");
        this.eFJ = this.eFy.getString("o");
        this.eFK = this.eFy.getString("s");
        this.eFL = this.eFy.getString("r");
        if ((this.csV == null) || (this.csW == null) || (this.eFI == null) || (this.eFK == null) || (this.eFL == null)) {
          h.a(this, getString(a.j.contact_info_linkedin_account_params_error), null, false, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              BindLinkedInUI.a(BindLinkedInUI.this);
            }
          });
        }
      }
      this.eFx = getIntent().getBooleanExtra("oversea_entry", false);
      Wj();
      if (this.eFw) {
        this.eFv = true;
      }
      initView();
      if ((this.eFy != null) && (this.eFt) && (this.eFu.equals(this.csV)))
      {
        this.eFz = true;
        ce(true);
      }
      return;
    }
  }
  
  protected void onDestroy()
  {
    com.tencent.mm.kernel.g.DF().b(550, this);
    com.tencent.mm.kernel.g.DF().b(549, this);
    super.onDestroy();
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
  
  protected void onPause()
  {
    super.onPause();
  }
  
  protected void onResume()
  {
    super.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/account/bind/ui/BindLinkedInUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */