package com.tencent.mm.plugin.account.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.q;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ap;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.e.c.b;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.widget.a.c.a;
import com.tencent.mm.ui.widget.a.e.a;

@a(3)
public class ShareToFacebookRedirectUI
  extends MMActivity
  implements com.tencent.mm.ab.e
{
  private static String TAG = "MicroMsg.ShareToFacebookRedirectUI";
  private String eXa;
  private String eXb;
  private String eXc;
  private String eXd;
  private p eXe;
  
  private void YP()
  {
    com.tencent.mm.sdk.platformtools.x.i(TAG, "doSend");
    e.a locala1 = new e.a(this);
    e.a locala2 = locala1.abz(this.eXa);
    String str = this.eXc;
    locala2.qIF.abv(str);
    str = this.eXb;
    int i = ap.fromDPToPix(locala2.mContext, (int)(14.0F * ap.fe(locala2.mContext)));
    if ((str != null) && (str.length() > 0))
    {
      SpannableString localSpannableString = (SpannableString)b.c(str.toString(), i);
      locala2.qIF.S(localSpannableString);
    }
    locala2.qIF.S(str);
    str = getString(q.e.app_comment);
    locala2.qIF.abw(str);
    locala2.Gv(q.e.app_share).a(new ShareToFacebookRedirectUI.4(this, locala1)).eIW.show();
  }
  
  private void Zp()
  {
    com.tencent.mm.sdk.platformtools.x.i(TAG, "refreshFacebookToken");
    long l = bi.c((Long)com.tencent.mm.kernel.g.Ei().DT().get(65831, null));
    String str = bi.oV((String)com.tencent.mm.kernel.g.Ei().DT().get(65830, null));
    if ((bi.bH(l) > 86400000L) && (str.length() > 0))
    {
      com.tencent.mm.ui.f.a.c localc = new com.tencent.mm.ui.f.a.c("290293790992170");
      localc.aaT(str);
      new com.tencent.mm.plugin.account.model.g(localc, new ShareToFacebookRedirectUI.3(this)).Yl();
      return;
    }
    YP();
  }
  
  private void aM(String paramString1, String paramString2)
  {
    h.a(this.mController.tml, paramString2, paramString1, new ShareToFacebookRedirectUI.5(this), null);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.i(TAG, "type:%d, code:%d, msg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    YC();
    this.eXe.dismiss();
    if ((paramInt1 == 4) && (paramInt2 == -68))
    {
      paraml = paramString;
      if (bi.oW(paramString)) {
        paraml = "error";
      }
      aM(getString(q.e.app_tip), paraml);
      return;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = getString(q.e.share_ok);
      new ShareToFacebookRedirectUI.1(this);
      h.bA(this, paramString);
      finish();
      return;
    }
    h.a(this.mController.tml, "err(" + paramInt2 + "," + paramInt1 + ")", getString(q.e.app_tip), new ShareToFacebookRedirectUI.2(this), null);
  }
  
  protected final int getLayoutId()
  {
    return -1;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    String str = TAG;
    if (paramIntent == null) {}
    for (boolean bool = true;; bool = false)
    {
      com.tencent.mm.sdk.platformtools.x.i(str, "onActivityResult, requestCode:%d, resultCode:%d, data==null:%b", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(bool) });
      if ((paramInt1 != 0) || (paramInt2 != -1) || (paramIntent == null)) {
        break;
      }
      bool = paramIntent.getBooleanExtra("bind_facebook_succ", false);
      com.tencent.mm.sdk.platformtools.x.i(TAG, "bind facebooksucc %b", new Object[] { Boolean.valueOf(bool) });
      if (!bool) {
        break;
      }
      Zp();
      YP();
      return;
    }
    finish();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    com.tencent.mm.kernel.g.DF().a(433, this);
    this.eXa = getIntent().getStringExtra("title");
    this.eXb = getIntent().getStringExtra("digest");
    this.eXc = getIntent().getStringExtra("img");
    this.eXd = getIntent().getStringExtra("link");
    com.tencent.mm.sdk.platformtools.x.i(TAG, "title %s, digest:%s, img:%s, link:%s", new Object[] { this.eXa, this.eXb, this.eXc, this.eXd });
    if (!q.Hg())
    {
      paramBundle = new Intent(this, FacebookAuthUI.class);
      paramBundle.putExtra("is_force_unbind", true);
      startActivityForResult(paramBundle, 0);
      return;
    }
    Zp();
    YP();
  }
  
  protected void onDestroy()
  {
    com.tencent.mm.kernel.g.DF().b(433, this);
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/account/ui/ShareToFacebookRedirectUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */