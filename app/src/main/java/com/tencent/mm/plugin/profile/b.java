package com.tencent.mm.plugin.profile;

import com.tencent.mm.bt.h.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bs;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;

public final class b
  implements ar
{
  private static HashMap<Integer, h.d> cVM = new HashMap();
  private volatile com.tencent.mm.plugin.profile.ui.newbizinfo.d.a lUd;
  
  static
  {
    com.tencent.mm.pluginsdk.cmd.b.a(new com.tencent.mm.plugin.profile.ui.newbizinfo.a.a(), new String[] { "//usenewprofile" });
    cVM.put(Integer.valueOf("NEW_BIZINFO_PROFILE_INFO_TABLE".hashCode()), new b.1());
  }
  
  public static com.tencent.mm.plugin.profile.ui.newbizinfo.d.a bni()
  {
    g.Eg().Ds();
    if (bnj().lUd == null)
    {
      b localb = bnj();
      au.HU();
      localb.lUd = new com.tencent.mm.plugin.profile.ui.newbizinfo.d.a(c.FO());
    }
    return bnj().lUd;
  }
  
  private static b bnj()
  {
    au.HN();
    b localb2 = (b)bs.iK("plugin.profile");
    b localb1 = localb2;
    if (localb2 == null)
    {
      x.w("MicroMsg.SubCoreProfile", "not found in MMCore, new one");
      localb1 = new b();
      au.HN().a("plugin.freewifi", localb1);
    }
    return localb1;
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return cVM;
  }
  
  public final void bn(boolean paramBoolean) {}
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease() {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/profile/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */