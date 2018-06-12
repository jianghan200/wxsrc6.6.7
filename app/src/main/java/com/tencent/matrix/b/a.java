package com.tencent.matrix.b;

import android.content.Context;

public class a
  implements c
{
  private final Context context;
  
  public a(Context paramContext)
  {
    this.context = paramContext;
  }
  
  public final void b(b paramb)
  {
    com.tencent.matrix.d.b.i("Matrix.DefaultPluginListener", "%s plugin is inited", new Object[] { paramb.getTag() });
  }
  
  public void b(com.tencent.matrix.c.b paramb)
  {
    com.tencent.matrix.d.b.e("Matrix.DefaultPluginListener", "report issue content: %s", new Object[] { paramb });
  }
  
  public final void c(b paramb)
  {
    com.tencent.matrix.d.b.i("Matrix.DefaultPluginListener", "%s plugin is started", new Object[] { paramb.getTag() });
  }
  
  public final void d(b paramb)
  {
    com.tencent.matrix.d.b.i("Matrix.DefaultPluginListener", "%s plugin is stopped", new Object[] { paramb.getTag() });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/matrix/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */