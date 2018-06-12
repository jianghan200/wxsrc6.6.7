package com.tencent.mm.plugin.soter_mp.a;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.os.Message;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.d.b.f.b.a;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.soter_mp.b.d;
import com.tencent.mm.plugin.soter_mp.ui.SoterAuthenticationUI;
import com.tencent.mm.plugin.soter_mp.ui.SoterAuthenticationUI.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.ref.WeakReference;

public final class b
  extends c
  implements com.tencent.mm.ab.e
{
  TextView glY = null;
  com.tencent.d.b.c.a jgQ = null;
  boolean ood = false;
  private com.tencent.mm.ui.widget.a.c ooe = null;
  ImageView oof = null;
  private final int oog = 3;
  private int ooh = 0;
  private final long ooi = 500L;
  Animation ooj = null;
  Animation ook = null;
  Runnable ool = new b.8(this);
  
  public b(WeakReference<Activity> paramWeakReference, d paramd, com.tencent.mm.plugin.soter_mp.b.e parame)
  {
    super(paramWeakReference, paramd, parame);
  }
  
  private boolean bFn()
  {
    if (SoterAuthenticationUI.oox != null) {
      SoterAuthenticationUI.oox.obtainMessage(4).sendToTarget();
    }
    for (;;)
    {
      x.i("MicroMsg.SoterControllerFingerprint", "hy: auth key not valid or auth key not valid");
      com.tencent.d.b.a.a(new b.1(this), false, 2, new com.tencent.mm.plugin.soter_mp.b.c(), new com.tencent.mm.plugin.soter.b.e());
      return false;
      x.e("MicroMsg.SoterMpBaseController", "hy: handler not bind");
    }
  }
  
  private void bFo()
  {
    this.jgQ = new com.tencent.d.b.c.a();
    b.3 local3 = new b.3(this);
    b.4 local4 = new b.4(this);
    b.a locala = new b.a().Hq(2).hK(ad.getContext()).a(this.jgQ).acG(this.ooq.jgX);
    locala.vml.vmj = null;
    com.tencent.d.b.a.a(local3, locala.a(local4).vml);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml) {}
  
  @TargetApi(23)
  public final void dd()
  {
    if (!com.tencent.d.a.a.hz(ad.getContext()))
    {
      this.oor.errCode = 90011;
      this.oor.Yy = "no fingerprint enrolled";
      bFs();
    }
    try
    {
      if (ad.getContext().checkSelfPermission("android.permission.USE_FINGERPRINT") != 0)
      {
        if (SoterAuthenticationUI.oox != null)
        {
          Message localMessage = SoterAuthenticationUI.oox.obtainMessage(3);
          Bundle localBundle = new Bundle();
          localBundle.putStringArray("permissions", new String[] { "android.permission.USE_FINGERPRINT" });
          localBundle.putInt("request_code", 0);
          localMessage.setData(localBundle);
          localMessage.sendToTarget();
          return;
        }
        x.e("MicroMsg.SoterMpBaseController", "hy: handler not bind");
        return;
      }
    }
    catch (NoSuchMethodError localNoSuchMethodError)
    {
      x.i("MicroMsg.SoterControllerFingerprint", "hy: not implements the checkSelfPermission. permission already given");
      this.ood = true;
      return;
    }
    this.ood = true;
  }
  
  @TargetApi(16)
  public final void onPause()
  {
    if ((this.ood) && (this.jgQ != null)) {
      this.jgQ.mR(true);
    }
    if ((this.ooe != null) && (this.ooe.isShowing())) {
      this.ooe.dismiss();
    }
  }
  
  public final void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    if (paramInt == 0)
    {
      if ((paramArrayOfString.length > 0) && (paramArrayOfInt.length > 0) && ("android.permission.USE_FINGERPRINT".equals(paramArrayOfString[0])) && (paramArrayOfInt[0] == 0))
      {
        x.i("MicroMsg.SoterControllerFingerprint", "hy: permission granted");
        bFn();
        this.ood = true;
      }
    }
    else {
      return;
    }
    x.w("MicroMsg.SoterControllerFingerprint", "hy: permission not granted");
    this.oor.errCode = 90002;
    this.oor.Yy = "user not grant to use fingerprint";
    bFs();
  }
  
  public final void onResume()
  {
    if (this.ood) {
      bFn();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/soter_mp/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */