package com.tencent.mm.plugin.wear.model.g;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import com.tencent.mm.g.a.ts;
import com.tencent.mm.g.a.ts.b;
import com.tencent.mm.plugin.wear.ui.WearYoLockUI;
import com.tencent.mm.plugin.wear.ui.WearYoNoLockUI;
import com.tencent.mm.protocal.c.cfh;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class a
{
  private PowerManager pJg = (PowerManager)ad.getContext().getSystemService("power");
  private KeyguardManager pJh = (KeyguardManager)ad.getContext().getSystemService("keyguard");
  LinkedHashMap<String, a> pKi = new LinkedHashMap();
  
  public static ts PR(String paramString)
  {
    ts localts = new ts();
    localts.cfs.bIH = 1;
    localts.cfs.username = paramString;
    com.tencent.mm.sdk.b.a.sFg.m(localts);
    return localts;
  }
  
  public final void bSB()
  {
    if (PR(null).cft.cfu != 0)
    {
      x.i("MicroMsg.wear.WearYoLogic", "current show yo");
      return;
    }
    for (;;)
    {
      Object localObject5;
      synchronized (this.pKi)
      {
        Object localObject1 = this.pKi.entrySet().iterator();
        if (!((Iterator)localObject1).hasNext()) {
          break label281;
        }
        localObject1 = (a)((Map.Entry)((Iterator)localObject1).next()).getValue();
        if (localObject1 != null) {
          this.pKi.remove(((a)localObject1).otZ);
        }
        if (localObject1 == null) {
          break;
        }
        localObject5 = ((a)localObject1).content;
        ??? = new cfh();
        localObject5 = bl.z((String)localObject5, "msg");
        if (localObject5 == null)
        {
          ((cfh)???).hcE = 0;
          localObject5 = new Intent();
          ((Intent)localObject5).putExtra("key_talker", ((a)localObject1).otZ);
        }
      }
      try
      {
        ((Intent)localObject5).putExtra("key_data", ((cfh)???).toByteArray());
        ((Intent)localObject5).addFlags(268435456);
        int i;
        if ((this.pJh.inKeyguardRestrictedInputMode()) || (!this.pJg.isScreenOn()))
        {
          i = 1;
          label186:
          if (i == 0) {
            break label263;
          }
          ((Intent)localObject5).setClass(ad.getContext(), WearYoLockUI.class);
        }
        for (;;)
        {
          ad.getContext().startActivity((Intent)localObject5);
          return;
          localObject2 = finally;
          throw ((Throwable)localObject2);
          ((cfh)???).hcE = bi.getInt((String)((Map)localObject5).get(".msg.yo.$type"), 0);
          ((cfh)???).hbF = bi.getInt((String)((Map)localObject5).get(".msg.yo.$count"), 0);
          break;
          i = 0;
          break label186;
          label263:
          ((Intent)localObject5).setClass(ad.getContext(), WearYoNoLockUI.class);
        }
      }
      catch (IOException localIOException)
      {
        for (;;) {}
      }
      label281:
      Object localObject3 = null;
    }
  }
  
  private final class a
  {
    String content;
    String otZ;
    
    public a(String paramString1, String paramString2)
    {
      this.otZ = paramString1;
      this.content = paramString2;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/wear/model/g/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */