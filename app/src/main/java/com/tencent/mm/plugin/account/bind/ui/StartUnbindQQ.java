package com.tencent.mm.plugin.account.bind.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.mm.aa.f;
import com.tencent.mm.aa.k;
import com.tencent.mm.g.a.af;
import com.tencent.mm.g.a.sf;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.a.f;
import com.tencent.mm.plugin.account.a.g;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.plugin.account.friend.a.an;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.widget.a.c;

public class StartUnbindQQ
  extends MMWizardActivity
  implements com.tencent.mm.ab.e
{
  private String eGa = null;
  private View eJh;
  private c eJi;
  private p tipDialog;
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.StartUnbindQQ", "onSceneEnd " + paramInt1 + " errCode " + paramInt2 + " errMsg " + paramString + "  " + paraml.getType());
    if (paraml.getType() == 253)
    {
      if (this.tipDialog != null)
      {
        this.tipDialog.dismiss();
        this.tipDialog = null;
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramInt1 = bi.a((Integer)g.Ei().DT().get(9, null), 0);
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.StartUnbindQQ", "iBindUin " + paramInt1);
        if (paramInt1 != 0) {
          ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FZ().delete(new com.tencent.mm.a.o(paramInt1) + "@qqim");
        }
        paraml = g.Ei().DT().get(102407, null);
        if ((paraml != null) && (((String)paraml).length() > 0)) {
          g.Ei().DT().set(102407, null);
        }
      }
    }
    try
    {
      com.tencent.mm.sdk.b.a.sFg.m(new af());
      paramInt1 = bi.a((Integer)g.Ei().DT().get(9, null), 0);
      paraml = new com.tencent.mm.a.o(paramInt1) + "@qqim";
      ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FZ().delete(paraml);
      ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().Ym(paraml);
      com.tencent.mm.aa.q.KH().kd(paraml);
      String str = com.tencent.mm.model.q.GF() + "@qqim";
      com.tencent.mm.aa.q.KH().kd(str);
      com.tencent.mm.aa.q.Kp();
      f.B(paraml, false);
      com.tencent.mm.aa.q.Kp();
      f.B(paraml, true);
      com.tencent.mm.aa.q.Kp();
      f.B(str, false);
      com.tencent.mm.aa.q.Kp();
      f.B(str, true);
      paraml = (an)((com.tencent.mm.plugin.account.a.a.a)g.n(com.tencent.mm.plugin.account.a.a.a.class)).getQQGroupStg();
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.QQGroupStorage", "delete all");
      if (paraml.dCZ.delete("qqgroup", null, null) > 0) {
        paraml.doNotify();
      }
      com.tencent.mm.plugin.account.a.a.ezo.vl();
    }
    catch (Exception paraml)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.StartUnbindQQ", paraml, "", new Object[0]);
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.StartUnbindQQ", paraml, "", new Object[0]);
        continue;
        DT(1);
      }
    }
    g.Ei().DT().set(9, Integer.valueOf(0));
    paraml = new sf();
    paraml.ccY.ccZ = false;
    paraml.ccY.cda = true;
    com.tencent.mm.sdk.b.a.sFg.m(paraml);
    if (!bi.oW(this.eGa))
    {
      com.tencent.mm.ui.base.h.a(this, this.eGa, "", getString(a.j.app_i_known), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          StartUnbindQQ.b(StartUnbindQQ.this);
        }
      });
      paramString = com.tencent.mm.h.a.eV(paramString);
      if (paramString != null) {
        paramString.a(this, null, null);
      }
      return;
    }
  }
  
  protected final int getLayoutId()
  {
    return a.g.start_unbindqq;
  }
  
  protected final void initView()
  {
    setMMTitle(a.j.unbind_qq);
    this.eJh = findViewById(a.f.setting_start_unbind_qq);
    setBackBtn(new StartUnbindQQ.1(this));
    this.eJh.setOnClickListener(new StartUnbindQQ.2(this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    g.DF().a(253, this);
    this.eGa = getIntent().getStringExtra("notice");
  }
  
  public void onDestroy()
  {
    g.DF().b(253, this);
    super.onDestroy();
  }
  
  protected void onResume()
  {
    super.onResume();
    initView();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/account/bind/ui/StartUnbindQQ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */