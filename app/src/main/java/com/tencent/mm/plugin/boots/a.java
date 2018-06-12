package com.tencent.mm.plugin.boots;

import android.content.Context;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.boots.a.c;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.List;

public final class a
  implements com.tencent.mm.pluginsdk.cmd.a
{
  public final boolean a(Context paramContext, String[] paramArrayOfString)
  {
    paramContext = paramArrayOfString[1];
    int i;
    if (b.chp())
    {
      i = -1;
      switch (paramContext.hashCode())
      {
      }
    }
    for (;;)
    {
      switch (i)
      {
      default: 
        paramContext.hashCode();
        return false;
        if (paramContext.equals("showall"))
        {
          i = 0;
          continue;
          if (paramContext.equals("apkg")) {
            i = 1;
          }
        }
        break;
      }
    }
    paramContext = ((c)g.l(c.class)).aua();
    if (!paramContext.isEmpty())
    {
      x.e("MicroMsg.Boots.BootsCommand", "start day active keys");
      paramContext = paramContext.iterator();
      while (paramContext.hasNext())
      {
        paramArrayOfString = (com.tencent.mm.plugin.boots.a.a)paramContext.next();
        x.i("MicroMsg.Boots.BootsCommand", "key:%s active:%d", new Object[] { Integer.toHexString(paramArrayOfString.field_key), Integer.valueOf(paramArrayOfString.field_dau) });
      }
    }
    return true;
    if (paramArrayOfString.length < 5) {
      x.i("MicroMsg.Boots.BootsCommand", "must include url,md5 and appId");
    }
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/boots/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */