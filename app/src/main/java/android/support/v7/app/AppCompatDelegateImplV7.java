package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.app.v;
import android.support.v4.os.c;
import android.support.v4.view.ae;
import android.support.v4.view.ai;
import android.support.v4.view.an;
import android.support.v4.view.ap;
import android.support.v4.view.z;
import android.support.v4.widget.m;
import android.support.v7.a.a.a;
import android.support.v7.a.a.f;
import android.support.v7.a.a.h;
import android.support.v7.a.a.j;
import android.support.v7.a.a.k;
import android.support.v7.view.b.a;
import android.support.v7.view.menu.f.a;
import android.support.v7.view.menu.l.a;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.AppCompatAutoCompleteTextView;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatCheckBox;
import android.support.v7.widget.AppCompatCheckedTextView;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.AppCompatImageButton;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatMultiAutoCompleteTextView;
import android.support.v7.widget.AppCompatRadioButton;
import android.support.v7.widget.AppCompatRatingBar;
import android.support.v7.widget.AppCompatSeekBar;
import android.support.v7.widget.AppCompatSpinner;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.ContentFrameLayout.a;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.ViewStubCompat;
import android.support.v7.widget.am;
import android.support.v7.widget.ar;
import android.support.v7.widget.at;
import android.support.v7.widget.x;
import android.support.v7.widget.x.a;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.view.Window.Callback;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;

class AppCompatDelegateImplV7
  extends f
  implements android.support.v4.view.k, f.a
{
  private TextView Dm;
  ActionBarContextView EA;
  PopupWindow EB;
  Runnable EC;
  ai ED = null;
  private boolean EE;
  private ViewGroup EF;
  private View EG;
  private boolean EH;
  private boolean EI;
  private boolean EJ;
  private PanelFeatureState[] EK;
  private PanelFeatureState EL;
  private boolean EM;
  private boolean EN;
  private int EO;
  private final Runnable EP = new Runnable()
  {
    public final void run()
    {
      if ((AppCompatDelegateImplV7.a(AppCompatDelegateImplV7.this) & 0x1) != 0) {
        AppCompatDelegateImplV7.a(AppCompatDelegateImplV7.this, 0);
      }
      if ((AppCompatDelegateImplV7.a(AppCompatDelegateImplV7.this) & 0x1000) != 0) {
        AppCompatDelegateImplV7.a(AppCompatDelegateImplV7.this, 108);
      }
      AppCompatDelegateImplV7.b(AppCompatDelegateImplV7.this);
      AppCompatDelegateImplV7.c(AppCompatDelegateImplV7.this);
    }
  };
  private boolean EQ;
  private k ER;
  private android.support.v7.widget.t Ew;
  private a Ex;
  private d Ey;
  android.support.v7.view.b Ez;
  private Rect ex;
  private Rect ey;
  
  AppCompatDelegateImplV7(Context paramContext, Window paramWindow, d paramd)
  {
    super(paramContext, paramWindow, paramd);
  }
  
  private PanelFeatureState a(Menu paramMenu)
  {
    PanelFeatureState[] arrayOfPanelFeatureState = this.EK;
    int i;
    int j;
    if (arrayOfPanelFeatureState != null)
    {
      i = arrayOfPanelFeatureState.length;
      j = 0;
    }
    for (;;)
    {
      if (j >= i) {
        break label57;
      }
      PanelFeatureState localPanelFeatureState = arrayOfPanelFeatureState[j];
      if ((localPanelFeatureState != null) && (localPanelFeatureState.Fa == paramMenu))
      {
        return localPanelFeatureState;
        i = 0;
        break;
      }
      j += 1;
    }
    label57:
    return null;
  }
  
  private void a(int paramInt, PanelFeatureState paramPanelFeatureState, Menu paramMenu)
  {
    Object localObject1 = paramPanelFeatureState;
    Object localObject2 = paramMenu;
    if (paramMenu == null)
    {
      PanelFeatureState localPanelFeatureState = paramPanelFeatureState;
      if (paramPanelFeatureState == null)
      {
        localPanelFeatureState = paramPanelFeatureState;
        if (paramInt >= 0)
        {
          localPanelFeatureState = paramPanelFeatureState;
          if (paramInt < this.EK.length) {
            localPanelFeatureState = this.EK[paramInt];
          }
        }
      }
      localObject1 = localPanelFeatureState;
      localObject2 = paramMenu;
      if (localPanelFeatureState != null)
      {
        localObject2 = localPanelFeatureState.Fa;
        localObject1 = localPanelFeatureState;
      }
    }
    if ((localObject1 != null) && (!((PanelFeatureState)localObject1).BA)) {}
    while (this.En) {
      return;
    }
    this.Ef.onPanelClosed(paramInt, (Menu)localObject2);
  }
  
  private void a(PanelFeatureState paramPanelFeatureState, KeyEvent paramKeyEvent)
  {
    int k = -1;
    if ((paramPanelFeatureState.BA) || (this.En)) {}
    Object localObject1;
    int i;
    label115:
    label120:
    label124:
    label126:
    Object localObject2;
    label266:
    do
    {
      do
      {
        for (;;)
        {
          return;
          if (paramPanelFeatureState.EW == 0)
          {
            localObject1 = this.mContext;
            if ((((Context)localObject1).getResources().getConfiguration().screenLayout & 0xF) != 4) {
              break label115;
            }
            i = 1;
            if (((Context)localObject1).getApplicationInfo().targetSdkVersion < 11) {
              break label120;
            }
          }
          for (int j = 1;; j = 0)
          {
            if ((i != 0) && (j != 0)) {
              break label124;
            }
            localObject1 = this.CS.getCallback();
            if ((localObject1 == null) || (((Window.Callback)localObject1).onMenuOpened(paramPanelFeatureState.EW, paramPanelFeatureState.Fa))) {
              break label126;
            }
            a(paramPanelFeatureState, true);
            return;
            i = 0;
            break;
          }
        }
        localObject1 = (WindowManager)this.mContext.getSystemService("window");
      } while ((localObject1 == null) || (!b(paramPanelFeatureState, paramKeyEvent)));
      if ((paramPanelFeatureState.EX != null) && (!paramPanelFeatureState.Fg)) {
        break label758;
      }
      if (paramPanelFeatureState.EX != null) {
        break label581;
      }
      localObject2 = di();
      TypedValue localTypedValue = new TypedValue();
      paramKeyEvent = ((Context)localObject2).getResources().newTheme();
      paramKeyEvent.setTo(((Context)localObject2).getTheme());
      paramKeyEvent.resolveAttribute(a.a.actionBarPopupTheme, localTypedValue, true);
      if (localTypedValue.resourceId != 0) {
        paramKeyEvent.applyStyle(localTypedValue.resourceId, true);
      }
      paramKeyEvent.resolveAttribute(a.a.panelMenuListTheme, localTypedValue, true);
      if (localTypedValue.resourceId == 0) {
        break;
      }
      paramKeyEvent.applyStyle(localTypedValue.resourceId, true);
      localObject2 = new android.support.v7.view.d((Context)localObject2, 0);
      ((Context)localObject2).getTheme().setTo(paramKeyEvent);
      paramPanelFeatureState.Fc = ((Context)localObject2);
      paramKeyEvent = ((Context)localObject2).obtainStyledAttributes(a.k.AppCompatTheme);
      paramPanelFeatureState.background = paramKeyEvent.getResourceId(a.k.AppCompatTheme_panelBackground, 0);
      paramPanelFeatureState.windowAnimations = paramKeyEvent.getResourceId(a.k.AppCompatTheme_android_windowAnimationStyle, 0);
      paramKeyEvent.recycle();
      paramPanelFeatureState.EX = new c(paramPanelFeatureState.Fc);
      paramPanelFeatureState.gravity = 81;
    } while (paramPanelFeatureState.EX == null);
    label359:
    if (paramPanelFeatureState.EZ != null)
    {
      paramPanelFeatureState.EY = paramPanelFeatureState.EZ;
      i = 1;
      label376:
      if (i == 0) {
        break label731;
      }
      if (paramPanelFeatureState.EY == null) {
        break label753;
      }
      if (paramPanelFeatureState.EZ == null) {
        break label733;
      }
      i = 1;
      label396:
      if (i == 0) {
        break label756;
      }
      paramKeyEvent = paramPanelFeatureState.EY.getLayoutParams();
      if (paramKeyEvent != null) {
        break label794;
      }
      paramKeyEvent = new ViewGroup.LayoutParams(-2, -2);
    }
    label581:
    label728:
    label731:
    label733:
    label753:
    label756:
    label758:
    label794:
    for (;;)
    {
      i = paramPanelFeatureState.background;
      paramPanelFeatureState.EX.setBackgroundResource(i);
      localObject2 = paramPanelFeatureState.EY.getParent();
      if ((localObject2 != null) && ((localObject2 instanceof ViewGroup))) {
        ((ViewGroup)localObject2).removeView(paramPanelFeatureState.EY);
      }
      paramPanelFeatureState.EX.addView(paramPanelFeatureState.EY, paramKeyEvent);
      if (!paramPanelFeatureState.EY.hasFocus()) {
        paramPanelFeatureState.EY.requestFocus();
      }
      i = -2;
      for (;;)
      {
        paramPanelFeatureState.Fe = false;
        paramKeyEvent = new WindowManager.LayoutParams(i, -2, paramPanelFeatureState.x, paramPanelFeatureState.y, 1002, 8519680, -3);
        paramKeyEvent.gravity = paramPanelFeatureState.gravity;
        paramKeyEvent.windowAnimations = paramPanelFeatureState.windowAnimations;
        ((WindowManager)localObject1).addView(paramPanelFeatureState.EX, paramKeyEvent);
        paramPanelFeatureState.BA = true;
        return;
        paramKeyEvent.applyStyle(a.j.Theme_AppCompat_CompactMenu, true);
        break label266;
        if ((!paramPanelFeatureState.Fg) || (paramPanelFeatureState.EX.getChildCount() <= 0)) {
          break label359;
        }
        paramPanelFeatureState.EX.removeAllViews();
        break label359;
        if (paramPanelFeatureState.Fa != null)
        {
          if (this.Ey == null) {
            this.Ey = new d((byte)0);
          }
          paramKeyEvent = this.Ey;
          if (paramPanelFeatureState.Fa == null) {}
          for (paramKeyEvent = null;; paramKeyEvent = paramPanelFeatureState.Fb.e(paramPanelFeatureState.EX))
          {
            paramPanelFeatureState.EY = ((View)paramKeyEvent);
            if (paramPanelFeatureState.EY == null) {
              break label728;
            }
            i = 1;
            break;
            if (paramPanelFeatureState.Fb == null)
            {
              paramPanelFeatureState.Fb = new android.support.v7.view.menu.e(paramPanelFeatureState.Fc, a.h.abc_list_menu_item_layout);
              paramPanelFeatureState.Fb.bp = paramKeyEvent;
              paramPanelFeatureState.Fa.a(paramPanelFeatureState.Fb);
            }
          }
        }
        i = 0;
        break label376;
        break;
        if (paramPanelFeatureState.Fb.getAdapter().getCount() > 0)
        {
          i = 1;
          break label396;
        }
        i = 0;
        break label396;
        break;
        if (paramPanelFeatureState.EZ != null)
        {
          paramKeyEvent = paramPanelFeatureState.EZ.getLayoutParams();
          if (paramKeyEvent != null)
          {
            i = k;
            if (paramKeyEvent.width == -1) {
              continue;
            }
          }
        }
        i = -2;
      }
    }
  }
  
  private void a(PanelFeatureState paramPanelFeatureState, boolean paramBoolean)
  {
    if ((paramBoolean) && (paramPanelFeatureState.EW == 0) && (this.Ew != null) && (this.Ew.isOverflowMenuShowing())) {
      c(paramPanelFeatureState.Fa);
    }
    do
    {
      return;
      WindowManager localWindowManager = (WindowManager)this.mContext.getSystemService("window");
      if ((localWindowManager != null) && (paramPanelFeatureState.BA) && (paramPanelFeatureState.EX != null))
      {
        localWindowManager.removeView(paramPanelFeatureState.EX);
        if (paramBoolean) {
          a(paramPanelFeatureState.EW, paramPanelFeatureState, null);
        }
      }
      paramPanelFeatureState.Fd = false;
      paramPanelFeatureState.Fe = false;
      paramPanelFeatureState.BA = false;
      paramPanelFeatureState.EY = null;
      paramPanelFeatureState.Fg = true;
    } while (this.EL != paramPanelFeatureState);
    this.EL = null;
  }
  
  private boolean a(PanelFeatureState paramPanelFeatureState, int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.isSystem()) {}
    while (((!paramPanelFeatureState.Fd) && (!b(paramPanelFeatureState, paramKeyEvent))) || (paramPanelFeatureState.Fa == null)) {
      return false;
    }
    return paramPanelFeatureState.Fa.performShortcut(paramInt, paramKeyEvent, 1);
  }
  
  private PanelFeatureState aH(int paramInt)
  {
    Object localObject2 = this.EK;
    Object localObject1;
    if (localObject2 != null)
    {
      localObject1 = localObject2;
      if (localObject2.length > paramInt) {}
    }
    else
    {
      localObject1 = new PanelFeatureState[paramInt + 1];
      if (localObject2 != null) {
        System.arraycopy(localObject2, 0, localObject1, 0, localObject2.length);
      }
      this.EK = ((PanelFeatureState[])localObject1);
    }
    localObject2 = localObject1[paramInt];
    if (localObject2 == null)
    {
      localObject2 = new PanelFeatureState(paramInt);
      localObject1[paramInt] = localObject2;
      return (PanelFeatureState)localObject2;
    }
    return (PanelFeatureState)localObject2;
  }
  
  private boolean b(PanelFeatureState paramPanelFeatureState, KeyEvent paramKeyEvent)
  {
    if (this.En) {
      return false;
    }
    if (paramPanelFeatureState.Fd) {
      return true;
    }
    if ((this.EL != null) && (this.EL != paramPanelFeatureState)) {
      a(this.EL, false);
    }
    Window.Callback localCallback = this.CS.getCallback();
    if (localCallback != null) {
      paramPanelFeatureState.EZ = localCallback.onCreatePanelView(paramPanelFeatureState.EW);
    }
    int i;
    label89:
    Context localContext;
    TypedValue localTypedValue;
    Resources.Theme localTheme;
    Object localObject1;
    if ((paramPanelFeatureState.EW == 0) || (paramPanelFeatureState.EW == 108))
    {
      i = 1;
      if ((i != 0) && (this.Ew != null)) {
        this.Ew.eh();
      }
      if ((paramPanelFeatureState.EZ != null) || ((i != 0) && ((this.mActionBar instanceof l)))) {
        break label625;
      }
      if ((paramPanelFeatureState.Fa != null) && (!paramPanelFeatureState.Fh)) {
        break label495;
      }
      if (paramPanelFeatureState.Fa == null)
      {
        localContext = this.mContext;
        if (((paramPanelFeatureState.EW != 0) && (paramPanelFeatureState.EW != 108)) || (this.Ew == null)) {
          break label653;
        }
        localTypedValue = new TypedValue();
        localTheme = localContext.getTheme();
        localTheme.resolveAttribute(a.a.actionBarTheme, localTypedValue, true);
        if (localTypedValue.resourceId == 0) {
          break label472;
        }
        localObject1 = localContext.getResources().newTheme();
        ((Resources.Theme)localObject1).setTo(localTheme);
        ((Resources.Theme)localObject1).applyStyle(localTypedValue.resourceId, true);
        ((Resources.Theme)localObject1).resolveAttribute(a.a.actionBarWidgetTheme, localTypedValue, true);
        label256:
        Object localObject2 = localObject1;
        if (localTypedValue.resourceId != 0)
        {
          localObject2 = localObject1;
          if (localObject1 == null)
          {
            localObject2 = localContext.getResources().newTheme();
            ((Resources.Theme)localObject2).setTo(localTheme);
          }
          ((Resources.Theme)localObject2).applyStyle(localTypedValue.resourceId, true);
        }
        if (localObject2 == null) {
          break label653;
        }
        localObject1 = new android.support.v7.view.d(localContext, 0);
        ((Context)localObject1).getTheme().setTo((Resources.Theme)localObject2);
      }
    }
    for (;;)
    {
      localObject1 = new android.support.v7.view.menu.f((Context)localObject1);
      ((android.support.v7.view.menu.f)localObject1).a(this);
      paramPanelFeatureState.e((android.support.v7.view.menu.f)localObject1);
      if (paramPanelFeatureState.Fa == null) {
        break;
      }
      if ((i != 0) && (this.Ew != null))
      {
        if (this.Ex == null) {
          this.Ex = new a((byte)0);
        }
        this.Ew.a(paramPanelFeatureState.Fa, this.Ex);
      }
      paramPanelFeatureState.Fa.dJ();
      if (!localCallback.onCreatePanelMenu(paramPanelFeatureState.EW, paramPanelFeatureState.Fa))
      {
        paramPanelFeatureState.e(null);
        if ((i == 0) || (this.Ew == null)) {
          break;
        }
        this.Ew.a(null, this.Ex);
        return false;
        i = 0;
        break label89;
        label472:
        localTheme.resolveAttribute(a.a.actionBarWidgetTheme, localTypedValue, true);
        localObject1 = null;
        break label256;
      }
      paramPanelFeatureState.Fh = false;
      label495:
      paramPanelFeatureState.Fa.dJ();
      if (paramPanelFeatureState.Fi != null)
      {
        paramPanelFeatureState.Fa.d(paramPanelFeatureState.Fi);
        paramPanelFeatureState.Fi = null;
      }
      if (!localCallback.onPreparePanel(0, paramPanelFeatureState.EZ, paramPanelFeatureState.Fa))
      {
        if ((i != 0) && (this.Ew != null)) {
          this.Ew.a(null, this.Ex);
        }
        paramPanelFeatureState.Fa.dK();
        return false;
      }
      if (paramKeyEvent != null)
      {
        i = paramKeyEvent.getDeviceId();
        if (KeyCharacterMap.load(i).getKeyboardType() == 1) {
          break label647;
        }
      }
      label625:
      label647:
      for (boolean bool = true;; bool = false)
      {
        paramPanelFeatureState.Ff = bool;
        paramPanelFeatureState.Fa.setQwertyMode(paramPanelFeatureState.Ff);
        paramPanelFeatureState.Fa.dK();
        paramPanelFeatureState.Fd = true;
        paramPanelFeatureState.Fe = false;
        this.EL = paramPanelFeatureState;
        return true;
        i = -1;
        break;
      }
      label653:
      localObject1 = localContext;
    }
  }
  
  private void c(android.support.v7.view.menu.f paramf)
  {
    if (this.EJ) {
      return;
    }
    this.EJ = true;
    this.Ew.ei();
    Window.Callback localCallback = this.CS.getCallback();
    if ((localCallback != null) && (!this.En)) {
      localCallback.onPanelClosed(108, paramf);
    }
    this.EJ = false;
  }
  
  private void dj()
  {
    Object localObject1;
    if (!this.EE)
    {
      localObject1 = this.mContext.obtainStyledAttributes(a.k.AppCompatTheme);
      if (!((TypedArray)localObject1).hasValue(a.k.AppCompatTheme_windowActionBar))
      {
        ((TypedArray)localObject1).recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
      }
      if (((TypedArray)localObject1).getBoolean(a.k.AppCompatTheme_windowNoTitle, false))
      {
        requestWindowFeature(1);
        if (((TypedArray)localObject1).getBoolean(a.k.AppCompatTheme_windowActionBarOverlay, false)) {
          requestWindowFeature(109);
        }
        if (((TypedArray)localObject1).getBoolean(a.k.AppCompatTheme_windowActionModeOverlay, false)) {
          requestWindowFeature(10);
        }
        this.El = ((TypedArray)localObject1).getBoolean(a.k.AppCompatTheme_android_windowIsFloating, false);
        ((TypedArray)localObject1).recycle();
        this.CS.getDecorView();
        localObject1 = LayoutInflater.from(this.mContext);
        if (this.Em) {
          break label459;
        }
        if (!this.El) {
          break label288;
        }
        localObject1 = (ViewGroup)((LayoutInflater)localObject1).inflate(a.h.abc_dialog_title_material, null);
        this.Ej = false;
        this.Ei = false;
      }
    }
    for (;;)
    {
      if (localObject1 == null)
      {
        throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.Ei + ", windowActionBarOverlay: " + this.Ej + ", android:windowIsFloating: " + this.El + ", windowActionModeOverlay: " + this.Ek + ", windowNoTitle: " + this.Em + " }");
        if (!((TypedArray)localObject1).getBoolean(a.k.AppCompatTheme_windowActionBar, false)) {
          break;
        }
        requestWindowFeature(108);
        break;
        label288:
        if (!this.Ei) {
          break label1002;
        }
        localObject1 = new TypedValue();
        this.mContext.getTheme().resolveAttribute(a.a.actionBarTheme, (TypedValue)localObject1, true);
        if (((TypedValue)localObject1).resourceId != 0) {}
        for (localObject1 = new android.support.v7.view.d(this.mContext, ((TypedValue)localObject1).resourceId);; localObject1 = this.mContext)
        {
          localObject1 = (ViewGroup)LayoutInflater.from((Context)localObject1).inflate(a.h.abc_screen_toolbar, null);
          this.Ew = ((android.support.v7.widget.t)((ViewGroup)localObject1).findViewById(a.f.decor_content_parent));
          this.Ew.setWindowCallback(this.CS.getCallback());
          if (this.Ej) {
            this.Ew.aJ(109);
          }
          if (this.EH) {
            this.Ew.aJ(2);
          }
          if (this.EI) {
            this.Ew.aJ(5);
          }
          break;
        }
        label459:
        if (this.Ek) {}
        for (localObject1 = (ViewGroup)((LayoutInflater)localObject1).inflate(a.h.abc_screen_simple_overlay_action_mode, null);; localObject1 = (ViewGroup)((LayoutInflater)localObject1).inflate(a.h.abc_screen_simple, null))
        {
          if (Build.VERSION.SDK_INT < 21) {
            break label521;
          }
          z.b((View)localObject1, new android.support.v4.view.t()
          {
            public final ap a(View paramAnonymousView, ap paramAnonymousap)
            {
              int i = paramAnonymousap.getSystemWindowInsetTop();
              int j = AppCompatDelegateImplV7.b(AppCompatDelegateImplV7.this, i);
              ap localap = paramAnonymousap;
              if (i != j) {
                localap = paramAnonymousap.f(paramAnonymousap.getSystemWindowInsetLeft(), j, paramAnonymousap.getSystemWindowInsetRight(), paramAnonymousap.getSystemWindowInsetBottom());
              }
              return z.a(paramAnonymousView, localap);
            }
          });
          break;
        }
        label521:
        ((x)localObject1).setOnFitSystemWindowsListener(new x.a()
        {
          public final void f(Rect paramAnonymousRect)
          {
            paramAnonymousRect.top = AppCompatDelegateImplV7.b(AppCompatDelegateImplV7.this, paramAnonymousRect.top);
          }
        });
        continue;
      }
      if (this.Ew == null) {
        this.Dm = ((TextView)((ViewGroup)localObject1).findViewById(a.f.title));
      }
      at.bw((View)localObject1);
      Object localObject2 = (ContentFrameLayout)((ViewGroup)localObject1).findViewById(a.f.action_bar_activity_content);
      ViewGroup localViewGroup = (ViewGroup)this.CS.findViewById(16908290);
      if (localViewGroup != null)
      {
        while (localViewGroup.getChildCount() > 0)
        {
          View localView = localViewGroup.getChildAt(0);
          localViewGroup.removeViewAt(0);
          ((ContentFrameLayout)localObject2).addView(localView);
        }
        localViewGroup.setId(-1);
        ((ContentFrameLayout)localObject2).setId(16908290);
        if ((localViewGroup instanceof FrameLayout)) {
          ((FrameLayout)localViewGroup).setForeground(null);
        }
      }
      this.CS.setContentView((View)localObject1);
      ((ContentFrameLayout)localObject2).setAttachListener(new ContentFrameLayout.a()
      {
        public final void onDetachedFromWindow()
        {
          AppCompatDelegateImplV7.d(AppCompatDelegateImplV7.this);
        }
      });
      this.EF = ((ViewGroup)localObject1);
      if ((this.Ef instanceof Activity)) {}
      for (localObject1 = ((Activity)this.Ef).getTitle();; localObject1 = this.sn)
      {
        if (!TextUtils.isEmpty((CharSequence)localObject1)) {
          f((CharSequence)localObject1);
        }
        localObject1 = (ContentFrameLayout)this.EF.findViewById(16908290);
        localObject2 = this.CS.getDecorView();
        int i = ((View)localObject2).getPaddingLeft();
        int j = ((View)localObject2).getPaddingTop();
        int k = ((View)localObject2).getPaddingRight();
        int m = ((View)localObject2).getPaddingBottom();
        ((ContentFrameLayout)localObject1).NL.set(i, j, k, m);
        if (z.ai((View)localObject1)) {
          ((ContentFrameLayout)localObject1).requestLayout();
        }
        localObject2 = this.mContext.obtainStyledAttributes(a.k.AppCompatTheme);
        ((TypedArray)localObject2).getValue(a.k.AppCompatTheme_windowMinWidthMajor, ((ContentFrameLayout)localObject1).getMinWidthMajor());
        ((TypedArray)localObject2).getValue(a.k.AppCompatTheme_windowMinWidthMinor, ((ContentFrameLayout)localObject1).getMinWidthMinor());
        if (((TypedArray)localObject2).hasValue(a.k.AppCompatTheme_windowFixedWidthMajor)) {
          ((TypedArray)localObject2).getValue(a.k.AppCompatTheme_windowFixedWidthMajor, ((ContentFrameLayout)localObject1).getFixedWidthMajor());
        }
        if (((TypedArray)localObject2).hasValue(a.k.AppCompatTheme_windowFixedWidthMinor)) {
          ((TypedArray)localObject2).getValue(a.k.AppCompatTheme_windowFixedWidthMinor, ((ContentFrameLayout)localObject1).getFixedWidthMinor());
        }
        if (((TypedArray)localObject2).hasValue(a.k.AppCompatTheme_windowFixedHeightMajor)) {
          ((TypedArray)localObject2).getValue(a.k.AppCompatTheme_windowFixedHeightMajor, ((ContentFrameLayout)localObject1).getFixedHeightMajor());
        }
        if (((TypedArray)localObject2).hasValue(a.k.AppCompatTheme_windowFixedHeightMinor)) {
          ((TypedArray)localObject2).getValue(a.k.AppCompatTheme_windowFixedHeightMinor, ((ContentFrameLayout)localObject1).getFixedHeightMinor());
        }
        ((TypedArray)localObject2).recycle();
        ((ContentFrameLayout)localObject1).requestLayout();
        this.EE = true;
        localObject1 = aH(0);
        if ((!this.En) && ((localObject1 == null) || (((PanelFeatureState)localObject1).Fa == null))) {
          invalidatePanelMenu(108);
        }
        return;
      }
      label1002:
      localObject1 = null;
    }
  }
  
  private void dk()
  {
    if (this.ED != null) {
      this.ED.cancel();
    }
  }
  
  private void dl()
  {
    if (this.EE) {
      throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }
  }
  
  private void invalidatePanelMenu(int paramInt)
  {
    this.EO |= 1 << paramInt;
    if (!this.EN)
    {
      z.a(this.CS.getDecorView(), this.EP);
      this.EN = true;
    }
  }
  
  View a(String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    if ((this.Ef instanceof LayoutInflater.Factory))
    {
      paramString = ((LayoutInflater.Factory)this.Ef).onCreateView(paramString, paramContext, paramAttributeSet);
      if (paramString != null) {
        return paramString;
      }
    }
    return null;
  }
  
  public final boolean a(android.support.v7.view.menu.f paramf, MenuItem paramMenuItem)
  {
    Window.Callback localCallback = this.CS.getCallback();
    if ((localCallback != null) && (!this.En))
    {
      paramf = a(paramf.dQ());
      if (paramf != null) {
        return localCallback.onMenuItemSelected(paramf.EW, paramMenuItem);
      }
    }
    return false;
  }
  
  final void aE(int paramInt)
  {
    Object localObject;
    if (paramInt == 108)
    {
      localObject = getSupportActionBar();
      if (localObject != null) {
        ((ActionBar)localObject).E(false);
      }
    }
    do
    {
      do
      {
        return;
      } while (paramInt != 0);
      localObject = aH(paramInt);
    } while (!((PanelFeatureState)localObject).BA);
    a((PanelFeatureState)localObject, false);
  }
  
  final boolean aF(int paramInt)
  {
    if (paramInt == 108)
    {
      ActionBar localActionBar = getSupportActionBar();
      if (localActionBar != null) {
        localActionBar.E(true);
      }
      return true;
    }
    return false;
  }
  
  public final void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    dj();
    ((ViewGroup)this.EF.findViewById(16908290)).addView(paramView, paramLayoutParams);
    this.Ef.onContentChanged();
  }
  
  final android.support.v7.view.b b(b.a parama)
  {
    dk();
    if (this.Ez != null) {
      this.Ez.finish();
    }
    b localb1 = new b(parama);
    if ((this.Eh != null) && (!this.En)) {}
    for (;;)
    {
      try
      {
        android.support.v7.view.b localb = this.Eh.onWindowStartingSupportActionMode(localb1);
        if (localb == null) {
          break label107;
        }
        this.Ez = localb;
        if ((this.Ez != null) && (this.Eh != null)) {
          this.Eh.onSupportActionModeStarted(this.Ez);
        }
        return this.Ez;
      }
      catch (AbstractMethodError localAbstractMethodError) {}
      Object localObject1 = null;
      continue;
      label107:
      Object localObject2;
      if (this.EA == null)
      {
        if (!this.El) {
          break label498;
        }
        localObject2 = new TypedValue();
        localObject1 = this.mContext.getTheme();
        ((Resources.Theme)localObject1).resolveAttribute(a.a.actionBarTheme, (TypedValue)localObject2, true);
        if (((TypedValue)localObject2).resourceId != 0)
        {
          Resources.Theme localTheme = this.mContext.getResources().newTheme();
          localTheme.setTo((Resources.Theme)localObject1);
          localTheme.applyStyle(((TypedValue)localObject2).resourceId, true);
          localObject1 = new android.support.v7.view.d(this.mContext, 0);
          ((Context)localObject1).getTheme().setTo(localTheme);
          label213:
          this.EA = new ActionBarContextView((Context)localObject1);
          this.EB = new PopupWindow((Context)localObject1, null, a.a.actionModePopupWindowStyle);
          m.a(this.EB, 2);
          this.EB.setContentView(this.EA);
          this.EB.setWidth(-1);
          ((Context)localObject1).getTheme().resolveAttribute(a.a.actionBarSize, (TypedValue)localObject2, true);
          int i = TypedValue.complexToDimensionPixelSize(((TypedValue)localObject2).data, ((Context)localObject1).getResources().getDisplayMetrics());
          this.EA.setContentHeight(i);
          this.EB.setHeight(-2);
          this.EC = new Runnable()
          {
            public final void run()
            {
              AppCompatDelegateImplV7.this.EB.showAtLocation(AppCompatDelegateImplV7.this.EA, 55, 0, 0);
              AppCompatDelegateImplV7.e(AppCompatDelegateImplV7.this);
              z.d(AppCompatDelegateImplV7.this.EA, 0.0F);
              AppCompatDelegateImplV7.this.ED = z.U(AppCompatDelegateImplV7.this.EA).t(1.0F);
              AppCompatDelegateImplV7.this.ED.a(new an()
              {
                public final void p(View paramAnonymous2View)
                {
                  AppCompatDelegateImplV7.this.EA.setVisibility(0);
                }
                
                public final void q(View paramAnonymous2View)
                {
                  z.d(AppCompatDelegateImplV7.this.EA, 1.0F);
                  AppCompatDelegateImplV7.this.ED.a(null);
                  AppCompatDelegateImplV7.this.ED = null;
                }
              });
            }
          };
        }
      }
      else
      {
        label331:
        if (this.EA == null) {
          break label543;
        }
        dk();
        this.EA.ec();
        localObject1 = this.EA.getContext();
        localObject2 = this.EA;
        if (this.EB != null) {
          break label545;
        }
      }
      label498:
      label543:
      label545:
      for (boolean bool = true;; bool = false)
      {
        localObject1 = new android.support.v7.view.e((Context)localObject1, (ActionBarContextView)localObject2, localb1, bool);
        if (!parama.a((android.support.v7.view.b)localObject1, ((android.support.v7.view.b)localObject1).getMenu())) {
          break label550;
        }
        ((android.support.v7.view.b)localObject1).invalidate();
        this.EA.c((android.support.v7.view.b)localObject1);
        this.Ez = ((android.support.v7.view.b)localObject1);
        z.d(this.EA, 0.0F);
        this.ED = z.U(this.EA).t(1.0F);
        this.ED.a(new an()
        {
          public final void p(View paramAnonymousView)
          {
            AppCompatDelegateImplV7.this.EA.setVisibility(0);
            AppCompatDelegateImplV7.this.EA.sendAccessibilityEvent(32);
            if (AppCompatDelegateImplV7.this.EA.getParent() != null) {
              z.Y((View)AppCompatDelegateImplV7.this.EA.getParent());
            }
          }
          
          public final void q(View paramAnonymousView)
          {
            z.d(AppCompatDelegateImplV7.this.EA, 1.0F);
            AppCompatDelegateImplV7.this.ED.a(null);
            AppCompatDelegateImplV7.this.ED = null;
          }
        });
        if (this.EB == null) {
          break;
        }
        this.CS.getDecorView().post(this.EC);
        break;
        localObject1 = this.mContext;
        break label213;
        localObject1 = (ViewStubCompat)this.EF.findViewById(a.f.action_mode_bar_stub);
        if (localObject1 == null) {
          break label331;
        }
        ((ViewStubCompat)localObject1).setLayoutInflater(LayoutInflater.from(di()));
        this.EA = ((ActionBarContextView)((ViewStubCompat)localObject1).inflate());
        break label331;
        break;
      }
      label550:
      this.Ez = null;
    }
  }
  
  public final void b(android.support.v7.view.menu.f paramf)
  {
    if ((this.Ew != null) && (this.Ew.ef()) && ((!ae.b(ViewConfiguration.get(this.mContext))) || (this.Ew.eg())))
    {
      paramf = this.CS.getCallback();
      if (!this.Ew.isOverflowMenuShowing()) {
        if ((paramf != null) && (!this.En))
        {
          if ((this.EN) && ((this.EO & 0x1) != 0))
          {
            this.CS.getDecorView().removeCallbacks(this.EP);
            this.EP.run();
          }
          PanelFeatureState localPanelFeatureState = aH(0);
          if ((localPanelFeatureState.Fa != null) && (!localPanelFeatureState.Fh) && (paramf.onPreparePanel(0, localPanelFeatureState.EZ, localPanelFeatureState.Fa)))
          {
            paramf.onMenuOpened(108, localPanelFeatureState.Fa);
            this.Ew.showOverflowMenu();
          }
        }
      }
      do
      {
        return;
        this.Ew.hideOverflowMenu();
      } while (this.En);
      paramf.onPanelClosed(108, aH(0).Fa);
      return;
    }
    paramf = aH(0);
    paramf.Fg = true;
    a(paramf, false);
    a(paramf, null);
  }
  
  public final void dd()
  {
    dj();
  }
  
  public final void de()
  {
    LayoutInflater localLayoutInflater = LayoutInflater.from(this.mContext);
    if (localLayoutInflater.getFactory() == null)
    {
      android.support.v4.view.h.a(localLayoutInflater, this);
      return;
    }
    android.support.v4.view.h.a(localLayoutInflater);
  }
  
  public final void dh()
  {
    dj();
    if ((!this.Ei) || (this.mActionBar != null)) {}
    for (;;)
    {
      return;
      if ((this.Ef instanceof Activity)) {
        this.mActionBar = new o((Activity)this.Ef, this.Ej);
      }
      while (this.mActionBar != null)
      {
        this.mActionBar.C(this.EQ);
        return;
        if ((this.Ef instanceof Dialog)) {
          this.mActionBar = new o((Dialog)this.Ef);
        }
      }
    }
  }
  
  final boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getKeyCode() == 82) && (this.Ef.dispatchKeyEvent(paramKeyEvent))) {}
    int i;
    label180:
    do
    {
      int j;
      do
      {
        do
        {
          return true;
          j = paramKeyEvent.getKeyCode();
          if (paramKeyEvent.getAction() == 0) {}
          for (i = 1; i != 0; i = 0) {
            switch (j)
            {
            default: 
              if (Build.VERSION.SDK_INT < 11) {
                onKeyShortcut(j, paramKeyEvent);
              }
              return false;
            }
          }
        } while (paramKeyEvent.getRepeatCount() != 0);
        localPanelFeatureState = aH(0);
      } while (localPanelFeatureState.BA);
      b(localPanelFeatureState, paramKeyEvent);
      return true;
      if ((paramKeyEvent.getFlags() & 0x80) != 0) {}
      for (bool = true;; bool = false)
      {
        this.EM = bool;
        break;
      }
      switch (j)
      {
      default: 
        return false;
      }
    } while (this.Ez != null);
    PanelFeatureState localPanelFeatureState = aH(0);
    if ((this.Ew != null) && (this.Ew.ef()) && (!ae.b(ViewConfiguration.get(this.mContext)))) {
      if (!this.Ew.isOverflowMenuShowing())
      {
        if ((this.En) || (!b(localPanelFeatureState, paramKeyEvent))) {
          break label483;
        }
        bool = this.Ew.showOverflowMenu();
      }
    }
    label268:
    while (bool)
    {
      paramKeyEvent = (AudioManager)this.mContext.getSystemService("audio");
      if (paramKeyEvent == null) {
        break;
      }
      paramKeyEvent.playSoundEffect(0);
      return true;
      bool = this.Ew.hideOverflowMenu();
      continue;
      if ((!localPanelFeatureState.BA) && (!localPanelFeatureState.Fe)) {
        break label345;
      }
      bool = localPanelFeatureState.BA;
      a(localPanelFeatureState, true);
    }
    label345:
    if (localPanelFeatureState.Fd)
    {
      if (!localPanelFeatureState.Fh) {
        break label489;
      }
      localPanelFeatureState.Fd = false;
    }
    label483:
    label489:
    for (boolean bool = b(localPanelFeatureState, paramKeyEvent);; bool = true)
    {
      if (bool)
      {
        a(localPanelFeatureState, paramKeyEvent);
        bool = true;
        break label268;
        bool = this.EM;
        this.EM = false;
        paramKeyEvent = aH(0);
        if ((paramKeyEvent != null) && (paramKeyEvent.BA))
        {
          if (bool) {
            break;
          }
          a(paramKeyEvent, true);
          return true;
        }
        if (this.Ez != null)
        {
          this.Ez.finish();
          i = 1;
        }
        while (i != 0)
        {
          return true;
          paramKeyEvent = getSupportActionBar();
          if ((paramKeyEvent != null) && (paramKeyEvent.collapseActionView())) {
            i = 1;
          } else {
            i = 0;
          }
        }
        break label180;
      }
      bool = false;
      break label268;
    }
  }
  
  final void f(CharSequence paramCharSequence)
  {
    if (this.Ew != null) {
      this.Ew.setWindowTitle(paramCharSequence);
    }
    do
    {
      return;
      if (this.mActionBar != null)
      {
        this.mActionBar.setWindowTitle(paramCharSequence);
        return;
      }
    } while (this.Dm == null);
    this.Dm.setText(paramCharSequence);
  }
  
  public final View findViewById(int paramInt)
  {
    dj();
    return this.CS.findViewById(paramInt);
  }
  
  public final void invalidateOptionsMenu()
  {
    ActionBar localActionBar = getSupportActionBar();
    if ((localActionBar != null) && (localActionBar.dc())) {
      return;
    }
    invalidatePanelMenu(0);
  }
  
  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    if ((this.Ei) && (this.EE))
    {
      ActionBar localActionBar = getSupportActionBar();
      if (localActionBar != null) {
        localActionBar.onConfigurationChanged(paramConfiguration);
      }
    }
    df();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    if (((this.Ef instanceof Activity)) && (v.c((Activity)this.Ef) != null))
    {
      paramBundle = this.mActionBar;
      if (paramBundle == null) {
        this.EQ = true;
      }
    }
    else
    {
      return;
    }
    paramBundle.C(true);
  }
  
  public final View onCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    int j = 0;
    Object localObject1 = a(paramString, paramContext, paramAttributeSet);
    if (localObject1 != null)
    {
      paramString = (String)localObject1;
      return paramString;
    }
    boolean bool1;
    label34:
    int i;
    label79:
    Object localObject2;
    boolean bool2;
    if (Build.VERSION.SDK_INT < 21)
    {
      bool1 = true;
      if (this.ER == null) {
        this.ER = new k();
      }
      if (!bool1) {
        break label425;
      }
      localObject1 = (ViewParent)paramView;
      if (localObject1 != null) {
        break label361;
      }
      i = 0;
      if (i == 0) {
        break label425;
      }
      i = 1;
      localObject2 = this.ER;
      bool2 = ar.hi();
      if ((i == 0) || (paramView == null)) {
        break label845;
      }
    }
    label248:
    label251:
    label320:
    label361:
    label425:
    label845:
    for (paramView = paramView.getContext();; paramView = paramContext)
    {
      paramView = k.a(paramView, paramAttributeSet, bool1);
      localObject1 = paramView;
      if (bool2) {
        localObject1 = am.T(paramView);
      }
      paramView = null;
      switch (paramString.hashCode())
      {
      default: 
        i = -1;
        switch (i)
        {
        default: 
          if ((paramView == null) && (paramContext != localObject1)) {
            paramView = ((k)localObject2).a((Context)localObject1, paramString, paramAttributeSet);
          }
          break;
        }
        break;
      }
      for (;;)
      {
        paramString = paramView;
        if (paramView == null) {
          break;
        }
        k.a(paramView, paramAttributeSet);
        return paramView;
        bool1 = false;
        break label34;
        localObject2 = this.CS.getDecorView();
        for (;;)
        {
          if (localObject1 == null)
          {
            i = 1;
            break;
          }
          if ((localObject1 == localObject2) || (!(localObject1 instanceof View)) || (z.ak((View)localObject1)))
          {
            i = 0;
            break;
          }
          localObject1 = ((ViewParent)localObject1).getParent();
        }
        i = 0;
        break label79;
        if (!paramString.equals("TextView")) {
          break label248;
        }
        i = j;
        break label251;
        if (!paramString.equals("ImageView")) {
          break label248;
        }
        i = 1;
        break label251;
        if (!paramString.equals("Button")) {
          break label248;
        }
        i = 2;
        break label251;
        if (!paramString.equals("EditText")) {
          break label248;
        }
        i = 3;
        break label251;
        if (!paramString.equals("Spinner")) {
          break label248;
        }
        i = 4;
        break label251;
        if (!paramString.equals("ImageButton")) {
          break label248;
        }
        i = 5;
        break label251;
        if (!paramString.equals("CheckBox")) {
          break label248;
        }
        i = 6;
        break label251;
        if (!paramString.equals("RadioButton")) {
          break label248;
        }
        i = 7;
        break label251;
        if (!paramString.equals("CheckedTextView")) {
          break label248;
        }
        i = 8;
        break label251;
        if (!paramString.equals("AutoCompleteTextView")) {
          break label248;
        }
        i = 9;
        break label251;
        if (!paramString.equals("MultiAutoCompleteTextView")) {
          break label248;
        }
        i = 10;
        break label251;
        if (!paramString.equals("RatingBar")) {
          break label248;
        }
        i = 11;
        break label251;
        if (!paramString.equals("SeekBar")) {
          break label248;
        }
        i = 12;
        break label251;
        paramView = new AppCompatTextView((Context)localObject1, paramAttributeSet);
        break label320;
        paramView = new AppCompatImageView((Context)localObject1, paramAttributeSet);
        break label320;
        paramView = new AppCompatButton((Context)localObject1, paramAttributeSet);
        break label320;
        paramView = new AppCompatEditText((Context)localObject1, paramAttributeSet);
        break label320;
        paramView = new AppCompatSpinner((Context)localObject1, paramAttributeSet);
        break label320;
        paramView = new AppCompatImageButton((Context)localObject1, paramAttributeSet);
        break label320;
        paramView = new AppCompatCheckBox((Context)localObject1, paramAttributeSet);
        break label320;
        paramView = new AppCompatRadioButton((Context)localObject1, paramAttributeSet);
        break label320;
        paramView = new AppCompatCheckedTextView((Context)localObject1, paramAttributeSet);
        break label320;
        paramView = new AppCompatAutoCompleteTextView((Context)localObject1, paramAttributeSet);
        break label320;
        paramView = new AppCompatMultiAutoCompleteTextView((Context)localObject1, paramAttributeSet);
        break label320;
        paramView = new AppCompatRatingBar((Context)localObject1, paramAttributeSet);
        break label320;
        paramView = new AppCompatSeekBar((Context)localObject1, paramAttributeSet);
        break label320;
      }
    }
  }
  
  public final void onDestroy()
  {
    super.onDestroy();
    if (this.mActionBar != null) {
      this.mActionBar.onDestroy();
    }
  }
  
  final boolean onKeyShortcut(int paramInt, KeyEvent paramKeyEvent)
  {
    Object localObject = getSupportActionBar();
    if ((localObject != null) && (((ActionBar)localObject).onKeyShortcut(paramInt, paramKeyEvent))) {}
    boolean bool;
    do
    {
      do
      {
        return true;
        if ((this.EL == null) || (!a(this.EL, paramKeyEvent.getKeyCode(), paramKeyEvent))) {
          break;
        }
      } while (this.EL == null);
      this.EL.Fe = true;
      return true;
      if (this.EL != null) {
        break;
      }
      localObject = aH(0);
      b((PanelFeatureState)localObject, paramKeyEvent);
      bool = a((PanelFeatureState)localObject, paramKeyEvent.getKeyCode(), paramKeyEvent);
      ((PanelFeatureState)localObject).Fd = false;
    } while (bool);
    return false;
  }
  
  public final void onPostResume()
  {
    ActionBar localActionBar = getSupportActionBar();
    if (localActionBar != null) {
      localActionBar.D(true);
    }
  }
  
  public final void onStop()
  {
    ActionBar localActionBar = getSupportActionBar();
    if (localActionBar != null) {
      localActionBar.D(false);
    }
  }
  
  public final boolean requestWindowFeature(int paramInt)
  {
    int i;
    if (paramInt == 8) {
      i = 108;
    }
    while ((this.Em) && (i == 108))
    {
      return false;
      i = paramInt;
      if (paramInt == 9) {
        i = 109;
      }
    }
    if ((this.Ei) && (i == 1)) {
      this.Ei = false;
    }
    switch (i)
    {
    default: 
      return this.CS.requestFeature(i);
    case 108: 
      dl();
      this.Ei = true;
      return true;
    case 109: 
      dl();
      this.Ej = true;
      return true;
    case 10: 
      dl();
      this.Ek = true;
      return true;
    case 2: 
      dl();
      this.EH = true;
      return true;
    case 5: 
      dl();
      this.EI = true;
      return true;
    }
    dl();
    this.Em = true;
    return true;
  }
  
  public final void setContentView(int paramInt)
  {
    dj();
    ViewGroup localViewGroup = (ViewGroup)this.EF.findViewById(16908290);
    localViewGroup.removeAllViews();
    LayoutInflater.from(this.mContext).inflate(paramInt, localViewGroup);
    this.Ef.onContentChanged();
  }
  
  public final void setContentView(View paramView)
  {
    dj();
    ViewGroup localViewGroup = (ViewGroup)this.EF.findViewById(16908290);
    localViewGroup.removeAllViews();
    localViewGroup.addView(paramView);
    this.Ef.onContentChanged();
  }
  
  public final void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    dj();
    ViewGroup localViewGroup = (ViewGroup)this.EF.findViewById(16908290);
    localViewGroup.removeAllViews();
    localViewGroup.addView(paramView, paramLayoutParams);
    this.Ef.onContentChanged();
  }
  
  public final void setSupportActionBar(Toolbar paramToolbar)
  {
    if (!(this.Ef instanceof Activity)) {
      return;
    }
    ActionBar localActionBar = getSupportActionBar();
    if ((localActionBar instanceof o)) {
      throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
    }
    this.gh = null;
    if (localActionBar != null) {
      localActionBar.onDestroy();
    }
    if (paramToolbar != null)
    {
      paramToolbar = new l(paramToolbar, ((Activity)this.mContext).getTitle(), this.Eg);
      this.mActionBar = paramToolbar;
      this.CS.setCallback(paramToolbar.Fu);
    }
    for (;;)
    {
      invalidateOptionsMenu();
      return;
      this.mActionBar = null;
      this.CS.setCallback(this.Eg);
    }
  }
  
  public final android.support.v7.view.b startSupportActionMode(b.a parama)
  {
    if (parama == null) {
      throw new IllegalArgumentException("ActionMode callback can not be null.");
    }
    if (this.Ez != null) {
      this.Ez.finish();
    }
    parama = new b(parama);
    ActionBar localActionBar = getSupportActionBar();
    if (localActionBar != null)
    {
      this.Ez = localActionBar.a(parama);
      if ((this.Ez != null) && (this.Eh != null)) {
        this.Eh.onSupportActionModeStarted(this.Ez);
      }
    }
    if (this.Ez == null) {
      this.Ez = b(parama);
    }
    return this.Ez;
  }
  
  private static final class PanelFeatureState
  {
    boolean BA;
    int EW;
    ViewGroup EX;
    View EY;
    View EZ;
    android.support.v7.view.menu.f Fa;
    android.support.v7.view.menu.e Fb;
    Context Fc;
    boolean Fd;
    boolean Fe;
    public boolean Ff;
    boolean Fg;
    boolean Fh;
    Bundle Fi;
    int background;
    int gravity;
    int windowAnimations;
    int x;
    int y;
    
    PanelFeatureState(int paramInt)
    {
      this.EW = paramInt;
      this.Fg = false;
    }
    
    final void e(android.support.v7.view.menu.f paramf)
    {
      if (paramf == this.Fa) {}
      do
      {
        return;
        if (this.Fa != null) {
          this.Fa.b(this.Fb);
        }
        this.Fa = paramf;
      } while ((paramf == null) || (this.Fb == null));
      paramf.a(this.Fb);
    }
    
    private static class SavedState
      implements Parcelable
    {
      public static final Parcelable.Creator<SavedState> CREATOR = android.support.v4.os.b.a(new c() {});
      boolean BA;
      int EW;
      Bundle gj;
      
      public int describeContents()
      {
        return 0;
      }
      
      public void writeToParcel(Parcel paramParcel, int paramInt)
      {
        paramParcel.writeInt(this.EW);
        if (this.BA) {}
        for (paramInt = 1;; paramInt = 0)
        {
          paramParcel.writeInt(paramInt);
          if (this.BA) {
            paramParcel.writeBundle(this.gj);
          }
          return;
        }
      }
    }
  }
  
  private final class a
    implements l.a
  {
    private a() {}
    
    public final void a(android.support.v7.view.menu.f paramf, boolean paramBoolean)
    {
      AppCompatDelegateImplV7.a(AppCompatDelegateImplV7.this, paramf);
    }
    
    public final boolean d(android.support.v7.view.menu.f paramf)
    {
      Window.Callback localCallback = AppCompatDelegateImplV7.this.CS.getCallback();
      if (localCallback != null) {
        localCallback.onMenuOpened(108, paramf);
      }
      return true;
    }
  }
  
  final class b
    implements b.a
  {
    private b.a EU;
    
    public b(b.a parama)
    {
      this.EU = parama;
    }
    
    public final void a(android.support.v7.view.b paramb)
    {
      this.EU.a(paramb);
      if (AppCompatDelegateImplV7.this.EB != null) {
        AppCompatDelegateImplV7.this.CS.getDecorView().removeCallbacks(AppCompatDelegateImplV7.this.EC);
      }
      if (AppCompatDelegateImplV7.this.EA != null)
      {
        AppCompatDelegateImplV7.e(AppCompatDelegateImplV7.this);
        AppCompatDelegateImplV7.this.ED = z.U(AppCompatDelegateImplV7.this.EA).t(0.0F);
        AppCompatDelegateImplV7.this.ED.a(new an()
        {
          public final void q(View paramAnonymousView)
          {
            AppCompatDelegateImplV7.this.EA.setVisibility(8);
            if (AppCompatDelegateImplV7.this.EB != null) {
              AppCompatDelegateImplV7.this.EB.dismiss();
            }
            for (;;)
            {
              AppCompatDelegateImplV7.this.EA.removeAllViews();
              AppCompatDelegateImplV7.this.ED.a(null);
              AppCompatDelegateImplV7.this.ED = null;
              return;
              if ((AppCompatDelegateImplV7.this.EA.getParent() instanceof View)) {
                z.Y((View)AppCompatDelegateImplV7.this.EA.getParent());
              }
            }
          }
        });
      }
      if (AppCompatDelegateImplV7.this.Eh != null) {
        AppCompatDelegateImplV7.this.Eh.onSupportActionModeFinished(AppCompatDelegateImplV7.this.Ez);
      }
      AppCompatDelegateImplV7.this.Ez = null;
    }
    
    public final boolean a(android.support.v7.view.b paramb, Menu paramMenu)
    {
      return this.EU.a(paramb, paramMenu);
    }
    
    public final boolean a(android.support.v7.view.b paramb, MenuItem paramMenuItem)
    {
      return this.EU.a(paramb, paramMenuItem);
    }
    
    public final boolean b(android.support.v7.view.b paramb, Menu paramMenu)
    {
      return this.EU.b(paramb, paramMenu);
    }
  }
  
  private final class c
    extends ContentFrameLayout
  {
    public c(Context paramContext)
    {
      super();
    }
    
    public final boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
    {
      return (AppCompatDelegateImplV7.this.dispatchKeyEvent(paramKeyEvent)) || (super.dispatchKeyEvent(paramKeyEvent));
    }
    
    public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
    {
      if (paramMotionEvent.getAction() == 0)
      {
        int i = (int)paramMotionEvent.getX();
        int j = (int)paramMotionEvent.getY();
        if ((i < -5) || (j < -5) || (i > getWidth() + 5) || (j > getHeight() + 5)) {}
        for (i = 1; i != 0; i = 0)
        {
          AppCompatDelegateImplV7.f(AppCompatDelegateImplV7.this);
          return true;
        }
      }
      return super.onInterceptTouchEvent(paramMotionEvent);
    }
    
    public final void setBackgroundResource(int paramInt)
    {
      setBackgroundDrawable(android.support.v7.widget.h.eJ().a(getContext(), paramInt, false));
    }
  }
  
  private final class d
    implements l.a
  {
    private d() {}
    
    public final void a(android.support.v7.view.menu.f paramf, boolean paramBoolean)
    {
      android.support.v7.view.menu.f localf = paramf.dQ();
      if (localf != paramf) {}
      for (int i = 1;; i = 0)
      {
        AppCompatDelegateImplV7 localAppCompatDelegateImplV7 = AppCompatDelegateImplV7.this;
        if (i != 0) {
          paramf = localf;
        }
        paramf = AppCompatDelegateImplV7.a(localAppCompatDelegateImplV7, paramf);
        if (paramf != null)
        {
          if (i == 0) {
            break;
          }
          AppCompatDelegateImplV7.a(AppCompatDelegateImplV7.this, paramf.EW, paramf, localf);
          AppCompatDelegateImplV7.a(AppCompatDelegateImplV7.this, paramf, true);
        }
        return;
      }
      AppCompatDelegateImplV7.a(AppCompatDelegateImplV7.this, paramf, paramBoolean);
    }
    
    public final boolean d(android.support.v7.view.menu.f paramf)
    {
      if ((paramf == null) && (AppCompatDelegateImplV7.this.Ei))
      {
        Window.Callback localCallback = AppCompatDelegateImplV7.this.CS.getCallback();
        if ((localCallback != null) && (!AppCompatDelegateImplV7.this.En)) {
          localCallback.onMenuOpened(108, paramf);
        }
      }
      return true;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/app/AppCompatDelegateImplV7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */