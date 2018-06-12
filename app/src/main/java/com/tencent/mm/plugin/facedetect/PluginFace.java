package com.tencent.mm.plugin.facedetect;

import com.tencent.mm.kernel.b.f;
import com.tencent.mm.plugin.facedetect.a.a;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.vending.g.d.a;

public class PluginFace
  extends f
  implements a
{
  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    x.i("MicroMsg.PluginFace", "hy: starting execute.");
    if (paramg.ES()) {
      com.tencent.mm.vending.g.g.cBK().d(new b()).a(new d.a() {});
    }
  }
  
  public String name()
  {
    return "plugin-facedetect";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/facedetect/PluginFace.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */