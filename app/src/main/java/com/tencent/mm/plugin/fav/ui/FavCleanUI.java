package com.tencent.mm.plugin.fav.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.ak;
import com.tencent.mm.plugin.fav.a.d;
import com.tencent.mm.plugin.fav.a.d.a;
import com.tencent.mm.plugin.fav.ui.d.a.c;
import com.tencent.mm.plugin.fav.ui.widget.a;
import com.tencent.mm.protocal.c.vx;
import com.tencent.mm.protocal.c.wl;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FavCleanUI
  extends MMActivity
  implements a.c
{
  protected ag dvh = new ag(Looper.getMainLooper());
  private boolean iXW = false;
  protected boolean iXX = false;
  private long iXZ = 0L;
  private HandlerThread iYc;
  protected ag iYd;
  protected View iYe;
  private View iYf;
  private Runnable iYl = new FavCleanUI.7(this);
  protected Runnable iYm = new Runnable()
  {
    public final void run()
    {
      if (FavCleanUI.e(FavCleanUI.this) == null) {}
      do
      {
        return;
        if ((!FavCleanUI.e(FavCleanUI.this).isEmpty()) && (SystemClock.elapsedRealtime() - FavCleanUI.h(FavCleanUI.this) < 1000L))
        {
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FavCleanUI", "try refresh, time limit, now %d last %d delay %d", new Object[] { Long.valueOf(SystemClock.elapsedRealtime()), Long.valueOf(FavCleanUI.h(FavCleanUI.this)), Integer.valueOf(1000) });
          FavCleanUI.this.dvh.postDelayed(this, 500L);
          return;
        }
        FavCleanUI.i(FavCleanUI.this);
        FavCleanUI.a(FavCleanUI.this, SystemClock.elapsedRealtime());
        com.tencent.mm.sdk.platformtools.x.v("MicroMsg.FavCleanUI", "do refresh job");
        FavCleanUI.d(FavCleanUI.this);
      } while (!FavCleanUI.this.iXX);
      com.tencent.mm.sdk.platformtools.x.v("MicroMsg.FavCleanUI", "do scroll to first");
      FavCleanUI.j(FavCleanUI.this).setSelection(0);
      FavCleanUI.this.iXX = false;
    }
  };
  private k iYr;
  private com.tencent.mm.plugin.fav.ui.a.b iYs;
  private ListView iYt;
  private TextView iYu;
  private a iYv;
  private boolean iYw = false;
  private int iYx = 0;
  private d.a iYy = new FavCleanUI.3(this);
  private com.tencent.mm.ab.e iYz = new com.tencent.mm.ab.e()
  {
    public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, l paramAnonymousl)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FavCleanUI", "on getfavinfo scene end");
      if (FavCleanUI.f(FavCleanUI.this) != null) {
        FavCleanUI.f(FavCleanUI.this).jfd = com.tencent.mm.plugin.fav.a.b.aKR();
      }
    }
  };
  
  private void eR(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.iYf.setVisibility(8);
      this.iYu.setVisibility(0);
      this.iYt.removeFooterView(this.iYe);
      if (this.iYv != null) {
        this.iYv.hide();
      }
    }
    do
    {
      return;
      this.iYf.setVisibility(8);
      this.iYu.setVisibility(8);
      this.iYt.removeFooterView(this.iYe);
    } while (this.iYv == null);
    this.iYv.show();
  }
  
  private void eS(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if (this.iYt.getFooterViewsCount() == 0) {
        this.iYt.addFooterView(this.iYe);
      }
      return;
    }
    this.iYt.removeFooterView(this.iYe);
  }
  
  protected final void aMg()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FavCleanUI", "on storage change, try refresh job");
    this.dvh.removeCallbacks(this.iYm);
    this.dvh.post(this.iYm);
  }
  
  public final void dC(long paramLong)
  {
    Object localObject = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dy(paramLong);
    if ((localObject != null) && (((com.tencent.mm.plugin.fav.a.g)localObject).field_favProto != null) && (((com.tencent.mm.plugin.fav.a.g)localObject).field_favProto.rBI.size() != 0))
    {
      localObject = ((com.tencent.mm.plugin.fav.a.g)localObject).field_favProto.rBI.iterator();
      while (((Iterator)localObject).hasNext()) {
        paramLong = ((vx)((Iterator)localObject).next()).rzJ;
      }
    }
    if (this.iYs.jbQ)
    {
      localObject = this.iYv;
      if (this.iYs.aMG() <= 0) {
        break label217;
      }
    }
    label217:
    for (boolean bool = true;; bool = false)
    {
      if (((a)localObject).jff) {
        ((a)localObject).eOQ.setEnabled(bool);
      }
      localObject = this.iYv;
      List localList = this.iYs.eU(false);
      paramLong = this.iYs.aMH();
      if ((localList.size() == 0) || (paramLong <= 0L)) {
        break;
      }
      ((a)localObject).hSo.setText(((a)localObject).hSo.getContext().getString(m.i.fav_clean_delete_info, new Object[] { com.tencent.mm.plugin.fav.a.b.dp(paramLong) }));
      ((a)localObject).eOQ.setEnabled(true);
      return;
    }
    ((a)localObject).aMR();
  }
  
  protected final int getLayoutId()
  {
    return m.f.fav_clean_ui;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onBackPressed()
  {
    finish();
    super.onBackPressed();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.iYx = getIntent().getIntExtra("key_enter_fav_cleanui_from", 0);
    this.iYc = com.tencent.mm.sdk.f.e.Xs(getClass().getName() + "_handlerThread_" + System.currentTimeMillis());
    this.iYc.start();
    this.iYd = new ag(this.iYc.getLooper());
    this.iYt = ((ListView)findViewById(m.e.fav_clean_list));
    setMMTitle(m.i.fav_clean_title);
    this.iYw = true;
    paramBundle = new ak();
    com.tencent.mm.kernel.g.DF().a(paramBundle, 0);
    com.tencent.mm.kernel.g.DF().a(438, this.iYz);
    setBackBtn(new FavCleanUI.1(this));
    paramBundle = (ViewStub)findViewById(m.e.empty_load_view_stub);
    if (paramBundle != null) {}
    for (this.iYf = paramBundle.inflate();; this.iYf = findViewById(m.e.favorite_loading))
    {
      this.iYu = ((TextView)findViewById(m.e.empty_fav_view));
      this.iYf.setVisibility(0);
      this.iYu.setVisibility(8);
      this.iYt.removeFooterView(this.iYe);
      if (this.iYv != null) {
        this.iYv.hide();
      }
      this.iYe = y.gq(this).inflate(m.f.fav_loading_footer, null);
      this.iYt.setOnScrollListener(new FavCleanUI.2(this));
      if (this.iYw)
      {
        this.iYv = new a();
        paramBundle = this.iYv;
        View localView = findViewById(m.e.fav_clean_footer);
        paramBundle.jff = false;
        paramBundle.jfg = localView;
        this.iYv.jfh = new FavCleanUI.5(this);
        this.iYw = false;
      }
      d.aLb().a(this.iYy);
      return;
    }
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FavCleanUI", "on create options menu");
    return super.onCreateOptionsMenu(paramMenu);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    d locald = d.aLb();
    d.a locala = this.iYy;
    if (locald.iVy.contains(locala)) {
      locald.iVy.remove(locala);
    }
    if (this.iYr != null)
    {
      this.iYr.destory();
      this.iYr = null;
    }
    if (this.iYs != null) {
      this.iYs.finish();
    }
    this.iYc.quit();
    com.tencent.mm.kernel.g.DF().b(438, this.iYz);
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    return super.onOptionsItemSelected(paramMenuItem);
  }
  
  protected void onResume()
  {
    super.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/fav/ui/FavCleanUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */