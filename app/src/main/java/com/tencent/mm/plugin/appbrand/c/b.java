package com.tencent.mm.plugin.appbrand.c;

import com.tencent.mm.modelcdntran.g;
import com.tencent.mm.modelcdntran.i.a;
import com.tencent.mm.modelcdntran.j.a;
import com.tencent.mm.plugin.appbrand.app.e;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Vector;

public final class b
{
  public i.a dVu = new b.1(this);
  public Vector<d.b> fnS = new Vector();
  public Vector<d.a> fnT = new Vector();
  public HashMap<String, d.c> fnU = new HashMap();
  public j.a fnV = new b.2(this);
  
  public static boolean rq(String paramString)
  {
    a locala = e.abk().rs(paramString);
    if (locala == null)
    {
      x.e("MicroMsg.AppbrandCdnService", "cancelUploadTask get webview file chooser item  by local id failed : %s", new Object[] { paramString });
      return false;
    }
    return g.ND().lw(locala.mediaId);
  }
  
  public final void a(d.a parama)
  {
    if ((this.fnT != null) && (parama != null)) {
      this.fnT.remove(parama);
    }
  }
  
  public final void a(d.b paramb)
  {
    if ((this.fnS != null) && (paramb != null)) {
      this.fnS.remove(paramb);
    }
  }
  
  public final void rr(String paramString)
  {
    this.fnU.remove(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */