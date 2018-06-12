package com.tencent.mm.plugin.j.a;

import com.tencent.mm.g.c.cm;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd;
import java.util.ArrayList;
import java.util.List;

public final class e
  extends a
{
  protected final List<com.tencent.mm.plugin.j.b.a> M(bd parambd)
  {
    if (parambd == null) {
      return null;
    }
    o.Ta();
    Object localObject = s.nK(parambd.field_imgPath);
    long l = com.tencent.mm.a.e.cm((String)localObject);
    com.tencent.mm.plugin.j.b.a locala = N(parambd);
    locala.field_msgSubType = 1;
    locala.field_path = wZ((String)localObject);
    locala.field_size = l;
    o.Ta();
    localObject = s.nL(parambd.field_imgPath);
    l = com.tencent.mm.a.e.cm((String)localObject);
    parambd = N(parambd);
    parambd.field_msgSubType = 2;
    parambd.field_path = wZ((String)localObject);
    parambd.field_size = l;
    x.i("MicroMsg.VideoMsgHandler", "%s create video wx file index video[%s] thumb[%s]", new Object[] { avA(), locala, parambd });
    localObject = new ArrayList();
    ((List)localObject).add(locala);
    ((List)localObject).add(parambd);
    return (List<com.tencent.mm.plugin.j.b.a>)localObject;
  }
  
  protected final String avA()
  {
    return "video_" + hashCode();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/j/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */