package com.tencent.mm.pluginsdk.c;

import com.tencent.mm.g.a.je;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.b.c;
import java.util.ArrayList;

public abstract class a
  extends c<je>
{
  protected ArrayList<String> qyv = new ArrayList(3);
  
  public a()
  {
    this.sFo = je.class.getName().hashCode();
  }
  
  public static void a(String paramString, a parama)
  {
    if (!parama.qyv.contains(paramString)) {
      parama.qyv.add(paramString);
    }
    com.tencent.mm.sdk.b.a.sFg.b(parama);
    e.SG(paramString);
  }
  
  public static void b(String paramString, a parama)
  {
    e.SH(paramString);
    com.tencent.mm.sdk.b.a.sFg.c(parama);
    if (parama.qyv.contains(paramString)) {
      parama.qyv.remove(paramString);
    }
  }
  
  public abstract void j(b paramb);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/pluginsdk/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */