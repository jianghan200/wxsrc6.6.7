package com.tencent.mm.plugin.welab.a;

import android.text.TextUtils;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.b;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.plugin.welab.e.a;
import com.tencent.mm.protocal.c.aqg;
import com.tencent.mm.protocal.c.aqh;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public final class b
  implements com.tencent.mm.plugin.welab.a.a.a
{
  private Map<String, Integer> qmR = new HashMap();
  private String tag = "";
  
  public b()
  {
    bYM();
  }
  
  private void bYM()
  {
    this.tag = ((String)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sXj, null));
    com.tencent.mm.sdk.platformtools.x.i("LabAppLifeService", "load red tag " + this.tag);
    if (!TextUtils.isEmpty(this.tag))
    {
      String[] arrayOfString = this.tag.split("&");
      int j = arrayOfString.length;
      int i = 0;
      while (i < j)
      {
        Object localObject = arrayOfString[i];
        if (!TextUtils.isEmpty((CharSequence)localObject))
        {
          localObject = ((String)localObject).split("=");
          if ((localObject != null) && (localObject.length == 2)) {
            this.qmR.put(localObject[0], Integer.valueOf(bi.WU(localObject[1])));
          }
        }
        i += 1;
      }
    }
  }
  
  public final boolean RX(String paramString)
  {
    if (com.tencent.mm.plugin.welab.b.bYI().RT(paramString).field_Switch == 2)
    {
      com.tencent.mm.sdk.platformtools.x.i("LabAppLifeService", "appid %s is open ", new Object[] { paramString });
      return true;
    }
    com.tencent.mm.sdk.platformtools.x.i("LabAppLifeService", "appid %s is close", new Object[] { paramString });
    return false;
  }
  
  public final boolean RY(String paramString)
  {
    return (this.qmR.get(paramString) == null) || (((Integer)this.qmR.get(paramString)).intValue() == 0);
  }
  
  public final boolean RZ(String paramString)
  {
    com.tencent.mm.plugin.welab.c.a.a locala = com.tencent.mm.plugin.welab.b.bYI().RT(paramString);
    paramString = new StringBuilder("hitExp ").append(paramString).append(", ");
    if (locala.isRunning()) {}
    for (boolean bool = true;; bool = false)
    {
      com.tencent.mm.sdk.platformtools.x.i("LabAppLifeService", bool);
      if (!locala.isRunning()) {
        break;
      }
      return true;
    }
    return false;
  }
  
  public final void bh(String paramString, boolean paramBoolean)
  {
    int j = 1;
    com.tencent.mm.sdk.platformtools.x.i("LabAppLifeService", "switchEntry " + paramString + "," + paramBoolean);
    com.tencent.mm.plugin.welab.c.a.a locala = com.tencent.mm.plugin.welab.b.bYI().RT(paramString);
    if (paramBoolean)
    {
      i = 2;
      if (locala.field_Switch != i)
      {
        locala.field_Switch = i;
        com.tencent.mm.plugin.welab.b.bYI().qmM.c(locala, new String[0]);
        Object localObject = new aqh();
        aqg localaqg = new aqg();
        localaqg.rSI = bi.WU(locala.field_expId);
        localaqg.rSJ = locala.field_LabsAppId;
        if (locala.field_Switch != 2) {
          break label206;
        }
        i = j;
        label132:
        localaqg.rDF = i;
        ((aqh)localObject).dav.add(localaqg);
        localObject = new h.a(207, (com.tencent.mm.bk.a)localObject);
        ((i)com.tencent.mm.kernel.g.l(i.class)).FQ().b((h.b)localObject);
        if (locala.field_Switch != 2) {
          break label211;
        }
      }
    }
    label206:
    label211:
    for (int i = 4;; i = 5)
    {
      com.tencent.mm.plugin.welab.e.n(paramString, i, false);
      return;
      i = 1;
      break;
      i = 2;
      break label132;
    }
  }
  
  public final void open(String paramString)
  {
    this.qmR.put(paramString, Integer.valueOf(1));
    this.tag = (this.tag + "&" + paramString + "=1");
    com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sXj, this.tag);
    com.tencent.mm.plugin.welab.c.a.a locala = com.tencent.mm.plugin.welab.b.bYI().RT(paramString);
    e.a locala1 = new e.a();
    locala1.bPS = paramString;
    locala1.qmP = locala.field_expId;
    locala1.timeStamp = System.currentTimeMillis();
    locala1.action = 3;
    com.tencent.mm.plugin.welab.e.a(locala1);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/welab/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */