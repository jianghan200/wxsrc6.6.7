package com.tencent.mm.plugin.facedetect;

import com.tencent.mm.plugin.facedetect.model.i;
import com.tencent.mm.plugin.facedetect.model.j;
import com.tencent.mm.plugin.facedetect.model.l;
import com.tencent.mm.plugin.facedetect.model.n;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.x;

public final class b
  implements com.tencent.mm.vending.c.a<Void, Void>
{
  private static j iLR = new j();
  private static n iLS = new n();
  private static i iLT = new i();
  private static l iLU = new l();
  private com.tencent.mm.vending.g.b eAc = null;
  
  private static void safeAddListener(c paramc)
  {
    if (paramc == null)
    {
      x.w("MicroMsg.TaskInitFace", "hy: listener is null or id is invalid");
      return;
    }
    if (com.tencent.mm.sdk.b.a.sFg.d(paramc))
    {
      x.w("MicroMsg.TaskInitFace", "hy: already has listener");
      return;
    }
    com.tencent.mm.sdk.b.a.sFg.b(paramc);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/facedetect/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */