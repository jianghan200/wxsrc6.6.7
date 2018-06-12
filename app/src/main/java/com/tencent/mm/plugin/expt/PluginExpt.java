package com.tencent.mm.plugin.expt;

import com.tencent.mm.bt.h.d;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.platformtools.u;
import com.tencent.mm.platformtools.u.a;
import com.tencent.mm.plugin.expt.roomexpt.b;
import com.tencent.mm.plugin.messenger.foundation.a.o;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;

public class PluginExpt
  extends f
  implements com.tencent.mm.kernel.api.c, a
{
  private static HashMap<Integer, h.d> hsC;
  private u.a hsE;
  
  static
  {
    HashMap localHashMap = new HashMap();
    hsC = localHashMap;
    localHashMap.put(Integer.valueOf("EXPT_TABLE".hashCode()), new PluginExpt.1());
    hsC.put(Integer.valueOf("EXPT_KEY_MAP_ID_TABLE".hashCode()), new PluginExpt.2());
    hsC.put(Integer.valueOf("CHATROOM_MUTE_EXPT_TABLE".hashCode()), new PluginExpt.3());
  }
  
  private void closeDB()
  {
    if (this.hsE != null) {
      this.hsE.iQ(hashCode());
    }
    this.hsE = null;
  }
  
  private void initDB()
  {
    if (this.hsE != null) {
      closeDB();
    }
    String str = com.tencent.mm.kernel.g.Ei().cachePath + "WxExpt.db";
    this.hsE = u.a(hashCode(), str, hsC, true);
  }
  
  public void dependency()
  {
    dependsOn(o.class);
  }
  
  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.expt.a.a.class, com.tencent.mm.plugin.expt.b.a.aIu());
    com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.expt.roomexpt.d.class, com.tencent.mm.plugin.expt.roomexpt.a.aIx());
  }
  
  public void installed()
  {
    alias(a.class);
  }
  
  public void onAccountInitialized(e.c paramc)
  {
    boolean bool = false;
    x.i("MicroMsg.PluginExpt", "Plugin expt onAccountInitialized [%d] [%d]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(com.tencent.mm.plugin.expt.b.a.aIu().hashCode()) });
    initDB();
    paramc = com.tencent.mm.plugin.expt.b.a.aIu();
    u.a locala = this.hsE;
    int i = paramc.hashCode();
    if (locala != null) {
      bool = true;
    }
    x.i("MicroMsg.ExptService", "reset DB [%d] dataDB[%b]", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool) });
    if (locala != null)
    {
      paramc.iHQ = new com.tencent.mm.plugin.expt.c.d(locala);
      paramc.iHR = new com.tencent.mm.plugin.expt.c.c(locala);
    }
    com.tencent.mm.plugin.expt.roomexpt.a.aIx().iIl = new b(this.hsE);
  }
  
  public void onAccountRelease()
  {
    x.i("MicroMsg.PluginExpt", "Plugin expt onAccountRelease [%d] [%d]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(com.tencent.mm.plugin.expt.b.a.aIu().hashCode()) });
    closeDB();
  }
  
  public String toString()
  {
    return "plugin-expt";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/expt/PluginExpt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */