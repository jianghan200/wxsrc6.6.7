package com.tencent.mm.bt;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Pair;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.hardcoder.HardCoderJNI;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.repair.DBDumpUtil;
import com.tencent.wcdb.repair.DBDumpUtil.ExecuteSqlCallback;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import junit.framework.Assert;

public class h
  implements com.tencent.mm.sdk.e.e
{
  String TAG = "MicroMsg.SqliteDB";
  public int field_MARK_CURSOR_CHECK_IGNORE = 1;
  private long gTh = 0L;
  private a tdL = null;
  public a tdM = new a();
  private String tdN = "";
  public e tdO = null;
  public String tdP = "";
  final LinkedList<b> tdQ = new LinkedList();
  private ag tdR = null;
  protected f tdk = null;
  
  public h() {}
  
  public h(a parama)
  {
    this.tdL = parama;
  }
  
  private void ZL(String paramString)
  {
    String str1 = ad.getProcessName();
    String str2 = ad.getPackageName();
    x.i(this.TAG, "check process :[%s] [%s] path[%s]", new Object[] { str1, str2, paramString });
    if ((str1 != null) && (str2 != null) && (!str2.equals(str1))) {
      Assert.assertTrue("processName:" + str1 + "  packagename:" + str2, false);
    }
  }
  
  public static String fz(String paramString)
  {
    if (bi.oW(paramString)) {
      return "";
    }
    return DatabaseUtils.sqlEscapeString(paramString);
  }
  
  public final boolean ZM(String paramString)
  {
    if (!isOpen())
    {
      x.e(this.TAG, "DB IS CLOSED ! {%s}", new Object[] { bi.cjd() });
      return false;
    }
    try
    {
      this.tdk.execSQL("DROP TABLE " + paramString);
      return false;
    }
    catch (Exception paramString)
    {
      com.tencent.mm.plugin.report.f.mDy.a(181L, 11L, 1L, false);
      x.e(this.TAG, "drop table Error :" + paramString.getMessage());
      c.k(paramString);
    }
    return false;
  }
  
  public final long a(String paramString1, String paramString2, ContentValues paramContentValues, boolean paramBoolean)
  {
    int i = 0;
    if (!isOpen())
    {
      x.e(this.TAG, "DB IS CLOSED ! {%s}", new Object[] { bi.cjd() });
      return -2L;
    }
    boolean bool = HardCoderJNI.hcDBEnable;
    int j = HardCoderJNI.hcDBDelayWrite;
    int k = HardCoderJNI.hcDBCPU;
    int m = HardCoderJNI.hcDBIO;
    if (HardCoderJNI.hcDBThr) {
      i = g.Em().cij();
    }
    i = HardCoderJNI.startPerformance(bool, j, k, m, i, HardCoderJNI.hcDBTimeout, 501, HardCoderJNI.hcDBActionWrite, this.TAG);
    c.begin();
    try
    {
      long l = this.tdk.insert(paramString1, paramString2, paramContentValues);
      c.a(paramString1, null, this.gTh);
      return l;
    }
    catch (Exception paramString1)
    {
      com.tencent.mm.plugin.report.f.mDy.a(181L, 11L, 1L, false);
      x.e(this.TAG, "insert Error :" + paramString1.getMessage());
      c.k(paramString1);
      if (paramBoolean) {
        throw paramString1;
      }
    }
    finally
    {
      HardCoderJNI.stopPerformace(HardCoderJNI.hcDBEnable, i);
    }
    HardCoderJNI.stopPerformace(HardCoderJNI.hcDBEnable, i);
    return -1L;
  }
  
  public final Cursor a(String paramString1, String[] paramArrayOfString1, String paramString2, String[] paramArrayOfString2, String paramString3, String paramString4, String paramString5, int paramInt)
  {
    if (!isOpen())
    {
      x.e(this.TAG, "DB IS CLOSED ! {%s}", new Object[] { bi.cjd() });
      return d.cnR();
    }
    boolean bool = HardCoderJNI.hcDBEnable;
    int j = HardCoderJNI.hcDBDelayQuery;
    int k = HardCoderJNI.hcDBCPU;
    int m = HardCoderJNI.hcDBIO;
    if (HardCoderJNI.hcDBThr) {}
    for (i = g.Em().cij();; i = 0)
    {
      i = HardCoderJNI.startPerformance(bool, j, k, m, i, HardCoderJNI.hcDBTimeout, 501, HardCoderJNI.hcDBActionQuery, this.TAG);
      c.begin();
      try
      {
        paramArrayOfString1 = this.tdk.a(paramString1, paramArrayOfString1, paramString2, paramArrayOfString2, paramString3, paramString4, paramString5, paramInt);
        c.a(paramString1, paramArrayOfString1, this.gTh);
        return paramArrayOfString1;
      }
      catch (Exception paramString1)
      {
        com.tencent.mm.plugin.report.f.mDy.a(181L, 10L, 1L, false);
        x.e(this.TAG, "execSQL Error :" + paramString1.getMessage());
        c.k(paramString1);
        paramString1 = d.cnR();
        return paramString1;
      }
      finally
      {
        HardCoderJNI.stopPerformace(HardCoderJNI.hcDBEnable, i);
      }
    }
  }
  
  public final boolean a(String paramString1, String paramString2, long paramLong, String paramString3, HashMap<Integer, d> paramHashMap)
  {
    return a(paramString1, paramString2, "", paramLong, paramString3, paramHashMap, true);
  }
  
  public final boolean a(String paramString1, String paramString2, String paramString3, long paramLong, String paramString4, HashMap<Integer, d> paramHashMap, boolean paramBoolean)
  {
    int i = paramString1.lastIndexOf("/");
    if (i != -1) {
      this.TAG = (this.TAG + "." + paramString1.substring(i + 1));
    }
    ZL(paramString2);
    if ((this.tdM.a(paramString1, paramString2, paramString3, paramLong, paramString4, paramHashMap, paramBoolean)) && (this.tdM.tdk != null))
    {
      this.tdP = this.tdM.getError();
      this.tdk = this.tdM.tdk;
      return true;
    }
    this.tdP = this.tdM.getError();
    this.tdk = null;
    this.tdM = null;
    x.i(this.TAG, "initDB failed. %s", new Object[] { this.tdP });
    return false;
  }
  
  public final boolean a(String paramString1, String paramString2, String paramString3, List<String> paramList, DBDumpUtil.ExecuteSqlCallback paramExecuteSqlCallback)
  {
    if (!isOpen())
    {
      x.e(this.TAG, "DB IS CLOSED ! {%s}", new Object[] { bi.cjd() });
      return false;
    }
    return DBDumpUtil.doRecoveryDb(this.tdk.tdt, paramString1, paramString2, paramString3, paramList, null, paramExecuteSqlCallback, true);
  }
  
  public final Cursor b(final String paramString, final String[] paramArrayOfString, int paramInt)
  {
    int i = 0;
    if (!bi.oW(paramString)) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue("sql is null ", bool);
      if (isOpen()) {
        break;
      }
      x.e(this.TAG, "DB IS CLOSED ! {%s}", new Object[] { bi.cjd() });
      return d.cnR();
    }
    bool = HardCoderJNI.hcDBEnable;
    int j = HardCoderJNI.hcDBDelayQuery;
    int k = HardCoderJNI.hcDBCPU;
    int m = HardCoderJNI.hcDBIO;
    if (HardCoderJNI.hcDBThr) {
      i = g.Em().cij();
    }
    i = HardCoderJNI.startPerformance(bool, j, k, m, i, HardCoderJNI.hcDBTimeout, 501, HardCoderJNI.hcDBActionQuery, this.TAG);
    c.begin();
    try
    {
      paramArrayOfString = this.tdk.b(paramString, paramArrayOfString, paramInt);
      if ((b.chn()) || (b.chp()))
      {
        if (this.tdR == null)
        {
          localObject = com.tencent.mm.sdk.f.e.Xs("CheckCursor");
          ((HandlerThread)localObject).start();
          this.tdR = new ag(((HandlerThread)localObject).getLooper());
        }
        final Object localObject = new c();
        this.tdR.postDelayed(new Runnable()
        {
          public final void run()
          {
            long l1;
            Object localObject7;
            int i;
            Object localObject8;
            Object localObject9;
            try
            {
              l1 = bi.VF();
              if (paramArrayOfString == null) {
                break label1327;
              }
              if (paramArrayOfString.isClosed()) {
                return;
              }
              localObject7 = new HashMap();
              i = 0;
              Object localObject1 = null;
              synchronized (h.this.tdQ)
              {
                localObject8 = h.this.tdQ.iterator();
                if (!((Iterator)localObject8).hasNext()) {
                  break label604;
                }
                localObject9 = (h.b)((Iterator)localObject8).next();
                if ((localObject9 == null) || (((h.b)localObject9).tdV == null) || (((h.b)localObject9).tdV.isClosed())) {
                  ((Iterator)localObject8).remove();
                }
              }
              if ((l1 - ((h.b)localObject9).lastReportTime) / 1000L <= 100L) {
                break label287;
              }
            }
            catch (Exception localException1)
            {
              x.e(h.this.TAG, "checkCursor table:[%s] e:%s[%s]", new Object[] { paramString, localException1.getMessage(), bi.i(localException1) });
              return;
            }
            ((h.b)localObject9).lastReportTime = l1;
            label287:
            int j;
            if (((h.b)localObject9).tdY) {
              if (TextUtils.isEmpty(((h.b)localObject9).tdZ))
              {
                x.w(h.this.TAG, "CheckCursorRES time:%d MSG: BadOut cu:%s caller:%s outCu:%b kw:%s", new Object[] { Long.valueOf(l1 - ((h.b)localObject9).tdX), Integer.valueOf(((h.b)localObject9).tdV.hashCode()), ((h.b)localObject9).tdW, Boolean.valueOf(((h.b)localObject9).tdY), ((h.b)localObject9).tdZ });
                ??? = (Pair)((HashMap)localObject7).get(((h.b)localObject9).tdW);
                if (??? != null) {
                  break label543;
                }
                if (l1 - ((h.b)localObject9).tdX <= 30000L) {
                  break label1331;
                }
                j = 1;
                label324:
                ??? = new Pair(Integer.valueOf(j), localObject9);
                ((HashMap)localObject7).put(((h.b)localObject9).tdW, ???);
              }
            }
            label352:
            Object localObject3;
            label543:
            label604:
            label663:
            label691:
            label861:
            long l2;
            for (;;)
            {
              if (i < ((Integer)((Pair)???).first).intValue())
              {
                i = ((Integer)((Pair)???).first).intValue();
                localObject3 = ((h.b)((Pair)???).second).tea;
                break label1328;
                x.w(h.this.TAG, "CheckCursorRES time:%d MSG: Adapter cu:%s caller:%s outCu:%b kw:%s", new Object[] { Long.valueOf(l1 - ((h.b)localObject9).tdX), Integer.valueOf(((h.b)localObject9).tdV.hashCode()), ((h.b)localObject9).tdW, Boolean.valueOf(((h.b)localObject9).tdY), ((h.b)localObject9).tdZ });
                break;
                x.w(h.this.TAG, "CheckCursorRES time:%d MSG: NOTCLOSE cu:%s caller:%s outCu:%b kw:%s", new Object[] { Long.valueOf(l1 - ((h.b)localObject9).tdX), Integer.valueOf(((h.b)localObject9).tdV.hashCode()), ((h.b)localObject9).tdW, Boolean.valueOf(((h.b)localObject9).tdY), ((h.b)localObject9).tdZ });
                break;
                if (l1 - ((h.b)localObject9).tdX <= 30000L) {
                  break label1324;
                }
                ??? = new Pair(Integer.valueOf(((Integer)((Pair)???).first).intValue() + 1), ((Pair)???).second);
                ((HashMap)localObject7).put(((h.b)localObject9).tdW, ???);
                continue;
                x.d(h.this.TAG, "CheckCursor: checkAss max:%d list:%d map:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(h.this.tdQ.size()), Integer.valueOf(((HashMap)localObject7).size()) });
                if (!b.chn()) {
                  break label1344;
                }
                j = 20;
                if (i <= j)
                {
                  j = h.this.tdQ.size();
                  if (!b.chn()) {
                    break label1350;
                  }
                  i = 50;
                  break label1336;
                }
                localObject8 = ((HashMap)localObject7).keySet().iterator();
                Pair localPair;
                for (??? = ""; ((Iterator)localObject8).hasNext(); ??? = (String)??? + (String)localObject9 + "," + localPair.first + "," + ((h.b)localPair.second).tdY + "," + ((h.b)localPair.second).tdZ + ";")
                {
                  localObject9 = (String)((Iterator)localObject8).next();
                  localPair = (Pair)((HashMap)localObject7).get(localObject9);
                }
                if (localObject3 != null)
                {
                  ??? = new h.c((String)???);
                  ((h.c)???).setStackTrace(((h.c)localObject3).getStackTrace());
                  throw ((Throwable)???);
                }
                throw new AssertionError(???);
                l2 = bi.VF();
                localObject3 = new h.b();
                ((h.b)localObject3).tdV = paramArrayOfString;
                ((h.b)localObject3).table = paramString;
                ((h.b)localObject3).tdX = l1;
                ((h.b)localObject3).tdW = "";
                ((h.b)localObject3).tdY = true;
                ((h.b)localObject3).tea = localObject;
                ??? = localObject.getStackTrace();
                j = 0;
              }
            }
            for (;;)
            {
              if (j < ???.length)
              {
                localObject8 = ???[j].getClassName();
                ??? = ???[j].getMethodName();
                i = ???[j].getLineNumber();
                localObject7 = ((String)localObject8).replace("com.tencent.mm.", "") + ":" + (String)??? + "(" + i + ")";
                localObject8 = Class.forName((String)localObject8);
              }
              for (;;)
              {
                try
                {
                  localObject9 = ((Class)localObject8).getDeclaredField("field_MARK_CURSOR_CHECK_IGNORE");
                  if (localObject9 == null) {
                    continue;
                  }
                  i = 1;
                }
                catch (Exception localException2)
                {
                  boolean bool1;
                  int k;
                  boolean bool2;
                  label1324:
                  label1327:
                  label1328:
                  label1331:
                  label1336:
                  label1344:
                  label1350:
                  i = 0;
                  continue;
                  j += 1;
                }
                if (i != 0) {
                  continue;
                }
                if (TextUtils.isEmpty(((h.b)localObject3).tdW))
                {
                  ((h.b)localObject3).tdW = ((String)localObject7);
                  localObject7 = ((Class)localObject8).getMethods();
                  bool1 = false;
                  k = localObject7.length;
                  i = 0;
                  bool2 = bool1;
                  if (i < k)
                  {
                    localObject8 = localObject7[i];
                    if (((Method)localObject8).getName().equals(???))
                    {
                      bool1 = ((Method)localObject8).getReturnType().getName().contains(".Cursor");
                      bool2 = bool1;
                      if (bool1 != true) {}
                    }
                  }
                  else
                  {
                    ((h.b)localObject3).tdY = bool2;
                    continue;
                  }
                }
                else
                {
                  if (((h.b)localObject3).tdY)
                  {
                    ??? = ((String)localObject7).toLowerCase();
                    if ((!((String)???).contains("cursor")) && (!((String)???).contains("adapter"))) {
                      continue;
                    }
                    ((h.b)localObject3).tdZ = ((String)localObject7);
                    continue;
                  }
                  if (TextUtils.isEmpty(((h.b)localObject3).tdW)) {
                    ((h.b)localObject3).tdW = aj.b((StackTraceElement[])???);
                  }
                  synchronized (h.this.tdQ)
                  {
                    h.this.tdQ.add(localObject3);
                    x.d(h.this.TAG, "checkCursor insert [%d,%d] caller:%s outCu:%b kw:%s", new Object[] { Long.valueOf(l2 - l1), Long.valueOf(bi.bH(l1)), ((h.b)localObject3).tdW, Boolean.valueOf(((h.b)localObject3).tdY), ((h.b)localObject3).tdZ });
                    return;
                  }
                  continue;
                  break label352;
                  return;
                  break;
                  j = 0;
                  break label324;
                  if (j > i)
                  {
                    break label691;
                    j = 50;
                    break label663;
                    i = 100;
                    continue;
                  }
                  break label861;
                }
                i += 1;
                continue;
                i = 0;
              }
            }
          }
        }, 500L);
      }
      c.a(paramString, paramArrayOfString, this.gTh);
      return paramArrayOfString;
    }
    catch (Exception paramString)
    {
      com.tencent.mm.plugin.report.f.mDy.a(181L, 10L, 1L, false);
      x.e(this.TAG, "execSQL Error :" + paramString.getMessage());
      c.k(paramString);
      paramString = d.cnR();
      return paramString;
    }
    finally
    {
      HardCoderJNI.stopPerformace(HardCoderJNI.hcDBEnable, i);
    }
  }
  
  public final boolean b(String paramString, HashMap<Integer, d> paramHashMap, boolean paramBoolean)
  {
    int i = paramString.lastIndexOf("/");
    if (i != -1) {
      this.TAG = (this.TAG + "." + paramString.substring(i + 1));
    }
    ZL(paramString);
    if ((this.tdM.a(paramString, paramHashMap, paramBoolean)) && (this.tdM.tdk != null))
    {
      this.tdk = this.tdM.tdk;
      x.i(this.TAG, "SqliteDB db %s", new Object[] { this.tdk });
      return true;
    }
    this.tdk = null;
    this.tdM = null;
    x.e(this.TAG, "initDB failed.");
    return false;
  }
  
  public final boolean cjr()
  {
    return (this.tdk == null) || (!this.tdk.isOpen());
  }
  
  public void closeDB()
  {
    ex(null);
  }
  
  public final f cnZ()
  {
    return this.tdk;
  }
  
  public final SQLiteDatabase coa()
  {
    f localf = this.tdk;
    if (localf.tdt != null) {
      return localf.tdt;
    }
    return localf.tdu;
  }
  
  public final long dO(long paramLong)
  {
    long l1 = -1L;
    for (;;)
    {
      long l2;
      try
      {
        l2 = Thread.currentThread().getId();
        x.i(this.TAG, "beginTransaction thr:(%d,%d) ticket:%d db:%b  {%s}", new Object[] { Long.valueOf(paramLong), Long.valueOf(l2), Long.valueOf(this.gTh), Boolean.valueOf(isOpen()), bi.cjd() });
        if (!isOpen())
        {
          x.e(this.TAG, "DB IS CLOSED ! {%s}", new Object[] { bi.cjd() });
          paramLong = -4L;
          return paramLong;
        }
        if (this.gTh > 0L)
        {
          x.e(this.TAG, "ERROR beginTransaction transactionTicket:" + this.gTh);
          paramLong = l1;
          continue;
        }
        if (ah.isMainThread()) {
          break label201;
        }
      }
      finally {}
      if (paramLong == -1L)
      {
        x.e(this.TAG, "FORBID: beginTrans UNKNOW_THREAD ParamID:%d nowThr:%d", new Object[] { Long.valueOf(paramLong), Long.valueOf(l2) });
        paramLong = -2L;
      }
      else
      {
        try
        {
          label201:
          c.begin();
          this.tdk.beginTransaction();
          c.a("beginTrans", null, 0L);
          this.gTh = (bi.VF() & 0x7FFFFFFF);
          this.gTh |= (l2 & 0x7FFFFFFF) << 32;
          if (this.tdL != null) {
            this.tdL.Eb();
          }
          paramLong = this.gTh;
        }
        catch (Exception localException)
        {
          com.tencent.mm.plugin.report.f.mDy.a(181L, 8L, 1L, false);
          x.e(this.TAG, "beginTransaction Error :" + localException.getMessage());
          c.k(localException);
          paramLong = -3L;
        }
      }
    }
  }
  
  public final int delete(String paramString1, String paramString2, String[] paramArrayOfString)
  {
    int i = 0;
    if (!isOpen())
    {
      x.e(this.TAG, "DB IS CLOSED ! {%s}", new Object[] { bi.cjd() });
      return -2;
    }
    boolean bool = HardCoderJNI.hcDBEnable;
    int j = HardCoderJNI.hcDBDelayWrite;
    int k = HardCoderJNI.hcDBCPU;
    int m = HardCoderJNI.hcDBIO;
    if (HardCoderJNI.hcDBThr) {
      i = g.Em().cij();
    }
    i = HardCoderJNI.startPerformance(bool, j, k, m, i, HardCoderJNI.hcDBTimeout, 501, HardCoderJNI.hcDBActionWrite, this.TAG);
    c.begin();
    try
    {
      j = this.tdk.delete(paramString1, paramString2, paramArrayOfString);
      c.a(paramString1, null, this.gTh);
      return j;
    }
    catch (Exception paramString1)
    {
      com.tencent.mm.plugin.report.f.mDy.a(181L, 11L, 1L, false);
      x.e(this.TAG, "delete Error :" + paramString1.getMessage());
      c.k(paramString1);
      return -1;
    }
    finally
    {
      HardCoderJNI.stopPerformace(HardCoderJNI.hcDBEnable, i);
    }
  }
  
  public void ex(String paramString)
  {
    if (this.tdk == null) {
      return;
    }
    if (this.tdL != null) {
      this.tdL.Ea();
    }
    x.w(this.TAG, "begin close db, inTrans:%b ticket:%s  thr:%d {%s}", new Object[] { Boolean.valueOf(inTransaction()), Long.toHexString(this.gTh), Long.valueOf(Thread.currentThread().getId()), bi.cjd() });
    g.a locala = new g.a();
    if (paramString != null) {
      this.tdN = paramString;
    }
    this.tdk.close();
    this.tdk = null;
    x.d(this.TAG, "end close db time:%d", new Object[] { Long.valueOf(locala.Ad()) });
  }
  
  public final boolean fV(String paramString1, String paramString2)
  {
    if (!bi.oW(paramString2)) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue("sql is null ", bool);
      if (isOpen()) {
        break;
      }
      x.e(this.TAG, "DB IS CLOSED ! {%s}", new Object[] { bi.cjd() });
      return false;
    }
    bool = HardCoderJNI.hcDBEnable;
    int j = HardCoderJNI.hcDBDelayWrite;
    int k = HardCoderJNI.hcDBCPU;
    int m = HardCoderJNI.hcDBIO;
    if (HardCoderJNI.hcDBThr) {}
    for (i = g.Em().cij();; i = 0)
    {
      i = HardCoderJNI.startPerformance(bool, j, k, m, i, HardCoderJNI.hcDBTimeout, 501, HardCoderJNI.hcDBActionWrite, this.TAG);
      c.begin();
      try
      {
        this.tdk.execSQL(paramString2);
        c.a(paramString2, null, this.gTh);
        return true;
      }
      catch (Exception paramString1)
      {
        com.tencent.mm.plugin.report.f.mDy.a(181L, 11L, 1L, false);
        paramString2 = paramString1.getMessage();
        x.e(this.TAG, "execSQL Error :" + paramString2);
        if ((paramString2 == null) || (!paramString2.contains("no such table"))) {
          break label260;
        }
        paramString2 = this.tdM;
        x.d("MicroMsg.DBInit", "resetIniCache iniFilename:%s", new Object[] { paramString2.tdl });
        com.tencent.mm.a.e.deleteFile(paramString2.tdl);
        if (this.tdO == null) {
          break;
        }
        this.tdO.Ed();
        Assert.assertTrue("clean ini cache and reboot", false);
        c.k(paramString1);
        return false;
      }
      finally
      {
        HardCoderJNI.stopPerformace(HardCoderJNI.hcDBEnable, i);
      }
    }
  }
  
  protected void finalize()
  {
    ex(null);
  }
  
  public final String getKey()
  {
    if (this.tdM == null) {
      return null;
    }
    return this.tdM.aAL;
  }
  
  public final long getPageSize()
  {
    return this.tdk.tdt.getPageSize();
  }
  
  public final String getPath()
  {
    if (!isOpen())
    {
      x.e(this.TAG, "DB IS CLOSED ! {%s}", new Object[] { bi.cjd() });
      return null;
    }
    return this.tdk.getPath();
  }
  
  public final int gp(long paramLong)
  {
    int j = 0;
    for (;;)
    {
      try
      {
        l1 = bi.VF();
        l2 = Thread.currentThread().getId();
        x.i(this.TAG, "endTransaction thr:%d ticket:(%d,%d) db:%b  {%s} ", new Object[] { Long.valueOf(l2), Long.valueOf(paramLong), Long.valueOf(this.gTh), Boolean.valueOf(isOpen()), bi.cjd() });
        if (isOpen()) {
          continue;
        }
        x.e(this.TAG, "DB IS CLOSED ! {%s}", new Object[] { bi.cjd() });
        i = -4;
      }
      finally
      {
        try
        {
          long l1;
          long l2;
          long l3;
          c.begin();
          this.tdk.endTransaction();
          x.i(this.TAG, "endTransaction Succ Time:%d thr:%d ticket:(%d,%d) db:%b  {%s} ", new Object[] { Long.valueOf(bi.bH(l1)), Long.valueOf(l2), Long.valueOf(paramLong), Long.valueOf(this.gTh), Boolean.valueOf(isOpen()), bi.cjd() });
          c.a("endTrans", null, 0L);
          this.gTh = 0L;
          i = j;
          if (this.tdL == null) {
            continue;
          }
          this.tdL.Ec();
          i = j;
        }
        catch (Exception localException)
        {
          x.e(this.TAG, "endTransaction Error :" + localException.getMessage());
          com.tencent.mm.plugin.report.f.mDy.a(181L, 9L, 1L, false);
          c.k(localException);
          int i = -3;
        }
        localObject = finally;
      }
      return i;
      if (paramLong != this.gTh)
      {
        x.e(this.TAG, "ERROR endTransaction ticket:" + paramLong + " transactionTicket:" + this.gTh);
        i = -1;
      }
      else
      {
        l3 = paramLong >> 32 & 0x7FFFFFFF;
        if (l3 != l2)
        {
          x.e(this.TAG, "FORBID: endTrans UNKNOW_THREAD ticket:%s ParamID:%d nowThr:%d", new Object[] { Long.toHexString(paramLong), Long.valueOf(l3), Long.valueOf(l2) });
          i = -2;
        }
      }
    }
  }
  
  /* Error */
  public final boolean inTransaction()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_0
    //   5: invokevirtual 148	com/tencent/mm/bt/h:isOpen	()Z
    //   8: ifne +26 -> 34
    //   11: aload_0
    //   12: getfield 54	com/tencent/mm/bt/h:TAG	Ljava/lang/String;
    //   15: ldc -106
    //   17: iconst_1
    //   18: anewarray 4	java/lang/Object
    //   21: dup
    //   22: iconst_0
    //   23: invokestatic 154	com/tencent/mm/sdk/platformtools/bi:cjd	()Lcom/tencent/mm/sdk/platformtools/aj;
    //   26: aastore
    //   27: invokestatic 156	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   30: aload_0
    //   31: monitorexit
    //   32: iload_1
    //   33: ireturn
    //   34: aload_0
    //   35: getfield 80	com/tencent/mm/bt/h:gTh	J
    //   38: lstore_2
    //   39: lload_2
    //   40: lconst_0
    //   41: lcmp
    //   42: ifle -12 -> 30
    //   45: iconst_1
    //   46: istore_1
    //   47: goto -17 -> 30
    //   50: astore 4
    //   52: aload_0
    //   53: monitorexit
    //   54: aload 4
    //   56: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	57	0	this	h
    //   1	46	1	bool	boolean
    //   38	2	2	l	long
    //   50	5	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   4	30	50	finally
    //   34	39	50	finally
  }
  
  public final long insert(String paramString1, String paramString2, ContentValues paramContentValues)
  {
    return a(paramString1, paramString2, paramContentValues, false);
  }
  
  public final boolean isOpen()
  {
    if ((this.tdk != null) && (this.tdk.isOpen())) {
      return true;
    }
    Assert.assertTrue("DB has been closed :[" + this.tdN + "]", bi.oW(this.tdN));
    return false;
  }
  
  public final Cursor query(String paramString1, String[] paramArrayOfString1, String paramString2, String[] paramArrayOfString2, String paramString3, String paramString4, String paramString5)
  {
    return a(paramString1, paramArrayOfString1, paramString2, paramArrayOfString2, paramString3, paramString4, paramString5, 0);
  }
  
  public final Cursor rawQuery(String paramString, String[] paramArrayOfString)
  {
    return b(paramString, paramArrayOfString, 0);
  }
  
  public final long replace(String paramString1, String paramString2, ContentValues paramContentValues)
  {
    int i = 0;
    if (!isOpen())
    {
      x.e(this.TAG, "DB IS CLOSED ! {%s}", new Object[] { bi.cjd() });
      return -2L;
    }
    boolean bool = HardCoderJNI.hcDBEnable;
    int j = HardCoderJNI.hcDBDelayWrite;
    int k = HardCoderJNI.hcDBCPU;
    int m = HardCoderJNI.hcDBIO;
    if (HardCoderJNI.hcDBThr) {
      i = g.Em().cij();
    }
    i = HardCoderJNI.startPerformance(bool, j, k, m, i, HardCoderJNI.hcDBTimeout, 501, HardCoderJNI.hcDBActionWrite, this.TAG);
    c.begin();
    try
    {
      long l = this.tdk.replace(paramString1, paramString2, paramContentValues);
      c.a(paramString1, null, this.gTh);
      return l;
    }
    catch (Exception paramString1)
    {
      com.tencent.mm.plugin.report.f.mDy.a(181L, 11L, 1L, false);
      x.e(this.TAG, "repalce  Error :" + paramString1.getMessage());
      c.k(paramString1);
      return -1L;
    }
    finally
    {
      HardCoderJNI.stopPerformace(HardCoderJNI.hcDBEnable, i);
    }
  }
  
  public final int update(String paramString1, ContentValues paramContentValues, String paramString2, String[] paramArrayOfString)
  {
    int i = 0;
    if (!isOpen())
    {
      x.e(this.TAG, "DB IS CLOSED ! {%s}", new Object[] { bi.cjd() });
      return -2;
    }
    boolean bool = HardCoderJNI.hcDBEnable;
    int j = HardCoderJNI.hcDBDelayWrite;
    int k = HardCoderJNI.hcDBCPU;
    int m = HardCoderJNI.hcDBIO;
    if (HardCoderJNI.hcDBThr) {
      i = g.Em().cij();
    }
    i = HardCoderJNI.startPerformance(bool, j, k, m, i, HardCoderJNI.hcDBTimeout, 501, HardCoderJNI.hcDBActionWrite, this.TAG);
    c.begin();
    try
    {
      j = this.tdk.update(paramString1, paramContentValues, paramString2, paramArrayOfString);
      c.a(paramString1, null, this.gTh);
      return j;
    }
    catch (Exception paramString1)
    {
      com.tencent.mm.plugin.report.f.mDy.a(181L, 11L, 1L, false);
      x.e(this.TAG, "update Error :" + paramString1.getMessage());
      c.k(paramString1);
      return -1;
    }
    finally
    {
      HardCoderJNI.stopPerformace(HardCoderJNI.hcDBEnable, i);
    }
  }
  
  public static abstract interface a
  {
    public abstract void Ea();
    
    public abstract void Eb();
    
    public abstract void Ec();
  }
  
  public static final class b
  {
    public long lastReportTime;
    public String table;
    public Cursor tdV;
    public String tdW;
    public long tdX;
    public boolean tdY;
    public String tdZ;
    public h.c tea;
  }
  
  private static final class c
    extends AssertionError
  {
    c() {}
    
    c(String paramString)
    {
      super();
    }
  }
  
  public static abstract interface d
  {
    public abstract String[] xb();
  }
  
  public static abstract interface e
  {
    public abstract void Ed();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/bt/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */