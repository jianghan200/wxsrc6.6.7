package com.tencent.mm.plugin.fav.ui;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fav.a.ac;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.aj;
import com.tencent.mm.plugin.fav.a.ak;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.a.r;
import com.tencent.mm.plugin.fav.a.z;
import com.tencent.mm.plugin.fav.ui.widget.c;
import com.tencent.mm.plugin.fav.ui.widget.c.a;
import com.tencent.mm.pluginsdk.wallet.i;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.y;

public abstract class FavBaseUI
  extends MMActivity
  implements AdapterView.OnItemClickListener
{
  protected ag dvh = new ag(Looper.getMainLooper());
  private boolean iXW = false;
  protected boolean iXX = false;
  private boolean iXY = false;
  private long iXZ = 0L;
  protected ListView iYa;
  protected TextView iYb;
  private HandlerThread iYc;
  protected ag iYd;
  protected View iYe;
  private View iYf;
  protected c iYg;
  protected k iYh;
  protected c.a iYi = null;
  private com.tencent.mm.ab.e iYj = new FavBaseUI.6(this);
  private com.tencent.mm.ab.e iYk = new FavBaseUI.7(this);
  private Runnable iYl = new FavBaseUI.8(this);
  protected Runnable iYm = new FavBaseUI.9(this);
  private Runnable iYn = new Runnable()
  {
    public final void run()
    {
      synchronized (FavBaseUI.g(FavBaseUI.this))
      {
        FavBaseUI.this.aMd();
        FavBaseUI.this.aMc().aME();
        FavBaseUI.this.aMg();
        return;
      }
    }
  };
  private j.a iYo = new FavBaseUI.2(this);
  private final Object lockObj = new Object();
  
  private void eQ(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if (this.iYb == null) {
        this.iYb = ((TextView)((ViewStub)findViewById(m.e.empty_view_stub)).inflate().findViewById(m.e.empty_fav_view));
      }
      this.iYb.setVisibility(0);
    }
    while (this.iYb == null) {
      return;
    }
    this.iYb.setVisibility(8);
  }
  
  protected final void a(com.tencent.mm.plugin.fav.ui.a.a parama)
  {
    if (parama == null) {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FavoriteBaseUI", "handle empty view fail, adapter is null");
    }
    do
    {
      return;
      if (parama.isEmpty()) {
        if (aMe())
        {
          eP(true);
          eQ(false);
        }
      }
      while ((parama.isEmpty()) || (((ae)g.n(ae.class)).getFavItemInfoStorage().r(parama.aMB(), parama.getType())))
      {
        this.iYa.removeFooterView(this.iYe);
        return;
        eP(false);
        eQ(true);
        aMf();
        continue;
        eP(false);
        eQ(false);
      }
    } while (this.iYa.getFooterViewsCount() != 0);
    this.iYa.addFooterView(this.iYe);
  }
  
  public abstract com.tencent.mm.plugin.fav.ui.a.a aMc();
  
  protected abstract void aMd();
  
  protected abstract boolean aMe();
  
  protected abstract void aMf();
  
  protected void aMg()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FavoriteBaseUI", "on storage change, try refresh job");
    this.dvh.removeCallbacks(this.iYm);
    this.dvh.post(this.iYm);
  }
  
  protected final void eP(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if (this.iYf == null) {
        this.iYf = ((ViewStub)findViewById(m.e.empty_load_view_stub)).inflate();
      }
      this.iYf.setVisibility(0);
    }
    while (this.iYf == null) {
      return;
    }
    this.iYf.setVisibility(8);
  }
  
  protected final int getLayoutId()
  {
    return m.f.favorite_base_ui;
  }
  
  protected void initHeaderView()
  {
    this.iYg = new c(this.mController.tml);
    this.iYg.setCleanFavSpace(this.iYi);
    this.iYg.eX(false);
    this.iYg.jfp.setVisibility(8);
    this.iYg.jfq.setVisibility(8);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FavoriteBaseUI", "padding %s, %s", new Object[] { Integer.valueOf(this.iYg.getPaddingTop()), Integer.valueOf(this.iYg.getPaddingBottom()) });
    this.iYa.addHeaderView(this.iYg);
  }
  
  protected final void initView()
  {
    long l = System.currentTimeMillis();
    this.iYa = ((ListView)findViewById(m.e.favorite_lv));
    this.iYa.setDrawingCacheEnabled(false);
    new FavBaseUI.3(this);
    initHeaderView();
    this.iYe = y.gq(this).inflate(m.f.fav_loading_footer, null);
    this.iYa.setOnScrollListener(new FavBaseUI.4(this));
    this.iYa.setOnItemClickListener(this);
    this.iYa.setOnTouchListener(new FavBaseUI.5(this));
    this.iYa.setAdapter(aMc());
    a(aMc());
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FavoriteBaseUI", "init view use %d ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
  }
  
  public void onCreate(Bundle paramBundle)
  {
    long l = System.currentTimeMillis();
    super.onCreate(paramBundle);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FavoriteBaseUI", "onCreate MMCore.accHasReady[%b]", new Object[] { Boolean.valueOf(g.Eg().Dx()) });
    paramBundle = new ak();
    g.DF().a(paramBundle, 0);
    ((ae)g.n(ae.class)).getFavItemInfoStorage().c(this.iYo);
    g.DF().a(400, this.iYj);
    g.DF().a(402, this.iYk);
    this.iYc = com.tencent.mm.sdk.f.e.Xs(getClass().getName() + "_handlerThread_" + System.currentTimeMillis());
    this.iYc.start();
    this.iYd = new ag(this.iYc.getLooper());
    this.iYh = new k(this.mController.tml, 64);
    initView();
    lF(this.mController.tml.getResources().getColor(m.b.normal_actionbar_color));
    if (bi.f((Integer)g.Ei().DT().get(8217, null)) == 0)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FavoriteBaseUI", "do init data for first time");
      this.iXY = true;
      paramBundle = new aj();
      g.DF().a(paramBundle, 0);
      if (this.iXY)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FavoriteBaseUI", "show loading dialog");
        if ((aMc() == null) || (aMc().isEmpty())) {
          eP(true);
        }
        eQ(false);
      }
    }
    for (;;)
    {
      ((ae)g.n(ae.class)).getFavCdnService().run();
      ((ae)g.n(ae.class)).getCheckCdnService().run();
      ((ae)g.n(ae.class)).getSendService().run();
      ((ae)g.n(ae.class)).getModService().run();
      g.Em().H(new FavBaseUI.1(this));
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FavoriteBaseUI", "on create use %d ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      return;
      b.startSync();
      if (aMc().isEmpty())
      {
        eP(true);
        eQ(false);
        this.iYe.setVisibility(8);
      }
      else
      {
        eP(false);
        eQ(false);
      }
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    if (((ae)g.n(ae.class)).getFavItemInfoStorage().aLz() == null) {
      return;
    }
    this.iYh.destory();
    this.iYh = null;
    this.iYc.quit();
    ((ae)g.n(ae.class)).getFavItemInfoStorage().d(this.iYo);
    g.DF().b(400, this.iYj);
    g.DF().b(402, this.iYk);
  }
  
  protected void onPause()
  {
    super.onPause();
    aMc();
  }
  
  protected void onResume()
  {
    super.onResume();
    i.Cx(5);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/fav/ui/FavBaseUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */