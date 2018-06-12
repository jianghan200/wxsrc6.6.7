package com.tencent.mm.plugin.j.a;

import com.tencent.mm.a.e;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd;
import java.util.ArrayList;
import java.util.List;

public final class f
  extends a
{
  protected final List<com.tencent.mm.plugin.j.b.a> M(bd parambd)
  {
    if (parambd == null) {
      return null;
    }
    com.tencent.mm.plugin.j.b.a locala = N(parambd);
    parambd = q.getFullPath(parambd.field_imgPath);
    long l = e.cm(parambd);
    locala.field_msgSubType = 10;
    locala.field_path = wZ(parambd);
    locala.field_size = l;
    x.i("MicroMsg.VoiceMsgHandler", "%s create voice wx file index voice[%s]", new Object[] { avA(), locala });
    parambd = new ArrayList();
    parambd.add(locala);
    return parambd;
  }
  
  protected final String avA()
  {
    return "voice_" + hashCode();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/j/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */