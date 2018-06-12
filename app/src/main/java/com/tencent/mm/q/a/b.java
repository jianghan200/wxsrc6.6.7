package com.tencent.mm.q.a;

import android.content.Context;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.fts.a.d.e.a;
import com.tencent.mm.plugin.fts.a.d.e.b;
import com.tencent.mm.sdk.platformtools.ag;
import java.util.HashSet;

public final class b
  extends com.tencent.mm.plugin.fts.ui.a
{
  public b(Context paramContext, e.b paramb, int paramInt)
  {
    super(paramContext, paramb, paramInt);
  }
  
  protected final com.tencent.mm.plugin.fts.a.a.a a(ag paramag, HashSet<String> paramHashSet)
  {
    return null;
  }
  
  public final com.tencent.mm.plugin.fts.a.d.a.a a(int paramInt1, int paramInt2, l paraml, e.a parama)
  {
    c localc = new c(paramInt2);
    localc.fyJ = paraml;
    localc.jrx = parama.jrx;
    localc.cF(paraml.type, paraml.jru);
    return localc;
  }
  
  protected final com.tencent.mm.plugin.fts.a.d.a.a a(int paramInt, e.a parama)
  {
    return null;
  }
  
  protected final void a(j paramj, HashSet<String> paramHashSet) {}
  
  public final int getType()
  {
    return 33;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/q/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */