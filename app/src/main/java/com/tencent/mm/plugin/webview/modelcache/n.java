package com.tencent.mm.plugin.webview.modelcache;

import com.tencent.mm.compatible.util.e;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bv.a;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelsfs.SFSContext.Builder;
import com.tencent.mm.sdk.platformtools.x;

public final class n
{
  public final bv.a pTc = new n.1(this);
  public final com.tencent.mm.sdk.b.c pTd = new n.2(this);
  public final com.tencent.mm.sdk.b.c pTe = new n.3(this);
  
  public static void bUJ()
  {
    Object localObject = null;
    try
    {
      com.tencent.mm.model.c localc = au.HU();
      localObject = localc;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.e("MicroMsg.WebViewCacheSubCoreToolsExtension", "setupSFS, getAccStg, exception = %s", new Object[] { localException });
      }
      FileOp.mL(e.dgx + "sfs");
      FileOp.a(e.dgx, new SFSContext.Builder().setDBDirectory(com.tencent.mm.model.c.Gp() + "sfs").setStoragePath(e.dgx + "sfs").setName("wvcache"));
    }
    if (localObject == null) {
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/webview/modelcache/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */