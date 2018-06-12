package com.tencent.mm.plugin.account.ui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.modelsimple.q;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.applet.SecurityImage.a;
import com.tencent.mm.ui.base.h;

public final class m
  implements e, MobileVerifyUI.b
{
  SecurityImage eIX = null;
  f eQY = null;
  private g eSA = null;
  MobileVerifyUI eTG;
  private int eTb;
  
  public m(int paramInt)
  {
    this.eTb = paramInt;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MobileVerifyForgetPwdLogic", "forget pwd, purpose %d", new Object[] { Integer.valueOf(paramInt) });
  }
  
  private void YM()
  {
    Object localObject = new StringBuilder();
    com.tencent.mm.kernel.g.Eg();
    localObject = ((StringBuilder)localObject).append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",R200_350_auto,");
    com.tencent.mm.kernel.g.Eg();
    com.tencent.mm.plugin.c.a.pV(com.tencent.mm.kernel.a.gd("R200_350_auto") + ",1");
    com.tencent.mm.kernel.g.DF().a(145, this);
    com.tencent.mm.kernel.g.DF().a(132, this);
    localObject = null;
    if (this.eTb == 3) {
      localObject = new com.tencent.mm.modelfriend.a(this.eTG.bTi, 9, this.eTG.eGC.getText().toString().trim(), 0, "");
    }
    for (;;)
    {
      if (localObject != null)
      {
        com.tencent.mm.kernel.g.DF().a((l)localObject, 0);
        MobileVerifyUI localMobileVerifyUI1 = this.eTG;
        MobileVerifyUI localMobileVerifyUI2 = this.eTG;
        this.eTG.getString(a.j.app_tip);
        localMobileVerifyUI1.eHw = h.a(localMobileVerifyUI2, this.eTG.getString(a.j.bind_mcontact_verifing), true, new m.1(this, (l)localObject));
      }
      return;
      if (this.eTb == 5) {
        localObject = new com.tencent.mm.plugin.account.friend.a.x(this.eTG.bTi, 21, this.eTG.eGC.getText().toString().trim(), 0, "");
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MobileVerifyForgetPwdLogic", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.eTG.eHw != null)
    {
      this.eTG.eHw.dismiss();
      this.eTG.eHw = null;
    }
    if (this.eQY == null) {
      this.eQY = new f();
    }
    if ((paraml.getType() == 701) && (this.eSA != null))
    {
      com.tencent.mm.kernel.g.DF().b(701, this);
      this.eQY.eJa = ((q)paraml).Re();
      this.eQY.eIZ = ((q)paraml).Rf();
      this.eQY.eJb = ((q)paraml).Rg();
      this.eQY.eRQ = ((q)paraml).getSecCodeType();
      if ((paramInt2 == -6) || (paramInt2 == 65225) || (paramInt2 == 65226))
      {
        com.tencent.mm.kernel.g.DF().a(701, this);
        if (this.eIX == null) {
          this.eIX = SecurityImage.a.a(this.eTG, a.j.regbyqq_secimg_title, this.eQY.eRQ, this.eQY.eIZ, this.eQY.eJa, this.eQY.eJb, new m.2(this), null, new m.3(this), this.eQY);
        }
      }
      do
      {
        return;
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MobileVerifyForgetPwdLogic", "imgSid:" + this.eQY.eJa + " img len" + this.eQY.eIZ.length + " " + com.tencent.mm.compatible.util.g.Ac());
        this.eIX.a(this.eQY.eRQ, this.eQY.eIZ, this.eQY.eJa, this.eQY.eJb);
        return;
        this.eSA.a(this.eTG, paramInt1, paramInt2, paramString, paraml);
      } while ((paramInt1 != 0) || (paramInt2 != 0));
      if (!(paraml instanceof q)) {
        break label808;
      }
    }
    label808:
    for (boolean bool = ((q)paraml).Rm();; bool = true)
    {
      this.eTG.co(bool);
      return;
      if (paraml.getType() == 145)
      {
        this.eQY.account = ((com.tencent.mm.modelfriend.a)paraml).getUsername();
        this.eQY.eRP = ((com.tencent.mm.modelfriend.a)paraml).Oi();
        com.tencent.mm.kernel.g.DF().b(145, this);
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          if (this.eTb != 3) {
            break;
          }
          com.tencent.mm.kernel.g.DF().a(701, this);
          this.eSA = new g(new m.4(this), ((com.tencent.mm.modelfriend.a)paraml).getUsername(), ((com.tencent.mm.modelfriend.a)paraml).Oi(), this.eTG.bTi);
          this.eSA.a(this.eTG);
          return;
        }
        if (paramInt2 == -51)
        {
          paramString = com.tencent.mm.h.a.eV(paramString);
          if (paramString != null)
          {
            paramString.a(this.eTG, null, null);
            return;
          }
          h.i(this.eTG, a.j.bind_mcontact_verify_err_time_out_content, a.j.bind_mcontact_verify_tip);
          return;
        }
      }
      if (paraml.getType() == 132)
      {
        com.tencent.mm.kernel.g.DF().b(132, this);
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          if (this.eTb != 5) {
            break;
          }
          paramString = ((com.tencent.mm.plugin.account.friend.a.x)paraml).Oj();
          paraml = new Intent();
          paraml.putExtra("setpwd_ticket", paramString);
          this.eTG.setResult(-1, paraml);
          this.eTG.finish();
          return;
        }
        if (paramInt2 == -51)
        {
          paramString = com.tencent.mm.h.a.eV(paramString);
          if (paramString != null)
          {
            paramString.a(this.eTG, null, null);
            return;
          }
          h.i(this.eTG, a.j.bind_mcontact_verify_err_time_out_content, a.j.bind_mcontact_verify_tip);
          return;
        }
      }
      if (this.eTG.e(paramInt1, paramInt2, paramString)) {
        break;
      }
      if (paraml.getType() == 701)
      {
        paramString = com.tencent.mm.h.a.eV(paramString);
        if ((paramString != null) && (paramString.a(this.eTG, null, null))) {
          break;
        }
      }
      if ((paramInt1 == 0) && (paramInt2 == 0)) {
        break;
      }
      Toast.makeText(this.eTG, this.eTG.getString(a.j.bind_mcontact_verify_err, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      return;
    }
  }
  
  public final void a(MobileVerifyUI paramMobileVerifyUI)
  {
    this.eTG = paramMobileVerifyUI;
  }
  
  public final boolean jn(int paramInt)
  {
    switch (m.5.eTK[(paramInt - 1)])
    {
    default: 
      return false;
    case 1: 
      YM();
      return false;
    case 2: 
      Object localObject = new StringBuilder();
      com.tencent.mm.kernel.g.Eg();
      localObject = ((StringBuilder)localObject).append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",R200_400,");
      com.tencent.mm.kernel.g.Eg();
      com.tencent.mm.plugin.c.a.pV(com.tencent.mm.kernel.a.gd("R200_400") + ",1");
      localObject = null;
      if (this.eTb == 3) {
        localObject = new com.tencent.mm.modelfriend.a(this.eTG.bTi, 8, "", 0, "");
      }
      while (localObject != null)
      {
        com.tencent.mm.kernel.g.DF().a((l)localObject, 0);
        return false;
        if (this.eTb == 5) {
          localObject = new com.tencent.mm.plugin.account.friend.a.x(this.eTG.bTi, 20, "", 0, "");
        }
      }
    }
    YM();
    return false;
  }
  
  public final void start()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    com.tencent.mm.kernel.g.Eg();
    localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",F200_300,");
    com.tencent.mm.kernel.g.Eg();
    com.tencent.mm.plugin.c.a.d(true, com.tencent.mm.kernel.a.gd("F200_300") + ",1");
    com.tencent.mm.plugin.c.a.pT("F200_300");
  }
  
  public final void stop()
  {
    int i = 2;
    if (this.eTG.eUl != -1) {
      i = this.eTG.eUl;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    com.tencent.mm.kernel.g.Eg();
    localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",F200_300,");
    com.tencent.mm.kernel.g.Eg();
    com.tencent.mm.plugin.c.a.d(false, com.tencent.mm.kernel.a.gd("F200_300") + "," + i);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/account/ui/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */