package com.tencent.mm.plugin.emoji.model;

import com.tencent.mm.g.a.cu;
import com.tencent.mm.sdk.b.a;
import java.util.HashMap;
import java.util.Map;

public final class e
{
  private cu ihn = new cu();
  public final Map<String, Integer> iho = new HashMap();
  
  public final void g(String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    this.ihn.bKj.bKk = paramString1;
    this.ihn.bKj.status = paramInt1;
    this.ihn.bKj.progress = paramInt2;
    this.ihn.bKj.bKl = paramString2;
    a.sFg.m(this.ihn);
    if (paramInt1 == 6)
    {
      if ((paramInt2 < 0) || (paramInt2 >= 100))
      {
        this.iho.remove(paramString1);
        return;
      }
      this.iho.put(paramString1, Integer.valueOf(paramInt2));
      return;
    }
    this.iho.remove(paramString1);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/emoji/model/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */