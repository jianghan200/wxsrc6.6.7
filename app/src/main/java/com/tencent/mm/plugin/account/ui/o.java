package com.tencent.mm.plugin.account.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Bitmap.CompressFormat;
import android.widget.EditText;
import android.widget.Toast;
import com.tencent.mm.ab.l;
import com.tencent.mm.model.at;
import com.tencent.mm.modelsimple.q;
import com.tencent.mm.modelsimple.r;
import com.tencent.mm.modelsimple.s;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.plugin.account.bind.ui.FindMContactAlertUI;
import com.tencent.mm.plugin.account.bind.ui.FindMContactIntroUI;
import com.tencent.mm.plugin.account.model.i;
import com.tencent.mm.plugin.account.model.i.a;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.c;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.applet.SecurityImage.a;
import com.tencent.mm.ui.base.h;
import java.io.File;
import java.util.Map;

public final class o
  implements com.tencent.mm.ab.e, MobileVerifyUI.b
{
  String eHp;
  g eSA = null;
  MobileVerifyUI eTG;
  String eTM;
  private boolean eTN = true;
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.i("MicroMsg.MobileVerifyRegLogic", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.eTG.eHw != null)
    {
      this.eTG.eHw.dismiss();
      this.eTG.eHw = null;
    }
    if (paraml.getType() == 255)
    {
      com.tencent.mm.kernel.g.DF().b(255, this);
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        this.eTG.co(this.eTN);
      }
    }
    Object localObject1;
    int i;
    do
    {
      do
      {
        do
        {
          return;
          if ((paraml.getType() != 701) || (this.eSA == null)) {
            break;
          }
          com.tencent.mm.kernel.g.DF().b(701, this);
          this.eSA.a(this.eTG, paramInt1, paramInt2, paramString, paraml);
        } while ((paramInt1 != 0) || (paramInt2 != 0));
        if ((paraml instanceof q)) {
          this.eTN = ((q)paraml).Rm();
        }
        com.tencent.mm.kernel.g.DF().a(255, this);
        paramString = new r(1);
        com.tencent.mm.kernel.g.DF().a(paramString, 0);
        paraml = this.eTG;
        localObject1 = this.eTG;
        this.eTG.getString(a.j.app_tip);
        paraml.eHw = h.a((Context)localObject1, this.eTG.getString(a.j.app_loading), true, new o.12(this, paramString));
        return;
        if (paraml.getType() != 145) {
          break;
        }
        com.tencent.mm.kernel.g.DF().b(145, this);
        i = ((com.tencent.mm.modelfriend.a)paraml).Oh();
      } while (i != 15);
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        break;
      }
    } while (i != 15);
    if (this.eTG.eTw == 1)
    {
      this.eTM = ((com.tencent.mm.modelfriend.a)paraml).Oj();
      com.tencent.mm.kernel.g.DF().a(126, this);
      paramString = new s("", this.eTG.eTo, this.eTG.bgn, 0, "", this.eTG.bTi, "", "", this.eTM, this.eTG.egg, "", "", "", true, this.eTG.eUh.booleanValue());
      paramString.mX(this.eTG.eSE);
      com.tencent.mm.kernel.g.DF().a(paramString, 0);
      paraml = this.eTG;
      localObject1 = this.eTG;
      this.eTG.getString(a.j.app_tip);
      paraml.eHw = h.a((Context)localObject1, this.eTG.getString(a.j.regbyqq_reg_waiting), true, new o.7(this, paramString));
      return;
    }
    paramString = new Intent();
    paramString.putExtra("regsetinfo_ticket", ((com.tencent.mm.modelfriend.a)paraml).Oj());
    paramString.putExtra("regsetinfo_user", this.eTG.bTi);
    paramString.putExtra("regsession_id", this.eTG.eSE);
    paramString.putExtra("regsetinfo_ismobile", 4);
    paramString.putExtra("regsetinfo_NextControl", ((com.tencent.mm.modelfriend.a)paraml).Op());
    paramString.putExtra("key_reg_style", this.eTG.eTw);
    paramString.setClass(this.eTG, RegSetInfoUI.class);
    this.eTG.startActivity(paramString);
    i.jj(i.a.eOm);
    return;
    if (paramInt2 == -35)
    {
      paramString = com.tencent.mm.h.a.eV(paramString);
      if (paramString != null)
      {
        paramString.a(this.eTG, new o.13(this, paraml), new o.14(this));
        return;
      }
      h.a(this.eTG, this.eTG.getString(a.j.bind_mcontact_already_bind_relogin), null, new o.15(this, paraml), new o.16(this));
      return;
    }
    if (paramInt2 == 65324)
    {
      paramString = new Intent(this.eTG, MobileLoginOrForceReg.class);
      paramString.putExtra("ticket", ((com.tencent.mm.modelfriend.a)paraml).Oj());
      paramString.putExtra("moble", this.eTG.bTi);
      paramString.putExtra("regsession_id", this.eTG.eSE);
      paramString.putExtra("next_controll", ((com.tencent.mm.modelfriend.a)paraml).Op());
      paramString.putExtra("username", ((com.tencent.mm.modelfriend.a)paraml).getUsername());
      paramString.putExtra("password", ((com.tencent.mm.modelfriend.a)paraml).Oi());
      paramString.putExtra("nickname", ((com.tencent.mm.modelfriend.a)paraml).Ov());
      paramString.putExtra("avatar_url", ((com.tencent.mm.modelfriend.a)paraml).Ou());
      paramString.putExtra("key_reg_style", this.eTG.eTw);
      if (this.eTG.eTw == 1)
      {
        paramString.putExtra("kintent_nickname", this.eTG.bgn);
        paramString.putExtra("kintent_password", this.eTG.eTo);
        paramString.putExtra("kintent_hasavatar", this.eTG.eUh);
      }
      this.eTG.startActivity(paramString);
      return;
    }
    Object localObject2;
    String str2;
    Object localObject4;
    String str1;
    int j;
    String str3;
    boolean bool2;
    boolean bool1;
    Object localObject3;
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
      if (paraml.getType() == 126)
      {
        if ((paramInt2 == -6) || (paramInt2 == 65225) || (paramInt2 == 65226))
        {
          paramString = this.eTG.bTi;
          paramString = this.eTG.eUh;
          localObject1 = this.eTG.eTo;
          localObject2 = this.eTG.bgn;
          if (this.eTG.eIX == null)
          {
            this.eTG.eIX = SecurityImage.a.a(this.eTG, a.j.regbyqq_secimg_title, 0, ((s)paraml).Rf(), ((s)paraml).Re(), "", new o.2(this, (String)localObject1, (String)localObject2, paraml, paramString), null, new o.3(this), new o.4(this, (String)localObject1, (String)localObject2, paraml, paramString));
            return;
          }
          this.eTG.eIX.a(0, ((s)paraml).Rf(), ((s)paraml).Re(), "");
          return;
        }
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          str2 = this.eTG.bTi;
          localObject4 = this.eTG.eUh;
          localObject1 = this.eTG.eTo;
          localObject1 = this.eTG.bgn;
          i = ((s)paraml).Ro();
          str1 = ((s)paraml).Rp();
          j = ((s)paraml).Rq();
          str3 = ((s)paraml).Rr();
          localObject1 = null;
          localObject2 = null;
          bool2 = false;
          bool1 = false;
          Map localMap = bl.z(str3, "wording");
          if (localMap == null) {
            break label2096;
          }
          localObject3 = (String)localMap.get(".wording.switch");
          if (!bi.oW((String)localObject3)) {
            break label1634;
          }
          bool1 = true;
          bool2 = bool1;
          if (!bool1) {
            break label2096;
          }
          localObject3 = (String)localMap.get(".wording.title");
          if (!bi.oW((String)localObject3)) {
            localObject1 = localObject3;
          }
          localObject3 = (String)localMap.get(".wording.desc");
          if (bi.oW((String)localObject3)) {
            break label2093;
          }
          localObject2 = localObject3;
        }
      }
    }
    for (;;)
    {
      x.i("MicroMsg.MobileVerifyRegLogic", "hasSetAvatar , %s", new Object[] { localObject4 });
      x.i("MicroMsg.MobileVerifyRegLogic", "styleId , %s", new Object[] { Integer.valueOf(i) });
      x.i("MicroMsg.MobileVerifyRegLogic", "nextStep , %s", new Object[] { str1 });
      x.i("MicroMsg.MobileVerifyRegLogic", "nextStyle , %s", new Object[] { Integer.valueOf(j) });
      x.i("MicroMsg.MobileVerifyRegLogic", "mShowStyleContactUploadWordings , %s", new Object[] { str3 });
      com.tencent.mm.kernel.a.unhold();
      com.tencent.mm.kernel.a.bt(true);
      if (((Boolean)localObject4).booleanValue())
      {
        localObject3 = com.tencent.mm.compatible.util.e.dgs + "temp.avatar";
        localObject4 = com.tencent.mm.compatible.util.e.dgs + "temp.avatar.hd";
        new File((String)localObject3).renameTo(new File((String)localObject4));
        com.tencent.mm.a.e.deleteFile((String)localObject3);
        c.c((String)localObject4, 96, 96, Bitmap.CompressFormat.JPEG, 90, (String)localObject3);
        new com.tencent.mm.aa.o(this.eTG, com.tencent.mm.compatible.util.e.dgs + "temp.avatar").a(new o.5(this, paraml, str2, str1, bool1, (String)localObject1, (String)localObject2, j), new o.6(this, paraml, str2, str1, bool1, (String)localObject1, (String)localObject2, j));
      }
      for (;;)
      {
        localObject1 = com.tencent.mm.h.a.eV(paramString);
        if (localObject1 == null) {
          break label1999;
        }
        ((com.tencent.mm.h.a)localObject1).a(this.eTG, null, null);
        return;
        label1634:
        int k = bi.WU((String)localObject3);
        if (k == 0)
        {
          bool1 = false;
          break;
        }
        if (k != 1) {
          break;
        }
        bool1 = true;
        break;
        this.eHp = ((s)paraml).Rn();
        at.dBv.T("login_user_name", str2);
        if ((str1 != null) && (str1.contains("0")))
        {
          com.tencent.mm.plugin.c.a.pU("R300_100_phone");
          if (!bool1) {}
          for (localObject1 = new Intent(this.eTG, FindMContactIntroUI.class);; localObject1 = localObject3)
          {
            ((Intent)localObject1).addFlags(67108864);
            ((Intent)localObject1).putExtra("regsetinfo_ticket", this.eHp);
            ((Intent)localObject1).putExtra("regsetinfo_NextStep", str1);
            ((Intent)localObject1).putExtra("regsetinfo_NextStyle", j);
            localObject2 = com.tencent.mm.plugin.account.a.a.ezn.be(this.eTG);
            ((Intent)localObject2).addFlags(67108864);
            ((Intent)localObject2).putExtra("LauncherUI.enter_from_reg", true);
            MMWizardActivity.b(this.eTG, (Intent)localObject1, (Intent)localObject2);
            this.eTG.finish();
            break;
            localObject3 = new Intent(this.eTG, FindMContactAlertUI.class);
            ((Intent)localObject3).putExtra("alert_title", (String)localObject1);
            ((Intent)localObject3).putExtra("alert_message", (String)localObject2);
          }
        }
        localObject1 = com.tencent.mm.plugin.account.a.a.ezn.be(this.eTG);
        ((Intent)localObject1).addFlags(67108864);
        ((Intent)localObject1).putExtra("LauncherUI.enter_from_reg", true);
        this.eTG.startActivity((Intent)localObject1);
        localObject1 = new StringBuilder();
        com.tencent.mm.kernel.g.Eg();
        localObject1 = ((StringBuilder)localObject1).append(com.tencent.mm.kernel.a.DA()).append(",").append(this.eTG.getClass().getName()).append(",R200_900_phone,");
        com.tencent.mm.kernel.g.Eg();
        com.tencent.mm.plugin.c.a.pV(com.tencent.mm.kernel.a.gd("R200_900_phone") + ",4");
        this.eTG.finish();
      }
      label1999:
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
      label2093:
      continue;
      label2096:
      localObject1 = null;
      bool1 = bool2;
    }
  }
  
  public final void a(MobileVerifyUI paramMobileVerifyUI)
  {
    this.eTG = paramMobileVerifyUI;
  }
  
  public final boolean jn(int paramInt)
  {
    switch (o.8.eTK[(paramInt - 1)])
    {
    default: 
      return false;
    case 1: 
      h.a(this.eTG, this.eTG.getString(a.j.mobile_verify_cancel_tip), "", this.eTG.getString(a.j.mobile_verify_cancel_tip_back), this.eTG.getString(a.j.mobile_verify_cancel_tip_wait), new DialogInterface.OnClickListener()new o.10
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          o.this.eTG.finish();
          i.jj(i.a.eOk);
        }
      }, new o.10(this));
      return true;
    case 2: 
      com.tencent.mm.kernel.g.DF().a(145, this);
      localObject = new com.tencent.mm.modelfriend.a(this.eTG.bTi, 15, this.eTG.eGC.getText().toString().trim(), 0, "");
      ((com.tencent.mm.modelfriend.a)localObject).lD(this.eTG.eSE);
      com.tencent.mm.kernel.g.DF().a((l)localObject, 0);
      localMobileVerifyUI1 = this.eTG;
      localMobileVerifyUI2 = this.eTG;
      this.eTG.getString(a.j.app_tip);
      localMobileVerifyUI1.eHw = h.a(localMobileVerifyUI2, this.eTG.getString(a.j.bind_mcontact_verifing), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          com.tencent.mm.kernel.g.DF().c(localObject);
          com.tencent.mm.kernel.g.DF().b(145, o.this);
        }
      });
      return false;
    case 3: 
      com.tencent.mm.kernel.g.DF().a(145, this);
      localObject = new com.tencent.mm.modelfriend.a(this.eTG.bTi, 14, "", 0, "");
      ((com.tencent.mm.modelfriend.a)localObject).lD(this.eTG.eSE);
      com.tencent.mm.kernel.g.DF().a((l)localObject, 0);
      i.jj(i.a.eOl);
      return false;
    }
    final Object localObject = new StringBuilder();
    com.tencent.mm.kernel.g.Eg();
    localObject = ((StringBuilder)localObject).append(com.tencent.mm.kernel.a.DA()).append(",").append(getClass().getName()).append(",R200_350_auto,");
    com.tencent.mm.kernel.g.Eg();
    com.tencent.mm.plugin.c.a.pV(com.tencent.mm.kernel.a.gd("R200_350_auto") + ",1");
    com.tencent.mm.kernel.g.DF().a(145, this);
    localObject = new com.tencent.mm.modelfriend.a(this.eTG.bTi, 15, this.eTG.eGC.getText().toString().trim(), 0, "");
    ((com.tencent.mm.modelfriend.a)localObject).lD(this.eTG.eSE);
    com.tencent.mm.kernel.g.DF().a((l)localObject, 0);
    MobileVerifyUI localMobileVerifyUI1 = this.eTG;
    MobileVerifyUI localMobileVerifyUI2 = this.eTG;
    this.eTG.getString(a.j.app_tip);
    localMobileVerifyUI1.eHw = h.a(localMobileVerifyUI2, this.eTG.getString(a.j.bind_mcontact_verifing), true, new o.1(this, (com.tencent.mm.modelfriend.a)localObject));
    return false;
  }
  
  public final void start() {}
  
  public final void stop() {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/account/ui/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */