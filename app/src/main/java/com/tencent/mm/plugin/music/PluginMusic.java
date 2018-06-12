package com.tencent.mm.plugin.music;

import com.tencent.mm.an.a.b;
import com.tencent.mm.an.e;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.model.p;
import com.tencent.mm.plugin.music.a.d;
import com.tencent.mm.plugin.music.model.h;
import com.tencent.mm.sdk.platformtools.x;

public class PluginMusic
  extends f
  implements com.tencent.mm.an.a.c
{
  private com.tencent.mm.plugin.music.a.a lwy = new com.tencent.mm.plugin.music.a.a();
  
  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
    if (paramg.ES())
    {
      x.i("MicroMsg.Music.PluginMusic", "PluginMusic configure SubCoreMusic");
      pin(new p(h.class));
      com.tencent.mm.kernel.g.Ek();
      com.tencent.mm.kernel.g.a(b.class, new e());
      com.tencent.mm.kernel.g.Ek();
      com.tencent.mm.kernel.g.a(com.tencent.mm.an.a.a.class, new a());
    }
    d.bhe();
    this.lwy.cht();
  }
  
  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    if (paramg.ES())
    {
      x.i("MicroMsg.Music.PluginMusic", "PluginMusic execute");
      com.tencent.mm.bg.c.Um("music");
    }
  }
  
  public void installed()
  {
    alias(com.tencent.mm.an.a.c.class);
  }
  
  public String name()
  {
    return "plugin-music";
  }
  
  public void uninstalled()
  {
    super.uninstalled();
    this.lwy.dead();
    d locald = d.bhf();
    x.i("MicroMsg.Audio.AudioPlayerMgr", "release, clear all cache");
    locald.bhg();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/music/PluginMusic.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */