package com.tencent.mm.plugin.auth;

import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.b.g;
import com.tencent.mm.model.av;
import com.tencent.mm.plugin.messenger.foundation.a.o;
import com.tencent.mm.protocal.i.f;
import com.tencent.mm.protocal.i.g;
import com.tencent.mm.protocal.u.b;

public class PluginAuth
  extends f
  implements com.tencent.mm.plugin.auth.a.b
{
  private final a gQW = new a((byte)0);
  
  public com.tencent.mm.vending.b.b addHandleAuthResponse(com.tencent.mm.plugin.auth.a.a parama)
  {
    return this.gQW.aI(parama);
  }
  
  public void configure(g paramg)
  {
    av.a(new PluginAuth.1(this));
  }
  
  public void dependency()
  {
    dependsOn(o.class);
  }
  
  public void execute(g paramg) {}
  
  public com.tencent.mm.plugin.auth.a.a getHandleAuthResponseCallbacks()
  {
    return this.gQW;
  }
  
  public void installed()
  {
    alias(com.tencent.mm.plugin.auth.a.b.class);
  }
  
  public String toString()
  {
    return "plugin-auth";
  }
  
  private static final class a
    extends com.tencent.mm.by.a<com.tencent.mm.plugin.auth.a.a>
    implements com.tencent.mm.plugin.auth.a.a
  {
    public final void a(i.f paramf, i.g paramg, boolean paramBoolean)
    {
      a(new PluginAuth.a.1(this, paramf, paramg, paramBoolean));
    }
    
    public final void a(u.b paramb, String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2)
    {
      a(new PluginAuth.a.2(this, paramb, paramString1, paramInt1, paramString2, paramString3, paramInt2));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/auth/PluginAuth.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */