package com.tencent.mm.plugin.video;

import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.b.g;
import com.tencent.mm.model.p;
import com.tencent.mm.modelcontrol.d;
import com.tencent.mm.modelvideo.n;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.plugin.video.a.a;
import com.tencent.mm.sdk.platformtools.x;

public class PluginVideo
  extends f
  implements a
{
  public void execute(g paramg)
  {
    x.i("MicroMsg.PluginVideo", "plugin video execute");
    if (paramg.ES())
    {
      pin(new p(o.class));
      pin(new p(d.class));
      pin(new p(n.class));
    }
  }
  
  public String name()
  {
    return "plugin-video";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/video/PluginVideo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */