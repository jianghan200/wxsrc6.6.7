package com.tencent.mm.plugin.api;

import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.e.t;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.plugin.mmsight.api.a.a;
import com.tencent.mm.plugin.mmsight.model.b.b;
import com.tencent.mm.sdk.platformtools.x;

public final class a
  implements a.a
{
  public final com.tencent.mm.plugin.mmsight.api.a a(int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if (paramInt1 == 1) {
      return new com.tencent.mm.plugin.mmsight.model.b.a(paramString1, paramString2, paramInt2, paramInt3, paramInt4, paramInt5);
    }
    if (paramInt1 == 2) {
      return new b(paramString1, paramString2, paramInt2, paramInt3, paramInt4, paramInt5);
    }
    return null;
  }
  
  public final com.tencent.mm.plugin.mmsight.api.a a(int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong1, long paramLong2)
  {
    if (paramInt1 == 1) {
      return new com.tencent.mm.plugin.mmsight.model.b.a(paramString1, paramString2, paramInt2, paramInt3, paramInt4, paramInt5, paramLong1, paramLong2);
    }
    if (paramInt1 == 2) {
      return new b(paramString1, paramString2, paramInt2, paramInt3, paramInt4, paramInt5, paramLong1, paramLong2);
    }
    return null;
  }
  
  public final com.tencent.mm.plugin.mmsight.api.a a(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong1, long paramLong2)
  {
    int i = q.deT.dfk;
    x.i("MicroMsg.MMSightPresendRemuxerImpl", "get, configRemuxerType: %s", new Object[] { Integer.valueOf(i) });
    if (i != -1)
    {
      if (i == 1) {
        return new com.tencent.mm.plugin.mmsight.model.b.a(paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramInt4, paramLong1, paramLong2);
      }
      if (i == 2) {
        return new b(paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramInt4, paramLong1, paramLong2);
      }
    }
    if (d.fR(19)) {
      return new com.tencent.mm.plugin.mmsight.model.b.a(paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramInt4, paramLong1, paramLong2);
    }
    return new b(paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramInt4, paramLong1, paramLong2);
  }
  
  public final com.tencent.mm.plugin.mmsight.api.a b(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = q.deT.dfk;
    x.i("MicroMsg.MMSightPresendRemuxerImpl", "get, configRemuxerType: %s", new Object[] { Integer.valueOf(i) });
    if (i != -1)
    {
      if (i == 1) {
        return new com.tencent.mm.plugin.mmsight.model.b.a(paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramInt4);
      }
      if (i == 2) {
        return new b(paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramInt4);
      }
    }
    if (d.fR(19)) {
      return new com.tencent.mm.plugin.mmsight.model.b.a(paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramInt4);
    }
    return new b(paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramInt4);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/api/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */