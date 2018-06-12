package com.tencent.mm.plugin.topstory.ui;

import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.plugin.topstory.ui.home.d;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.aa.a;

public class PluginTopStoryUI
  extends f
  implements com.tencent.mm.kernel.a.b.b, com.tencent.mm.kernel.api.bucket.c, a
{
  private int ozm = 2;
  private c ozn;
  private d ozo;
  
  public void execute(com.tencent.mm.kernel.b.g paramg) {}
  
  public int getFirstLoadWebView()
  {
    return this.ozm;
  }
  
  public c getTopStoryCommand()
  {
    return this.ozn;
  }
  
  public d getWebViewMgr()
  {
    return this.ozo;
  }
  
  public void onAccountInitialized(e.c paramc)
  {
    this.ozo = new d();
    this.ozn = new c();
    com.tencent.mm.pluginsdk.cmd.b.a(this.ozn, new String[] { "//topstory" });
    long l = com.tencent.mm.kernel.g.Ei().DT().i(aa.a.tad);
    if (System.currentTimeMillis() - l <= 259200000L)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.TopStory.PluginTopStoryUI", "Use TopStory In Three Days");
      ah.i(new PluginTopStoryUI.1(this), 1000L);
    }
    for (;;)
    {
      com.tencent.mm.sdk.f.e.post(new PluginTopStoryUI.2(this), "TopStory.DeleteTopStoryConversation");
      return;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.TopStory.PluginTopStoryUI", "Not Use TopStory In Three Days");
    }
  }
  
  public void onAccountRelease()
  {
    this.ozo = null;
    this.ozn = null;
    com.tencent.mm.pluginsdk.cmd.b.D(new String[] { "//topstory" });
  }
  
  public void parallelsDependency() {}
  
  public void setFirstLoadWebView(int paramInt)
  {
    this.ozm = paramInt;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/topstory/ui/PluginTopStoryUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */