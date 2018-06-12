package com.tencent.mm.plugin.webview.stub;

import android.annotation.TargetApi;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.view.Window;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.a.sk;
import com.tencent.mm.g.a.sk.a;
import com.tencent.mm.g.a.sk.b;
import com.tencent.mm.model.au;
import com.tencent.mm.model.q;
import com.tencent.mm.modelsimple.w;
import com.tencent.mm.plugin.account.ui.SimpleLoginUI;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.g;
import com.tencent.mm.pluginsdk.f.e.a;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.o.a;
import com.tencent.mm.pluginsdk.o.d;
import com.tencent.mm.pluginsdk.ui.d.l;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bl;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.d.b;

@com.tencent.mm.ui.base.a(7)
@d.b
public class WebViewStubProxyUI
  extends MMActivity
{
  private al bAZ = new al(new WebViewStubProxyUI.7(this), true);
  private int jgc = 0;
  private e pRY = null;
  private final e pUA = new WebViewStubProxyUI.5(this);
  private DialogInterface.OnDismissListener pUB = new WebViewStubProxyUI.6(this);
  private al pUC = new al(new WebViewStubProxyUI.8(this), true);
  public boolean pUx = false;
  private boolean pUy = false;
  private int pUz;
  
  protected final int getForceOrientation()
  {
    return getIntent().getIntExtra("screen_orientation", -1);
  }
  
  protected final int getLayoutId()
  {
    return -1;
  }
  
  @TargetApi(21)
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (com.tencent.mm.compatible.util.d.fR(21)) {
      getWindow().setStatusBarColor(0);
    }
    paramBundle = (WebViewStubCallbackWrapper)getIntent().getParcelableExtra("webview_stub_callbacker_key");
    if (paramBundle != null) {
      this.pRY = paramBundle.pXx;
    }
    paramBundle = getIntent();
    int i = paramBundle.getIntExtra("proxyui_action_code_key", 0);
    this.pUz = paramBundle.getIntExtra("webview_binder_id", 0);
    x.i("MicroMsg.WebViewStubProxyUI", "onCreate, actionCode = %d, binderID = %d", new Object[] { Integer.valueOf(i), Integer.valueOf(this.pUz) });
    if ("startMonitoringBeacons".equals(paramBundle.getStringExtra("proxyui_function_key"))) {
      this.pUx = true;
    }
    switch (i)
    {
    }
    final Object localObject;
    do
    {
      do
      {
        do
        {
          return;
          if (!this.pUy) {
            this.bAZ.J(100L, 100L);
          }
        } while (!this.pUx);
        this.pUC.J(5000L, 5000L);
        return;
        localObject = new sk();
        ((sk)localObject).bJX = new Runnable()
        {
          public final void run()
          {
            if (!localObject.cdj.cdk) {
              WebViewStubProxyUI.this.finish();
            }
            for (;;)
            {
              return;
              if (WebViewStubProxyUI.a(WebViewStubProxyUI.this) != null) {}
              try
              {
                WebViewStubProxyUI.a(WebViewStubProxyUI.this).c(1001, null);
                WebViewStubProxyUI.this.finish();
                e.a locala = com.tencent.mm.pluginsdk.f.e.qBn;
                if (locala == null) {
                  continue;
                }
                locala.bc(WebViewStubProxyUI.this);
                return;
              }
              catch (RemoteException localRemoteException)
              {
                for (;;)
                {
                  x.w("MicroMsg.WebViewStubProxyUI", "dealUpdate fail, ex = " + localRemoteException.getMessage());
                }
              }
            }
          }
        };
        ((sk)localObject).cdi.context = this;
        ((sk)localObject).cdi.type = paramBundle.getIntExtra("update_type_key", 0);
        if (((sk)localObject).cdi.type <= 0)
        {
          x.e("MicroMsg.WebViewStubProxyUI", "doUpdate fail, invalid type = " + ((sk)localObject).cdi.type);
          finish();
          return;
        }
        com.tencent.mm.sdk.b.a.sFg.a((b)localObject, Looper.myLooper());
        return;
        au.HU();
        paramBundle = com.tencent.mm.model.c.FZ().Hg("@t.qq.com");
        if (!q.Hm()) {
          paramBundle = com.tencent.mm.ui.base.h.a(this, R.l.contact_info_medianote_sync_to_qqmail_alert_tip, R.l.app_tip, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              com.tencent.mm.plugin.webview.a.a.ezn.h(new Intent(), WebViewStubProxyUI.this);
            }
          }, null);
        }
        while (paramBundle == null)
        {
          finish();
          return;
          if ((paramBundle == null) || (bi.oW(paramBundle.name)))
          {
            paramBundle = com.tencent.mm.ui.base.h.i(this, R.l.settings_tweibo_notfind, R.l.app_tip);
          }
          else
          {
            paramBundle = bi.oV(getIntent().getStringExtra("shortUrl"));
            paramBundle = new w(getIntent().getIntExtra("type", 0), paramBundle);
            au.DF().a(paramBundle, 0);
            try
            {
              this.pRY.As(0);
              paramBundle = null;
            }
            catch (Exception paramBundle)
            {
              x.w("MicroMsg.WebViewStubProxyUI", "setTitlePbVisibility, ex = " + paramBundle.getMessage());
              paramBundle = null;
            }
          }
        }
        paramBundle.setOnDismissListener(this.pUB);
        return;
        this.bAZ.J(100L, 100L);
        return;
      } while (o.a.qyj == null);
      o.a.qyj.a(this, paramBundle.getStringExtra("proxyui_handle_event_url"), this.pUB);
      return;
      i = getIntent().getIntExtra("proxyui_expired_errtype", 0);
      int j = getIntent().getIntExtra("proxyui_expired_errcode", 0);
      if ((i == 0) && (j == 0))
      {
        x.e("MicroMsg.WebViewStubProxyUI", "PROXY_AC_VALUE_ACCOUNT_EXPIRED, errType & errCode should not both be 0");
        return;
      }
      paramBundle = new com.tencent.mm.g.a.c();
      paramBundle.bGb.bGc = this;
      paramBundle.bGb.errType = i;
      paramBundle.bGb.errCode = j;
      com.tencent.mm.sdk.b.a.sFg.m(paramBundle);
      return;
      paramBundle = getIntent().getStringExtra("proxyui_phone");
      if (bi.oW(paramBundle))
      {
        x.e("MicroMsg.WebViewStubProxyUI", "show phone span dialog, phone is empty");
        finish();
        return;
      }
      localObject = new Bundle();
      ((Bundle)localObject).putInt("fromScene", 3);
      l.a(this, paramBundle, this.pUB, (Bundle)localObject);
      return;
      paramBundle = (Intent)getIntent().getExtras().getParcelable("proxyui_next_intent_key");
      paramBundle.setFlags(603979776);
      localObject = new Intent();
      ((Intent)localObject).setClass(this, SimpleLoginUI.class);
      MMWizardActivity.b(this, (Intent)localObject, paramBundle);
      finish();
      return;
      paramBundle = getIntent().getStringExtra("KAppId");
      localObject = getIntent().getStringExtra("shortcut_user_name");
    } while ((bi.oW(paramBundle)) || (bi.oW((String)localObject)));
    getString(R.l.app_tip);
    p localp = com.tencent.mm.ui.base.h.a(this, getString(R.l.app_waiting), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        x.i("MicroMsg.WebViewStubProxyUI", "addshortcut, user cancel");
        WebViewStubProxyUI.this.finish();
      }
    });
    localp.show();
    com.tencent.mm.plugin.base.model.d.a(ad.getContext(), (String)localObject, paramBundle, new WebViewStubProxyUI.4(this, localp));
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    if (!this.pUx) {
      this.pRY = null;
    }
    x.i("MicroMsg.WebViewStubProxyUI", "onDestroy proxyui");
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    }
    if (paramArrayOfInt[0] == 0)
    {
      com.tencent.mm.plugin.webview.ui.tools.jsapi.h.Bh(this.pUz).b(paramInt, -1, null);
      return;
    }
    com.tencent.mm.plugin.webview.ui.tools.jsapi.h.Bh(this.pUz).b(paramInt, 0, null);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/webview/stub/WebViewStubProxyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */