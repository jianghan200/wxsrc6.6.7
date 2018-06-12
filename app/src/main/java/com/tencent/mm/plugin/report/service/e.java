package com.tencent.mm.plugin.report.service;

import com.tencent.mars.smc.IDKey;
import com.tencent.mars.smc.SmcLogic;
import com.tencent.mm.plugin.report.b.a;
import com.tencent.mm.protocal.c.amj;
import com.tencent.mm.protocal.c.avj;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class e
{
  private static boolean mDt = false;
  private static Map<Long, Long> mEr;
  private static a mEs = new a();
  private static int mEt = -1;
  private static boolean mEu = false;
  
  public static void a(long paramLong, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean2) {}
    for (;;)
    {
      try
      {
        SmcLogic.writeImportKvData(paramLong, paramString, paramBoolean1);
        if (mDt)
        {
          j localj = j.brV();
          if ((localj.mDt) && (localj.mFb != null))
          {
            x.v("MicroMsg.SubCoreReport", "put kv info [%d %s]", new Object[] { Long.valueOf(paramLong), paramString });
            Object localObject = (List)localj.mFb.get(String.valueOf(paramLong));
            paramBoolean1 = false;
            if (localObject != null) {
              break;
            }
            localObject = new LinkedList();
            ((List)localObject).add(0, new d(paramLong, paramString, bi.VF(), paramBoolean1));
            localj.mFb.put(String.valueOf(paramLong), localObject);
          }
        }
        return;
      }
      catch (Exception localException)
      {
        x.e("MicroMsg.KVEasyReport", "localReport :%s", new Object[] { bi.i(localException) });
        continue;
      }
      try
      {
        SmcLogic.writeKvData(paramLong, paramString, paramBoolean1);
      }
      catch (Throwable localThrowable)
      {
        x.printErrStackTrace("MicroMsg.KVEasyReport", localThrowable, "", new Object[0]);
        if (com.tencent.mm.compatible.util.d.fS(20)) {
          SmcLogic.writeKvData(paramLong, paramString, paramBoolean1);
        } else {
          throw localThrowable;
        }
      }
    }
    d locald = (d)localThrowable.get(localThrowable.size() - 1);
    if (bi.bH(locald.mEo) < 1000L) {}
    for (paramBoolean1 = true;; paramBoolean1 = false)
    {
      if (paramBoolean1) {
        locald.mEq = true;
      }
      break;
    }
  }
  
  public static void a(long paramLong, byte[] paramArrayOfByte, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean2) {
      try
      {
        SmcLogic.writeImportKvPbData(paramLong, paramArrayOfByte, paramBoolean1);
        return;
      }
      catch (Exception paramArrayOfByte)
      {
        x.e("MicroMsg.KVEasyReport", "localReport :%s", new Object[] { bi.i(paramArrayOfByte) });
        return;
      }
    }
    SmcLogic.writeKvPbData(paramLong, paramArrayOfByte, paramBoolean1);
  }
  
  public static void b(long paramLong1, long paramLong2, long paramLong3, boolean paramBoolean)
  {
    for (;;)
    {
      int i;
      label11:
      int j;
      if (e.class.getClassLoader() == null)
      {
        i = -1;
        if (Thread.currentThread().getContextClassLoader() != null) {
          break label119;
        }
        j = -1;
        x.i("MicroMsg.KVEasyReport", "SmcLogic.reportIDKey class loader %s, %s ", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
      }
      try
      {
        SmcLogic.reportIDKey(paramLong1, paramLong2, paramLong3, paramBoolean);
        if (mEu)
        {
          if (mEr == null) {
            brQ();
          }
          long l = bi.a((Long)mEr.get(Long.valueOf(paramLong1)), 0L);
          paramLong1 = l;
          if (l > 0L) {
            continue;
          }
        }
        return;
        i = e.class.getClassLoader().hashCode();
        break label11;
        label119:
        j = Thread.currentThread().getContextClassLoader().hashCode();
      }
      catch (Throwable localThrowable)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.KVEasyReport", localThrowable, "", new Object[0]);
          if (!com.tencent.mm.compatible.util.d.fS(20)) {
            break;
          }
          SmcLogic.reportIDKey(paramLong1, paramLong2, paramLong3, paramBoolean);
        }
        throw localThrowable;
      }
    }
  }
  
  public static void brQ()
  {
    try
    {
      if (mEr == null) {
        mEr = new HashMap(20);
      }
      Object localObject1 = a.brI();
      if ((localObject1 != null) && (((amj)localObject1).rOY != mEt))
      {
        mEt = ((amj)localObject1).rOY;
        mEr.clear();
        localObject1 = ((amj)localObject1).rOZ;
        if (localObject1 != null)
        {
          localObject1 = ((LinkedList)localObject1).iterator();
          while (((Iterator)localObject1).hasNext())
          {
            avj localavj = (avj)((Iterator)localObject1).next();
            mEr.put(new Long(localavj.rYf), new Long(localavj.rYg));
          }
        }
      }
    }
    finally {}
    tmp137_134[0] = Integer.valueOf(mEt);
    Object[] tmp146_137 = tmp137_134;
    tmp146_137[1] = Integer.valueOf(mEr.size());
    Object[] tmp160_146 = tmp146_137;
    tmp160_146[2] = mEr;
    Object[] tmp166_160 = tmp160_146;
    tmp166_160[3] = bi.cjd();
    x.i("MicroMsg.KVEasyReport", "summerhv reloadHeavyUserIDMap heavyUserIDMap[%d][%d][%s], stack[%s]", tmp166_160);
  }
  
  public static void c(ArrayList<IDKey> paramArrayList, boolean paramBoolean)
  {
    if (paramArrayList != null) {}
    try
    {
      SmcLogic.reportListIDKey((IDKey[])paramArrayList.toArray(new IDKey[paramArrayList.size()]), paramBoolean);
      return;
    }
    catch (Throwable localThrowable)
    {
      x.printErrStackTrace("MicroMsg.KVEasyReport", localThrowable, "", new Object[0]);
      if (com.tencent.mm.compatible.util.d.fS(20))
      {
        SmcLogic.reportListIDKey((IDKey[])paramArrayList.toArray(new IDKey[paramArrayList.size()]), paramBoolean);
        return;
      }
      throw localThrowable;
    }
  }
  
  public static void hr(boolean paramBoolean)
  {
    mDt = paramBoolean;
  }
  
  public static void ht(boolean paramBoolean)
  {
    x.i("MicroMsg.KVEasyReport", "summerhv setHeavyUser [%b %b], stack[%s]", new Object[] { Boolean.valueOf(mEu), Boolean.valueOf(paramBoolean), bi.cjd() });
    mEu = paramBoolean;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/report/service/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */