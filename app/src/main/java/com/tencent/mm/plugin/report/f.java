package com.tencent.mm.plugin.report;

import com.tencent.mars.smc.IDKey;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Map;

public enum f
  implements d
{
  d mDz = new a((byte)0);
  
  private f() {}
  
  public static Object a(int paramInt1, int[] paramArrayOfInt, int paramInt2, int paramInt3)
  {
    int i = 0;
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0) || (paramInt3 <= paramInt2) || (paramInt3 > 255) || (paramArrayOfInt.length != paramInt3 - paramInt2)) {
      return null;
    }
    if (paramInt1 <= paramArrayOfInt[0]) {
      return Integer.valueOf(paramInt2);
    }
    do
    {
      i += 1;
      if (i >= paramArrayOfInt.length - 1) {
        break;
      }
      if (paramArrayOfInt[i] >= paramArrayOfInt[(i + 1)]) {
        return null;
      }
    } while ((paramInt1 <= paramArrayOfInt[i]) || (paramInt1 > paramArrayOfInt[(i + 1)]));
    return Integer.valueOf(i + (paramInt2 + 1));
    return Integer.valueOf(paramInt3);
  }
  
  public static Object a(int paramInt, int[] paramArrayOfInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    if ((paramArrayOfInt.length <= 0) || (paramArrayOfInt.length + 1 != paramArrayOfObject.length)) {
      return null;
    }
    if (paramInt <= paramArrayOfInt[0]) {
      return paramArrayOfObject[0];
    }
    do
    {
      i += 1;
      if (i >= paramArrayOfInt.length - 1) {
        break;
      }
      if (paramArrayOfInt[i] >= paramArrayOfInt[(i + 1)]) {
        return null;
      }
    } while ((paramInt <= paramArrayOfInt[i]) || (paramInt > paramArrayOfInt[(i + 1)]));
    return paramArrayOfObject[(i + 1)];
    return paramArrayOfObject[(paramArrayOfObject.length - 1)];
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean)
  {
    x.d("MicroMsg.ReportService", "idkeyGroupForPair [%d, %d] -> %d / [%d, %d] -> %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt3), Integer.valueOf(paramInt5), Integer.valueOf(paramInt2), Integer.valueOf(paramInt4), Integer.valueOf(paramInt6) });
    this.mDz.a(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramBoolean);
  }
  
  public final void a(int paramInt, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.mDz.a(paramInt, paramString, paramBoolean1, paramBoolean2);
  }
  
  public final void a(int paramInt, boolean paramBoolean1, boolean paramBoolean2, Object... paramVarArgs)
  {
    this.mDz.a(paramInt, paramBoolean1, paramBoolean2, paramVarArgs);
  }
  
  public final void a(long paramLong1, long paramLong2, long paramLong3, boolean paramBoolean)
  {
    x.d("MicroMsg.ReportService", "idkeyStat [%d, %d] -> %d", new Object[] { Long.valueOf(paramLong1), Long.valueOf(paramLong2), Long.valueOf(paramLong3) });
    this.mDz.a(paramLong1, paramLong2, paramLong3, paramBoolean);
  }
  
  public final void b(ArrayList<IDKey> paramArrayList, boolean paramBoolean)
  {
    this.mDz.b(paramArrayList, paramBoolean);
  }
  
  public final void c(String paramString1, String paramString2, Map<String, Object> paramMap)
  {
    this.mDz.c(paramString1, paramString2, paramMap);
  }
  
  public final void e(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    x.d("MicroMsg.ReportService", "idkeyGroupForPairAverger [%d, %d] -> %d / [%d, %d] -> 1", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt4), Integer.valueOf(paramInt1), Integer.valueOf(paramInt3) });
    this.mDz.e(paramInt1, paramInt2, paramInt3, paramInt4, paramBoolean);
  }
  
  public final void eK(int paramInt)
  {
    this.mDz.eK(paramInt);
  }
  
  public final void h(int paramInt, Object... paramVarArgs)
  {
    this.mDz.h(paramInt, paramVarArgs);
  }
  
  public final void k(int paramInt, String paramString)
  {
    this.mDz.k(paramInt, paramString);
  }
  
  private static final class a
    implements d
  {
    public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean)
    {
      x.i("MicroMsg.ReportService", "this is DummyReportService");
    }
    
    public final void a(int paramInt, String paramString, boolean paramBoolean1, boolean paramBoolean2)
    {
      x.i("MicroMsg.ReportService", "this is DummyReportService");
    }
    
    public final void a(int paramInt, boolean paramBoolean1, boolean paramBoolean2, Object... paramVarArgs)
    {
      x.i("MicroMsg.ReportService", "this is DummyReportService");
    }
    
    public final void a(long paramLong1, long paramLong2, long paramLong3, boolean paramBoolean)
    {
      x.i("MicroMsg.ReportService", "this is DummyReportService");
    }
    
    public final void b(ArrayList<IDKey> paramArrayList, boolean paramBoolean)
    {
      x.i("MicroMsg.ReportService", "this is DummyReportService");
    }
    
    public final void c(String paramString1, String paramString2, Map<String, Object> paramMap)
    {
      x.i("MicroMsg.ReportService", "this is DummyReportService");
    }
    
    public final void e(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
    {
      x.i("MicroMsg.ReportService", "this is DummyReportService");
    }
    
    public final void eK(int paramInt)
    {
      x.i("MicroMsg.ReportService", "this is DummyReportService");
    }
    
    public final void h(int paramInt, Object... paramVarArgs)
    {
      x.i("MicroMsg.ReportService", "this is DummyReportService");
    }
    
    public final void k(int paramInt, String paramString)
    {
      x.i("MicroMsg.ReportService", "this is DummyReportService");
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/report/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */