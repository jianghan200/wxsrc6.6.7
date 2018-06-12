package com.tencent.mm.plugin.sns.f;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class h
{
  public boolean bKE = true;
  public String kCA = "";
  public String ntX = "";
  public String ntY = "";
  public int nuA = 0;
  public List<a> nuB = new ArrayList();
  public String nuN = "";
  public int[] nuO;
  
  public final boolean bzi()
  {
    return (this.bKE) && (this.nuB != null) && (this.nuB.size() > 0);
  }
  
  public final boolean d(String paramString1, String paramString2, Map<String, String> paramMap)
  {
    this.ntY = paramString1;
    this.ntX = paramString2;
    if (paramMap == null) {
      return false;
    }
    for (;;)
    {
      int i;
      try
      {
        this.nuB.clear();
        this.kCA = bi.aG((String)paramMap.get("language"), "");
        this.nuN = bi.aG((String)paramMap.get("first_step_order"), "");
        paramString2 = this.nuN.split("\\|");
        this.nuO = new int[paramString2.length];
        if (this.nuO.length != 0) {
          break label460;
        }
        this.bKE = false;
      }
      catch (Exception paramString1)
      {
        int j;
        int k;
        x.printErrStackTrace("MicroMsg.SnsAdAbTestInfo", paramString1, "feed xml error ", new Object[0]);
        return false;
      }
      if (i < paramString2.length)
      {
        this.nuO[i] = bi.WU(paramString2[i]);
        if ((this.nuO[i] <= 0) || (this.nuO[i] > 3)) {
          this.bKE = false;
        }
      }
      else
      {
        j = bi.WU((String)paramMap.get("wording_count"));
        k = bi.WU((String)paramMap.get("expertype"));
        i = 0;
        if (i < j)
        {
          paramString2 = new a();
          paramString2.ntq = bi.WU((String)paramMap.get(String.format("wording_%d_id", new Object[] { Integer.valueOf(i + 1) })));
          paramString2.ntr = bi.aG((String)paramMap.get(String.format("wording_%d_zh_CN", new Object[] { Integer.valueOf(i + 1) })), "");
          paramString2.nts = bi.aG((String)paramMap.get(String.format("wording_%d_zh_TW", new Object[] { Integer.valueOf(i + 1) })), "");
          paramString2.ntt = bi.aG((String)paramMap.get(String.format("wording_%d_en", new Object[] { Integer.valueOf(i + 1) })), "");
          paramString2.ntu = bi.WU((String)paramMap.get(String.format("wording_%d_action_type", new Object[] { Integer.valueOf(i + 1) })));
          this.nuB.add(paramString2);
          i += 1;
          continue;
        }
        x.i("MicroMsg.SnsAdAbTestInfo", "expertType " + k + " " + paramString1 + " " + this.nuN);
        return false;
        label460:
        i = 0;
        continue;
      }
      i += 1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sns/f/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */