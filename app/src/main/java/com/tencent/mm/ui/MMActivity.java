package com.tencent.mm.ui;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.compatible.loader.c;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.statusbar.b;
import com.tencent.mm.ui.statusbar.d;
import com.tencent.mm.ui.tools.o;
import com.tencent.mm.ui.widget.SwipeBackLayout;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;

@com.tencent.mm.ui.base.a(0)
public abstract class MMActivity
  extends MMFragmentActivity
{
  private static String tlR;
  String className;
  public a geJ = null;
  public s mController = new s()
  {
    protected final String aYS()
    {
      return MMActivity.this.aYS();
    }
    
    protected final boolean cpZ()
    {
      return MMActivity.this.cpZ();
    }
    
    protected final void dealContentView(View paramAnonymousView)
    {
      MMActivity.this.dealContentView(paramAnonymousView);
    }
    
    protected final String getClassName()
    {
      return MMActivity.this.getClass().getName();
    }
    
    protected final int getLayoutId()
    {
      return MMActivity.this.getLayoutId();
    }
    
    protected final View getLayoutView()
    {
      return MMActivity.getLayoutView();
    }
    
    public final boolean needShowIdcError()
    {
      return MMActivity.this.needShowIdcError();
    }
    
    public final boolean noActionBar()
    {
      return MMActivity.this.noActionBar();
    }
    
    protected final void onCreateBeforeSetContentView()
    {
      MMActivity.this.onCreateBeforeSetContentView();
    }
    
    public final void onKeyboardStateChanged()
    {
      MMActivity.this.onKeyboardStateChanged();
    }
  };
  public boolean tlM = false;
  public boolean tlN = false;
  private ViewGroup tlO = null;
  public boolean tlP = false;
  private View tlQ;
  private long tlS = 0L;
  private long tlT = 0L;
  private long tlU = 0L;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 19) {}
    try
    {
      Method localMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[] { String.class });
      localMethod.setAccessible(true);
      tlR = (String)localMethod.invoke(null, new Object[] { "qemu.hw.mainkeys" });
      return;
    }
    catch (Throwable localThrowable)
    {
      tlR = null;
    }
  }
  
  public static void cqb() {}
  
  protected static View getLayoutView()
  {
    return null;
  }
  
  public static boolean gn(Context paramContext)
  {
    Resources localResources = paramContext.getResources();
    boolean bool2 = KeyCharacterMap.deviceHasKey(4);
    int i = localResources.getIdentifier("config_showNavigationBar", "bool", "android");
    if (i != 0)
    {
      bool1 = localResources.getBoolean(i);
      if ("1".equals(tlR))
      {
        bool1 = false;
        if ((!bool1) || (bool2) || (ViewConfiguration.get(paramContext).hasPermanentMenuKey())) {
          break label83;
        }
      }
    }
    label83:
    while ((!ViewConfiguration.get(paramContext).hasPermanentMenuKey()) && (!bool2))
    {
      for (;;)
      {
        boolean bool1;
        return true;
        if ("0".equals(tlR)) {
          bool1 = true;
        }
      }
      return false;
    }
    return false;
  }
  
  public static Locale initLanguage(Context paramContext)
  {
    return s.initLanguage(paramContext);
  }
  
  public static void showVKB(Activity paramActivity)
  {
    InputMethodManager localInputMethodManager = (InputMethodManager)paramActivity.getSystemService("input_method");
    if (localInputMethodManager == null) {}
    do
    {
      return;
      paramActivity = paramActivity.getCurrentFocus();
    } while ((paramActivity == null) || (paramActivity.getWindowToken() == null));
    localInputMethodManager.toggleSoftInput(0, 2);
  }
  
  public final void DL(int paramInt)
  {
    this.mController.tmq.setVisibility(paramInt);
  }
  
  public final void DM(int paramInt)
  {
    this.mController.setTitleLogo(0, paramInt);
  }
  
  public final void DN(int paramInt)
  {
    s locals = this.mController;
    locals.tmv = paramInt;
    if (locals.tmt != null) {
      locals.tmt.setColorFilter(paramInt, PorterDuff.Mode.SRC_ATOP);
    }
    if ((locals.tmq != null) && (locals.tmq.getVisibility() == 0)) {
      locals.tmq.setTextColor(paramInt);
    }
    if ((locals.tmu != null) && (locals.tmu.getVisibility() == 0)) {
      locals.tmu.setTextColor(paramInt);
    }
    if ((locals.tgq != null) && (locals.tgq.getVisibility() == 0)) {
      locals.tgq.getDrawable().setColorFilter(paramInt, PorterDuff.Mode.SRC_ATOP);
    }
    while ((locals.tgs == null) || (locals.tgs.getVisibility() != 0)) {
      return;
    }
    locals.tgs.setTextColor(paramInt);
  }
  
  public final void DO(int paramInt)
  {
    if (this.tlQ != null) {
      this.tlQ.setVisibility(paramInt);
    }
  }
  
  public final void L(Class<?> paramClass)
  {
    Intent localIntent = new Intent();
    localIntent.setClass(this, paramClass);
    startActivity(localIntent);
  }
  
  public final void M(CharSequence paramCharSequence)
  {
    this.mController.M(paramCharSequence);
  }
  
  public boolean Xf()
  {
    return false;
  }
  
  public void YC()
  {
    this.mController.hideVKB();
  }
  
  public final void a(int paramInt1, String paramString, int paramInt2, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    s locals = this.mController;
    int i = s.b.tmW;
    s.a locala = new s.a();
    locala.tgH = paramInt1;
    locala.text = paramString;
    locala.textColor = paramInt2;
    locala.eOJ = paramOnMenuItemClickListener;
    locala.jcS = null;
    locala.tmU = i;
    locals.DP(locala.tgH);
    locals.tgz.add(locala);
    new ag().postDelayed(new s.6(locals), 200L);
  }
  
  public final void a(int paramInt, String paramString, Drawable paramDrawable, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.mController.a(paramInt, paramString, paramDrawable, paramOnMenuItemClickListener);
  }
  
  public final void a(int paramInt1, String paramString, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener, int paramInt2)
  {
    this.mController.addTextOptionMenu$7df2a0ca(paramInt1, paramString, paramOnMenuItemClickListener, null, paramInt2);
  }
  
  public final void a(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.mController.updateOptionMenuListener(1, paramOnMenuItemClickListener, null);
  }
  
  public final void a(o paramo)
  {
    this.mController.addSearchMenu(true, paramo);
  }
  
  public final void a(Class<?> paramClass, Intent paramIntent)
  {
    paramIntent.setClass(this, paramClass);
    startActivity(paramIntent);
  }
  
  public final void aA(float paramFloat)
  {
    s locals = this.mController;
    if (locals.tmq != null) {
      locals.tmq.setAlpha(paramFloat);
    }
  }
  
  public String aYS()
  {
    return "";
  }
  
  public final void addDialog(Dialog paramDialog)
  {
    this.mController.addDialog(paramDialog);
  }
  
  public final void addIconOptionMenu(int paramInt1, int paramInt2, int paramInt3, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.mController.addIconOptionMenu(paramInt1, paramInt2, paramInt3, paramOnMenuItemClickListener);
  }
  
  public void addIconOptionMenu(int paramInt1, int paramInt2, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.mController.addIconOptionMenu(paramInt1, paramInt2, paramOnMenuItemClickListener);
  }
  
  public void addTextOptionMenu(int paramInt, String paramString, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.mController.addTextOptionMenu(paramInt, paramString, paramOnMenuItemClickListener);
  }
  
  public void ahy()
  {
    if (getForceOrientation() == -1)
    {
      this.tlM = getSharedPreferences(ad.chY(), 0).getBoolean("settings_landscape_mode", false);
      if (this.tlM)
      {
        setRequestedOrientation(-1);
        return;
      }
      setRequestedOrientation(1);
      return;
    }
    setRequestedOrientation(getForceOrientation());
  }
  
  public final void b(a parama, Intent paramIntent, int paramInt)
  {
    this.geJ = parama;
    startActivityForResult(paramIntent, paramInt);
  }
  
  public final void b(Runnable paramRunnable1, Runnable paramRunnable2)
  {
    s locals = this.mController;
    if (locals.mActionBar == null) {
      return;
    }
    locals.mActionBar.getCustomView().setOnClickListener(new s.3(locals, paramRunnable1, paramRunnable2));
  }
  
  public boolean cpZ()
  {
    return false;
  }
  
  public final ActionBarActivity cqa()
  {
    return this.mController.tml;
  }
  
  public final void cqc()
  {
    Object localObject = this.mController;
    if (Build.VERSION.SDK_INT >= 23)
    {
      localObject = ((s)localObject).tml.getWindow().getDecorView();
      ((View)localObject).setSystemUiVisibility(((View)localObject).getSystemUiVisibility() | 0x2000);
    }
  }
  
  public final boolean cqd()
  {
    Iterator localIterator = this.mController.tgz.iterator();
    while (localIterator.hasNext())
    {
      s.a locala = (s.a)localIterator.next();
      if (locala.tgH == 0) {
        return locala.bKe;
      }
    }
    return false;
  }
  
  public final boolean cqe()
  {
    Iterator localIterator = this.mController.tgz.iterator();
    while (localIterator.hasNext())
    {
      s.a locala = (s.a)localIterator.next();
      if (locala.tgH == 0) {
        return locala.YN;
      }
    }
    return false;
  }
  
  public final void cqf()
  {
    s locals = this.mController;
    if (locals.tmt != null) {
      locals.tmt.getDrawable().setColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
    }
  }
  
  public final void cqg()
  {
    s locals = this.mController;
    if (locals.aDx < locals.tmy)
    {
      ValueAnimator localValueAnimator = ValueAnimator.ofInt(new int[] { locals.aDx, locals.tmy }).setDuration(200L);
      localValueAnimator.addUpdateListener(new s.7(locals));
      localValueAnimator.start();
    }
  }
  
  public final void cqh()
  {
    s locals = this.mController;
    if (Build.VERSION.SDK_INT >= 21) {
      locals.getSupportActionBar().setElevation(0.0F);
    }
  }
  
  public final void cqi()
  {
    s locals = this.mController;
    locals.tmt.setVisibility(8);
    locals.tms.setVisibility(8);
  }
  
  public final void cqj()
  {
    int k = 0;
    if (!gn(this.mController.tml))
    {
      x.w("MicroMsg.MMActivity", "has not NavigationBar!");
      return;
    }
    if (this.tlQ == null)
    {
      this.tlQ = new View(this.mController.tml);
      ((ViewGroup)getWindow().getDecorView()).addView(this.tlQ);
    }
    Object localObject = this.mController.tml;
    Resources localResources = ((Context)localObject).getResources();
    int j;
    int i;
    if (localResources.getConfiguration().orientation == 1)
    {
      j = 1;
      i = k;
      if (Build.VERSION.SDK_INT >= 14)
      {
        i = k;
        if (gn((Context)localObject)) {
          if (j == 0) {
            break label204;
          }
        }
      }
    }
    label204:
    for (localObject = "navigation_bar_height";; localObject = "navigation_bar_height_landscape")
    {
      j = localResources.getIdentifier((String)localObject, "dimen", "android");
      i = k;
      if (j > 0) {
        i = localResources.getDimensionPixelSize(j);
      }
      localObject = new FrameLayout.LayoutParams(-1, i);
      ((FrameLayout.LayoutParams)localObject).gravity = 80;
      this.tlQ.setLayoutParams((ViewGroup.LayoutParams)localObject);
      this.tlQ.setBackgroundColor(-637534208);
      this.tlQ.setVisibility(8);
      return;
      j = 0;
      break;
    }
  }
  
  public final String cqk()
  {
    localObject1 = "";
    Object localObject2 = getCallingActivity();
    if (localObject2 != null)
    {
      localObject1 = ((ComponentName)localObject2).getPackageName();
      x.i("MicroMsg.MMActivity", "get calling activity, %s", new Object[] { localObject1 });
    }
    localObject2 = localObject1;
    if (bi.oW((String)localObject1))
    {
      localObject2 = localObject1;
      if (Build.VERSION.SDK_INT < 22) {}
    }
    try
    {
      localObject2 = new c(this, "mReferrer", null).get();
      if (localObject2 == null) {
        break label157;
      }
      localObject2 = (String)localObject2;
      localObject1 = localObject2;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Uri localUri;
        x.printErrStackTrace("MicroMsg.MMActivity", localException, "get mReferrer error", new Object[0]);
        Object localObject3 = localObject1;
      }
    }
    localObject2 = localObject1;
    localObject1 = localObject2;
    if (bi.oW((String)localObject2))
    {
      localObject1 = localObject2;
      if (Build.VERSION.SDK_INT >= 22)
      {
        localUri = getReferrer();
        localObject1 = localObject2;
        if (localUri != null)
        {
          localObject1 = localUri.getAuthority();
          x.i("MicroMsg.MMActivity", "get referrer, %s", new Object[] { localObject1 });
        }
      }
    }
    return (String)localObject1;
  }
  
  public final long cql()
  {
    if (this.tlT != 0L) {}
    for (long l = this.tlT - this.tlS + this.tlU;; l = bi.VG() - this.tlS + this.tlU)
    {
      if (l < 0L) {
        x.w("MicroMsg.MMActivity", "%d get activity browse time is error, may be something warn here.[%d %d %d %d]", new Object[] { Integer.valueOf(hashCode()), Long.valueOf(l), Long.valueOf(this.tlS), Long.valueOf(this.tlT), Long.valueOf(this.tlU) });
      }
      x.v("MicroMsg.MMActivity", "%d get activity browse time [%d]", new Object[] { Integer.valueOf(hashCode()), Long.valueOf(l) });
      return l;
    }
  }
  
  public void dealContentView(View paramView)
  {
    setContentView(paramView);
  }
  
  public final void enableBackMenu(boolean paramBoolean)
  {
    this.mController.enableBackMenu(paramBoolean);
  }
  
  public final void enableOptionMenu(int paramInt, boolean paramBoolean)
  {
    this.mController.c(false, paramInt, paramBoolean);
  }
  
  public final void enableOptionMenu(boolean paramBoolean)
  {
    this.mController.c(true, -1, paramBoolean);
  }
  
  public void finish()
  {
    super.finish();
    int i = com.tencent.mm.sdk.platformtools.s.a(getIntent(), "MMActivity.OverrideEnterAnimation", -1);
    int j = com.tencent.mm.sdk.platformtools.s.a(getIntent(), "MMActivity.OverrideExitAnimation", -1);
    if (i != -1) {
      super.overridePendingTransition(i, j);
    }
  }
  
  public final void fullScreenNoTitleBar(boolean paramBoolean)
  {
    this.mController.fullScreenNoTitleBar(paramBoolean);
  }
  
  public int getForceOrientation()
  {
    return -1;
  }
  
  public abstract int getLayoutId();
  
  public void hideVKB(View paramView)
  {
    this.mController.hideVKB(paramView);
  }
  
  public void initSwipeBack()
  {
    super.initSwipeBack();
    View localView;
    if ((getSwipeBackLayout() != null) && (getSwipeBackLayout().getChildCount() > 0))
    {
      localView = getSwipeBackLayout().getChildAt(0);
      getSwipeBackLayout().removeView(localView);
      if (!this.tlN) {
        break label97;
      }
    }
    label97:
    for (this.tlO = new b(this);; this.tlO = new FrameLayout(this))
    {
      this.tlO.addView(localView, new FrameLayout.LayoutParams(-1, -1));
      getSwipeBackLayout().addView(this.tlO);
      getSwipeBackLayout().setContentView(this.tlO);
      return;
    }
  }
  
  @Deprecated
  public void initView() {}
  
  public final void lC(boolean paramBoolean)
  {
    s locals = this.mController;
    locals.mQO = paramBoolean;
    locals.cqt();
    locals.cqs();
  }
  
  public final void lD(boolean paramBoolean)
  {
    s locals = this.mController;
    if (locals.tmt != null)
    {
      if (paramBoolean) {
        locals.tmt.setVisibility(0);
      }
    }
    else {
      return;
    }
    locals.tmt.setVisibility(8);
  }
  
  public void lF(int paramInt)
  {
    this.mController.lF(paramInt);
    if ((this.tlN) && (Build.VERSION.SDK_INT >= 21) && (getWindow() != null)) {
      com.tencent.mm.ui.statusbar.a.c(this.mController.contentView, getWindow().getStatusBarColor(), d.c(getWindow()));
    }
  }
  
  public void nS(int paramInt)
  {
    s locals = this.mController;
    if (locals.mActionBar != null) {
      locals.tmq.setTextColor(paramInt);
    }
  }
  
  public boolean needShowIdcError()
  {
    return true;
  }
  
  public boolean noActionBar()
  {
    return false;
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (this.geJ != null) {
      this.geJ.b(paramInt1, paramInt2, paramIntent);
    }
    this.geJ = null;
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.mController.a(getApplicationContext(), this);
    x.i("MicroMsg.MMActivity", "checktask onCreate:%s#0x%x, taskid:%d, task:%s", new Object[] { getClass().getSimpleName(), Integer.valueOf(hashCode()), Integer.valueOf(getTaskId()), bi.fV(this) });
    initNavigationSwipeBack();
  }
  
  public void onCreateBeforeSetContentView() {}
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    if (this.mController.onCreateOptionsMenu(paramMenu)) {
      return true;
    }
    return super.onCreateOptionsMenu(paramMenu);
  }
  
  public void onDestroy()
  {
    x.i("MicroMsg.MMActivity", "checktask onDestroy:%s#0x%x task:%s ", new Object[] { getClass().getSimpleName(), Integer.valueOf(hashCode()), bi.fV(this) });
    super.onDestroy();
    this.mController.onDestroy();
    this.tlP = true;
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (this.mController.onKeyDown(paramInt, paramKeyEvent)) {
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  @TargetApi(17)
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if (this.mController.onKeyUp(paramInt, paramKeyEvent)) {
      return true;
    }
    try
    {
      boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
      return bool;
    }
    catch (Exception paramKeyEvent)
    {
      x.printErrStackTrace("MicroMsg.MMActivity", paramKeyEvent, "java.lang.IllegalStateException: Can not perform this action after onSaveInstanceState", new Object[0]);
    }
    return true;
  }
  
  public void onKeyboardStateChanged() {}
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    return this.mController.onOptionsItemSelected(paramMenuItem);
  }
  
  public void onPause()
  {
    long l = System.currentTimeMillis();
    ai.ba(2, this.className);
    super.onPause();
    this.mController.onPause();
    boolean bool = isFinishing();
    x.v("MicroMsg.INIT", "KEVIN MMActivity onPause: %d ms, isFinishing %B, hash:#0x%x", new Object[] { Long.valueOf(System.currentTimeMillis() - l), Boolean.valueOf(bool), Integer.valueOf(hashCode()) });
    this.tlT = bi.VG();
  }
  
  public boolean onPrepareOptionsMenu(Menu paramMenu)
  {
    this.mController.onPrepareOptionsMenu(paramMenu);
    return super.onPrepareOptionsMenu(paramMenu);
  }
  
  public void onResume()
  {
    long l = System.currentTimeMillis();
    ai.ba(1, this.className);
    super.onResume();
    x.v("MicroMsg.INIT", "KEVIN MMActivity super.onResume " + (System.currentTimeMillis() - l));
    this.mController.onResume();
    x.v("MicroMsg.INIT", "KEVIN MMActivity onResume :%dms, hash:#0x%x", new Object[] { Long.valueOf(System.currentTimeMillis() - l), Integer.valueOf(hashCode()) });
    if (this.tlT > this.tlS) {
      this.tlU += this.tlT - this.tlS;
    }
    this.tlS = bi.VG();
    this.tlT = 0L;
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    if (Build.VERSION.SDK_INT < 11) {
      super.onSaveInstanceState(paramBundle);
    }
  }
  
  public void onStart()
  {
    ahy();
    super.onStart();
  }
  
  public void onSwipeBack()
  {
    if (!Xf()) {
      this.mController.callBackMenu();
    }
    super.onSwipeBack();
  }
  
  public final boolean removeOptionMenu(int paramInt)
  {
    return this.mController.removeOptionMenu(paramInt);
  }
  
  public void setBackBtn(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.mController.setBackBtn(paramOnMenuItemClickListener, 0);
  }
  
  public void setBackBtn(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener, int paramInt)
  {
    this.mController.setBackBtn(paramOnMenuItemClickListener, paramInt);
  }
  
  public final void setBackGroundColorResource(int paramInt)
  {
    this.mController.setBackGroundColorResource(paramInt);
  }
  
  public final void setMMSubTitle(int paramInt)
  {
    this.mController.setMMSubTitle(paramInt);
  }
  
  public void setMMSubTitle(String paramString)
  {
    this.mController.setMMSubTitle(paramString);
  }
  
  public void setMMTitle(int paramInt)
  {
    this.mController.setMMTitle(paramInt);
  }
  
  public void setMMTitle(String paramString)
  {
    this.mController.setMMTitle(paramString);
  }
  
  public final void setScreenEnable(boolean paramBoolean)
  {
    this.mController.setScreenEnable(paramBoolean);
  }
  
  public final void setTitleBarDoubleClickListener(Runnable paramRunnable)
  {
    this.mController.setTitleBarDoubleClickListener(paramRunnable);
  }
  
  public final void setTitleMuteIconVisibility(int paramInt)
  {
    this.mController.setTitleMuteIconVisibility(paramInt);
  }
  
  public final void setTitleVisibility(int paramInt)
  {
    this.mController.setTitleVisibility(paramInt);
  }
  
  public final void showHomeBtn(boolean paramBoolean)
  {
    this.mController.showHomeBtn(paramBoolean);
  }
  
  public final void showOptionMenu(int paramInt, boolean paramBoolean)
  {
    this.mController.d(false, paramInt, paramBoolean);
  }
  
  public final void showOptionMenu(boolean paramBoolean)
  {
    this.mController.d(true, -1, paramBoolean);
  }
  
  public void showVKB()
  {
    this.mController.showVKB();
  }
  
  public final void updateOptionMenuText(int paramInt, String paramString)
  {
    this.mController.updateOptionMenuText(paramInt, paramString);
  }
  
  public void ux(int paramInt)
  {
    this.mController.contentView.setVisibility(paramInt);
    if (paramInt == 0)
    {
      this.mController.showTitleView();
      return;
    }
    this.mController.hideTitleView();
  }
  
  public static abstract interface a
  {
    public abstract void b(int paramInt1, int paramInt2, Intent paramIntent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ui/MMActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */