package com.tencent.mm.plugin.sns.a;

import com.tencent.mm.plugin.sns.b.c;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;

public final class a
  implements c
{
  private Map<Integer, com.tencent.mm.plugin.sns.a.a.a> nhZ = new HashMap();
  
  public final void a(int paramInt1, int paramInt2, Object... paramVarArgs)
  {
    com.tencent.mm.plugin.sns.a.a.a locala = (com.tencent.mm.plugin.sns.a.a.a)this.nhZ.get(Integer.valueOf(paramInt1));
    if (locala == null)
    {
      x.w("SnsAdReportService", "can not find %s implementation for kv %d", new Object[] { com.tencent.mm.plugin.sns.a.a.a.class, Integer.valueOf(paramInt1) });
      return;
    }
    locala.h(paramInt2, paramVarArgs);
  }
  
  public final void a(com.tencent.mm.plugin.sns.a.a.a parama)
  {
    this.nhZ.put(Integer.valueOf(parama.bqo()), parama);
  }
  
  public final void h(int paramInt, Object... paramVarArgs)
  {
    com.tencent.mm.plugin.sns.a.a.a locala = (com.tencent.mm.plugin.sns.a.a.a)this.nhZ.get(Integer.valueOf(paramInt));
    if (locala == null)
    {
      x.w("SnsAdReportService", "can not find %s implementation for kv %d", new Object[] { com.tencent.mm.plugin.sns.a.a.a.class, Integer.valueOf(paramInt) });
      return;
    }
    locala.c(paramVarArgs);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/sns/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */