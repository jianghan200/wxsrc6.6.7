package com.tencent.mm.plugin.fingerprint;

import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.b.g;
import com.tencent.mm.plugin.fingerprint.a.a;

public class PluginFingerprint
  extends f
  implements a
{
  public void configure(g paramg)
  {
    paramg.ES();
  }
  
  public void dependency() {}
  
  public void execute(g paramg)
  {
    paramg.ES();
  }
  
  public void installed()
  {
    alias(PluginFingerprint.class);
  }
  
  public String name()
  {
    return "plugin-fingerprint";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/fingerprint/PluginFingerprint.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */