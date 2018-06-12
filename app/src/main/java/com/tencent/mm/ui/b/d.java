package com.tencent.mm.ui.b;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.ai;
import android.support.v4.view.am;
import android.support.v4.view.an;
import android.support.v4.view.ao;
import android.support.v4.view.z;
import android.support.v7.a.a.a;
import android.support.v7.a.a.f;
import android.support.v7.a.a.k;
import android.support.v7.app.ActionBar;
import android.support.v7.view.b;
import android.support.v7.view.b.a;
import android.support.v7.view.g;
import android.support.v7.view.h;
import android.support.v7.view.menu.f;
import android.support.v7.view.menu.f.a;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout.a;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.u;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class d
  extends ActionBar
  implements ActionBarOverlayLayout.a
{
  private static final Interpolator FN = new AccelerateInterpolator();
  private static final Interpolator FO = new DecelerateInterpolator();
  private static final boolean FP;
  private Context FQ;
  private ActionBarContainer FS;
  private ActionBarContextView FT;
  private View FU;
  private boolean FX;
  b FZ;
  u Fs;
  private boolean Fw;
  private ArrayList<Object> Fx = new ArrayList();
  b.a Ga;
  private int Gc = 0;
  private boolean Gd = true;
  private boolean Ge;
  private boolean Gf;
  private boolean Gg;
  private boolean Gh = true;
  private h Gi;
  private boolean Gj;
  final am Gl = new an()
  {
    public final void q(View paramAnonymousView)
    {
      if ((d.a(d.this)) && (d.b(d.this) != null))
      {
        z.c(d.b(d.this), 0.0F);
        z.c(d.c(d.this), 0.0F);
      }
      d.c(d.this).setVisibility(8);
      d.c(d.this).setTransitioning(false);
      d.d(d.this);
      paramAnonymousView = d.this;
      if (paramAnonymousView.Ga != null)
      {
        paramAnonymousView.Ga.a(paramAnonymousView.FZ);
        paramAnonymousView.FZ = null;
        paramAnonymousView.Ga = null;
      }
    }
  };
  final am Gm = new an()
  {
    public final void q(View paramAnonymousView)
    {
      d.d(d.this);
      d.c(d.this).requestLayout();
    }
  };
  final ao Gn = new ao()
  {
    public final void cn()
    {
      ((View)d.c(d.this).getParent()).invalidate();
    }
  };
  private Activity mActivity;
  private Context mContext;
  a tra;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 14) {}
    for (boolean bool = true;; bool = false)
    {
      FP = bool;
      return;
    }
  }
  
  public d(Activity paramActivity, ViewGroup paramViewGroup)
  {
    this.mActivity = paramActivity;
    paramActivity = paramViewGroup.findViewById(a.f.action_bar);
    if ((paramActivity instanceof u)) {}
    for (paramActivity = (u)paramActivity;; paramActivity = ((Toolbar)paramActivity).getWrapper())
    {
      this.Fs = paramActivity;
      this.FT = ((ActionBarContextView)paramViewGroup.findViewById(a.f.action_context_bar));
      this.FS = ((ActionBarContainer)paramViewGroup.findViewById(a.f.action_bar_container));
      if ((this.Fs != null) && (this.FT != null) && (this.FS != null)) {
        break label238;
      }
      throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
      if (!(paramActivity instanceof Toolbar)) {
        break;
      }
    }
    if ("Can't make a decor toolbar out of " + paramActivity != null) {}
    for (paramActivity = paramActivity.getClass().getSimpleName();; paramActivity = "null") {
      throw new IllegalStateException(paramActivity);
    }
    label238:
    this.mContext = this.Fs.getContext();
    if ((this.Fs.getDisplayOptions() & 0x4) != 0) {}
    for (int i = 1;; i = 0)
    {
      if (i != 0) {
        this.FX = true;
      }
      android.support.v7.view.a.R(this.mContext).ds();
      paramActivity = this.mContext.obtainStyledAttributes(null, a.k.ActionBar, a.a.actionBarStyle, 0);
      paramActivity.getBoolean(a.k.ActionBar_hideOnContentScroll, false);
      i = paramActivity.getDimensionPixelSize(a.k.ActionBar_elevation, 0);
      if (i != 0) {
        setElevation(i);
      }
      paramActivity.recycle();
      this.FU = null;
      return;
    }
  }
  
  private void H(boolean paramBoolean)
  {
    float f2;
    float f1;
    Object localObject1;
    Object localObject2;
    if (d(this.Ge, this.Gf, this.Gg)) {
      if (!this.Gh)
      {
        this.Gh = true;
        if (this.Gi != null) {
          this.Gi.cancel();
        }
        this.FS.setVisibility(0);
        if ((this.Gc != 0) || (!FP) || ((!this.Gj) && (!paramBoolean))) {
          break label257;
        }
        z.c(this.FS, 0.0F);
        f2 = -this.FS.getHeight();
        f1 = f2;
        if (paramBoolean)
        {
          localObject1 = new int[2];
          Object tmp107_105 = localObject1;
          tmp107_105[0] = 0;
          Object tmp111_107 = tmp107_105;
          tmp111_107[1] = 0;
          tmp111_107;
          this.FS.getLocationInWindow((int[])localObject1);
          f1 = f2 - localObject1[1];
        }
        z.c(this.FS, f1);
        localObject1 = new h();
        localObject2 = z.U(this.FS).v(0.0F);
        ((ai)localObject2).a(this.Gn);
        ((h)localObject1).g((ai)localObject2);
        if ((this.Gd) && (this.FU != null))
        {
          z.c(this.FU, f1);
          ((h)localObject1).g(z.U(this.FU).v(0.0F));
        }
        ((h)localObject1).d(FO);
        ((h)localObject1).dx();
        ((h)localObject1).b(this.Gm);
        this.Gi = ((h)localObject1);
        ((h)localObject1).start();
      }
    }
    label257:
    while (!this.Gh)
    {
      return;
      z.d(this.FS, 1.0F);
      z.c(this.FS, 0.0F);
      if ((this.Gd) && (this.FU != null)) {
        z.c(this.FU, 0.0F);
      }
      this.Gm.q(null);
      return;
    }
    this.Gh = false;
    if (this.Gi != null) {
      this.Gi.cancel();
    }
    if ((this.Gc == 0) && (FP) && ((this.Gj) || (paramBoolean)))
    {
      z.d(this.FS, 1.0F);
      this.FS.setTransitioning(true);
      localObject1 = new h();
      f2 = -this.FS.getHeight();
      f1 = f2;
      if (paramBoolean)
      {
        localObject2 = new int[2];
        Object tmp404_402 = localObject2;
        tmp404_402[0] = 0;
        Object tmp408_404 = tmp404_402;
        tmp408_404[1] = 0;
        tmp408_404;
        this.FS.getLocationInWindow((int[])localObject2);
        f1 = f2 - localObject2[1];
      }
      localObject2 = z.U(this.FS).v(f1);
      ((ai)localObject2).a(this.Gn);
      ((h)localObject1).g((ai)localObject2);
      if ((this.Gd) && (this.FU != null)) {
        ((h)localObject1).g(z.U(this.FU).v(f1));
      }
      ((h)localObject1).d(FN);
      ((h)localObject1).dx();
      ((h)localObject1).b(this.Gl);
      this.Gi = ((h)localObject1);
      ((h)localObject1).start();
      return;
    }
    this.Gl.q(null);
  }
  
  private static boolean d(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if (paramBoolean3) {}
    while ((!paramBoolean1) && (!paramBoolean2)) {
      return true;
    }
    return false;
  }
  
  private void setDisplayOptions(int paramInt1, int paramInt2)
  {
    int i = this.Fs.getDisplayOptions();
    if ((paramInt2 & 0x4) != 0) {
      this.FX = true;
    }
    this.Fs.setDisplayOptions(i & (paramInt2 ^ 0xFFFFFFFF) | paramInt1 & paramInt2);
  }
  
  public final void C(boolean paramBoolean)
  {
    if (!this.FX) {
      setDisplayHomeAsUpEnabled(paramBoolean);
    }
  }
  
  public final void D(boolean paramBoolean)
  {
    this.Gj = paramBoolean;
    if ((!paramBoolean) && (this.Gi != null)) {
      this.Gi.cancel();
    }
  }
  
  public final void E(boolean paramBoolean)
  {
    if (paramBoolean == this.Fw) {}
    for (;;)
    {
      return;
      this.Fw = paramBoolean;
      int j = this.Fx.size();
      int i = 0;
      while (i < j)
      {
        this.Fx.get(i);
        i += 1;
      }
    }
  }
  
  public final void G(boolean paramBoolean)
  {
    this.Gd = paramBoolean;
  }
  
  public final void I(boolean paramBoolean)
  {
    ai localai1;
    ai localai2;
    if (paramBoolean)
    {
      if (!this.Gg)
      {
        this.Gg = true;
        H(false);
      }
      if (!paramBoolean) {
        break label95;
      }
      localai1 = this.Fs.c(8, 100L);
      localai2 = this.FT.c(0, 200L);
    }
    for (;;)
    {
      h localh = new h();
      localh.a(localai1, localai2);
      localh.start();
      return;
      if (!this.Gg) {
        break;
      }
      this.Gg = false;
      H(false);
      break;
      label95:
      localai2 = this.Fs.c(0, 200L);
      localai1 = this.FT.c(8, 100L);
    }
  }
  
  public final b a(b.a parama)
  {
    if (this.tra != null) {
      this.tra.finish();
    }
    this.FT.ec();
    parama = new a(this.FT.getContext(), parama);
    if (parama.dq())
    {
      parama.invalidate();
      this.FT.c(parama);
      I(true);
      this.FT.sendAccessibilityEvent(32);
      this.tra = parama;
      return parama;
    }
    return null;
  }
  
  public final void cZ()
  {
    setDisplayOptions(0, 2);
  }
  
  public final boolean collapseActionView()
  {
    if ((this.Fs != null) && (this.Fs.hasExpandedActionView()))
    {
      this.Fs.collapseActionView();
      return true;
    }
    return false;
  }
  
  public final void da()
  {
    setDisplayOptions(0, 8);
  }
  
  public final void db()
  {
    setDisplayOptions(16, 16);
  }
  
  public final void dn()
  {
    if (this.Gf)
    {
      this.Gf = false;
      H(true);
    }
  }
  
  public final void jdMethod_do()
  {
    if (!this.Gf)
    {
      this.Gf = true;
      H(true);
    }
  }
  
  public final void dp()
  {
    if (this.Gi != null)
    {
      this.Gi.cancel();
      this.Gi = null;
    }
  }
  
  public final View getCustomView()
  {
    return this.Fs.getCustomView();
  }
  
  public final int getDisplayOptions()
  {
    return this.Fs.getDisplayOptions();
  }
  
  public final int getHeight()
  {
    return this.FS.getHeight();
  }
  
  public final Context getThemedContext()
  {
    int i;
    if (this.FQ == null)
    {
      TypedValue localTypedValue = new TypedValue();
      this.mContext.getTheme().resolveAttribute(a.a.actionBarWidgetTheme, localTypedValue, true);
      i = localTypedValue.resourceId;
      if (i == 0) {
        break label61;
      }
    }
    label61:
    for (this.FQ = new ContextThemeWrapper(this.mContext, i);; this.FQ = this.mContext) {
      return this.FQ;
    }
  }
  
  public final CharSequence getTitle()
  {
    return this.Fs.getTitle();
  }
  
  public final void hide()
  {
    if (!this.Ge)
    {
      this.Ge = true;
      H(false);
    }
  }
  
  public final boolean isShowing()
  {
    int i = this.FS.getHeight();
    return (this.Gh) && ((i == 0) || (i > 0));
  }
  
  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    paramConfiguration = this.Fs.eQ().getLayoutParams();
    if (paramConfiguration != null) {
      paramConfiguration.height = com.tencent.mm.compatible.util.a.i(this.mActivity);
    }
    this.Fs.eQ().setLayoutParams(paramConfiguration);
  }
  
  public final void onWindowVisibilityChanged(int paramInt)
  {
    this.Gc = paramInt;
  }
  
  public final void setBackgroundDrawable(Drawable paramDrawable)
  {
    this.FS.setPrimaryBackground(paramDrawable);
  }
  
  public final void setCustomView(int paramInt)
  {
    setCustomView(LayoutInflater.from(getThemedContext()).inflate(paramInt, this.Fs.eQ(), false));
  }
  
  public final void setCustomView(View paramView)
  {
    this.Fs.setCustomView(paramView);
  }
  
  public final void setDisplayHomeAsUpEnabled(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i = 4;; i = 0)
    {
      setDisplayOptions(i, 4);
      return;
    }
  }
  
  public final void setDisplayOptions(int paramInt)
  {
    if ((paramInt & 0x4) != 0) {
      this.FX = true;
    }
    this.Fs.setDisplayOptions(paramInt);
  }
  
  public final void setElevation(float paramFloat)
  {
    z.g(this.FS, paramFloat);
  }
  
  public final void setHomeActionContentDescription(int paramInt)
  {
    this.Fs.setNavigationContentDescription(paramInt);
  }
  
  public final void setIcon(int paramInt)
  {
    this.Fs.setIcon(paramInt);
  }
  
  public final void setLogo(Drawable paramDrawable)
  {
    this.Fs.setLogo(paramDrawable);
  }
  
  public final void setWindowTitle(CharSequence paramCharSequence)
  {
    this.Fs.setWindowTitle(paramCharSequence);
  }
  
  public final void show()
  {
    if (this.Ge)
    {
      this.Ge = false;
      H(false);
    }
  }
  
  public final class a
    extends b
    implements f.a
  {
    private final Context Gp;
    private b.a Gq;
    private WeakReference<View> Gr;
    private final f bq;
    
    public a(Context paramContext, b.a parama)
    {
      this.Gp = paramContext;
      this.Gq = parama;
      this$1 = new f(paramContext);
      d.this.Im = 1;
      this.bq = d.this;
      this.bq.a(this);
    }
    
    public final boolean a(f paramf, MenuItem paramMenuItem)
    {
      if (this.Gq != null) {
        return this.Gq.a(this, paramMenuItem);
      }
      return false;
    }
    
    public final void b(f paramf)
    {
      if (this.Gq == null) {
        return;
      }
      invalidate();
      d.g(d.this).showOverflowMenu();
    }
    
    public final boolean dq()
    {
      this.bq.dJ();
      try
      {
        boolean bool = this.Gq.a(this, this.bq);
        return bool;
      }
      finally
      {
        this.bq.dK();
      }
    }
    
    public final void finish()
    {
      if (d.this.tra != this) {
        return;
      }
      if (!d.W(d.e(d.this), d.f(d.this)))
      {
        d.this.FZ = this;
        d.this.Ga = this.Gq;
      }
      for (;;)
      {
        this.Gq = null;
        d.this.I(false);
        d.g(d.this).eb();
        d.h(d.this).eQ().sendAccessibilityEvent(32);
        d.this.tra = null;
        return;
        this.Gq.a(this);
      }
    }
    
    public final View getCustomView()
    {
      if (this.Gr != null) {
        return (View)this.Gr.get();
      }
      return null;
    }
    
    public final Menu getMenu()
    {
      return this.bq;
    }
    
    public final MenuInflater getMenuInflater()
    {
      return new g(this.Gp);
    }
    
    public final CharSequence getSubtitle()
    {
      return d.g(d.this).getSubtitle();
    }
    
    public final CharSequence getTitle()
    {
      return d.g(d.this).getTitle();
    }
    
    public final void invalidate()
    {
      if (d.this.tra != this) {
        return;
      }
      this.bq.dJ();
      try
      {
        this.Gq.b(this, this.bq);
        return;
      }
      finally
      {
        this.bq.dK();
      }
    }
    
    public final boolean isTitleOptional()
    {
      return d.g(d.this).JL;
    }
    
    public final void setCustomView(View paramView)
    {
      d.g(d.this).setCustomView(paramView);
      this.Gr = new WeakReference(paramView);
    }
    
    public final void setSubtitle(int paramInt)
    {
      setSubtitle(d.i(d.this).getResources().getString(paramInt));
    }
    
    public final void setSubtitle(CharSequence paramCharSequence)
    {
      d.g(d.this).setSubtitle(paramCharSequence);
    }
    
    public final void setTitle(int paramInt)
    {
      setTitle(d.i(d.this).getResources().getString(paramInt));
    }
    
    public final void setTitle(CharSequence paramCharSequence)
    {
      d.g(d.this).setTitle(paramCharSequence);
    }
    
    public final void setTitleOptionalHint(boolean paramBoolean)
    {
      super.setTitleOptionalHint(paramBoolean);
      d.g(d.this).setTitleOptional(paramBoolean);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ui/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */