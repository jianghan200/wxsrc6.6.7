package com.tencent.mm.plugin.topstory.ui.webview;

import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.topstory.ui.PluginTopStoryUI;
import com.tencent.mm.plugin.topstory.ui.c;
import com.tencent.mm.protocal.c.bte;
import com.tencent.mm.protocal.c.cfj;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
  implements com.tencent.mm.ab.e
{
  public com.tencent.mm.plugin.topstory.ui.home.a oCq;
  private boolean oCr;
  public b oCs;
  public byte[] oCt;
  byte[] oCu;
  byte[] oCv;
  private com.tencent.mm.plugin.topstory.a.c.a oyF;
  
  private void a(bte parambte, String paramString, boolean paramBoolean)
  {
    if (this.oCr)
    {
      if (this.oCq != null) {
        this.oCq.Ot(paramString);
      }
      this.oCr = false;
      return;
    }
    if (!paramBoolean)
    {
      this.oCs = new b((byte)0);
      this.oCs.oCz = parambte;
      this.oCs.hnN = System.currentTimeMillis();
      this.oCs.oCy = paramString;
      return;
    }
    this.oCs = null;
  }
  
  private static String bIF()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("ret", -1);
      return localJSONObject.toString();
    }
    catch (JSONException localJSONException)
    {
      for (;;) {}
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if (paraml.equals(this.oyF))
    {
      g.DF().b(1943, this);
      this.oyF = null;
      paramString = (com.tencent.mm.plugin.topstory.a.c.a)paraml;
      if ((paramInt1 == 0) && (paramInt2 == 0)) {
        break label61;
      }
      x.i("MicroMsg.TopStory.TopStoryWebData", "netscene topstory error");
      a(paramString.ccA, bIF(), true);
    }
    label61:
    do
    {
      return;
      paraml = paramString.bHD().rjK;
      a(paramString.ccA, paraml, false);
    } while (!((PluginTopStoryUI)g.n(PluginTopStoryUI.class)).getTopStoryCommand().ozs);
    com.tencent.mm.sdk.f.e.post(new b.1(this, paraml), "SaveLastRequestResult");
  }
  
  public final void a(bte parambte, boolean paramBoolean)
  {
    if ((this.oyF != null) && (parambte.bJK.equals(this.oyF.ccA.bJK)))
    {
      this.oCr = paramBoolean;
      x.i("MicroMsg.TopStory.TopStoryWebData", "Wait current net scene");
      return;
    }
    this.oyF = new com.tencent.mm.plugin.topstory.a.c.a(parambte);
    g.DF().a(1943, this);
    g.DF().a(this.oyF, 0);
    this.oCr = paramBoolean;
    x.i("MicroMsg.TopStory.TopStoryWebData", "Start new net scene");
  }
  
  private final class a
    implements Runnable
  {
    public String oCx;
    
    private a() {}
    
    private static long aM(byte[] paramArrayOfByte)
    {
      if (paramArrayOfByte == null) {
        return 0L;
      }
      return paramArrayOfByte.length;
    }
    
    public final void run()
    {
      int i = 0;
      long l1 = System.currentTimeMillis();
      b.this.oCt = FileOp.e("/data/data/com.tencent.mm/files/public/fts_browse/res/app.html", 0, -1);
      b.this.oCu = FileOp.e("/data/data/com.tencent.mm/files/public/fts_browse/res/dist/build.js", 0, -1);
      b.this.oCv = FileOp.e("/data/data/com.tencent.mm/files/public/fts_browse/res/dist/style.css", 0, -1);
      b localb;
      String str;
      JSONObject localJSONObject;
      if (!bi.oW(this.oCx))
      {
        localb = b.this;
        str = this.oCx;
        if (localb.oCt != null) {
          localJSONObject = new JSONObject();
        }
      }
      try
      {
        localJSONObject.put("json", str);
        localJSONObject.put("newQuery", false);
        localJSONObject.put("isCache", true);
        localb.oCt = new String(localb.oCt).replace("'###preloadObjFeedsData###'", localJSONObject.toString() + "\n").getBytes();
        x.i("MicroMsg.TopStory.TopStoryWebData", "attachDataToHtml");
        long l2 = aM(b.this.oCt);
        long l3 = aM(b.this.oCu);
        long l4 = aM(b.this.oCv);
        long l5 = System.currentTimeMillis();
        if (!bi.oW(this.oCx)) {
          i = this.oCx.length();
        }
        x.i("MicroMsg.TopStory.TopStoryWebData", "loadHtmlDataFromSdcard totalLength: %d usetime: %d attachJsonData %d", new Object[] { Long.valueOf(l2 + l3 + l4), Long.valueOf(l5 - l1), Integer.valueOf(i) });
        return;
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
    }
  }
  
  private final class b
  {
    long hnN;
    String oCy;
    bte oCz;
    
    private b() {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/topstory/ui/webview/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */