package com.tencent.mm.pluginsdk.c;

import com.tencent.mm.g.a.kb;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import java.util.ArrayList;

public abstract class b
  extends c<kb>
{
  protected ArrayList<String> qyv = new ArrayList(3);
  
  public b()
  {
    super(0);
    this.sFo = kb.class.getName().hashCode();
  }
  
  public static void a(String paramString, b paramb)
  {
    if (!paramb.qyv.contains(paramString)) {
      paramb.qyv.add(paramString);
    }
    a.sFg.b(paramb);
    e.SG(paramString);
  }
  
  public static void b(String paramString, b paramb)
  {
    e.SH(paramString);
    a.sFg.c(paramb);
    if (paramb.qyv.contains(paramString)) {
      paramb.qyv.remove(paramString);
    }
  }
  
  public abstract void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.sdk.b.b paramb);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/pluginsdk/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */