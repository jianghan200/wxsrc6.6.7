package com.tencent.mm.plugin.voip.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import com.tencent.mm.R.l;
import com.tencent.mm.a.o;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.f.b;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.al;

public final class g
{
  private static final String byN;
  private static final String byO;
  public static final int lvi = com.tencent.mm.bp.a.fromDPToPix(ad.getContext(), 8);
  public static final int lvo = com.tencent.mm.bp.a.fromDPToPix(ad.getContext(), 96);
  public static final int lvp = com.tencent.mm.bp.a.fromDPToPix(ad.getContext(), 76);
  public Intent intent;
  public h oSM;
  private Point oSN;
  private a oSO;
  private al oSP;
  
  static
  {
    String str = q.zz();
    byN = str;
    byO = o.getString(str.hashCode());
  }
  
  private void ab(Intent paramIntent)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.VoipVoiceMiniManager", "mini now..");
    if (this.oSM != null) {
      dismiss();
    }
    if (this.oSM == null) {
      this.oSM = new h(ad.getContext());
    }
    if (this.oSP != null) {
      this.oSP.SO();
    }
    this.oSM.setOnClickListener(new g.2(this, paramIntent));
    WindowManager localWindowManager = (WindowManager)ad.getContext().getSystemService("window");
    WindowManager.LayoutParams localLayoutParams = new WindowManager.LayoutParams();
    localLayoutParams.type = 2002;
    localLayoutParams.format = 1;
    localLayoutParams.flags = 40;
    localLayoutParams.gravity = 51;
    localLayoutParams.width = lvp;
    localLayoutParams.height = lvo;
    if (this.oSN == null)
    {
      au.HU();
      int i = c.DT().getInt(327947, 0);
      int j = lvi;
      localLayoutParams.x = (com.tencent.mm.bp.a.fk(ad.getContext()) - localLayoutParams.width - j);
      localLayoutParams.y = (i + j);
    }
    try
    {
      for (;;)
      {
        localWindowManager.addView(this.oSM, localLayoutParams);
        this.oSO.a(paramIntent, this.oSM);
        return;
        localLayoutParams.x = this.oSN.x;
        localLayoutParams.y = this.oSN.y;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.VoipVoiceMiniManager", "add failed", new Object[] { localException });
      }
    }
  }
  
  public final void OI(String paramString)
  {
    if (this.oSM != null) {
      this.oSM.OI(paramString);
    }
  }
  
  public final void a(Intent paramIntent, a parama)
  {
    if (parama == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.VoipVoiceMiniManager", "showMini, VoipMiniCallBack cannot be null!");
      return;
    }
    this.intent = paramIntent;
    this.oSO = parama;
    if (!b.bv(ad.getContext()))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.VoipVoiceMiniManager", "mini, permission denied");
      Context localContext = ad.getContext();
      RequestFloatWindowPermissionDialog.a(localContext, localContext.getString(R.l.voip_float_permission_alert_content), new g.1(this, parama, paramIntent));
      return;
    }
    ab(paramIntent);
  }
  
  public final void dismiss()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.VoipVoiceMiniManager", "dismiss now..");
    WindowManager localWindowManager = (WindowManager)ad.getContext().getSystemService("window");
    try
    {
      if (this.oSM != null)
      {
        WindowManager.LayoutParams localLayoutParams = (WindowManager.LayoutParams)this.oSM.getLayoutParams();
        this.oSN = new Point(localLayoutParams.x, localLayoutParams.y);
        localWindowManager.removeView(this.oSM);
        this.oSM.setOnClickListener(null);
        this.oSM = null;
      }
      return;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.VoipVoiceMiniManager", "remove failed", new Object[] { localException });
    }
  }
  
  public final void wQ(int paramInt)
  {
    if (this.oSM != null)
    {
      String str = String.format("%02d:%02d", new Object[] { Integer.valueOf(paramInt / 60), Integer.valueOf(paramInt % 60) });
      this.oSM.OJ(str);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/voip/ui/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */