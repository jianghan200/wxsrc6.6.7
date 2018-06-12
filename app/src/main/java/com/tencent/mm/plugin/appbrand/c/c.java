package com.tencent.mm.plugin.appbrand.c;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;

public final class c
{
  public HashMap<String, a> fnX = new HashMap();
  
  public final void a(a parama)
  {
    if ((parama == null) || (bi.oW(parama.bNH)))
    {
      x.e("MicroMsg.AppbrandMediaCdnItemManager", "item is null or local id is null, ignore this add");
      return;
    }
    x.i("MicroMsg.AppbrandMediaCdnItemManager", "add cdn item, local id : %s, file path : %s", new Object[] { parama.bNH, parama.fnM });
    this.fnX.put(parama.bNH, parama);
  }
  
  public final a rs(String paramString)
  {
    if (bi.oW(paramString))
    {
      x.e("MicroMsg.AppbrandMediaCdnItemManager", "get by local id error, local id is null or nil");
      return null;
    }
    return (a)this.fnX.get(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */