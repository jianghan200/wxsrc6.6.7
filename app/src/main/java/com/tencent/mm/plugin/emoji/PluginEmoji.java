package com.tencent.mm.plugin.emoji;

import com.tencent.mm.kernel.b.f;
import com.tencent.mm.plugin.emoji.b.b.a;
import com.tencent.mm.pluginsdk.f.h;
import com.tencent.mm.pluginsdk.ui.d.d.a;

public class PluginEmoji
  extends f
  implements com.tencent.mm.plugin.emoji.b.c
{
  private com.tencent.mm.pluginsdk.a.d icP;
  com.tencent.mm.pluginsdk.a.e icQ;
  
  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
    d.a.a(com.tencent.mm.br.g.cjL());
    com.tencent.mm.br.b.cjC();
    h.ccd();
  }
  
  public void dependency()
  {
    dependsOn(com.tencent.mm.plugin.comm.a.a.class);
  }
  
  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    if (paramg.ES())
    {
      pin(d.aDh());
      if (paramg.ES()) {
        com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.emoji.b.a.class, new com.tencent.mm.kernel.c.e(new a()));
      }
    }
    com.tencent.mm.ui.e.b.c.a(new PluginEmoji.1(this));
    com.tencent.mm.ui.e.c.b.a(new PluginEmoji.2(this));
    com.tencent.mm.api.o.bxf = new PluginEmoji.3(this);
  }
  
  public com.tencent.mm.pluginsdk.a.d getEmojiMgr()
  {
    setEmojiMgr();
    return this.icP;
  }
  
  public com.tencent.mm.pluginsdk.a.e getProvider()
  {
    if (this.icQ == null) {
      this.icQ = new com.tencent.mm.bo.a();
    }
    return this.icQ;
  }
  
  public void installed()
  {
    alias(com.tencent.mm.plugin.emoji.b.c.class);
  }
  
  public String name()
  {
    return "plugin-emoji";
  }
  
  public void removeEmojiMgr()
  {
    this.icP = null;
  }
  
  public void setEmojiMgr()
  {
    if (this.icP == null) {
      this.icP = b.a.ieJ.aDG();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/emoji/PluginEmoji.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */