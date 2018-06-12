package com.tencent.matrix.iocanary.core;

import com.tencent.matrix.c.c.a;
import java.util.List;

public class a
  implements c.a, b
{
  public boolean bpL;
  public final com.tencent.matrix.iocanary.a.a bqJ;
  private final com.tencent.matrix.iocanary.a bqU;
  public com.tencent.matrix.iocanary.b.a bqV;
  
  static
  {
    if (!a.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      $assertionsDisabled = bool;
      return;
    }
  }
  
  public a(com.tencent.matrix.iocanary.a parama)
  {
    this.bqJ = parama.bqJ;
    this.bqU = parama;
  }
  
  public final void a(com.tencent.matrix.c.b paramb)
  {
    this.bqU.a(paramb);
  }
  
  public final void y(List<IOIssue> paramList)
  {
    if (paramList == null) {}
    for (;;)
    {
      return;
      int i = 0;
      while (i < paramList.size())
      {
        this.bqU.a(com.tencent.matrix.iocanary.c.a.a((IOIssue)paramList.get(i)));
        i += 1;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/matrix/iocanary/core/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */