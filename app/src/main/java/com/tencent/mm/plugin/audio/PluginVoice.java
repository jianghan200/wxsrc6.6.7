package com.tencent.mm.plugin.audio;

import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.b.g;
import com.tencent.mm.model.p;
import com.tencent.mm.modelvoice.m;
import com.tencent.mm.plugin.audio.a.a;

public class PluginVoice
  extends f
  implements a
{
  public void execute(g paramg)
  {
    if (paramg.ES()) {
      pin(new p(m.class));
    }
  }
  
  public String name()
  {
    return "plugin-voice";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/audio/PluginVoice.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */