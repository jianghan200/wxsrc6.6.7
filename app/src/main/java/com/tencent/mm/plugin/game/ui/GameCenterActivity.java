package com.tencent.mm.plugin.game.ui;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.content.a;
import android.support.v7.app.ActionBar;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window;
import android.view.WindowInsets;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.plugin.game.d.db;
import com.tencent.mm.plugin.game.f.b;
import com.tencent.mm.plugin.game.f.e;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ak;
import com.tencent.mm.ui.an;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.widget.SwipeBackLayout;
import com.tencent.mm.w.a.k;

public abstract class GameCenterActivity
  extends GameBaseActivity
{
  protected int gwO;
  protected View jUX;
  protected View jUY;
  protected int jUZ = 0;
  protected String jVa = null;
  private db jVb;
  protected ActionBar mActionBar;
  
  private boolean aUR()
  {
    return (!bi.oW(this.jVa)) && (this.jVa.equals("black"));
  }
  
  @TargetApi(21)
  private void setStatusBarColor(int paramInt)
  {
    if ((this.gwO <= 0) || (d.fS(21))) {
      return;
    }
    getWindow().setStatusBarColor(0);
    ViewGroup.LayoutParams localLayoutParams;
    if (this.jUY == null)
    {
      this.jUY = new View(this);
      this.jUY.setId(f.e.game_action_btn);
      localLayoutParams = new ViewGroup.LayoutParams(-1, this.gwO);
      ((ViewGroup)findViewById(16908290)).addView(this.jUY, localLayoutParams);
    }
    for (;;)
    {
      this.jUY.setBackgroundColor(paramInt);
      return;
      localLayoutParams = this.jUY.getLayoutParams();
      if (localLayoutParams.height != this.gwO)
      {
        localLayoutParams.height = this.gwO;
        this.jUY.setLayoutParams(localLayoutParams);
      }
    }
  }
  
  @TargetApi(21)
  protected final void a(ViewGroup paramViewGroup, WindowInsets paramWindowInsets)
  {
    if (this.gwO == paramWindowInsets.getSystemWindowInsetTop()) {}
    int j;
    boolean bool;
    do
    {
      do
      {
        return;
        this.gwO = paramWindowInsets.getSystemWindowInsetTop();
        aUQ();
        Object localObject = paramViewGroup;
        if ((paramViewGroup instanceof SwipeBackLayout)) {
          localObject = paramViewGroup.getChildAt(0);
        }
        i = f.e.action_bar_container;
        if (i > 0)
        {
          paramViewGroup = ((View)localObject).findViewById(i);
          if (paramViewGroup != null)
          {
            localObject = (ViewGroup.MarginLayoutParams)paramViewGroup.getLayoutParams();
            ((ViewGroup.MarginLayoutParams)localObject).topMargin = paramWindowInsets.getSystemWindowInsetTop();
            paramViewGroup.setLayoutParams((ViewGroup.LayoutParams)localObject);
            paramViewGroup.requestLayout();
          }
        }
        x.i("MicroMsg.GameCenterActivity", "setInitialStatusBarStyle");
      } while (!d.fR(21));
      if (this.jUZ == 0) {
        break;
      }
      lF(this.jUZ);
      if (aUR())
      {
        x.i("MicroMsg.GameCenterActivity", "setBackBtnColorFilter");
        cqf();
      }
      j = this.jUZ;
      bool = aUR();
      if ((Build.VERSION.SDK_INT >= 23) && (!h.Ae()))
      {
        setStatusBarColor(j);
        paramViewGroup = getWindow();
        i = paramViewGroup.getDecorView().getSystemUiVisibility();
        if (bool) {
          i |= 0x2000;
        }
        for (;;)
        {
          paramViewGroup.getDecorView().setSystemUiVisibility(i);
          return;
          i &= 0xDFFF;
        }
      }
    } while (Build.VERSION.SDK_INT < 21);
    int i = j;
    if (bool) {
      i = ak.AD(j);
    }
    setStatusBarColor(i);
    return;
    setStatusBarColor(an.n(getResources().getColor(f.b.statusbar_fg_color), this.mController.cqm()));
  }
  
  protected final void aUQ()
  {
    if (this.jUX == null) {
      return;
    }
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)this.jUX.getLayoutParams();
    int j = this.gwO;
    if (this.mActionBar != null) {}
    for (int i = this.mActionBar.getHeight();; i = 0)
    {
      i += j;
      if (i == localMarginLayoutParams.topMargin) {
        break;
      }
      localMarginLayoutParams.topMargin = i;
      this.jUX.setLayoutParams(localMarginLayoutParams);
      return;
    }
  }
  
  public final void addIconOptionMenu(int paramInt1, int paramInt2, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    if (!d.fR(21)) {
      super.addIconOptionMenu(paramInt1, paramInt2, paramOnMenuItemClickListener);
    }
    Drawable localDrawable;
    do
    {
      return;
      localDrawable = a.f(this, paramInt2);
    } while (localDrawable == null);
    if (aUR()) {
      localDrawable.setColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
    }
    for (;;)
    {
      a(paramInt1, getString(a.k.app_more), localDrawable, paramOnMenuItemClickListener);
      return;
      localDrawable.clearColorFilter();
    }
  }
  
  public final void addTextOptionMenu(int paramInt, String paramString, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    if ((d.fR(21)) && (aUR()))
    {
      a(paramInt, paramString, -16777216, paramOnMenuItemClickListener);
      return;
    }
    super.addTextOptionMenu(paramInt, paramString, paramOnMenuItemClickListener);
  }
  
  /* Error */
  public void onCreate(android.os.Bundle paramBundle)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial 277	com/tencent/mm/plugin/game/ui/GameBaseActivity:onCreate	(Landroid/os/Bundle;)V
    //   5: aload_0
    //   6: aload_0
    //   7: invokevirtual 281	com/tencent/mm/plugin/game/ui/GameCenterActivity:getSupportActionBar	()Landroid/support/v7/app/ActionBar;
    //   10: putfield 221	com/tencent/mm/plugin/game/ui/GameCenterActivity:mActionBar	Landroid/support/v7/app/ActionBar;
    //   13: aload_0
    //   14: invokestatic 287	com/tencent/mm/plugin/game/model/h:aTL	()Lcom/tencent/mm/plugin/game/model/h;
    //   17: invokevirtual 291	com/tencent/mm/plugin/game/model/h:aTN	()Lcom/tencent/mm/plugin/game/d/db;
    //   20: putfield 293	com/tencent/mm/plugin/game/ui/GameCenterActivity:jVb	Lcom/tencent/mm/plugin/game/d/db;
    //   23: aload_0
    //   24: getfield 293	com/tencent/mm/plugin/game/ui/GameCenterActivity:jVb	Lcom/tencent/mm/plugin/game/d/db;
    //   27: ifnull +28 -> 55
    //   30: aload_0
    //   31: aload_0
    //   32: getfield 293	com/tencent/mm/plugin/game/ui/GameCenterActivity:jVb	Lcom/tencent/mm/plugin/game/d/db;
    //   35: getfield 298	com/tencent/mm/plugin/game/d/db:dxh	Ljava/lang/String;
    //   38: invokestatic 304	com/tencent/mm/plugin/game/e/c:parseColor	(Ljava/lang/String;)I
    //   41: putfield 22	com/tencent/mm/plugin/game/ui/GameCenterActivity:jUZ	I
    //   44: aload_0
    //   45: aload_0
    //   46: getfield 293	com/tencent/mm/plugin/game/ui/GameCenterActivity:jVb	Lcom/tencent/mm/plugin/game/d/db;
    //   49: getfield 307	com/tencent/mm/plugin/game/d/db:jOk	Ljava/lang/String;
    //   52: putfield 24	com/tencent/mm/plugin/game/ui/GameCenterActivity:jVa	Ljava/lang/String;
    //   55: aload_0
    //   56: aload_0
    //   57: getfield 206	com/tencent/mm/ui/MMActivity:mController	Lcom/tencent/mm/ui/s;
    //   60: getfield 310	com/tencent/mm/ui/s:contentView	Landroid/view/View;
    //   63: putfield 219	com/tencent/mm/plugin/game/ui/GameCenterActivity:jUX	Landroid/view/View;
    //   66: aload_0
    //   67: getfield 219	com/tencent/mm/plugin/game/ui/GameCenterActivity:jUX	Landroid/view/View;
    //   70: ifnull +35 -> 105
    //   73: aload_0
    //   74: invokevirtual 119	com/tencent/mm/plugin/game/ui/GameCenterActivity:aUQ	()V
    //   77: aload_0
    //   78: invokevirtual 58	com/tencent/mm/plugin/game/ui/GameCenterActivity:getWindow	()Landroid/view/Window;
    //   81: invokevirtual 174	android/view/Window:getDecorView	()Landroid/view/View;
    //   84: checkcast 89	android/view/ViewGroup
    //   87: iconst_0
    //   88: invokevirtual 124	android/view/ViewGroup:getChildAt	(I)Landroid/view/View;
    //   91: checkcast 89	android/view/ViewGroup
    //   94: new 312	com/tencent/mm/plugin/game/ui/GameCenterActivity$1
    //   97: dup
    //   98: aload_0
    //   99: invokespecial 315	com/tencent/mm/plugin/game/ui/GameCenterActivity$1:<init>	(Lcom/tencent/mm/plugin/game/ui/GameCenterActivity;)V
    //   102: invokevirtual 319	android/view/ViewGroup:addOnLayoutChangeListener	(Landroid/view/View$OnLayoutChangeListener;)V
    //   105: bipush 21
    //   107: invokestatic 149	com/tencent/mm/compatible/util/d:fR	(I)Z
    //   110: ifeq +58 -> 168
    //   113: aload_0
    //   114: invokevirtual 58	com/tencent/mm/plugin/game/ui/GameCenterActivity:getWindow	()Landroid/view/Window;
    //   117: invokevirtual 174	android/view/Window:getDecorView	()Landroid/view/View;
    //   120: checkcast 89	android/view/ViewGroup
    //   123: iconst_0
    //   124: invokevirtual 124	android/view/ViewGroup:getChildAt	(I)Landroid/view/View;
    //   127: checkcast 89	android/view/ViewGroup
    //   130: astore_1
    //   131: aload_1
    //   132: new 321	com/tencent/mm/plugin/game/ui/GameCenterActivity$2
    //   135: dup
    //   136: aload_0
    //   137: aload_1
    //   138: invokespecial 324	com/tencent/mm/plugin/game/ui/GameCenterActivity$2:<init>	(Lcom/tencent/mm/plugin/game/ui/GameCenterActivity;Landroid/view/ViewGroup;)V
    //   141: invokevirtual 328	android/view/ViewGroup:setOnApplyWindowInsetsListener	(Landroid/view/View$OnApplyWindowInsetsListener;)V
    //   144: return
    //   145: astore_1
    //   146: ldc -118
    //   148: ldc_w 330
    //   151: iconst_1
    //   152: anewarray 332	java/lang/Object
    //   155: dup
    //   156: iconst_0
    //   157: aload_1
    //   158: invokevirtual 336	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   161: aastore
    //   162: invokestatic 340	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   165: goto -60 -> 105
    //   168: aload_0
    //   169: invokevirtual 58	com/tencent/mm/plugin/game/ui/GameCenterActivity:getWindow	()Landroid/view/Window;
    //   172: invokevirtual 174	android/view/Window:getDecorView	()Landroid/view/View;
    //   175: checkcast 89	android/view/ViewGroup
    //   178: iconst_1
    //   179: invokevirtual 344	android/view/ViewGroup:setFitsSystemWindows	(Z)V
    //   182: return
    //   183: astore_1
    //   184: ldc -118
    //   186: ldc_w 346
    //   189: iconst_1
    //   190: anewarray 332	java/lang/Object
    //   193: dup
    //   194: iconst_0
    //   195: aload_1
    //   196: invokevirtual 336	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   199: aastore
    //   200: invokestatic 340	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   203: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	204	0	this	GameCenterActivity
    //   0	204	1	paramBundle	android.os.Bundle
    // Exception table:
    //   from	to	target	type
    //   55	105	145	java/lang/Exception
    //   105	144	183	java/lang/Exception
    //   168	182	183	java/lang/Exception
  }
  
  protected final void onCreateBeforeSetContentView()
  {
    supportRequestWindowFeature(5);
    supportRequestWindowFeature(9);
    setProgressBarIndeterminateVisibility(false);
  }
  
  public final void setBackBtn(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    x.i("MicroMsg.GameCenterActivity", "setBackBtn");
    super.setBackBtn(paramOnMenuItemClickListener, 0);
    if ((d.fR(21)) && (aUR()))
    {
      x.i("MicroMsg.GameCenterActivity", "setBackBtn, setBackBtnColorFilter");
      cqf();
    }
  }
  
  public final void setBackBtn(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener, int paramInt)
  {
    x.i("MicroMsg.GameCenterActivity", "setBackBtn");
    super.setBackBtn(paramOnMenuItemClickListener, paramInt);
    if ((d.fR(21)) && (aUR()))
    {
      x.i("MicroMsg.GameCenterActivity", "setBackBtn, setBackBtnColorFilter");
      cqf();
    }
  }
  
  public final void setMMTitle(int paramInt)
  {
    super.setMMTitle(paramInt);
    if ((d.fR(21)) && (aUR())) {
      nS(-16777216);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameCenterActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */