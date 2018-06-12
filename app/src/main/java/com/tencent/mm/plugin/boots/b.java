package com.tencent.mm.plugin.boots;

import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.boots.a.a;
import com.tencent.mm.plugin.boots.a.c;
import com.tencent.mm.plugin.boots.a.e;
import com.tencent.mm.plugin.boots.a.f;
import java.util.List;

public final class b
  implements c
{
  public final List<a> aua()
  {
    if (((e)g.n(e.class)).getTinkerLogic() != null) {
      return ((e)g.n(e.class)).getTinkerLogic().aua();
    }
    return null;
  }
  
  public final void ch(int paramInt1, int paramInt2)
  {
    if (((e)g.n(e.class)).getTinkerLogic() != null) {
      ((e)g.n(e.class)).getTinkerLogic().c(paramInt1, true, paramInt2);
    }
  }
  
  public final void nd(int paramInt)
  {
    if (((e)g.n(e.class)).getTinkerLogic() != null) {
      ((e)g.n(e.class)).getTinkerLogic().c(paramInt, false, 0);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/boots/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */