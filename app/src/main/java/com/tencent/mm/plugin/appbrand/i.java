package com.tencent.mm.plugin.appbrand;

import com.tencent.mm.plugin.appbrand.task.d;
import com.tencent.mm.plugin.report.service.h;

public final class i
{
  int aIs;
  boolean fdA;
  long[] fdv;
  int fdw;
  int fdx;
  private int fdy = 0;
  boolean fdz;
  int mType;
  
  final void d(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = 1;
    h localh = h.mEJ;
    int j = this.aIs;
    int k = this.mType;
    long l = this.fdv[paramInt2];
    int m = this.fdw;
    int n = this.fdy;
    int i1 = this.fdx;
    if (this.fdz)
    {
      paramInt2 = 1;
      if (!this.fdA) {
        break label180;
      }
    }
    for (;;)
    {
      localh.h(13886, new Object[] { paramString, Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(paramInt1), "", "", Long.valueOf(l), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(paramInt2), Integer.valueOf(i), Integer.valueOf(paramInt3) });
      return;
      paramInt2 = 0;
      break;
      label180:
      i = 0;
    }
  }
  
  public final void o(int paramInt, long paramLong)
  {
    if (paramInt == 0)
    {
      this.fdv = new long[13];
      if (!d.ana()) {
        break label48;
      }
    }
    label48:
    for (int i = 1;; i = 0)
    {
      this.fdy = i;
      if ((paramInt < this.fdv.length) && (this.fdv[paramInt] == 0L)) {
        break;
      }
      return;
    }
    this.fdv[paramInt] = paramLong;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */