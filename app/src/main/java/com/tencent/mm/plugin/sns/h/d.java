package com.tencent.mm.plugin.sns.h;

import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.aa;
import com.tencent.mm.storage.w;
import java.util.HashMap;
import java.util.Map;

public final class d
{
  public static d nxJ = new d();
  public w cXI;
  public int dlT = 0;
  public HashMap<String, Integer> nxK;
  public HashMap<String, String> nxL;
  public int nxM = 200;
  public int nxN = 86400;
  
  private d()
  {
    Object localObject1 = com.tencent.mm.model.c.c.Jx().fJ("100077");
    if (((com.tencent.mm.storage.c)localObject1).isValid())
    {
      localObject1 = ((com.tencent.mm.storage.c)localObject1).ckq();
      this.nxM = bi.getInt((String)((Map)localObject1).get("maxCacheFeedCount"), 200);
      this.nxN = bi.getInt((String)((Map)localObject1).get("maxCacheSeconds"), 86400);
      this.dlT = bi.getInt((String)((Map)localObject1).get("needUploadData"), 0);
    }
    x.i("MicroMsg.SnsReportHelper", "initAbtestArg maxCacheFeedCount:%d, maxCacheSeconds:%d, needUploadData:%d", new Object[] { Integer.valueOf(this.nxM), Integer.valueOf(this.nxN), Integer.valueOf(this.dlT) });
    this.cXI = new w(aa.duN + "snsreport.cfg");
    localObject1 = this.cXI.get(3, new HashMap());
    Object localObject2 = this.cXI.get(4, new HashMap());
    if ((!(localObject1 instanceof HashMap)) || (!(localObject2 instanceof HashMap)))
    {
      FileOp.deleteFile(aa.duN + "snsreport.cfg");
      this.nxK = new HashMap();
      this.nxL = new HashMap();
      return;
    }
    this.nxK = ((HashMap)localObject1);
    this.nxL = ((HashMap)localObject2);
  }
  
  public final void MT(String paramString)
  {
    if (this.dlT == 0) {
      return;
    }
    HashMap localHashMap = this.nxK;
    if (this.nxK.containsKey(paramString)) {}
    for (int i = ((Integer)this.nxK.get(paramString)).intValue() + 1;; i = 1)
    {
      localHashMap.put(paramString, Integer.valueOf(i));
      return;
    }
  }
  
  public final void eF(String paramString1, String paramString2)
  {
    if ((this.dlT == 0) || (bi.oW(paramString1)) || (bi.oW(paramString2))) {
      return;
    }
    this.nxL.put(paramString1, paramString2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/sns/h/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */