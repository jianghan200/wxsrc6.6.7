package com.tencent.mm.plugin.sns.storage;

import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.protocal.c.bsu;
import com.tencent.mm.protocal.c.qc;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class i
{
  public static boolean fb(long paramLong)
  {
    int i = 2;
    int j = 0;
    Object localObject = af.byo().fi(paramLong);
    if (localObject == null) {}
    boolean bool2;
    ArrayList localArrayList;
    label144:
    do
    {
      return false;
      String[] arrayOfString = ((String)g.Ei().DT().get(aa.a.taf, "")).split("&");
      if ((arrayOfString.length > 0) && (bi.getBoolean(arrayOfString[0], false)))
      {
        bool1 = true;
        if ((arrayOfString.length < 2) || (!bi.getBoolean(arrayOfString[1], false))) {
          break label144;
        }
      }
      for (bool2 = true;; bool2 = false)
      {
        localArrayList = new ArrayList();
        while (i < arrayOfString.length)
        {
          long l = bi.getLong(arrayOfString[i], 0L);
          if (l != 0L) {
            localArrayList.add(Long.valueOf(l));
          }
          i += 1;
        }
        bool1 = false;
        break;
      }
      if (((n)localObject).bAJ().sqc.ruz != 15) {
        break;
      }
    } while (bool1);
    boolean bool1 = true;
    for (;;)
    {
      if (!localArrayList.contains(Long.valueOf(paramLong))) {
        localArrayList.add(Long.valueOf(paramLong));
      }
      localObject = new StringBuilder().append(bool1).append("&").append(bool2);
      i = j;
      while (i < localArrayList.size())
      {
        ((StringBuilder)localObject).append("&").append(localArrayList.get(i));
        i += 1;
      }
      if ((((n)localObject).bAJ().sqc.ruz != 1) || (bool2)) {
        break;
      }
      bool2 = true;
    }
    g.Ei().DT().a(aa.a.taf, ((StringBuilder)localObject).toString());
    h(Long.valueOf(paramLong));
    return true;
  }
  
  public static void fc(long paramLong)
  {
    boolean bool2 = true;
    int j = 0;
    Object localObject = ((String)g.Ei().DT().get(aa.a.taf, "")).split("&");
    boolean bool1;
    if ((localObject.length > 0) && (bi.getBoolean(localObject[0], false)))
    {
      bool1 = true;
      if ((localObject.length < 2) || (!bi.getBoolean(localObject[1], false))) {
        break label128;
      }
    }
    ArrayList localArrayList;
    int i;
    for (;;)
    {
      localArrayList = new ArrayList();
      i = 2;
      while (i < localObject.length)
      {
        long l = bi.getLong(localObject[i], 0L);
        if (l != 0L) {
          localArrayList.add(Long.valueOf(l));
        }
        i += 1;
      }
      bool1 = false;
      break;
      label128:
      bool2 = false;
    }
    localArrayList.remove(Long.valueOf(paramLong));
    Collections.reverse(localArrayList);
    if (localArrayList.size() > 0) {}
    for (localObject = (Long)localArrayList.get(0);; localObject = null)
    {
      h((Long)localObject);
      localObject = new StringBuilder().append(bool1).append("&").append(bool2);
      i = j;
      while (i < localArrayList.size())
      {
        ((StringBuilder)localObject).append("&").append(localArrayList.get(i));
        i += 1;
      }
    }
    g.Ei().DT().a(aa.a.taf, ((StringBuilder)localObject).toString());
  }
  
  public static void h(Long paramLong)
  {
    g.Ei().DT().a(aa.a.tah, paramLong);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */