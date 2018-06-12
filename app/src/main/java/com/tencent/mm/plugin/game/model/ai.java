package com.tencent.mm.plugin.game.model;

import com.tencent.mm.plugin.game.d.ar;
import com.tencent.mm.plugin.game.d.av;
import com.tencent.mm.plugin.game.d.bb;
import com.tencent.mm.plugin.game.d.cr;
import com.tencent.mm.plugin.game.d.w;
import com.tencent.mm.plugin.game.e.d;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.Iterator;
import java.util.LinkedList;

public final class ai
  extends ac
{
  public static void a(bb parambb)
  {
    if ((parambb == null) || (bi.cX(parambb.jRH))) {}
    for (;;)
    {
      return;
      parambb = parambb.jRH.iterator();
      while (parambb.hasNext())
      {
        Object localObject = (com.tencent.mm.plugin.game.d.ac)parambb.next();
        if ((((com.tencent.mm.plugin.game.d.ac)localObject).jQv != null) && (((com.tencent.mm.plugin.game.d.ac)localObject).jQv.jOV != null))
        {
          d.a(a(((com.tencent.mm.plugin.game.d.ac)localObject).jQv.jOV));
        }
        else if ((((com.tencent.mm.plugin.game.d.ac)localObject).jQx != null) && (!bi.cX(((com.tencent.mm.plugin.game.d.ac)localObject).jQx.jPz)))
        {
          localObject = ((com.tencent.mm.plugin.game.d.ac)localObject).jQx.jPz.iterator();
          while (((Iterator)localObject).hasNext()) {
            d.a(a(((w)((Iterator)localObject).next()).jOV));
          }
        }
        else if ((((com.tencent.mm.plugin.game.d.ac)localObject).jQw != null) && (((com.tencent.mm.plugin.game.d.ac)localObject).jQw.jOV != null))
        {
          d.a(a(((com.tencent.mm.plugin.game.d.ac)localObject).jQw.jOV));
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/model/ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */