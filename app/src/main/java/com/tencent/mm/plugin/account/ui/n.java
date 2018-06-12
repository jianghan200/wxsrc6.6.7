package com.tencent.mm.plugin.account.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.a.hp;
import com.tencent.mm.g.a.hp.b;
import com.tencent.mm.g.a.hq;
import com.tencent.mm.g.a.hq.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import java.util.List;

public final class n
  implements e, MobileVerifyUI.b
{
  private String eHp = null;
  private String eHq = "";
  private int eHr = 2;
  private MobileVerifyUI eTG;
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    int i = 0;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MobileVerifyQQRegLogic", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.eTG.eHw != null)
    {
      this.eTG.eHw.dismiss();
      this.eTG.eHw = null;
    }
    if (paraml.getType() == 132)
    {
      g.DF().b(132, this);
      if ((((com.tencent.mm.plugin.account.friend.a.x)paraml).Oh() == 2) && (paramInt1 == 0) && (paramInt2 == 0))
      {
        com.tencent.mm.kernel.a.unhold();
        paramInt1 = i;
        if (com.tencent.mm.pluginsdk.a.eI(this.eTG).size() != 0) {
          paramInt1 = 1;
        }
        if ((this.eHq == null) || (!this.eHq.contains("1")) || (paramInt1 == 0)) {
          break label264;
        }
        com.tencent.mm.plugin.c.a.pU("R300_300_QQ");
        paramString = new Intent(this.eTG, FindMContactAddUI.class);
        paramString.addFlags(67108864);
        paramString.putExtra("regsetinfo_ticket", this.eHp);
        paramString.putExtra("regsetinfo_NextStep", this.eHq);
        paramString.putExtra("regsetinfo_NextStyle", this.eHr);
        paramString.putExtra("login_type", 1);
        paraml = com.tencent.mm.plugin.account.a.a.ezn.be(this.eTG);
        paraml.addFlags(67108864);
        MMWizardActivity.b(this.eTG, paramString, paraml);
        this.eTG.finish();
      }
    }
    label264:
    while ((this.eTG.e(paramInt1, paramInt2, paramString)) || ((paramInt1 == 0) && (paramInt2 == 0)))
    {
      return;
      paramString = com.tencent.mm.plugin.account.a.a.ezn.be(this.eTG);
      paramString.addFlags(67108864);
      this.eTG.startActivity(paramString);
      this.eTG.eUl = 4;
      this.eTG.finish();
      return;
    }
    Toast.makeText(this.eTG, this.eTG.getString(a.j.bind_mcontact_verify_err, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
  }
  
  public final void a(MobileVerifyUI paramMobileVerifyUI)
  {
    this.eTG = paramMobileVerifyUI;
    this.eHp = paramMobileVerifyUI.getIntent().getStringExtra("regsetinfo_ticket");
    this.eHq = paramMobileVerifyUI.getIntent().getStringExtra("regsetinfo_NextStep");
    this.eHr = paramMobileVerifyUI.getIntent().getIntExtra("regsetinfo_NextStyle", 2);
  }
  
  public final boolean jn(int paramInt)
  {
    switch (n.3.eTK[(paramInt - 1)])
    {
    default: 
      return false;
    case 1: 
      localObject1 = new hp();
      ((hp)localObject1).bQV.context = this.eTG;
      com.tencent.mm.sdk.b.a.sFg.m((b)localObject1);
      localObject1 = ((hp)localObject1).bQW.bQX;
      localObject2 = new hq();
      com.tencent.mm.sdk.b.a.sFg.m((b)localObject2);
      localObject2 = ((hq)localObject2).bQY.bQZ;
      g.DF().a(132, this);
      localObject1 = new com.tencent.mm.plugin.account.friend.a.x(this.eTG.bTi, 2, this.eTG.eGC.getText().toString().trim(), "", (String)localObject1, (String)localObject2);
      g.DF().a((l)localObject1, 0);
      localObject2 = this.eTG;
      localMobileVerifyUI = this.eTG;
      this.eTG.getString(a.j.app_tip);
      ((MobileVerifyUI)localObject2).eHw = h.a(localMobileVerifyUI, this.eTG.getString(a.j.bind_mcontact_verifing), true, new n.2(this, (com.tencent.mm.plugin.account.friend.a.x)localObject1));
      return false;
    case 2: 
      g.DF().a(132, this);
      localObject1 = new com.tencent.mm.plugin.account.friend.a.x(this.eTG.bTi, 1, "", 0, "");
      g.DF().a((l)localObject1, 0);
      return false;
    }
    final Object localObject1 = new hp();
    ((hp)localObject1).bQV.context = this.eTG;
    com.tencent.mm.sdk.b.a.sFg.m((b)localObject1);
    localObject1 = ((hp)localObject1).bQW.bQX;
    Object localObject2 = new hq();
    com.tencent.mm.sdk.b.a.sFg.m((b)localObject2);
    localObject2 = ((hq)localObject2).bQY.bQZ;
    g.DF().a(132, this);
    localObject1 = new com.tencent.mm.plugin.account.friend.a.x(this.eTG.bTi, 2, this.eTG.eGC.getText().toString().trim(), "", (String)localObject1, (String)localObject2);
    g.DF().a((l)localObject1, 0);
    localObject2 = this.eTG;
    MobileVerifyUI localMobileVerifyUI = this.eTG;
    this.eTG.getString(a.j.app_tip);
    ((MobileVerifyUI)localObject2).eHw = h.a(localMobileVerifyUI, this.eTG.getString(a.j.bind_mcontact_verifing), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        g.DF().c(localObject1);
        g.DF().b(132, n.this);
      }
    });
    return false;
  }
  
  public final void start() {}
  
  public final void stop() {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/account/ui/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */