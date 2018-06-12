package com.tencent.mm.plugin.topstory.ui.home;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.a.rq;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.topstory.ui.b.a;
import com.tencent.mm.plugin.topstory.ui.b.d;
import com.tencent.mm.plugin.topstory.ui.b.f;
import com.tencent.mm.plugin.topstory.ui.webview.TopStoryWebView;
import com.tencent.mm.plugin.websearch.api.ad;
import com.tencent.mm.protocal.c.bte;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.ThreeDotsLoadingView;
import java.io.IOException;

public class b
  implements a
{
  protected bte ccA;
  protected ThreeDotsLoadingView gzp;
  protected FrameLayout nED;
  protected com.tencent.mm.plugin.topstory.ui.webview.d ozA;
  protected View ozB;
  protected c<rq> ozC = new b.5(this);
  protected MMActivity ozw;
  protected boolean ozx;
  protected com.tencent.mm.plugin.topstory.ui.webview.b ozy;
  protected TopStoryWebView ozz;
  
  public b(MMActivity paramMMActivity, boolean paramBoolean)
  {
    this.ozw = paramMMActivity;
    this.ozx = paramBoolean;
  }
  
  public final void Ot(String paramString)
  {
    this.ozA.Ot(paramString);
  }
  
  public final void a(com.tencent.mm.plugin.topstory.ui.webview.b paramb, TopStoryWebView paramTopStoryWebView, com.tencent.mm.plugin.topstory.ui.webview.d paramd, bte parambte)
  {
    this.ozy = paramb;
    this.ozz = paramTopStoryWebView;
    this.ozA = paramd;
    this.ozA.oCq = this;
    this.ccA = parambte;
    this.ozy.oCq = this;
    paramb = new FrameLayout.LayoutParams(-1, -1);
    this.nED.addView(this.ozz, paramb);
  }
  
  public final void bHG()
  {
    ah.A(new Runnable()
    {
      public final void run()
      {
        b.this.gzp.cAH();
        b.this.ozB.setVisibility(8);
        b.this.ozz.setVisibility(0);
      }
    });
  }
  
  protected final void bHH()
  {
    com.tencent.mm.plugin.topstory.a.h.a(this.ccA, "uiBackBtnClick", System.currentTimeMillis());
    ad.Ad(19);
    if (this.ozx)
    {
      this.ozw.finish();
      return;
    }
    this.ozw.moveTaskToBack(true);
  }
  
  protected boolean bHI()
  {
    return true;
  }
  
  public final MMActivity baA()
  {
    return this.ozw;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    x.i("MicroMsg.TopStory.TopStoryUIComponentImpl", "onCreate");
    this.ccA = new bte();
    try
    {
      this.ccA.aG(this.ozw.getIntent().getByteArrayExtra("key_context"));
      if (!bi.oW(this.ccA.sqA))
      {
        x.i("MicroMsg.TopStory.TopStoryUIComponentImpl", "Create HomeContext Success %s", new Object[] { this.ccA.sqA });
        this.ozC.cht();
        ad.Ad(17);
        this.ozw.setBackBtn(new MenuItem.OnMenuItemClickListener()
        {
          public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
          {
            b.this.bHH();
            return true;
          }
        });
        this.nED = ((FrameLayout)this.ozw.findViewById(b.d.webview_container));
        if (((com.tencent.mm.plugin.topstory.ui.a)g.n(com.tencent.mm.plugin.topstory.ui.a.class)).getWebViewMgr() == null) {
          break label440;
        }
        if (!((com.tencent.mm.plugin.topstory.ui.a)g.n(com.tencent.mm.plugin.topstory.ui.a.class)).getWebViewMgr().ozJ) {
          ((com.tencent.mm.plugin.topstory.ui.a)g.n(com.tencent.mm.plugin.topstory.ui.a.class)).getWebViewMgr().a(this.ccA);
        }
        ((com.tencent.mm.plugin.topstory.ui.a)g.n(com.tencent.mm.plugin.topstory.ui.a.class)).getWebViewMgr().a(this);
        this.ozB = this.ozw.findViewById(b.d.splash_view);
        this.gzp = ((ThreeDotsLoadingView)this.ozw.findViewById(b.d.loading_view));
        if ((Build.VERSION.SDK_INT >= 21) && (!com.tencent.mm.ui.statusbar.d.Af()))
        {
          this.ozw.getWindow().setStatusBarColor(this.ozw.getResources().getColor(b.a.websearch_bg));
          this.ozw.cqc();
        }
        this.ozw.setMMTitle(this.ccA.sqD);
        this.ozw.nS(-16777216);
        this.ozw.cqf();
        this.ozw.lF(Color.parseColor("#F2F2F2"));
        this.gzp.cAG();
        if (bHI()) {
          this.ozw.addIconOptionMenu(0, b.f.actionbar_icon_dark_search, new b.2(this));
        }
      }
    }
    catch (Exception localException)
    {
      try
      {
        for (;;)
        {
          this.ozw.setTitleBarDoubleClickListener(new b.3(this));
          com.tencent.mm.plugin.topstory.ui.d.c(this.ccA, "uiOnCreate", System.currentTimeMillis());
          return;
          localException = localException;
          x.printErrStackTrace("MicroMsg.TopStory.TopStoryUIComponentImpl", localException, "initData use intent", new Object[0]);
          if (paramBundle != null)
          {
            try
            {
              this.ccA.aG(paramBundle.getByteArray("key_context"));
            }
            catch (IOException paramBundle)
            {
              x.printErrStackTrace("MicroMsg.TopStory.TopStoryUIComponentImpl", paramBundle, "initData use savedInstanceState", new Object[0]);
            }
            continue;
            x.i("MicroMsg.TopStory.TopStoryUIComponentImpl", "Create HomeContext Fail");
            this.ozw.finish();
          }
        }
        label440:
        paramBundle = new d();
        paramBundle.a(this.ccA);
        paramBundle.a(this);
      }
      catch (Throwable paramBundle)
      {
        for (;;) {}
      }
    }
  }
  
  protected final void onDestroy()
  {
    Object localObject = this.ccA;
    long l = this.ozw.cql();
    if (l > 0L)
    {
      localObject = String.format("%s,%s,%s,%s", new Object[] { Integer.valueOf(((bte)localObject).scene), Long.valueOf(l), Integer.valueOf(((bte)localObject).bxk), Integer.valueOf(((bte)localObject).sqC) });
      x.i("MicroMsg.TopStory.TopStoryReportApiLogic", "reportTopStoryHomePageBrowseTime 15018 %s", new Object[] { localObject });
      com.tencent.mm.plugin.report.service.h.mEJ.k(15018, (String)localObject);
    }
    com.tencent.mm.plugin.topstory.a.h.a(this.ccA, "uiOnDestroy", System.currentTimeMillis());
    ad.Ad(18);
    localObject = this.ozy;
    ((com.tencent.mm.plugin.topstory.ui.webview.b)localObject).oCq = null;
    ((com.tencent.mm.plugin.topstory.ui.webview.b)localObject).oCs = null;
    g.DF().b(1943, (e)localObject);
    this.ozC.dead();
  }
  
  protected final void onNewIntent(Intent paramIntent)
  {
    bte localbte = new bte();
    try
    {
      localbte.aG(paramIntent.getByteArrayExtra("key_context"));
      this.ccA.bJK = localbte.bJK;
      this.ccA.bWr = localbte.bWr;
      this.ccA.scene = localbte.scene;
      this.ccA.kJG = localbte.kJG;
      com.tencent.mm.plugin.topstory.a.h.a(this.ccA, "uiOnNewIntent", System.currentTimeMillis());
      ad.Ad(20);
      this.ozA.Ox("onNewIntent");
      return;
    }
    catch (Exception paramIntent)
    {
      for (;;)
      {
        this.ozw.finish();
      }
    }
  }
  
  protected final void onPause()
  {
    com.tencent.mm.plugin.topstory.a.h.a(this.ccA, "uiOnPause", System.currentTimeMillis());
    this.ozA.Ox("onPause");
  }
  
  protected final void onResume()
  {
    com.tencent.mm.plugin.topstory.a.h.a(this.ccA, "uiOnResume", System.currentTimeMillis());
    this.ozA.Ox("onResume");
  }
  
  protected final void onSaveInstanceState(Bundle paramBundle)
  {
    try
    {
      paramBundle.putByteArray("key_context", this.ccA.toByteArray());
      x.i("MicroMsg.TopStory.TopStoryUIComponentImpl", "onSaveInstanceState %s", new Object[] { this.ccA.sqA });
      return;
    }
    catch (IOException paramBundle)
    {
      x.printErrStackTrace("MicroMsg.TopStory.TopStoryUIComponentImpl", paramBundle, "onSaveInstanceState", new Object[0]);
    }
  }
  
  public final boolean yd(int paramInt)
  {
    if (paramInt == 4)
    {
      bHH();
      return true;
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/topstory/ui/home/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */