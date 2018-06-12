package com.tencent.mm.plugin.sns.model;

import com.tencent.mm.plugin.sns.storage.l;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.protocal.c.bsv;
import com.tencent.mm.protocal.c.vu;
import com.tencent.mm.protocal.c.xs;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.LinkedList;

public final class c
{
  private static long A(long paramLong1, long paramLong2)
  {
    if (((paramLong1 > 0L) && (paramLong2 > 0L)) || ((paramLong1 < 0L) && (paramLong2 < 0L))) {
      return paramLong1 - paramLong2;
    }
    if (paramLong1 < 0L) {
      return 1L;
    }
    return -1L;
  }
  
  public static int a(long paramLong1, long paramLong2, String paramString)
  {
    paramString = af.bys().Nn(paramString);
    Object localObject = paramString.rDy;
    x.i("MicroMsg.FaultLogic", "getLastReqTimeByMinId fault.count %s", new Object[] { Integer.valueOf(paramString.rDy.size()) });
    int j;
    if (((LinkedList)localObject).isEmpty()) {
      j = 0;
    }
    int i;
    do
    {
      return j;
      paramString = (vu)((LinkedList)localObject).getFirst();
      if ((paramLong1 == 0L) || (A(paramString.rzb, paramLong1) > 0L))
      {
        x.e("MicroMsg.FaultLogic", "has a fault  minId:" + paramLong2 + " fault.min:" + paramString.rzb);
        return 0;
      }
      if ((paramLong2 != 0L) && (A(paramString.rza, paramLong2) < 0L))
      {
        x.e("MicroMsg.FaultLogic", ":" + paramLong2 + " fault.max:" + paramString.rza);
        return 0;
      }
      paramString = paramString.rzc;
      if (paramString.isEmpty()) {
        return 0;
      }
      paramString = paramString.iterator();
      j = Integer.MAX_VALUE;
      do
      {
        do
        {
          if (!paramString.hasNext()) {
            break;
          }
          localObject = (bsv)paramString.next();
        } while ((paramLong2 != 0L) && (A(paramLong2, ((bsv)localObject).sqm) < 0L));
        i = j;
        if (((bsv)localObject).sqn < j) {
          i = ((bsv)localObject).sqn;
        }
        j = i;
      } while (A(paramLong1, ((bsv)localObject).sqm) < 0L);
      j = i;
    } while (i != Integer.MAX_VALUE);
    return 0;
    x.i("MicroMsg.FaultLogic", "should not to hear  minId:" + paramLong1);
    return 0;
  }
  
  private static vu a(vu paramvu1, vu paramvu2)
  {
    vu localvu = new vu();
    if (A(paramvu1.rza, paramvu2.rza) > 0L)
    {
      localvu.rza = paramvu1.rza;
      if (A(paramvu1.rzb, paramvu2.rzb) >= 0L) {
        break label127;
      }
      localvu.rzb = paramvu1.rzb;
      label59:
      paramvu1 = paramvu1.rzc;
      paramvu2 = paramvu2.rzc.iterator();
    }
    for (;;)
    {
      if (!paramvu2.hasNext()) {
        break label634;
      }
      bsv localbsv1 = (bsv)paramvu2.next();
      if (paramvu1.isEmpty())
      {
        x.e("MicroMsg.FaultLogic", "fault's segments should not empty!!");
        paramvu1.addFirst(localbsv1);
        continue;
        localvu.rza = paramvu2.rza;
        break;
        label127:
        localvu.rzb = paramvu2.rzb;
        break label59;
      }
      long l1 = localbsv1.sqm;
      int i = paramvu1.size() - 1;
      label153:
      label178:
      int j;
      if (i >= 0) {
        if (A(l1, ((bsv)paramvu1.get(i)).sqk) <= 0L)
        {
          l1 = localbsv1.sqk;
          j = 0;
          label187:
          if (j >= paramvu1.size()) {
            break label249;
          }
          if (A(l1, ((bsv)paramvu1.get(j)).sqm) < 0L) {
            break label242;
          }
        }
      }
      for (;;)
      {
        if (i != -1) {
          break label257;
        }
        paramvu1.addFirst(localbsv1);
        break;
        i -= 1;
        break label153;
        i = -1;
        break label178;
        label242:
        j += 1;
        break label187;
        label249:
        j = paramvu1.size();
      }
      label257:
      if (j == paramvu1.size())
      {
        paramvu1.addLast(localbsv1);
      }
      else
      {
        bsv localbsv2 = (bsv)paramvu1.get(j);
        int k = i;
        int m = j;
        bsv localbsv3;
        if (A(localbsv1.sqk, localbsv2.sqk) < 0L)
        {
          localbsv3 = new bsv();
          localbsv3.sqk = localbsv2.sqk;
          l1 = localbsv1.sqk;
          if (l1 != Long.MAX_VALUE) {
            break label488;
          }
        }
        label488:
        for (l1 = Long.MIN_VALUE;; l1 += 1L)
        {
          localbsv3.sqm = l1;
          localbsv3.sqn = localbsv2.sqn;
          paramvu1.add(j, localbsv3);
          k = i + 1;
          m = j + 1;
          localbsv2 = (bsv)paramvu1.get(k);
          i = k;
          if (A(localbsv1.sqm, localbsv2.sqm) > 0L)
          {
            localbsv3 = new bsv();
            localbsv3.sqm = localbsv2.sqm;
            localbsv3.sqk = eJ(localbsv1.sqm);
            localbsv3.sqn = localbsv2.sqn;
            paramvu1.add(k + 1, localbsv3);
            i = k;
          }
          while (i >= m)
          {
            paramvu1.remove(i);
            i -= 1;
          }
        }
        paramvu1.add(m, localbsv1);
        if (paramvu1.size() > 100)
        {
          long l2 = ((bsv)paramvu1.getLast()).sqm;
          l1 = ((bsv)paramvu1.getLast()).sqk;
          for (i = ((bsv)paramvu1.getLast()).sqn; paramvu1.size() >= 100; i = j)
          {
            localbsv1 = (bsv)paramvu1.removeLast();
            l1 = localbsv1.sqk;
            j = i;
            if (localbsv1.sqn < i) {
              j = localbsv1.sqn;
            }
          }
          localbsv1 = new bsv();
          localbsv1.sqk = l1;
          localbsv1.sqm = l2;
          localbsv1.sqn = i;
          paramvu1.addLast(localbsv1);
        }
      }
    }
    label634:
    localvu.rzc = paramvu1;
    return localvu;
  }
  
  public static void d(String paramString, long paramLong1, long paramLong2, int paramInt)
  {
    if (paramLong2 == 0L) {}
    label488:
    for (;;)
    {
      return;
      Object localObject1 = af.bys().Nn(paramString);
      if (localObject1 == null) {
        localObject1 = new xs();
      }
      for (;;)
      {
        if ((paramLong1 == 0L) && (((xs)localObject1).rDy.isEmpty())) {
          break label488;
        }
        long l = paramLong1;
        if (paramLong1 == 0L) {
          l = ((vu)((xs)localObject1).rDy.getFirst()).rza;
        }
        Object localObject2 = new vu();
        ((vu)localObject2).rza = l;
        ((vu)localObject2).rzb = paramLong2;
        Object localObject3 = new bsv();
        ((bsv)localObject3).sqk = l;
        ((bsv)localObject3).sqm = paramLong2;
        ((bsv)localObject3).sqn = paramInt;
        ((vu)localObject2).rzc.add(localObject3);
        for (;;)
        {
          if (!((xs)localObject1).rDy.isEmpty())
          {
            localObject3 = (vu)((xs)localObject1).rDy.getFirst();
            if (A(((vu)localObject2).rzb, ((vu)localObject3).rza) > 0L) {
              x.e("MicroMsg.FaultLogic", "has a fault: newerMin:" + ((vu)localObject2).rzb + " fault.Max" + ((vu)localObject3).rza);
            }
          }
          else
          {
            ((xs)localObject1).rDy.addFirst(localObject2);
            while (((xs)localObject1).rDy.size() > 100) {
              ((xs)localObject1).rDy.removeLast();
            }
          }
          ((xs)localObject1).rDy.removeFirst();
          localObject2 = a((vu)localObject3, (vu)localObject2);
        }
        if (((xs)localObject1).rDy.size() > 0) {
          x.d("MicroMsg.FaultLogic", "min " + ((vu)((xs)localObject1).rDy.get(0)).rzb + " max " + ((vu)((xs)localObject1).rDy.get(0)).rza);
        }
        localObject2 = af.bys().Np(paramString);
        try
        {
          ((l)localObject2).field_userName = paramString;
          ((l)localObject2).field_faultS = ((xs)localObject1).toByteArray();
          af.bys().c((l)localObject2);
          if (((xs)localObject1).rDy.size() <= 1) {
            break;
          }
          x.d("MicroMsg.FaultLogic", "fault size : " + ((xs)localObject1).rDy.size());
          paramString = ((xs)localObject1).rDy.iterator();
          while (paramString.hasNext())
          {
            localObject1 = (vu)paramString.next();
            x.d("MicroMsg.FaultLogic", "min - max " + ((vu)localObject1).rzb + " " + ((vu)localObject1).rza);
          }
        }
        catch (Exception paramString)
        {
          for (;;) {}
        }
      }
    }
  }
  
  public static long eJ(long paramLong)
  {
    if (paramLong == Long.MIN_VALUE) {
      return Long.MAX_VALUE;
    }
    return paramLong - 1L;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/sns/model/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */