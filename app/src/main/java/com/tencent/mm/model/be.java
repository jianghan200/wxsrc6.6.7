package com.tencent.mm.model;

import com.tencent.mm.af.a;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.plugin.report.f;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class be
{
  private static final Queue<Integer> dCE = new ConcurrentLinkedQueue();
  private static final long[] dCF = { 0L, 2000L, 5000L, 10000L, 30000L, 60000L, 180000L, 300000L, 600000L, 1800000L, 3600000L };
  private static final int[] dCG = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
  private static final int[] dCH = { 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40 };
  
  public static void a(String paramString, long paramLong1, long paramLong2, int paramInt)
  {
    if (paramString == null) {}
    boolean bool;
    label165:
    long l3;
    label255:
    label423:
    label444:
    label453:
    label468:
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              long l1;
              for (;;)
              {
                return;
                try
                {
                  Object localObject = q.GF();
                  if ((localObject == null) || (!((String)localObject).equals(paramString)))
                  {
                    localObject = ((i)g.l(i.class)).FR().Yg(paramString);
                    if (paramString.endsWith("@chatroom"))
                    {
                      if (((ai)localObject).csI != 0) {
                        x.i("MicroMsg.MsgReporter", "[oneliang]it is a normal chatroom? username:%s", new Object[] { paramString });
                      }
                    }
                    else
                    {
                      do
                      {
                        l1 = bx.IR();
                        if (l1 > 0L) {
                          break label165;
                        }
                        x.i("MicroMsg.MsgReporter", "[oneliang]current server time is 0l,then return");
                        return;
                        if ((s.hL(paramString)) || (ab.XO(paramString)) || (ab.XQ(paramString)) || (s.hH(paramString)) || (ab.gY(paramString))) {
                          break;
                        }
                        bool = ((ab)localObject).ckW();
                      } while (!bool);
                      return;
                    }
                  }
                }
                catch (Exception paramString)
                {
                  x.e("MicroMsg.MsgReporter", "[oneliang]something about contact has exception:%s", new Object[] { paramString.getMessage() });
                  return;
                }
              }
              long l2 = System.currentTimeMillis();
              l3 = l1 - paramLong2;
              x.i("MicroMsg.MsgReporter", "[oneliang]current server time:%s, msg server time:%s, intervalTime:%s, username:%s, msg server id:%s,msg type:%s", new Object[] { Long.valueOf(l1), Long.valueOf(paramLong2), Long.valueOf(l3), paramString, Long.valueOf(paramLong1), Integer.valueOf(paramInt) });
              bool = a.bm(paramLong2);
              int i;
              if (bool)
              {
                f.mDy.a(780L, 100L, 1L, false);
                i = dCF.length - 1;
              }
              for (;;)
              {
                if (i >= 0)
                {
                  if (l3 < dCF[i]) {
                    break label444;
                  }
                  if (!bool) {
                    break label423;
                  }
                  f.mDy.a(780L, dCG[i], 1L, false);
                }
                for (;;)
                {
                  if (l3 >= 2000L) {
                    a.a(l1, l2, paramLong2, l3, paramLong1);
                  }
                  switch (paramInt)
                  {
                  default: 
                    return;
                  case 1: 
                    if (l3 < 60000L) {
                      break label468;
                    }
                    if (!bool) {
                      break label453;
                    }
                    f.mDy.a(780L, 113L, 1L, false);
                    return;
                    f.mDy.a(780L, 101L, 1L, false);
                    break label255;
                    f.mDy.a(780L, dCH[i], 1L, false);
                  }
                }
                i -= 1;
              }
              f.mDy.a(780L, 118L, 1L, false);
              return;
              if (l3 >= 30000L)
              {
                if (bool)
                {
                  f.mDy.a(780L, 112L, 1L, false);
                  return;
                }
                f.mDy.a(780L, 117L, 1L, false);
                return;
              }
              if (l3 >= 10000L)
              {
                if (bool)
                {
                  f.mDy.a(780L, 111L, 1L, false);
                  return;
                }
                f.mDy.a(780L, 116L, 1L, false);
                return;
              }
            } while (l3 < 0L);
            if (bool)
            {
              f.mDy.a(780L, 110L, 1L, false);
              return;
            }
            f.mDy.a(780L, 115L, 1L, false);
            return;
            if (l3 >= 60000L)
            {
              if (bool)
              {
                f.mDy.a(780L, 123L, 1L, false);
                return;
              }
              f.mDy.a(780L, 128L, 1L, false);
              return;
            }
            if (l3 >= 30000L)
            {
              if (bool)
              {
                f.mDy.a(780L, 122L, 1L, false);
                return;
              }
              f.mDy.a(780L, 127L, 1L, false);
              return;
            }
            if (l3 >= 10000L)
            {
              if (bool)
              {
                f.mDy.a(780L, 121L, 1L, false);
                return;
              }
              f.mDy.a(780L, 126L, 1L, false);
              return;
            }
          } while (l3 < 0L);
          if (bool)
          {
            f.mDy.a(780L, 120L, 1L, false);
            return;
          }
          f.mDy.a(780L, 125L, 1L, false);
          return;
          if (l3 >= 60000L)
          {
            if (bool)
            {
              f.mDy.a(780L, 133L, 1L, false);
              return;
            }
            f.mDy.a(780L, 138L, 1L, false);
            return;
          }
          if (l3 >= 30000L)
          {
            if (bool)
            {
              f.mDy.a(780L, 132L, 1L, false);
              return;
            }
            f.mDy.a(780L, 137L, 1L, false);
            return;
          }
          if (l3 >= 10000L)
          {
            if (bool)
            {
              f.mDy.a(780L, 131L, 1L, false);
              return;
            }
            f.mDy.a(780L, 136L, 1L, false);
            return;
          }
        } while (l3 < 0L);
        if (bool)
        {
          f.mDy.a(780L, 130L, 1L, false);
          return;
        }
        f.mDy.a(780L, 135L, 1L, false);
        return;
        if (l3 >= 60000L)
        {
          if (bool)
          {
            f.mDy.a(780L, 143L, 1L, false);
            return;
          }
          f.mDy.a(780L, 148L, 1L, false);
          return;
        }
        if (l3 >= 30000L)
        {
          if (bool)
          {
            f.mDy.a(780L, 142L, 1L, false);
            return;
          }
          f.mDy.a(780L, 147L, 1L, false);
          return;
        }
        if (l3 >= 10000L)
        {
          if (bool)
          {
            f.mDy.a(780L, 141L, 1L, false);
            return;
          }
          f.mDy.a(780L, 146L, 1L, false);
          return;
        }
      } while (l3 < 0L);
      if (bool)
      {
        f.mDy.a(780L, 140L, 1L, false);
        return;
      }
      f.mDy.a(780L, 145L, 1L, false);
      return;
      if (l3 >= 60000L)
      {
        if (bool)
        {
          f.mDy.a(780L, 153L, 1L, false);
          return;
        }
        f.mDy.a(780L, 158L, 1L, false);
        return;
      }
      if (l3 >= 30000L)
      {
        if (bool)
        {
          f.mDy.a(780L, 152L, 1L, false);
          return;
        }
        f.mDy.a(780L, 157L, 1L, false);
        return;
      }
      if (l3 >= 10000L)
      {
        if (bool)
        {
          f.mDy.a(780L, 151L, 1L, false);
          return;
        }
        f.mDy.a(780L, 156L, 1L, false);
        return;
      }
    } while (l3 < 0L);
    if (bool)
    {
      f.mDy.a(780L, 150L, 1L, false);
      return;
    }
    f.mDy.a(780L, 155L, 1L, false);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/model/be.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */