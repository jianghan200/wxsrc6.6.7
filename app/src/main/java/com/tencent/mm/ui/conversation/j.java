package com.tencent.mm.ui.conversation;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView.a;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.g.a.qt;
import com.tencent.mm.g.a.rh;
import com.tencent.mm.model.au;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.plugin.appbrand.widget.recentview.AppBrandRecentView;
import com.tencent.mm.sdk.platformtools.FLock;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.az;
import com.tencent.mm.ui.AbstractTabChildActivity.a;
import com.tencent.mm.ui.HomeUI;
import com.tencent.mm.ui.LauncherUI;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class j
  extends AbstractTabChildActivity.a
  implements i.a
{
  private int[] nYg = new int[2];
  private g unL;
  private a uqM = new a();
  private ConversationWithAppBrandListView uqX;
  private TextView uqY;
  private i uqZ = new i();
  private c ura = new c();
  private m urb = new m();
  private k urc = new k();
  private a urd;
  
  public final void B(long paramLong, int paramInt)
  {
    if (this.uqX != null) {
      this.uqX.B(paramLong, paramInt);
    }
  }
  
  protected final void coA()
  {
    x.i("MicroMsg.MainUI", "onTabStart");
  }
  
  protected final void coB()
  {
    x.i("MicroMsg.MainUI", "onTabPause");
    com.tencent.mm.blink.b.xi().g(new j.10(this));
    Object localObject = this.uqZ;
    if (((i)localObject).wakeLock.isHeld())
    {
      x.w("MicroMsg.InitHelper", "onTabPause wakelock.release!");
      ((i)localObject).wakeLock.release();
    }
    hideVKB();
    localObject = this.urb;
    if (com.tencent.mm.ax.g.elf != null) {
      com.tencent.mm.ax.g.elf.b((com.tencent.mm.ax.a)localObject);
    }
    l.czc();
    LauncherUI localLauncherUI = (LauncherUI)((m)localObject).bOb;
    if (localLauncherUI != null) {
      localLauncherUI.tkn.ac(((m)localObject).uhD);
    }
    cza();
  }
  
  protected final void coC()
  {
    x.i("MicroMsg.MainUI", "onTabStop");
  }
  
  protected final void coD()
  {
    x.i("MicroMsg.MainUI", "onTabDestroy  acc:%b", new Object[] { Boolean.valueOf(au.HX()) });
    com.tencent.mm.blink.b.xi().g(new j.2(this));
    Object localObject = this.uqZ;
    ((i)localObject).uqQ.unlock();
    au.DF().b(-1, (com.tencent.mm.ab.e)localObject);
    if (((i)localObject).eHw != null)
    {
      ((i)localObject).eHw.dismiss();
      ((i)localObject).eHw = null;
    }
    com.tencent.mm.sdk.b.a.sFg.c(((i)localObject).uqO);
    com.tencent.mm.sdk.b.a.sFg.c(((i)localObject).uqP);
    localObject = this.urb;
    if (((m)localObject).ifd != null)
    {
      com.tencent.mm.sdk.b.a.sFg.c(((m)localObject).ifd);
      ((m)localObject).ifd = null;
    }
    com.tencent.mm.sdk.b.a.sFg.c(((m)localObject).uru);
    com.tencent.mm.sdk.b.a.sFg.c(((m)localObject).urv);
    if (com.tencent.mm.ax.g.elf != null) {
      com.tencent.mm.ax.g.elf.b((com.tencent.mm.ax.a)localObject);
    }
    if (au.HX()) {
      ai.VH();
    }
    localObject = this.ura;
    com.tencent.mm.sdk.b.a.sFg.c(((c)localObject).unO);
    com.tencent.mm.sdk.b.a.sFg.c(((c)localObject).unM);
    com.tencent.mm.sdk.b.a.sFg.c(((c)localObject).unN);
    ((c)localObject).activity = null;
    if ((au.HX()) && (this.unL != null))
    {
      au.HU();
      com.tencent.mm.model.c.FW().b(this.unL);
      au.HU();
      com.tencent.mm.model.c.FR().b(this.unL);
    }
    if (this.unL != null)
    {
      localObject = this.unL;
      if (((g)localObject).uoc != null)
      {
        com.tencent.mm.sdk.b.a.sFg.c(((g)localObject).uoc);
        ((g)localObject).uoc = null;
      }
      this.unL.upL = null;
      localObject = this.unL;
      ((g)localObject).upL = null;
      if (((g)localObject).tEl != null)
      {
        ((g)localObject).tEl.clear();
        ((g)localObject).tEl = null;
      }
      ((com.tencent.mm.ui.f)localObject).lv(true);
      ((g)localObject).coT();
      ((g)localObject).upO.clear();
      x.i("MicroMsg.ConversationWithCacheAdapter", "clear usernamePositionMap");
    }
  }
  
  public final void coE()
  {
    if (this.uqX != null) {
      this.uqX.coE();
    }
  }
  
  public final void coF()
  {
    x.i("MicroMsg.MainUI", "turn to bg");
  }
  
  public final void coG()
  {
    x.i("MicroMsg.MainUI", "turn to fg");
  }
  
  protected final void coy()
  {
    x.i("MicroMsg.MainUI", "onTabCreate, %d", new Object[] { Integer.valueOf(hashCode()) });
    if (this.mController != null) {
      this.mController.ak(4, false);
    }
    x.i("MicroMsg.MainUI", "mainUIOnCreate");
    long l = System.currentTimeMillis();
    setMenuVisibility(true);
    au.Em().cik();
    x.i("MicroMsg.MainUI", "main ui init view");
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if (this.uqX != null)
    {
      localObject1 = this.uqM;
      if (((a)localObject1).unh != null)
      {
        ((a)localObject1).dX(((a)localObject1).una);
        ((a)localObject1).dX(((a)localObject1).unb);
        ((a)localObject1).dX(((a)localObject1).unc);
        ((a)localObject1).dX(((a)localObject1).und);
        localObject2 = ((a)localObject1).une.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (com.tencent.mm.pluginsdk.ui.b.b)((Iterator)localObject2).next();
          if ((localObject3 != null) && (((com.tencent.mm.pluginsdk.ui.b.b)localObject3).getView() != null)) {
            ((a)localObject1).unh.removeFooterView(((com.tencent.mm.pluginsdk.ui.b.b)localObject3).getView());
          }
        }
      }
    }
    this.uqY = ((TextView)findViewById(R.h.empty_conversation_tv));
    this.uqX = ((ConversationWithAppBrandListView)findViewById(R.h.main_chatting_lv));
    this.uqX.setDrawingCacheEnabled(false);
    this.uqX.setScrollingCacheEnabled(false);
    this.unL = new g(getContext(), new j.3(this));
    this.unL.setGetViewPositionCallback(new j.4(this));
    this.unL.setPerformItemClickListener(new j.5(this));
    if (com.tencent.mm.compatible.util.d.fT(18))
    {
      com.tencent.mm.blink.b.xi().g(new Runnable()
      {
        public final void run()
        {
          j.c(j.this).a(j.this.getContext(), j.d(j.this), j.e(j.this));
        }
      });
      localObject1 = this.urc;
      localObject2 = this.uqX;
      localObject3 = this.unL;
      ((k)localObject1).unh = ((ListView)localObject2);
      ((k)localObject1).unL = ((g)localObject3);
      ((ListView)localObject2).setOnScrollListener(((k)localObject1).hLH);
      ((g)localObject3).unW = ((k)localObject1).hLH;
      ah.A(new k.2((k)localObject1));
      this.ura.Z(getActivity());
      this.uqX.setAdapter(this.unL);
      this.uqX.setOnItemClickListener(new e(this.unL, this.uqX, getActivity()));
      this.uqX.setOnItemLongClickListener(new f(this.unL, this.uqX, getActivity(), this.nYg));
      this.uqX.setOnTouchListener(new j.7(this));
      if (this.urd != null) {
        i(this.urd.bIq, this.urd.urg, this.urd.urh);
      }
      this.uqX.setSelection(0);
      localObject1 = this.uqZ;
      localObject2 = getActivity();
      localObject3 = this.uqM;
      ((i)localObject1).bOb = ((Activity)localObject2);
      ((i)localObject1).uqM = ((a)localObject3);
      ((i)localObject1).uqN = this;
      ((i)localObject1).wakeLock = ((PowerManager)((Activity)localObject2).getSystemService("power")).newWakeLock(26, "NetSceneInit Lock");
      au.DF().a(-1, (com.tencent.mm.ab.e)localObject1);
      ((i)localObject1).uqJ = false;
      com.tencent.mm.sdk.b.a.sFg.b(((i)localObject1).uqO);
      com.tencent.mm.sdk.b.a.sFg.b(((i)localObject1).uqP);
      localObject2 = new File(ad.getContext().getFilesDir(), "DBRecoverStarted");
      if (((File)localObject2).exists())
      {
        com.tencent.mm.plugin.report.f.mDy.c("DBRepair", "Last recovery interrupted.", null);
        ((File)localObject2).delete();
      }
      ((i)localObject1).uqQ = new FLock(new File(ad.getContext().getFilesDir(), "MMStarted"));
      if (!((i)localObject1).uqQ.chz()) {
        break label1235;
      }
      ((i)localObject1).uqQ.unlock();
      x.i("MicroMsg.DuplicateDetect", "No data multiple instance detected.");
    }
    for (;;)
    {
      ((i)localObject1).uqQ.chy();
      localObject1 = this.ura;
      localObject2 = this.unL;
      localObject3 = this.uqX;
      FragmentActivity localFragmentActivity = getActivity();
      ((c)localObject1).unL = ((g)localObject2);
      ((c)localObject1).unh = ((ListView)localObject3);
      ((c)localObject1).activity = localFragmentActivity;
      com.tencent.mm.sdk.b.a.sFg.b(((c)localObject1).unO);
      com.tencent.mm.sdk.b.a.sFg.b(((c)localObject1).unM);
      com.tencent.mm.sdk.b.a.sFg.b(((c)localObject1).unN);
      localObject1 = this.urb;
      localObject2 = this.unL;
      localObject3 = this.uqX;
      localFragmentActivity = getActivity();
      ((m)localObject1).unL = ((g)localObject2);
      ((m)localObject1).bOb = localFragmentActivity;
      ((m)localObject1).uqX = ((ConversationWithAppBrandListView)localObject3);
      if (((m)localObject1).ifd == null) {
        ((m)localObject1).ifd = new m.3((m)localObject1, new m.1((m)localObject1));
      }
      if (((m)localObject1).uru == null) {
        ((m)localObject1).uru = new m.4((m)localObject1);
      }
      if (((m)localObject1).urv == null) {
        ((m)localObject1).urv = new m.5((m)localObject1, (ConversationWithAppBrandListView)localObject3);
      }
      com.tencent.mm.sdk.b.a.sFg.b(((m)localObject1).ifd);
      com.tencent.mm.sdk.b.a.sFg.b(((m)localObject1).uru);
      com.tencent.mm.sdk.b.a.sFg.b(((m)localObject1).urv);
      ((m)localObject1).tjO = new m.6((m)localObject1);
      Looper.myQueue().addIdleHandler(((m)localObject1).tjO);
      ((ConversationWithAppBrandListView)localObject3).post(new m.7((m)localObject1));
      localObject1 = com.tencent.mm.ak.o.Ph();
      int i = R.g.chat_img_template;
      x.d("MicroMsg.AutoGetBigImgLogic", "chattingMaskResId change from " + ((com.tencent.mm.ak.b)localObject1).dTi + " to " + i);
      ((com.tencent.mm.ak.b)localObject1).dTi = i;
      com.tencent.mm.ak.o.Ph().start();
      au.HP();
      au.HU();
      com.tencent.mm.model.c.FW().a(this.unL);
      au.HU();
      com.tencent.mm.model.c.FR().a(this.unL);
      localObject1 = this.unL;
      if (((g)localObject1).uoc == null) {
        ((g)localObject1).uoc = new g.2((g)localObject1);
      }
      com.tencent.mm.sdk.b.a.sFg.b(((g)localObject1).uoc);
      this.unL.upL = new j.1(this);
      l = ai.bH(l);
      au.HU();
      x.i("MicroMsg.MainUI", "kevin mainUIOnCreate time:%d uin:%d ver:%x", new Object[] { Long.valueOf(l), Integer.valueOf(com.tencent.mm.model.c.Df()), Integer.valueOf(com.tencent.mm.protocal.d.qVN) });
      this.uqX.postDelayed(new j.8(this), 200L);
      return;
      this.uqM.a(getContext(), this.uqX, this.uqY);
      break;
      label1235:
      x.w("MicroMsg.DuplicateDetect", "Data multiple instance detected.");
      com.tencent.mm.plugin.report.f.mDy.a(579L, 0L, 1L, true);
    }
  }
  
  protected final void coz()
  {
    x.i("MicroMsg.MainUI", "onTabResume");
    long l = ai.VF();
    Object localObject = this.ura;
    if (((c)localObject).unK < 0)
    {
      x.d("MicroMsg.ConvUnreadHelper", "onTabResume totalUnReadCount %d", new Object[] { Integer.valueOf(((c)localObject).unK) });
      if (((c)localObject).unL != null) {
        ((c)localObject).unL.cyP();
      }
    }
    cyZ();
    com.tencent.mm.blink.b.xi().g(new j.9(this));
    x.d("MicroMsg.MainUI", "start time check dkinit KEVIN mainui TestTimeLayoutTime onTabResume:%d", new Object[] { Long.valueOf(ai.bH(l)) });
    localObject = this.urb;
    if (com.tencent.mm.ax.g.elf != null) {
      com.tencent.mm.ax.g.elf.a((com.tencent.mm.ax.a)localObject);
    }
    ah.A(new m.8((m)localObject));
    l.gS(((m)localObject).bOb);
    if ((((m)localObject).bOb != null) && (((m)localObject).bOb.getIntent() != null) && (((m)localObject).bOb.getIntent().getBooleanExtra("resend_fail_messages", false)))
    {
      ah.i(new m.9((m)localObject), 500L);
      ((m)localObject).bOb.getIntent().putExtra("resend_fail_messages", false);
    }
    LauncherUI localLauncherUI = (LauncherUI)((m)localObject).bOb;
    if (localLauncherUI != null) {
      localLauncherUI.tkn.setTitleBarDoubleClickListener(((m)localObject).uhD);
    }
    if ((com.tencent.mm.sdk.platformtools.s.a(((m)localObject).bOb.getIntent(), "Main_ListToTop", false)) && (((m)localObject).uqX != null)) {
      ((m)localObject).uqX.post(new m.2((m)localObject));
    }
    com.tencent.mm.sdk.platformtools.s.b(((m)localObject).bOb.getIntent(), "Main_ListToTop", false);
    localObject = this.uqZ;
    int i;
    if (((i)localObject).eHw == null) {
      i = -1;
    }
    for (;;)
    {
      x.i("MicroMsg.InitHelper", "onTabResume tip:%d initscene:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(((i)localObject).cyV()) });
      ((i)localObject).cyU();
      ah.i(new i.6((i)localObject), 100L);
      if ((au.HX()) && (!this.uqZ.cyW()))
      {
        com.tencent.mm.sdk.b.a.sFg.a(new rh(), Looper.getMainLooper());
        localObject = new qt();
        ((qt)localObject).cbp.action = 4;
        com.tencent.mm.sdk.b.a.sFg.a((com.tencent.mm.sdk.b.b)localObject, Looper.getMainLooper());
      }
      return;
      if (((i)localObject).eHw.isShowing()) {
        i = 1;
      } else {
        i = 0;
      }
    }
  }
  
  public final void cpr()
  {
    x.i("MicroMsg.MainUI", "dkinit onTabSwitchIn");
    i locali = this.uqZ;
    int i;
    if (locali.eHw == null) {
      i = -1;
    }
    for (;;)
    {
      x.i("MicroMsg.InitHelper", "onTabSwitchIn tip:%d initscene:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(locali.cyV()) });
      if (locali.wakeLock != null) {
        locali.cyU();
      }
      if (this.mController != null) {
        this.mController.onResume();
      }
      return;
      if (locali.eHw.isShowing()) {
        i = 1;
      } else {
        i = 0;
      }
    }
  }
  
  public final void cps()
  {
    x.i("MicroMsg.MainUI", "onTabSwitchOut");
    B(0L, 8);
  }
  
  public final void cxZ()
  {
    if (this.unL != null) {
      this.unL.cxZ();
    }
  }
  
  public final void cyX()
  {
    if (this.unL != null) {
      this.unL.kGt = true;
    }
  }
  
  public final void cyY()
  {
    if (this.unL != null)
    {
      this.unL.kGt = false;
      this.unL.cyP();
      if (thisActivity() != null) {
        this.ura.Z(getActivity());
      }
    }
  }
  
  public final void cyZ()
  {
    if (this.unL != null) {
      this.unL.onResume();
    }
  }
  
  public final void cza()
  {
    if (this.unL != null) {
      this.unL.onPause();
    }
  }
  
  protected int getLayoutId()
  {
    return R.i.main;
  }
  
  protected View getLayoutView()
  {
    return com.tencent.mm.kiss.a.b.EY().a(getContext(), "R.layout.main", R.i.main);
  }
  
  public final void i(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if ((this.uqX instanceof ConversationWithAppBrandListView))
    {
      ConversationWithAppBrandListView localConversationWithAppBrandListView = this.uqX;
      if (!localConversationWithAppBrandListView.mr(false))
      {
        x.w("MicroMsg.ConversationWithAppBrandListView", "[showAppBrandHeader] AppBrandHeader is disable! ");
        return;
      }
      x.i("MicroMsg.ConversationWithAppBrandListView", "[showAppBrandHeader] isShow:%s isScrollFirst:%s", new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean3) });
      localConversationWithAppBrandListView.mn(true);
      if ((localConversationWithAppBrandListView.uoX != null) && (!paramBoolean1)) {
        localConversationWithAppBrandListView.uoX.setVisibility(8);
      }
      for (;;)
      {
        localConversationWithAppBrandListView.post(new ConversationWithAppBrandListView.5(localConversationWithAppBrandListView, paramBoolean2));
        return;
        if ((localConversationWithAppBrandListView.uoX != null) && (localConversationWithAppBrandListView.uoY != null) && (localConversationWithAppBrandListView.uoY.getAdapter().getItemCount() > 1))
        {
          localConversationWithAppBrandListView.uoX.setVisibility(0);
          if (paramBoolean3) {
            localConversationWithAppBrandListView.uoY.smoothScrollToPosition(0);
          }
        }
      }
    }
    this.urd = new a(paramBoolean1, paramBoolean2, paramBoolean3);
  }
  
  public boolean noActionBar()
  {
    return true;
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    this.uqM.cyF();
  }
  
  public void onDestroy()
  {
    x.i("MicroMsg.MainUI", "onDestroy");
    this.urc.czb();
    if (this.uqX != null)
    {
      ConversationWithAppBrandListView localConversationWithAppBrandListView = this.uqX;
      if (localConversationWithAppBrandListView.uoY != null) {
        localConversationWithAppBrandListView.uoY.release();
      }
      localConversationWithAppBrandListView.uph.dead();
    }
    super.onDestroy();
  }
  
  public void onPause()
  {
    x.i("MicroMsg.MainUI", "onPause");
    super.onPause();
    if (this.uqX != null)
    {
      ConversationWithAppBrandListView localConversationWithAppBrandListView = this.uqX;
      x.i("MicroMsg.ConversationWithAppBrandListView", "[onPause]");
      localConversationWithAppBrandListView.bPd = true;
    }
  }
  
  public void onResume()
  {
    int i = 0;
    x.i("MicroMsg.MainUI", "onResume");
    super.onResume();
    ConversationWithAppBrandListView localConversationWithAppBrandListView;
    if (this.uqX != null)
    {
      localConversationWithAppBrandListView = this.uqX;
      x.i("MicroMsg.ConversationWithAppBrandListView", "[onResume]");
      localConversationWithAppBrandListView.bPd = false;
      if (localConversationWithAppBrandListView.uoY != null) {
        localConversationWithAppBrandListView.uoY.setLayoutFrozen(false);
      }
      if (localConversationWithAppBrandListView.getAdapter() != null) {
        break label89;
      }
    }
    for (;;)
    {
      if (localConversationWithAppBrandListView.FS(i) > 0.0F) {
        localConversationWithAppBrandListView.postDelayed(new ConversationWithAppBrandListView.13(localConversationWithAppBrandListView), 300L);
      }
      return;
      label89:
      i = localConversationWithAppBrandListView.getAdapter().getCount();
    }
  }
  
  public boolean supportNavigationSwipeBack()
  {
    return false;
  }
  
  final class a
  {
    boolean bIq;
    boolean urg;
    boolean urh;
    
    public a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
    {
      this.bIq = paramBoolean1;
      this.urg = paramBoolean2;
      this.urh = paramBoolean3;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/conversation/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */