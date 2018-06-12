package com.tencent.mm.plugin.game.gamewebview.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Looper;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.tencent.mm.plugin.game.wepkg.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class c
  extends FrameLayout
{
  private b jIG;
  private b jIH;
  com.tencent.mm.plugin.game.widget.b<b> jII;
  private GameWebViewUI jIJ;
  private Intent jIK;
  private long jIL;
  
  public c(GameWebViewUI paramGameWebViewUI)
  {
    super(paramGameWebViewUI);
    this.jIJ = paramGameWebViewUI;
    this.jII = new com.tencent.mm.plugin.game.widget.b(new c.1(this, paramGameWebViewUI));
  }
  
  private void a(Animator paramAnimator, Runnable paramRunnable)
  {
    paramAnimator.addListener(new c.7(this, paramRunnable));
    paramAnimator.start();
  }
  
  private boolean aSG()
  {
    return this.jIK.getBooleanExtra("is_from_keep_top", false);
  }
  
  final void a(b paramb)
  {
    if (paramb == null) {
      return;
    }
    paramb.fo(false);
    paramb.setVisibility(8);
    removeView(paramb);
    if (paramb != this.jIG)
    {
      paramb.agD();
      return;
    }
    paramb = ObjectAnimator.ofFloat(paramb, "translationX", new float[] { 0.0F });
    paramb.setDuration(0L);
    a(paramb, null);
  }
  
  public final void aSI()
  {
    x.d("MicroMsg.GameWebPageContainer", "cancelPageTop");
    if ((this.jIG != null) && (!this.jII.contains(this.jIG))) {
      this.jIG.agD();
    }
    for (;;)
    {
      this.jIG = null;
      return;
      if (this.jIG != null) {
        this.jIG.setHasKeepTop(false);
      }
    }
  }
  
  public final void b(b paramb)
  {
    x.d("MicroMsg.GameWebPageContainer", "keepPageTop");
    if (this.jIG == paramb) {
      return;
    }
    if ((this.jIG != null) && (!this.jII.contains(this.jIG))) {
      this.jIG.agD();
    }
    for (;;)
    {
      this.jIG = paramb;
      return;
      if (this.jIG != null) {
        this.jIG.setHasKeepTop(false);
      }
    }
  }
  
  public final void c(Intent paramIntent, boolean paramBoolean)
  {
    this.jIK = paramIntent;
    Object localObject1 = paramIntent.getStringExtra("rawUrl");
    if (bi.oW((String)localObject1)) {
      return;
    }
    Object localObject2 = (b)this.jII.peek();
    if ((localObject2 != null) && (((b)localObject2).getPageView().getRawUrl().equals(localObject1)))
    {
      ((b)localObject2).setFromKeepTop(aSG());
      return;
    }
    if ((aSG()) && (this.jIG != null))
    {
      while (!this.jII.isEmpty()) {
        a((b)this.jII.pop());
      }
      if (this.jIG.getParent() == null) {
        addView(this.jIG);
      }
      this.jIG.agE();
      this.jII.push(this.jIG);
      return;
    }
    int i;
    if ((!paramBoolean) && (paramIntent.getBooleanExtra("needAnimation", true)))
    {
      i = 1;
      x.d("MicroMsg.GameWebPageContainer", "createPage start : " + System.currentTimeMillis());
      this.jIL = System.currentTimeMillis();
      if (this.jIH == null) {
        break label510;
      }
      paramIntent = this.jIH;
      this.jIH = null;
      label208:
      paramIntent.setBundle(this.jIK.getExtras());
      x.d("MicroMsg.GameWebPageContainer", "LoadUrl begin : %d", new Object[] { Long.valueOf(System.currentTimeMillis() - this.jIL) });
      x.d("MicroMsg.GameWebPage", "loadUrl, url = %s, pageViewId = %d, this = %d", new Object[] { localObject1, Integer.valueOf(paramIntent.jGU.hashCode()), Integer.valueOf(paramIntent.hashCode()) });
      localObject2 = paramIntent.jGU;
      if (!bi.oW((String)localObject1)) {
        break label574;
      }
      x.e("MicroMsg.GameWebPageView", "rawUrl is null");
    }
    for (;;)
    {
      x.d("MicroMsg.GameWebPageContainer", "LoadUrl end : %d", new Object[] { Long.valueOf(System.currentTimeMillis() - this.jIL) });
      localObject2 = (b)this.jII.peek();
      this.jII.push(paramIntent);
      if (i == 0) {
        break label717;
      }
      x.d("MicroMsg.GameWebPageContainer", "addView start : %d", new Object[] { Long.valueOf(System.currentTimeMillis() - this.jIL) });
      if (paramIntent.getParent() == null) {
        addView(paramIntent, 0);
      }
      x.d("MicroMsg.GameWebPageContainer", "addView end : %d", new Object[] { Long.valueOf(System.currentTimeMillis() - this.jIL) });
      localObject1 = new boolean[1];
      localObject1[0] = 0;
      localObject2 = new c.2(this, (boolean[])localObject1, (b)localObject2, paramIntent);
      paramIntent.getPageView().setPageCallBack(new c.3(this, (boolean[])localObject1, (Runnable)localObject2));
      x.d("MicroMsg.GameWebPageContainer", "post : %d", new Object[] { Long.valueOf(System.currentTimeMillis() - this.jIL) });
      postDelayed((Runnable)localObject2, 300L);
      return;
      i = 0;
      break;
      label510:
      x.d("MicroMsg.GameWebPageContainer", "createPage begin: " + System.currentTimeMillis());
      paramIntent = new b(this.jIJ, this);
      x.d("MicroMsg.GameWebPageContainer", "createPage end: " + System.currentTimeMillis());
      break label208;
      label574:
      x.d("MicroMsg.GameWebPageView", "loadUrl, rawUrl = %s, this = %d", new Object[] { localObject1, Integer.valueOf(localObject2.hashCode()) });
      h.mEJ.a(611L, 1L, 1L, false);
      ((d)localObject2).jIl = ((String)localObject1);
      ((d)localObject2).jJl = new a(((d)localObject2).jIJ, ((d)localObject2).jIZ, ((d)localObject2).jIZ.hashCode());
      ((d)localObject2).jJl.kdI = new d.22((d)localObject2);
      ((d)localObject2).jJl.az(((d)localObject2).jIl, false);
      if (((d)localObject2).jJl.DS(((d)localObject2).jIl)) {
        ((d)localObject2).jJe.setVisibility(0);
      }
      ((d)localObject2).aSL();
    }
    label717:
    addView(paramIntent);
    paramIntent.agE();
  }
  
  public final void cleanup()
  {
    while (!this.jII.isEmpty()) {
      ((b)this.jII.pop()).agD();
    }
    if (this.jIH != null) {
      this.jIH.agD();
    }
  }
  
  public final void fp(boolean paramBoolean)
  {
    if (this.jII.size() <= 1)
    {
      this.jIJ.finish();
      return;
    }
    c.4 local4 = new c.4(this, paramBoolean);
    if (Looper.getMainLooper().getThread() == Thread.currentThread())
    {
      local4.run();
      return;
    }
    post(local4);
  }
  
  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    b localb = (b)this.jII.peek();
    if (localb != null)
    {
      if (localb.getPageView().onKeyDown(paramInt, paramKeyEvent)) {
        return true;
      }
      if ((paramInt == 4) && (localb.getPageView().aST())) {
        return true;
      }
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/ui/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */