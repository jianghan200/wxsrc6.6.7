package com.tencent.mm.ui.tools;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.compatible.util.g;
import com.tencent.mm.g.a.iz;
import com.tencent.mm.model.au;
import com.tencent.mm.modelsimple.q;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.applet.SecurityImage.a;
import com.tencent.mm.ui.w;

public class NewTaskUI
  extends MMBaseActivity
  implements e
{
  static NewTaskUI uBe;
  private ProgressDialog eHw = null;
  private SecurityImage eIX = null;
  private c eQf = new c() {};
  private h uBf = new h();
  
  public static NewTaskUI czP()
  {
    return uBe;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.i("MicroMsg.NewTaskUI", "onSceneEnd :%d  [%d,%d,%s]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((this.eHw != null) && (this.eHw.isShowing())) {
      this.eHw.dismiss();
    }
    if ((paramInt1 == 4) && (paramInt2 == -3))
    {
      x.i("MicroMsg.NewTaskUI", "summerauth MM_ERR_PASSWORD need kick out acc ready[%b]", new Object[] { Boolean.valueOf(au.HX()) });
      if (w.a(uBe, paramInt1, paramInt2, new Intent().setClass(uBe, LauncherUI.class).putExtra("Intro_Switch", true).putExtra("animation_pop_in", true).addFlags(67108864), paramString)) {
        return;
      }
    }
    if ((paramInt1 != 4) || ((paramInt2 != -6) && (paramInt2 != 65225) && (paramInt2 != 65226)))
    {
      uBe = null;
      finish();
      return;
    }
    if ((paraml instanceof q))
    {
      paramString = (q)paraml;
      this.uBf.eRQ = paramString.getSecCodeType();
      this.uBf.eIZ = paramString.Rf();
      this.uBf.eJa = paramString.Re();
      this.uBf.eJb = paramString.Rg();
      x.i("MicroMsg.NewTaskUI", "onSceneEnd dkwt imgSid:" + this.uBf.eJa + " img len" + this.uBf.eIZ.length + " " + g.Ac());
    }
    if (this.eIX == null)
    {
      this.eIX = SecurityImage.a.a(this, R.l.regbyqq_secimg_title, this.uBf.eRQ, this.uBf.eIZ, this.uBf.eJa, this.uBf.eJb, new NewTaskUI.3(this), new NewTaskUI.4(this), new DialogInterface.OnDismissListener()
      {
        public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
        {
          NewTaskUI.c(NewTaskUI.this);
        }
      }, this.uBf);
      return;
    }
    x.d("MicroMsg.NewTaskUI", "imgSid:" + this.uBf.eJa + " img len" + this.uBf.eIZ.length + " " + g.Ac());
    this.eIX.a(this.uBf.eRQ, this.uBf.eIZ, this.uBf.eJa, this.uBf.eJb);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    x.i("MicroMsg.NewTaskUI", "onCreate :%d", new Object[] { Integer.valueOf(hashCode()) });
    setContentView(R.i.background_transparent);
    au.DF().a(701, this);
    uBe = this;
    paramBundle = new q(0, "", "", "");
    au.DF().a(paramBundle, 0);
    getString(R.l.app_tip);
    this.eHw = com.tencent.mm.ui.base.h.a(this, getString(R.l.login_logining), true, new NewTaskUI.2(this, paramBundle));
  }
  
  public void onDestroy()
  {
    x.i("MicroMsg.NewTaskUI", "onDestroy :%d", new Object[] { Integer.valueOf(hashCode()) });
    if (equals(uBe)) {
      uBe = null;
    }
    if ((this.eHw != null) && (this.eHw.isShowing())) {
      this.eHw.dismiss();
    }
    if (this.eIX != null) {
      this.eIX.dismiss();
    }
    au.DF().b(701, this);
    super.onDestroy();
  }
  
  public void onPause()
  {
    super.onPause();
    a.sFg.c(this.eQf);
  }
  
  public void onResume()
  {
    a.sFg.b(this.eQf);
    super.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/tools/NewTaskUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */