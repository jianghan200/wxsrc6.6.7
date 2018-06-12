package com.tencent.mm.plugin.sns.lucky.a;

import com.tencent.mm.a.g;
import com.tencent.mm.model.q;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.aj;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.protocal.c.amh;
import com.tencent.mm.protocal.c.atf;
import com.tencent.mm.protocal.c.bou;
import com.tencent.mm.protocal.c.boy;
import com.tencent.mm.protocal.c.bpn;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class m
{
  private static final ThreadLocal<HashMap<String, Long>> nmc = new ThreadLocal();
  
  public static boolean LS(String paramString)
  {
    paramString = af.byo().Nl(paramString);
    return a(paramString, aj.n(paramString));
  }
  
  public static boolean a(n paramn, boy paramboy)
  {
    atf localatf = paramn.bAW();
    if (paramn.field_type != 21) {
      return true;
    }
    if (localatf.ceS == 1) {
      return true;
    }
    if (q.GF().equals(paramn.field_userName)) {
      return true;
    }
    if (paramboy.smZ != null)
    {
      paramboy = paramboy.smZ.snC;
      if ((paramboy == null) || (paramboy.size() == 0)) {
        return false;
      }
      paramn = q.GF();
      paramboy = paramboy.iterator();
      while (paramboy.hasNext()) {
        if (paramn.equals(((bou)paramboy.next()).rdS)) {
          return true;
        }
      }
    }
    return false;
  }
  
  public static long b(n paramn, boy paramboy)
  {
    long l = 0L;
    if (paramn == null) {}
    Object localObject1;
    Object localObject2;
    do
    {
      do
      {
        do
        {
          return 0L;
          localObject1 = paramboy;
          if (paramboy == null) {
            localObject1 = aj.n(paramn);
          }
        } while (localObject1 == null);
        paramboy = ((boy)localObject1).smZ;
      } while (paramboy == null);
      localObject2 = paramboy.snC;
    } while (localObject2 == null);
    paramboy = paramn.nJb;
    if (bi.oW(paramboy)) {}
    for (paramn = g.u(paramn.field_content) + g.u(paramn.field_attrBuf);; paramn = paramboy)
    {
      localObject1 = (HashMap)nmc.get();
      if ((localObject1 != null) && (((HashMap)localObject1).containsKey(paramn))) {
        return ((Long)((HashMap)localObject1).get(paramn)).longValue();
      }
      paramboy = ((List)localObject2).iterator();
      for (;;)
      {
        if (paramboy.hasNext())
        {
          bou localbou = (bou)paramboy.next();
          localObject2 = new amh();
          try
          {
            ((amh)localObject2).aG(ab.a(localbou.sml));
            l += ((amh)localObject2).cfh;
          }
          catch (Exception localException)
          {
            for (;;)
            {
              x.e("MicrMsg.SnsLuckyUtil", localException.getMessage() + "hbBuffer is error");
            }
          }
        }
      }
      paramboy = (boy)localObject1;
      if (localObject1 == null) {
        paramboy = new HashMap();
      }
      paramboy.put(paramn, Long.valueOf(l));
      nmc.set(paramboy);
      return l;
    }
  }
  
  public static boolean h(n paramn)
  {
    return a(paramn, aj.n(paramn));
  }
  
  public static int i(n paramn)
  {
    if (paramn == null) {}
    do
    {
      do
      {
        return 0;
        paramn = aj.n(paramn);
      } while (paramn == null);
      paramn = paramn.smZ;
    } while ((paramn == null) || (paramn.snC.size() == 0));
    return paramn.snC.size();
  }
  
  public static long j(n paramn)
  {
    return b(paramn, null);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sns/lucky/a/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */