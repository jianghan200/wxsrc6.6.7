package com.tencent.mm.plugin.websearch.api;

import android.content.Intent;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;

public class z
{
  private static volatile z pLY;
  private ah egm;
  private boolean pLT = false;
  private boolean pLU = false;
  private Boolean pLV;
  private h pLW = new t();
  private Map<Integer, aa> pLX;
  
  public static z bTc()
  {
    if (pLY == null) {}
    try
    {
      if (pLY == null) {
        pLY = new z();
      }
      return pLY;
    }
    finally {}
  }
  
  public final h Aa(int paramInt)
  {
    if (paramInt <= 0) {
      localObject = this.pLW;
    }
    aa localaa;
    do
    {
      return (h)localObject;
      if (this.pLX == null) {
        this.pLX = new HashMap();
      }
      localaa = (aa)this.pLX.get(Integer.valueOf(paramInt));
      localObject = localaa;
    } while (localaa != null);
    Object localObject = new aa(paramInt);
    this.pLX.put(Integer.valueOf(paramInt), localObject);
    return (h)localObject;
  }
  
  public final void ai(Intent paramIntent)
  {
    cu(paramIntent.getStringExtra("tools_param_preload_url"), paramIntent.getIntExtra("tools_param_preload_search_biz", -1));
  }
  
  public final boolean bTd()
  {
    if (this.pLV != null)
    {
      x.i("MicroMsg.WebSearch.WebSearchPreloadExport", "openSearchPreload cmdPreloadSwitch %b", new Object[] { this.pLV });
      return this.pLV.booleanValue();
    }
    if (p.zP(0) < 80007181)
    {
      x.e("MicroMsg.WebSearch.WebSearchPreloadExport", "current search template not support preload");
      return false;
    }
    return this.pLT;
  }
  
  public final boolean bTe()
  {
    if (this.pLV != null)
    {
      x.i("MicroMsg.WebSearch.WebSearchPreloadExport", "isOpenRecommendPreload cmdPreloadSwitch %b", new Object[] { this.pLV });
      return this.pLV.booleanValue();
    }
    return this.pLU;
  }
  
  public final void cu(String paramString, int paramInt)
  {
    if (ad.cie())
    {
      Aa(paramInt).PU(paramString);
      return;
    }
    g.Em().H(new z.1(this, paramInt, paramString));
  }
  
  public final void jP(boolean paramBoolean)
  {
    this.pLV = Boolean.valueOf(paramBoolean);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/websearch/api/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */