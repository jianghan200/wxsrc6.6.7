package com.tencent.mm.ui;

import android.annotation.TargetApi;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentFilter.MalformedMimeTypeException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.nfc.NfcAdapter;
import android.nfc.tech.IsoDep;
import android.nfc.tech.NfcA;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.m;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.animation.AnimationUtils;
import com.tencent.mm.compatible.e.u;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.tools.i;
import com.tencent.mm.ui.widget.SwipeBackLayout;
import com.tencent.mm.ui.widget.SwipeBackLayout.a;
import com.tencent.mm.ui.widget.g;
import com.tencent.mm.ui.widget.g.a;
import com.tencent.mm.vending.e.c;
import com.tencent.mm.w.a.a;
import com.tencent.mm.w.a.d;
import com.tencent.mm.w.a.g;
import com.tencent.mm.w.a.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class MMFragmentActivity
  extends ActionBarActivity
  implements SwipeBackLayout.a, g.a, com.tencent.mm.vending.e.b
{
  public static final long DURATION = 220L;
  private static final String TAG = "MicroMsg.MMFragmentActivity";
  String className;
  private a mActivityAnimStyle = new a();
  private View mContentViewForSwipeBack = null;
  private boolean mIsPaused;
  private com.tencent.mm.vending.a.a mLifeCycleKeeper = new com.tencent.mm.vending.a.a();
  private b mNfcFilterHelper;
  private SwipeBackLayout mSwipeBackLayout;
  private boolean mSwiping;
  ArrayList<WeakReference<x>> record = new ArrayList();
  
  public boolean convertActivityFromTranslucent()
  {
    return true;
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    if ((isSupportNavigationSwipeBack()) && (paramKeyEvent.getKeyCode() == 4) && (getSwipeBackLayout().ceH()))
    {
      com.tencent.mm.sdk.platformtools.x.w("ashutest", "ashutest::IS SwipeBack ING, ignore KeyBack Event");
      return true;
    }
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  public final boolean enableActivityAnimation()
  {
    return true;
  }
  
  public void finish()
  {
    super.finish();
    initActivityCloseAnimation();
  }
  
  public boolean forceRemoveNoMatchOnPath()
  {
    return false;
  }
  
  public x getCurrentFragmet()
  {
    int i = this.record.size();
    Object localObject;
    if (i == 0) {
      localObject = null;
    }
    x localx;
    do
    {
      return (x)localObject;
      localx = (x)((WeakReference)this.record.get(i - 1)).get();
      if (localx == null) {
        break;
      }
      localObject = localx;
    } while (localx.isShowing());
    return null;
  }
  
  public Resources getResources()
  {
    if ((getAssets() != null) && (ad.getResources() != null)) {
      return ad.getResources();
    }
    return super.getResources();
  }
  
  public SwipeBackLayout getSwipeBackLayout()
  {
    return this.mSwipeBackLayout;
  }
  
  public Object getSystemService(String paramString)
  {
    Object localObject2 = super.getSystemService(paramString);
    Object localObject1 = localObject2;
    if ("layout_inflater".equals(paramString)) {
      localObject1 = y.b((LayoutInflater)localObject2);
    }
    return localObject1;
  }
  
  public void initActivityCloseAnimation()
  {
    int j = 1;
    if (enableActivityAnimation()) {
      if ((com.tencent.mm.ui.base.b.M(getClass()) & 0x2) != 0) {
        break label38;
      }
    }
    label38:
    for (int i = 1; i != 0; i = 0)
    {
      super.overridePendingTransition(a.tnI, a.tnJ);
      return;
    }
    if ((com.tencent.mm.ui.base.b.M(getClass()) & 0x4) != 0) {}
    for (i = j; i == 0; i = 0)
    {
      com.tencent.mm.ui.base.b.gF(this);
      return;
    }
    com.tencent.mm.ui.base.b.gG(this);
  }
  
  public void initActivityOpenAnimation(Intent paramIntent)
  {
    if (enableActivityAnimation())
    {
      if (paramIntent != null) {
        break label62;
      }
      paramIntent = null;
      if (paramIntent != null)
      {
        if (!paramIntent.getClassName().startsWith(paramIntent.getPackageName())) {
          break label70;
        }
        paramIntent = paramIntent.getClassName();
        label36:
        if ((com.tencent.mm.ui.base.b.ZX(paramIntent) & 0x2) != 0) {
          break label98;
        }
      }
    }
    label62:
    label70:
    label98:
    for (int i = 1;; i = 0)
    {
      if (i == 0) {
        break label103;
      }
      super.overridePendingTransition(a.tnG, a.tnH);
      return;
      paramIntent = paramIntent.getComponent();
      break;
      paramIntent = paramIntent.getPackageName() + paramIntent.getClassName();
      break label36;
    }
    label103:
    if ((com.tencent.mm.ui.base.b.ZX(paramIntent) & 0x4) != 0) {}
    for (i = 1; i == 0; i = 0)
    {
      com.tencent.mm.ui.base.b.gD(this);
      return;
    }
    com.tencent.mm.ui.base.b.gG(this);
  }
  
  public boolean initNavigationSwipeBack()
  {
    if (com.tencent.mm.compatible.util.d.fR(19))
    {
      if ((!com.tencent.mm.ui.base.b.N(getClass())) || (!convertActivityFromTranslucent())) {
        break label49;
      }
      ah.A(new Runnable()
      {
        public final void run()
        {
          com.tencent.mm.ui.base.b.Y(MMFragmentActivity.this);
        }
      });
    }
    label49:
    label85:
    while (isSupportNavigationSwipeBack())
    {
      initSwipeBack();
      return true;
      if ((com.tencent.mm.ui.base.b.M(getClass()) & 0x10) != 0) {}
      for (int i = 1;; i = 0)
      {
        if (i == 0) {
          break label85;
        }
        ah.A(new Runnable()
        {
          public final void run()
          {
            com.tencent.mm.ui.base.b.Y(MMFragmentActivity.this);
          }
        });
        break;
      }
    }
    return false;
  }
  
  public void initSwipeBack()
  {
    ViewGroup localViewGroup1 = (ViewGroup)getWindow().getDecorView();
    this.mSwipeBackLayout = ((SwipeBackLayout)LayoutInflater.from(this).inflate(a.h.swipeback_layout, localViewGroup1, false));
    this.mSwipeBackLayout.init();
    getWindow().setBackgroundDrawable(new ColorDrawable(0));
    getWindow().getDecorView().setBackgroundDrawable(null);
    ViewGroup localViewGroup2 = (ViewGroup)localViewGroup1.getChildAt(0);
    localViewGroup2.setBackgroundResource(a.d.transparent);
    localViewGroup1.removeView(localViewGroup2);
    this.mSwipeBackLayout.addView(localViewGroup2);
    this.mSwipeBackLayout.setContentView(localViewGroup2);
    localViewGroup1.addView(this.mSwipeBackLayout);
    this.mSwipeBackLayout.setSwipeGestureDelegate(this);
  }
  
  public final boolean isSupportNavigationSwipeBack()
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (com.tencent.mm.compatible.util.d.fR(19))
    {
      bool1 = bool2;
      if (com.tencent.mm.compatible.i.a.zX())
      {
        bool1 = bool2;
        if (supportNavigationSwipeBack())
        {
          bool1 = bool2;
          if (com.tencent.mm.ui.base.b.N(getClass())) {
            bool1 = true;
          }
        }
      }
    }
    return bool1;
  }
  
  public boolean isSwiping()
  {
    return this.mSwiping;
  }
  
  public void keep(com.tencent.mm.vending.e.a parama)
  {
    this.mLifeCycleKeeper.uPA.keep(parama);
  }
  
  public void onCancel()
  {
    this.mSwiping = false;
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    if (getSupportActionBar() != null)
    {
      paramConfiguration = (ViewGroup)findViewById(a.g.decor_content_parent);
      if (paramConfiguration != null)
      {
        paramConfiguration = paramConfiguration.findViewById(a.g.action_bar);
        if ((paramConfiguration != null) && ((paramConfiguration instanceof Toolbar)))
        {
          paramConfiguration = (Toolbar)paramConfiguration;
          ViewGroup.LayoutParams localLayoutParams = paramConfiguration.getLayoutParams();
          if (localLayoutParams != null) {
            localLayoutParams.height = com.tencent.mm.compatible.util.a.i(this);
          }
          paramConfiguration.setLayoutParams(localLayoutParams);
        }
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    this.className = getClass().getName();
    ai.ba(3, this.className);
    super.onCreate(paramBundle);
    this.mNfcFilterHelper = new b((byte)0);
    paramBundle = this.mNfcFilterHelper;
    paramBundle.tnK = NfcAdapter.getDefaultAdapter(paramBundle.tnB);
    paramBundle.init();
  }
  
  public void onDestroy()
  {
    this.mLifeCycleKeeper.uPA.dead();
    super.onDestroy();
  }
  
  public void onDrag()
  {
    this.mSwiping = true;
  }
  
  public void onPause()
  {
    ai.ba(2, this.className);
    this.mIsPaused = true;
    super.onPause();
    if (isSupportNavigationSwipeBack())
    {
      if (getSwipeBackLayout() != null) {
        getSwipeBackLayout().setEnableGesture(false);
      }
      if (!isFinishing()) {
        g.a(this);
      }
    }
    b localb;
    if (this.mNfcFilterHelper != null)
    {
      localb = this.mNfcFilterHelper;
      if (localb.tnK == null) {}
    }
    try
    {
      localb.tnK.disableForegroundDispatch(localb.tnB);
      this.mLifeCycleKeeper.uPB.dead();
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MMFragmentActivity", "lo-nfc-onPause: exp:" + localIllegalStateException.getLocalizedMessage());
      }
    }
  }
  
  public void onResume()
  {
    ai.ba(1, this.className);
    this.mIsPaused = false;
    super.onResume();
    if (isSupportNavigationSwipeBack())
    {
      g.b(this);
      onSwipe(1.0F);
      if (getSwipeBackLayout() != null)
      {
        getSwipeBackLayout().setEnableGesture(true);
        getSwipeBackLayout().uIg = false;
      }
    }
    b localb;
    if (this.mNfcFilterHelper != null)
    {
      localb = this.mNfcFilterHelper;
      if (localb.tnK != null) {
        if ((localb.aJD == null) || (localb.tnL == null) || (localb.tnM == null)) {
          localb.init();
        }
      }
    }
    try
    {
      localb.tnK.enableForegroundDispatch(localb.tnB, localb.aJD, localb.tnL, localb.tnM);
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MMFragmentActivity", "lo-nfc-onResume: exp:" + localIllegalStateException.getLocalizedMessage());
    }
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    if (Build.VERSION.SDK_INT < 11) {
      super.onSaveInstanceState(paramBundle);
    }
  }
  
  public void onSettle(boolean paramBoolean, int paramInt)
  {
    long l = 110L;
    com.tencent.mm.sdk.platformtools.x.v("ashutest", "ashutest:: on settle %B, speed %d", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt) });
    if (this.mContentViewForSwipeBack == null) {
      this.mContentViewForSwipeBack = ak.a(getWindow(), getSupportActionBar().getCustomView());
    }
    View localView = this.mContentViewForSwipeBack;
    if (paramBoolean)
    {
      if (paramInt > 0) {}
      for (;;)
      {
        i.a(localView, l, 0.0F, null);
        return;
        l = 220L;
      }
    }
    if (paramInt > 0) {}
    for (;;)
    {
      i.a(localView, l, localView.getWidth() * -1 / 2.5F, null);
      return;
      l = 220L;
    }
  }
  
  public void onStart()
  {
    super.onStart();
  }
  
  public void onStop()
  {
    this.mLifeCycleKeeper.uPC.dead();
    super.onStop();
  }
  
  public void onSwipe(float paramFloat)
  {
    com.tencent.mm.sdk.platformtools.x.v("ashutest", "ashutest::on swipe %f, duration %d", new Object[] { Float.valueOf(paramFloat), Long.valueOf(220L) });
    Window localWindow;
    if (this.mContentViewForSwipeBack == null)
    {
      localWindow = getWindow();
      if (getSupportActionBar() == null) {
        break label83;
      }
    }
    label83:
    for (View localView = getSupportActionBar().getCustomView();; localView = null)
    {
      this.mContentViewForSwipeBack = ak.a(localWindow, localView);
      localView = this.mContentViewForSwipeBack;
      if (Float.compare(1.0F, paramFloat) > 0) {
        break;
      }
      i.n(localView, 0.0F);
      return;
    }
    i.n(localView, localView.getWidth() / 2.5F * (1.0F - paramFloat) * -1.0F);
  }
  
  public void onSwipeBack()
  {
    if (!isFinishing()) {
      finish();
    }
    getWindow().getDecorView().setVisibility(8);
    overridePendingTransition(0, 0);
    this.mSwiping = false;
  }
  
  public boolean popBackStackImmediate()
  {
    if (this.record.size() == 0) {
      return false;
    }
    this.record.remove(this.record.size() - 1);
    return getSupportFragmentManager().popBackStackImmediate();
  }
  
  public void putActivityCloseAnimation(int paramInt1, int paramInt2)
  {
    if (enableActivityAnimation())
    {
      a.tnI = paramInt1;
      a.tnJ = paramInt2;
    }
    super.overridePendingTransition(paramInt1, paramInt2);
  }
  
  public void putActivityOpenAnimation(int paramInt1, int paramInt2)
  {
    if (enableActivityAnimation())
    {
      a.tnG = paramInt1;
      a.tnH = paramInt2;
    }
    super.overridePendingTransition(paramInt1, paramInt2);
  }
  
  @TargetApi(11)
  public void startActivities(Intent[] paramArrayOfIntent)
  {
    super.startActivities(paramArrayOfIntent);
    initActivityOpenAnimation(null);
  }
  
  @TargetApi(16)
  public void startActivities(Intent[] paramArrayOfIntent, Bundle paramBundle)
  {
    if (d.a(this, this.mIsPaused, paramArrayOfIntent, new Object[] { paramBundle })) {
      return;
    }
    super.startActivities(paramArrayOfIntent, paramBundle);
    initActivityOpenAnimation(null);
  }
  
  public void startActivity(Intent paramIntent)
  {
    super.startActivity(paramIntent);
    initActivityOpenAnimation(paramIntent);
  }
  
  @TargetApi(16)
  public void startActivity(Intent paramIntent, Bundle paramBundle)
  {
    super.startActivity(paramIntent, paramBundle);
    initActivityOpenAnimation(paramIntent);
  }
  
  public void startActivityForResult(Intent paramIntent, int paramInt)
  {
    super.startActivityForResult(paramIntent, paramInt);
    initActivityOpenAnimation(paramIntent);
  }
  
  @TargetApi(16)
  public void startActivityForResult(Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    if (d.a(this, this.mIsPaused, new Intent[] { paramIntent }, new Object[] { Integer.valueOf(paramInt), paramBundle })) {
      return;
    }
    super.startActivityForResult(paramIntent, paramInt, paramBundle);
    initActivityOpenAnimation(paramIntent);
  }
  
  public void startActivityFromFragment(Fragment paramFragment, Intent paramIntent, int paramInt)
  {
    super.startActivityFromFragment(paramFragment, paramIntent, paramInt);
    initActivityOpenAnimation(paramIntent);
  }
  
  public void startActivityFromFragment(Fragment paramFragment, Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    if (d.a(this, this.mIsPaused, new Intent[] { paramIntent }, new Object[] { paramFragment, Integer.valueOf(paramInt) })) {
      return;
    }
    super.startActivityFromFragment(paramFragment, paramIntent, paramInt, paramBundle);
  }
  
  public void supportInvalidateOptionsMenu()
  {
    if ((getCurrentFragmet() != null) && (getCurrentFragmet().interceptSupportInvalidateOptionsMenu())) {
      return;
    }
    super.supportInvalidateOptionsMenu();
  }
  
  public boolean supportNavigationSwipeBack()
  {
    return true;
  }
  
  public void switchFragment(Fragment paramFragment, int paramInt1, boolean paramBoolean1, boolean paramBoolean2, int paramInt2, int paramInt3)
  {
    if ((paramFragment == null) || (paramInt1 == 0)) {
      return;
    }
    m localm = getSupportFragmentManager();
    android.support.v4.app.q localq = localm.bk();
    if (paramBoolean2) {
      localq.l(paramInt2, paramInt3);
    }
    if (localm.R(paramInt1) != null) {
      if (paramFragment.isHidden()) {
        localq.b(paramFragment);
      }
    }
    for (;;)
    {
      if (paramBoolean1) {
        localq.G(null);
      }
      localq.commit();
      localm.executePendingTransactions();
      return;
      localq.a(paramInt1, paramFragment, paramFragment.getTag());
    }
  }
  
  public void switchFragmentActivity(Fragment paramFragment)
  {
    if (paramFragment == null) {
      return;
    }
    switchFragmentActivity(paramFragment, paramFragment.getId());
  }
  
  public void switchFragmentActivity(Fragment paramFragment, int paramInt)
  {
    switchFragment(paramFragment, paramInt, true, true, a.a.pop_in, a.a.pop_out);
    this.record.add(new WeakReference((x)paramFragment));
  }
  
  public void switchFragmentInternalBackwardWithAnim(Fragment paramFragment)
  {
    switchFragmentInternalBackwardWithAnim(paramFragment, paramFragment.getId());
  }
  
  public void switchFragmentInternalBackwardWithAnim(Fragment paramFragment, int paramInt)
  {
    switchFragment(paramFragment, paramInt, false, true, a.a.slide_left_in, a.a.slide_right_out);
  }
  
  public void switchFragmentInternalBackwardWithAnimLeftSelfView(Fragment paramFragment, int paramInt, View paramView)
  {
    switchFragment(paramFragment, paramInt, false, true, 0, a.a.slide_right_out);
    if (paramView == null) {
      return;
    }
    paramFragment = AnimationUtils.loadAnimation(this, a.a.slide_left_in);
    if (paramFragment != null) {
      paramView.startAnimation(paramFragment);
    }
    paramView.setVisibility(0);
  }
  
  public void switchFragmentInternalBackwardWithAnimLeftSelfView(Fragment paramFragment, View paramView)
  {
    if (paramFragment == null) {
      return;
    }
    switchFragmentInternalBackwardWithAnimLeftSelfView(paramFragment, paramFragment.getId(), paramView);
  }
  
  public void switchFragmentInternalFarwardWithAnim(Fragment paramFragment)
  {
    if (paramFragment == null) {
      return;
    }
    switchFragmentInternalFarwardWithAnim(paramFragment, paramFragment.getId());
  }
  
  public void switchFragmentInternalFarwardWithAnim(Fragment paramFragment, int paramInt)
  {
    switchFragment(paramFragment, paramInt, false, true, a.a.slide_right_in, a.a.slide_left_out);
  }
  
  public void switchFragmentInternalWithoutAnim(Fragment paramFragment)
  {
    if (paramFragment == null) {
      return;
    }
    switchFragmentInternalWithoutAnim(paramFragment, paramFragment.getId());
  }
  
  public void switchFragmentInternalWithoutAnim(Fragment paramFragment, int paramInt)
  {
    switchFragment(paramFragment, paramInt, false, false, 0, 0);
  }
  
  protected com.tencent.mm.vending.e.b theCreate()
  {
    return this.mLifeCycleKeeper.uPA;
  }
  
  protected com.tencent.mm.vending.e.b theResume()
  {
    return this.mLifeCycleKeeper.uPB;
  }
  
  protected com.tencent.mm.vending.e.b theStart()
  {
    return this.mLifeCycleKeeper.uPB;
  }
  
  public static final class a
  {
    public static int tnC;
    public static int tnD;
    public static int tnE;
    public static int tnF;
    public static int tnG;
    public static int tnH;
    public static int tnI;
    public static int tnJ;
    
    static
    {
      boolean bool2 = com.tencent.mm.compatible.util.d.fR(19);
      boolean bool1 = com.tencent.mm.compatible.i.a.zX() & bool2;
      if (bool1)
      {
        i = a.a.slide_right_in;
        tnC = i;
        if (!bool1) {
          break label92;
        }
        i = a.a.slide_left_out;
        label32:
        tnD = i;
        if (!bool1) {
          break label99;
        }
        i = a.a.slide_left_in;
        label44:
        tnE = i;
        if (!bool1) {
          break label106;
        }
      }
      label92:
      label99:
      label106:
      for (int i = a.a.slide_right_out;; i = a.a.pop_out)
      {
        tnF = i;
        tnG = tnC;
        tnH = tnD;
        tnI = tnE;
        tnJ = tnF;
        return;
        i = a.a.pop_in;
        break;
        i = a.a.anim_not_change;
        break label32;
        i = a.a.anim_not_change;
        break label44;
      }
    }
    
    public static void cqv()
    {
      u localu = com.tencent.mm.compatible.e.q.deR;
      boolean bool = u.zP();
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MMFragmentActivity", "lm: setAnimationStyle swipbackType = " + bool);
      if (!bool) {
        return;
      }
      bool = com.tencent.mm.compatible.util.d.fR(19);
      bool = com.tencent.mm.compatible.i.a.zX() & bool;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MMFragmentActivity", "lm: setAnimationStyle supportSwipe = " + bool);
      if (bool)
      {
        i = a.a.slide_right_in;
        tnC = i;
        if (!bool) {
          break label147;
        }
        i = a.a.slide_left_out;
        label87:
        tnD = i;
        if (!bool) {
          break label154;
        }
        i = a.a.slide_left_in;
        label99:
        tnE = i;
        if (!bool) {
          break label161;
        }
      }
      label147:
      label154:
      label161:
      for (int i = a.a.slide_right_out;; i = a.a.pop_out)
      {
        tnF = i;
        tnG = tnC;
        tnH = tnD;
        tnI = tnE;
        tnJ = tnF;
        return;
        i = a.a.pop_in;
        break;
        i = a.a.anim_not_change;
        break label87;
        i = a.a.anim_not_change;
        break label99;
      }
    }
  }
  
  private final class b
  {
    PendingIntent aJD;
    NfcAdapter tnK;
    IntentFilter[] tnL;
    String[][] tnM;
    
    private b() {}
    
    final void init()
    {
      Object localObject = new Intent();
      ((Intent)localObject).setClassName(ad.getPackageName(), "com.tencent.mm.plugin.nfc_open.ui.NfcWebViewUI");
      ((Intent)localObject).addFlags(536870912);
      this.aJD = PendingIntent.getActivity(MMFragmentActivity.this, 0, (Intent)localObject, 0);
      localObject = new IntentFilter("android.nfc.action.NDEF_DISCOVERED");
      try
      {
        ((IntentFilter)localObject).addDataType("*/*");
        IntentFilter localIntentFilter = new IntentFilter("android.nfc.action.TECH_DISCOVERED");
        localIntentFilter.addDataScheme("vnd.android.nfc");
        this.tnL = new IntentFilter[] { localObject, localIntentFilter, new IntentFilter("android.nfc.action.TAG_DISCOVERED") };
        this.tnM = new String[][] { { NfcA.class.getName(), IsoDep.class.getName() } };
        return;
      }
      catch (IntentFilter.MalformedMimeTypeException localMalformedMimeTypeException)
      {
        throw new RuntimeException("fail", localMalformedMimeTypeException);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ui/MMFragmentActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */