package com.tencent.mm.plugin.account.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.bg.a;
import com.tencent.mm.modelsimple.q;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.account.a.f;
import com.tencent.mm.plugin.account.a.g;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.plugin.account.model.c.1;
import com.tencent.mm.plugin.account.model.c.a;
import com.tencent.mm.plugin.comm.a.h;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.model.app.d;
import com.tencent.mm.pluginsdk.model.app.w;
import com.tencent.mm.pluginsdk.model.app.w.1;
import com.tencent.mm.pluginsdk.model.app.w.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.applet.SecurityImage.a;
import com.tencent.mm.ui.base.MMClearEditText;
import com.tencent.mm.ui.base.MMFormInputView;
import com.tencent.mm.ui.s;
import com.tencent.mm.xlog.app.XLogSetup;
import java.util.Iterator;
import java.util.LinkedList;

public class SimpleLoginUI
  extends MMWizardActivity
  implements com.tencent.mm.ab.e
{
  private TextWatcher UE = new SimpleLoginUI.1(this);
  private String cbP = "";
  private ProgressDialog eHw = null;
  private SecurityImage eIX = null;
  private String eOW;
  private f eQY = new f();
  private com.tencent.mm.sdk.b.c eQf = new SimpleLoginUI.12(this);
  private MMClearEditText eRX;
  private MMClearEditText eRY;
  private MMFormInputView eRZ;
  private String eRa;
  private String eRb;
  private ResizeLayout eRf;
  private MMFormInputView eSa;
  private Button eSb;
  private MMKeyboardUperView eSh;
  
  private void WL()
  {
    boolean bool = getIntent().getBooleanExtra("key_auto_login_wizard_exit", false);
    if (!bool) {
      cancel();
    }
    DT(1);
    if (bool) {
      exit(1);
    }
  }
  
  private void Yz()
  {
    this.eQY.account = this.eRX.getText().toString().trim();
    this.eQY.eIY = this.eRY.getText().toString();
    if (this.eQY.account.equals(""))
    {
      com.tencent.mm.ui.base.h.i(this, a.j.verify_username_null_tip, a.j.login_err_title);
      return;
    }
    if (this.eQY.eIY.equals(""))
    {
      com.tencent.mm.ui.base.h.i(this, a.j.verify_password_null_tip, a.j.login_err_title);
      return;
    }
    YC();
    q localq = new q(this.eQY.account, this.eQY.eIY, this.eOW, 0);
    com.tencent.mm.kernel.g.DF().a(localq, 0);
    getString(a.j.app_tip);
    this.eHw = com.tencent.mm.ui.base.h.a(this, getString(a.j.login_logining), true, new SimpleLoginUI.5(this, localq));
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SimpleLoginUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SimpleLoginUI", "Scene Type " + paraml.getType());
    if (this.eHw != null)
    {
      this.eHw.dismiss();
      this.eHw = null;
    }
    this.cbP = ((q)paraml).Rd();
    int i;
    if (paraml.getType() == 701)
    {
      this.eQY.eRQ = ((q)paraml).getSecCodeType();
      this.eQY.eJa = ((q)paraml).Re();
      this.eQY.eIZ = ((q)paraml).Rf();
      this.eQY.eJb = ((q)paraml).Rg();
      if (paramInt2 == 65331)
      {
        this.eOW = ((q)paraml).Ok();
        this.eRa = ((q)paraml).Rh();
        this.eRb = ((q)paraml).Rk();
      }
      if ((paramInt1 == 4) && ((paramInt2 == -16) || (paramInt2 == -17)))
      {
        i = 1;
        com.tencent.mm.kernel.g.DF().a(new bg(new bg.a()
        {
          public final void a(com.tencent.mm.network.e paramAnonymouse)
          {
            if (paramAnonymouse == null) {
              return;
            }
            paramAnonymouse = paramAnonymouse.Lr();
            com.tencent.mm.kernel.g.Eg();
            int i = com.tencent.mm.kernel.a.Df();
            paramAnonymouse.x(new byte[0], i);
          }
        }), 0);
      }
    }
    for (;;)
    {
      if ((i != 0) || ((paramInt1 == 0) && (paramInt2 == 0)))
      {
        com.tencent.mm.kernel.a.unhold();
        com.tencent.mm.platformtools.x.bZ(this);
        aa.oS(this.eQY.account);
        paramString = new com.tencent.mm.plugin.account.model.c(this.mController.tml, new c.a()
        {
          public final void Yk()
          {
            String str = null;
            w localw = new w(SimpleLoginUI.this, new SimpleLoginUI.11.1(this));
            Object localObject1 = ad.chZ();
            if (localObject1 != null)
            {
              localObject1 = ((SharedPreferences)localObject1).getString("key_app_ids_registion_while_not_login", "");
              if (bi.oW((String)localObject1)) {
                com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AppUtil", "no saved appids while not login");
              }
            }
            else
            {
              localObject1 = null;
            }
            Object localObject2;
            for (;;)
            {
              localObject2 = str;
              if (localObject1 == null) {
                break label245;
              }
              localObject2 = str;
              if (((LinkedList)localObject1).isEmpty()) {
                break label245;
              }
              localObject2 = new LinkedList();
              localObject1 = ((LinkedList)localObject1).iterator();
              com.tencent.mm.pluginsdk.model.app.f localf;
              while (((Iterator)localObject1).hasNext())
              {
                str = (String)((Iterator)localObject1).next();
                localf = com.tencent.mm.pluginsdk.model.app.g.bl(str, false);
                if ((localf == null) || (localf.field_status == 0)) {
                  ((LinkedList)localObject2).add(str);
                }
              }
              localObject2 = ((String)localObject1).split("\\|");
              if ((localObject2 == null) || (localObject2.length <= 0)) {
                break;
              }
              localObject1 = new LinkedList();
              int m = localObject2.length;
              int i = 0;
              int k;
              for (int j = 1; i < m; j = k)
              {
                localf = localObject2[i];
                k = j;
                if (!bi.oW(localf))
                {
                  ((LinkedList)localObject1).add(localf);
                  k = j + 1;
                }
                if (k > 5) {
                  break;
                }
                i += 1;
              }
            }
            label245:
            if ((localObject2 == null) || (((LinkedList)localObject2).isEmpty()))
            {
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LoadAppInfoAfterLogin", "no saved appids, just callback");
              com.tencent.mm.pluginsdk.model.app.g.cbM();
              if (localw.qAa != null) {
                localw.qAa.Zq();
              }
              return;
            }
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LoadAppInfoAfterLogin", "now do batch get appinfos, appid liSst size is :%d", new Object[] { Integer.valueOf(((LinkedList)localObject2).size()) });
            com.tencent.mm.plugin.ac.a.bmi().a(7, localw);
            com.tencent.mm.plugin.ac.a.bme().ap((LinkedList)localObject2);
            if ((localw.mContext != null) && (!((Activity)localw.mContext).isFinishing()))
            {
              localObject1 = localw.mContext;
              localw.mContext.getString(a.h.app_tip);
              localw.tipDialog = com.tencent.mm.ui.base.h.a((Context)localObject1, localw.mContext.getString(a.h.app_waiting), true, new w.1(localw));
              return;
            }
            if (localw.qAa != null) {
              localw.qAa.Zq();
            }
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.LoadAppInfoAfterLogin", "dz[loadAppInfo:catch the null window for progress bar");
          }
        });
        paramString.bKq = com.tencent.mm.plugin.account.a.a.ezo.a(paramString);
        if (paramString.bKq == null) {
          if (paramString.eNU != null) {
            paramString.eNU.Yk();
          }
        }
      }
      label1150:
      for (;;)
      {
        return;
        if (paramString.bKq.getType() == 139) {
          com.tencent.mm.kernel.g.DF().a(139, paramString);
        }
        for (;;)
        {
          com.tencent.mm.kernel.g.DF().a(paramString.bKq, 0);
          paraml = paramString.context;
          paramString.context.getString(a.j.app_tip);
          paramString.tipDialog = com.tencent.mm.ui.base.h.a(paraml, paramString.context.getString(a.j.app_loading_data), true, new c.1(paramString));
          return;
          if (paramString.bKq.getType() == 138) {
            com.tencent.mm.kernel.g.DF().a(138, paramString);
          }
        }
        if (paramInt2 == 65319)
        {
          aa.a(this, com.tencent.mm.platformtools.f.a((q)paraml), paramInt2);
          return;
        }
        if (com.tencent.mm.plugin.account.a.a.ezo.a(this.mController.tml, paramInt1, paramInt2, paramString)) {
          i = 1;
        }
        for (;;)
        {
          if (i != 0) {
            break label1150;
          }
          paramString = com.tencent.mm.h.a.eV(paramString);
          if ((paramString != null) && (paramString.a(this, null, null))) {
            break;
          }
          Toast.makeText(this, getString(a.j.fmt_auth_err, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
          return;
          if (paramInt1 == 4) {}
          switch (paramInt2)
          {
          default: 
            i = 0;
            break;
          case -1: 
            if (com.tencent.mm.kernel.g.DF().Lg() == 5)
            {
              com.tencent.mm.ui.base.h.i(this, a.j.net_warn_server_down_tip, a.j.net_warn_server_down);
              i = 1;
            }
            break;
          case -30: 
          case -4: 
          case -3: 
            com.tencent.mm.ui.base.h.i(this, a.j.errcode_password, a.j.login_err_title);
            i = 1;
            break;
          case -9: 
            com.tencent.mm.ui.base.h.i(this, a.j.login_err_mailnotverify, a.j.login_err_title);
            i = 1;
            break;
          case -72: 
            com.tencent.mm.ui.base.h.i(this.mController.tml, a.j.regbyqq_auth_err_failed_niceqq, a.j.app_tip);
            i = 1;
            break;
          case -75: 
            aa.ch(this.mController.tml);
            i = 1;
            break;
          case -311: 
          case -310: 
          case -6: 
            if (this.eIX == null) {
              this.eIX = SecurityImage.a.a(this.mController.tml, a.j.regbyqq_secimg_title, this.eQY.eRQ, this.eQY.eIZ, this.eQY.eJa, this.eQY.eJb, new SimpleLoginUI.6(this), null, new SimpleLoginUI.7(this), this.eQY);
            }
            for (;;)
            {
              i = 1;
              break;
              com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SimpleLoginUI", "imgSid:" + this.eQY.eJa + " img len" + this.eQY.eIZ.length + " " + com.tencent.mm.compatible.util.g.Ac());
              this.eIX.a(this.eQY.eRQ, this.eQY.eIZ, this.eQY.eJa, this.eQY.eJb);
            }
          case -100: 
            com.tencent.mm.kernel.a.hold();
            com.tencent.mm.kernel.g.Eg();
            com.tencent.mm.ui.base.h.a(this, com.tencent.mm.kernel.a.Dh(), getString(a.j.app_tip), new SimpleLoginUI.8(this), new SimpleLoginUI.9(this));
            i = 1;
            break;
          case -205: 
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SimpleLoginUI", "summerphone MM_ERR_QQ_OK_NEED_MOBILE authTicket[%s], closeShowStyle[%s]", new Object[] { bi.Xf(this.eOW), this.eRb });
            f.a(this.eQY);
            paraml = new Intent();
            paraml.putExtra("auth_ticket", this.eOW);
            paraml.putExtra("binded_mobile", this.eRa);
            paraml.putExtra("close_safe_device_style", this.eRb);
            paraml.putExtra("from_source", 3);
            com.tencent.mm.plugin.account.a.a.ezn.g(this, paraml);
            i = 1;
            break;
          case -140: 
            if (!bi.oW(this.cbP)) {
              aa.n(this, paramString, this.cbP);
            }
            i = 1;
            break;
          case -106: 
            aa.e(this, paramString, 0);
            i = 1;
          }
        }
      }
      i = 0;
    }
  }
  
  protected final int getLayoutId()
  {
    return a.g.login;
  }
  
  protected final void initView()
  {
    this.eRZ = ((MMFormInputView)findViewById(a.f.login_account_auto));
    this.eSa = ((MMFormInputView)findViewById(a.f.login_password_et));
    this.eRX = ((MMClearEditText)this.eRZ.getContentEditText());
    this.eRX.setFocusableInTouchMode(false);
    this.eRX.setOnTouchListener(new SimpleLoginUI.14(this));
    this.eRY = ((MMClearEditText)this.eSa.getContentEditText());
    this.eRY.setFocusableInTouchMode(false);
    this.eRY.setOnTouchListener(new SimpleLoginUI.15(this));
    com.tencent.mm.ui.tools.a.c.d(this.eRY).Gi(16).a(null);
    this.eSb = ((Button)findViewById(a.f.login_btn));
    this.eSb.setEnabled(false);
    this.eRX.addTextChangedListener(this.UE);
    this.eRY.addTextChangedListener(this.UE);
    this.eRY.setOnEditorActionListener(new SimpleLoginUI.16(this));
    this.eRY.setOnKeyListener(new SimpleLoginUI.17(this));
    this.eRf = ((ResizeLayout)findViewById(a.f.resize_lv));
    this.eSh = ((MMKeyboardUperView)findViewById(a.f.scrollView));
    this.eRf.setOnSizeChanged(new ResizeLayout.a()
    {
      public final void YE()
      {
        SimpleLoginUI.e(SimpleLoginUI.this).post(new Runnable()
        {
          public final void run()
          {
            SimpleLoginUI.e(SimpleLoginUI.this).fullScroll(130);
          }
        });
      }
    });
    this.eSh.setOnTouchListener(new SimpleLoginUI.19(this));
    findViewById(a.f.login_by_other).setVisibility(8);
    View localView = findViewById(a.f.fblogin_tip);
    if (localView != null) {
      localView.setVisibility(8);
    }
    setMMTitle(a.j.login_title);
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        SimpleLoginUI.f(SimpleLoginUI.this);
        return true;
      }
    });
    this.eOW = getIntent().getStringExtra("auth_ticket");
    if (!bi.oW(this.eOW))
    {
      this.eRX.setText(bi.oV(f.YF()));
      this.eRY.setText(bi.oV(f.YG()));
      new ag().postDelayed(new SimpleLoginUI.3(this), 500L);
    }
    if (com.tencent.mm.sdk.platformtools.e.sFE) {
      com.tencent.mm.plugin.account.a.a.ezo.g(this);
    }
    this.eSb.setOnClickListener(new SimpleLoginUI.4(this));
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    int i = 0;
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    boolean bool;
    String str;
    if (paramIntent == null)
    {
      bool = true;
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SimpleLoginUI", "onActivityResult, requestCode:%d, resultCode:%d, data==null:%b", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(bool) });
      if ((paramInt2 == -1) && (paramInt1 == 1024) && (paramIntent != null))
      {
        str = paramIntent.getStringExtra("VoiceLoginAuthPwd");
        paramInt2 = paramIntent.getIntExtra("KVoiceHelpCode", 0);
        bool = bi.oW(str);
        if (!bi.oW(str)) {
          break label155;
        }
      }
    }
    label155:
    for (paramInt1 = i;; paramInt1 = str.length())
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SimpleLoginUI", "onActivityResult, do voiceprint auth, authPwd is null:%b, authPwd.len:%d, lastErrCode:%d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      if (paramInt2 == 65319) {
        Yz();
      }
      return;
      bool = false;
      break;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    int i = 0;
    super.onCreate(paramBundle);
    paramBundle = getSharedPreferences("system_config_prefs", 4);
    if (paramBundle.getBoolean("first_launch_weixin", true))
    {
      paramBundle.edit().putBoolean("first_launch_weixin", false).commit();
      XLogSetup.realSetupXlog();
    }
    setMMTitle(a.j.app_name);
    if (com.tencent.mm.plugin.account.a.a.ezo != null) {
      com.tencent.mm.plugin.account.a.a.ezo.vo();
    }
    initView();
    com.tencent.mm.kernel.g.DF().a(701, this);
    boolean bool = com.tencent.mm.pluginsdk.permission.a.f(this, "android.permission.WRITE_EXTERNAL_STORAGE");
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MPermissionUtil", "summerper checkPermission checkStorage[%b]", new Object[] { Boolean.valueOf(bool) });
    if (!bool) {}
    for (;;)
    {
      if (i == 0)
      {
        new Intent().addFlags(67108864);
        com.tencent.mm.plugin.account.a.a.ezn.q(new Intent(), this);
      }
      return;
      bool = com.tencent.mm.pluginsdk.permission.a.f(this, "android.permission.READ_PHONE_STATE");
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MPermissionUtil", "summerper checkPermission checkPhone[%b]", new Object[] { Boolean.valueOf(bool) });
      if (bool) {
        i = 1;
      }
    }
  }
  
  public void onDestroy()
  {
    com.tencent.mm.kernel.g.DF().b(701, this);
    super.onDestroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      WL();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    this.eOW = paramIntent.getStringExtra("auth_ticket");
    paramIntent = getIntent().getExtras();
    if (paramIntent != null) {
      this.eOW = paramIntent.getString("auth_ticket");
    }
    if (!bi.oW(this.eOW))
    {
      this.eRX.setText(bi.oV(f.YF()));
      this.eRY.setText(bi.oV(f.YG()));
      new ag().postDelayed(new SimpleLoginUI.13(this), 500L);
    }
  }
  
  protected void onPause()
  {
    if (this.eHw != null)
    {
      this.eHw.dismiss();
      this.eHw = null;
    }
    super.onPause();
    com.tencent.mm.sdk.b.a.sFg.c(this.eQf);
  }
  
  public void onResume()
  {
    com.tencent.mm.sdk.b.a.sFg.b(this.eQf);
    super.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/account/ui/SimpleLoginUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */