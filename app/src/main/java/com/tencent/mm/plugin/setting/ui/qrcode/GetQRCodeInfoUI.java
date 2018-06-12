package com.tencent.mm.plugin.setting.ui.qrcode;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.mm.aa.q;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.bg.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bg;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.plugin.setting.a.g;
import com.tencent.mm.plugin.setting.a.i;
import com.tencent.mm.plugin.setting.b;
import com.tencent.mm.pluginsdk.i;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.c.bja;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMBaseActivity;

public class GetQRCodeInfoUI
  extends MMBaseActivity
  implements e
{
  private ProgressDialog eHw = null;
  private com.tencent.mm.plugin.messenger.a.f mPz;
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.i("MicroMsg.GetQRCodeInfoUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.eHw != null)
    {
      this.eHw.dismiss();
      this.eHw = null;
    }
    if ((paramInt1 == 4) && (paramInt2 == 63532)) {
      com.tencent.mm.ui.base.h.a(this, a.i.qrcode_ban_by_expose, a.i.app_tip, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GetQRCodeInfoUI.this.finish();
        }
      });
    }
    do
    {
      return;
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        com.tencent.mm.ui.base.h.a(this, getString(a.i.fmt_search_err, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), getString(a.i.app_tip), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GetQRCodeInfoUI.this.finish();
          }
        });
        return;
      }
      paramString = ((com.tencent.mm.plugin.messenger.a.f)paraml).bcS();
      paraml = ab.a(paramString.rvi);
      q.Kp().g(paraml, ab.a(paramString.rcn));
      Intent localIntent = new Intent();
      ((i)g.l(i.class)).a(localIntent, paramString, 30);
    } while (bi.oV(paraml).length() <= 0);
    if ((paramString.rTe & 0x8) > 0) {
      com.tencent.mm.plugin.report.service.h.mEJ.k(10298, paraml + ",30");
    }
    d.c(this, "profile", ".ui.ContactInfoUI", 1);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    b.ezn.q(new Intent(), this);
    finish();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(a.g.empty);
    Object localObject = getIntent().getData();
    if (localObject == null)
    {
      finish();
      return;
    }
    paramBundle = bi.oV(((Uri)localObject).getHost());
    localObject = bi.oV(((Uri)localObject).getScheme());
    if ((("http".equals(localObject)) && ("weixin.qq.com".equals(paramBundle))) || (("weixin".equals(localObject)) && ("qr".equals(paramBundle))))
    {
      g.DF().a(new bg(new GetQRCodeInfoUI.1(this)), 0);
      return;
    }
    finish();
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    if (this.mPz != null) {
      g.DF().c(this.mPz);
    }
    g.DF().b(106, this);
  }
  
  public void onResume()
  {
    super.onResume();
    getString(a.i.app_tip);
    this.eHw = com.tencent.mm.ui.base.h.a(this, getString(a.i.address_searching), true, new GetQRCodeInfoUI.2(this));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/qrcode/GetQRCodeInfoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */