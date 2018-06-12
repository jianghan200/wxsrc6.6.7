package com.tencent.c.d.a;

import android.text.TextUtils;
import com.tencent.c.d.b.d.a;
import com.tencent.c.f.h;
import java.util.ArrayList;
import java.util.List;

public final class c
  implements b
{
  private final List<d.a> vjo = new ArrayList();
  
  public final void a(d.a parama)
  {
    if (parama.uid != 0) {}
    while ((TextUtils.isEmpty(parama.vjw)) || (!"u:r:zygote:s0".equals(parama.vjw)) || (TextUtils.isEmpty(parama.name)) || ("zygote".equals(parama.name)) || ("zygote64".equals(parama.name))) {
      return;
    }
    h.i("JavaProcessAnalyzer match : " + parama.toString());
    this.vjo.add(parama);
  }
  
  public final boolean cFe()
  {
    return this.vjo.size() > 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/c/d/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */