package com.tencent.mm.plugin.welab.d;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.s.c;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class b
{
  private static final b qnt = new b();
  public Map<String, Integer> qmR = new HashMap();
  public String tag = "";
  
  private b()
  {
    bYM();
  }
  
  private boolean Sc(String paramString)
  {
    return (this.qmR.containsKey(paramString)) && (((Integer)this.qmR.get(paramString)).intValue() == 1);
  }
  
  private void bYM()
  {
    this.tag = ((String)g.Ei().DT().get(aa.a.sXi, null));
    com.tencent.mm.sdk.platformtools.x.i("WeLabRedPointMgr", "load red tag " + this.tag);
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
  
  public static b bYX()
  {
    return qnt;
  }
  
  public static void bYY()
  {
    Object localObject = com.tencent.mm.plugin.welab.b.bYI().bYJ();
    if ((localObject != null) && (((List)localObject).isEmpty())) {}
    localObject = ((List)localObject).iterator();
    com.tencent.mm.plugin.welab.c.a.a locala;
    do
    {
      if (!((Iterator)localObject).hasNext()) {
        break;
      }
      locala = (com.tencent.mm.plugin.welab.c.a.a)((Iterator)localObject).next();
    } while ((locala == null) || (!qnt.e(locala)));
    for (int i = 0;; i = 1)
    {
      if (i != 0) {
        c.Cp().aV(266267, 266241);
      }
      return;
    }
  }
  
  public static boolean bYZ()
  {
    return c.Cp().aU(266267, 266241);
  }
  
  public static boolean bZa()
  {
    return ad.chZ().getBoolean("key_has_enter_welab", false);
  }
  
  public final boolean e(com.tencent.mm.plugin.welab.c.a.a parama)
  {
    int i;
    if (parama.field_RedPoint == 1)
    {
      if ((!parama.bTJ()) && (parama.field_Switch != 3)) {
        break label31;
      }
      i = 1;
      if (i == 0) {
        break label36;
      }
    }
    label31:
    label36:
    while (Sc(parama.field_LabsAppId))
    {
      return false;
      i = 0;
      break;
    }
    return true;
  }
  
  public final void f(com.tencent.mm.plugin.welab.c.a.a parama)
  {
    if ((parama.field_RedPoint == 1) && (!Sc(parama.field_LabsAppId)) && (parama.bYT())) {
      c.Cp().v(266267, true);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/welab/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */