package com.tencent.mm.plugin.j.a;

import com.tencent.mm.a.e;
import com.tencent.mm.ak.g;
import com.tencent.mm.ak.o;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.pluginsdk.model.app.ao;
import com.tencent.mm.pluginsdk.model.app.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd;
import com.tencent.mm.y.g.a;
import java.util.ArrayList;
import java.util.List;

public final class c
  extends a
{
  protected final List<com.tencent.mm.plugin.j.b.a> M(bd parambd)
  {
    long l = 0L;
    b localb2 = null;
    Object localObject2 = null;
    b localb1 = null;
    if (parambd == null) {
      return null;
    }
    Object localObject1 = bi.WT(parambd.field_content);
    if (localObject1 != null) {}
    for (localObject1 = g.a.gp((String)localObject1);; localObject1 = null)
    {
      if (localObject1 == null)
      {
        x.e("MicroMsg.AppMsgMsgHandler", "content is null");
        return null;
      }
      com.tencent.mm.plugin.j.b.a locala = N(parambd);
      int i;
      switch (((g.a)localObject1).type)
      {
      case 3: 
      case 4: 
      case 5: 
      default: 
        return null;
      case 2: 
        localb2 = ao.asF().SR(((g.a)localObject1).bGP);
        localObject1 = localb1;
        if (localb2 != null)
        {
          localObject1 = localb2.field_fileFullPath;
          l = e.cm((String)localObject1);
        }
        locala.field_msgSubType = 30;
        locala.field_path = wZ((String)localObject1);
        locala.field_size = l;
        i = 31;
      }
      for (;;)
      {
        localObject1 = o.Pf().E(parambd.field_imgPath, true);
        l = e.cm((String)localObject1);
        parambd = N(parambd);
        parambd.field_msgSubType = i;
        parambd.field_path = wZ((String)localObject1);
        parambd.field_size = l;
        x.i("MicroMsg.AppMsgMsgHandler", "%s create app msg wx file index app[%s] thumb[%s]", new Object[] { avA(), locala, parambd });
        localObject1 = new ArrayList();
        ((List)localObject1).add(locala);
        ((List)localObject1).add(parambd);
        return (List<com.tencent.mm.plugin.j.b.a>)localObject1;
        localb1 = ao.asF().SR(((g.a)localObject1).bGP);
        localObject1 = localb2;
        if (localb1 != null)
        {
          localObject1 = localb1.field_fileFullPath;
          l = e.cm((String)localObject1);
        }
        locala.field_msgSubType = 32;
        locala.field_path = wZ((String)localObject1);
        locala.field_size = l;
        i = 33;
        continue;
        localb1 = ao.asF().SR(((g.a)localObject1).bGP);
        localObject1 = localObject2;
        if (localb1 != null)
        {
          localObject1 = localb1.field_fileFullPath;
          l = e.cm((String)localObject1);
        }
        locala.field_msgSubType = 34;
        locala.field_path = wZ((String)localObject1);
        locala.field_size = l;
        i = 35;
      }
    }
  }
  
  protected final String avA()
  {
    return "AppMsg_" + hashCode();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/j/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */