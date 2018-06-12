package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.am;
import android.support.v4.view.an;
import android.support.v4.view.ao;
import android.support.v4.view.z;
import android.support.v7.a.a.a;
import android.support.v7.a.a.f;
import android.support.v7.a.a.k;
import android.support.v7.view.a;
import android.support.v7.view.b;
import android.support.v7.view.b.a;
import android.support.v7.view.g;
import android.support.v7.view.h;
import android.support.v7.view.menu.f;
import android.support.v7.view.menu.f.a;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
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
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class o
  extends ActionBar
  implements ActionBarOverlayLayout.a
{
  private static final Interpolator FN;
  private static final Interpolator FO;
  private static final boolean FP;
  private Context FQ;
  private ActionBarOverlayLayout FR;
  private ActionBarContainer FS;
  private ActionBarContextView FT;
  private View FU;
  private android.support.v7.widget.ai FV;
  private int FW = -1;
  private boolean FX;
  a FY;
  b FZ;
  private u Fs;
  private boolean Fw;
  private ArrayList<Object> Fx = new ArrayList();
  b.a Ga;
  private boolean Gb;
  private int Gc = 0;
  private boolean Gd = true;
  private boolean Ge;
  private boolean Gf;
  private boolean Gg;
  private boolean Gh = true;
  private h Gi;
  private boolean Gj;
  boolean Gk;
  final am Gl = new an()
  {
    public final void q(View paramAnonymousView)
    {
      if ((o.a(o.this)) && (o.b(o.this) != null))
      {
        z.c(o.b(o.this), 0.0F);
        z.c(o.c(o.this), 0.0F);
      }
      o.c(o.this).setVisibility(8);
      o.c(o.this).setTransitioning(false);
      o.d(o.this);
      paramAnonymousView = o.this;
      if (paramAnonymousView.Ga != null)
      {
        paramAnonymousView.Ga.a(paramAnonymousView.FZ);
        paramAnonymousView.FZ = null;
        paramAnonymousView.Ga = null;
      }
      if (o.e(o.this) != null) {
        z.Y(o.e(o.this));
      }
    }
  };
  final am Gm = new an()
  {
    public final void q(View paramAnonymousView)
    {
      o.d(o.this);
      o.c(o.this).requestLayout();
    }
  };
  final ao Gn = new ao()
  {
    public final void cn()
    {
      ((View)o.c(o.this).getParent()).invalidate();
    }
  };
  private ArrayList<Object> hk = new ArrayList();
  private Activity mActivity;
  private Context mContext;
  private Dialog nt;
  
  static
  {
    boolean bool2 = true;
    if (!o.class.desiredAssertionStatus())
    {
      bool1 = true;
      $assertionsDisabled = bool1;
      FN = new AccelerateInterpolator();
      FO = new DecelerateInterpolator();
      if (Build.VERSION.SDK_INT < 14) {
        break label56;
      }
    }
    label56:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      FP = bool1;
      return;
      bool1 = false;
      break;
    }
  }
  
  public o(Activity paramActivity, boolean paramBoolean)
  {
    this.mActivity = paramActivity;
    paramActivity = paramActivity.getWindow().getDecorView();
    aI(paramActivity);
    if (!paramBoolean) {
      this.FU = paramActivity.findViewById(16908290);
    }
  }
  
  public o(Dialog paramDialog)
  {
    this.nt = paramDialog;
    aI(paramDialog.getWindow().getDecorView());
  }
  
  private void F(boolean paramBoolean)
  {
    boolean bool = true;
    this.Gb = paramBoolean;
    int i;
    label50:
    label83:
    Object localObject;
    if (!this.Gb)
    {
      this.Fs.a(null);
      this.FS.setTabContainer(this.FV);
      if (this.Fs.getNavigationMode() != 2) {
        break label160;
      }
      i = 1;
      if (this.FV != null)
      {
        if (i == 0) {
          break label165;
        }
        this.FV.setVisibility(0);
        if (this.FR != null) {
          z.Y(this.FR);
        }
      }
      localObject = this.Fs;
      if ((this.Gb) || (i == 0)) {
        break label177;
      }
      paramBoolean = true;
      label102:
      ((u)localObject).setCollapsible(paramBoolean);
      localObject = this.FR;
      if ((this.Gb) || (i == 0)) {
        break label182;
      }
    }
    label160:
    label165:
    label177:
    label182:
    for (paramBoolean = bool;; paramBoolean = false)
    {
      ((ActionBarOverlayLayout)localObject).setHasNonEmbeddedTabs(paramBoolean);
      return;
      this.FS.setTabContainer(null);
      this.Fs.a(this.FV);
      break;
      i = 0;
      break label50;
      this.FV.setVisibility(8);
      break label83;
      paramBoolean = false;
      break label102;
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
          break label271;
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
        ((android.support.v4.view.ai)localObject2).a(this.Gn);
        ((h)localObject1).g((android.support.v4.view.ai)localObject2);
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
        if (this.FR != null) {
          z.Y(this.FR);
        }
      }
    }
    label271:
    while (!this.Gh) {
      for (;;)
      {
        return;
        z.d(this.FS, 1.0F);
        z.c(this.FS, 0.0F);
        if ((this.Gd) && (this.FU != null)) {
          z.c(this.FU, 0.0F);
        }
        this.Gm.q(null);
      }
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
        Object tmp420_418 = localObject2;
        tmp420_418[0] = 0;
        Object tmp424_420 = tmp420_418;
        tmp424_420[1] = 0;
        tmp424_420;
        this.FS.getLocationInWindow((int[])localObject2);
        f1 = f2 - localObject2[1];
      }
      localObject2 = z.U(this.FS).v(f1);
      ((android.support.v4.view.ai)localObject2).a(this.Gn);
      ((h)localObject1).g((android.support.v4.view.ai)localObject2);
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
  
  private void aI(View paramView)
  {
    this.FR = ((ActionBarOverlayLayout)paramView.findViewById(a.f.decor_content_parent));
    if (this.FR != null) {
      this.FR.setActionBarVisibilityCallback(this);
    }
    Object localObject = paramView.findViewById(a.f.action_bar);
    if ((localObject instanceof u)) {}
    for (localObject = (u)localObject;; localObject = ((Toolbar)localObject).getWrapper())
    {
      this.Fs = ((u)localObject);
      this.FT = ((ActionBarContextView)paramView.findViewById(a.f.action_context_bar));
      this.FS = ((ActionBarContainer)paramView.findViewById(a.f.action_bar_container));
      if ((this.Fs != null) && (this.FT != null) && (this.FS != null)) {
        break label199;
      }
      throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
      if (!(localObject instanceof Toolbar)) {
        break;
      }
    }
    if ("Can't make a decor toolbar out of " + localObject != null) {}
    for (paramView = localObject.getClass().getSimpleName();; paramView = "null") {
      throw new IllegalStateException(paramView);
    }
    label199:
    this.mContext = this.Fs.getContext();
    if ((this.Fs.getDisplayOptions() & 0x4) != 0) {}
    for (int i = 1;; i = 0)
    {
      if (i != 0) {
        this.FX = true;
      }
      paramView = a.R(this.mContext);
      paramView.ds();
      F(paramView.dr());
      paramView = this.mContext.obtainStyledAttributes(null, a.k.ActionBar, a.a.actionBarStyle, 0);
      if (!paramView.getBoolean(a.k.ActionBar_hideOnContentScroll, false)) {
        break label324;
      }
      if (this.FR.JV) {
        break;
      }
      throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }
    this.Gk = true;
    this.FR.setHideOnContentScrollEnabled(true);
    label324:
    i = paramView.getDimensionPixelSize(a.k.ActionBar_elevation, 0);
    if (i != 0) {
      setElevation(i);
    }
    paramView.recycle();
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
    android.support.v4.view.ai localai1;
    android.support.v4.view.ai localai2;
    if (paramBoolean)
    {
      if (!this.Gg)
      {
        this.Gg = true;
        if (this.FR != null) {
          this.FR.setShowingForActionMode(true);
        }
        H(false);
      }
      if (!paramBoolean) {
        break label124;
      }
      localai1 = this.Fs.c(4, 100L);
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
      if (this.FR != null) {
        this.FR.setShowingForActionMode(false);
      }
      H(false);
      break;
      label124:
      localai2 = this.Fs.c(0, 200L);
      localai1 = this.FT.c(8, 100L);
    }
  }
  
  public final b a(b.a parama)
  {
    if (this.FY != null) {
      this.FY.finish();
    }
    this.FR.setHideOnContentScrollEnabled(false);
    this.FT.ec();
    parama = new a(this.FT.getContext(), parama);
    if (parama.dq())
    {
      parama.invalidate();
      this.FT.c(parama);
      I(true);
      this.FT.sendAccessibilityEvent(32);
      this.FY = parama;
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
    return (this.Gh) && ((i == 0) || (this.FR.getActionBarHideOffset() < i));
  }
  
  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    F(a.R(this.mContext).dr());
  }
  
  public final void onWindowVisibilityChanged(int paramInt)
  {
    this.Gc = paramInt;
  }
  
  public final boolean requestFocus()
  {
    ViewGroup localViewGroup = this.Fs.eQ();
    if ((localViewGroup != null) && (!localViewGroup.hasFocus()))
    {
      localViewGroup.requestFocus();
      return true;
    }
    return false;
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
      o.this.Im = 1;
      this.bq = o.this;
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
      o.h(o.this).showOverflowMenu();
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
      if (o.this.FY != this) {
        return;
      }
      if (!o.e(o.f(o.this), o.g(o.this)))
      {
        o.this.FZ = this;
        o.this.Ga = this.Gq;
      }
      for (;;)
      {
        this.Gq = null;
        o.this.I(false);
        o.h(o.this).eb();
        o.i(o.this).eQ().sendAccessibilityEvent(32);
        o.e(o.this).setHideOnContentScrollEnabled(o.this.Gk);
        o.this.FY = null;
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
      return o.h(o.this).getSubtitle();
    }
    
    public final CharSequence getTitle()
    {
      return o.h(o.this).getTitle();
    }
    
    public final void invalidate()
    {
      if (o.this.FY != this) {
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
      return o.h(o.this).JL;
    }
    
    public final void setCustomView(View paramView)
    {
      o.h(o.this).setCustomView(paramView);
      this.Gr = new WeakReference(paramView);
    }
    
    public final void setSubtitle(int paramInt)
    {
      setSubtitle(o.j(o.this).getResources().getString(paramInt));
    }
    
    public final void setSubtitle(CharSequence paramCharSequence)
    {
      o.h(o.this).setSubtitle(paramCharSequence);
    }
    
    public final void setTitle(int paramInt)
    {
      setTitle(o.j(o.this).getResources().getString(paramInt));
    }
    
    public final void setTitle(CharSequence paramCharSequence)
    {
      o.h(o.this).setTitle(paramCharSequence);
    }
    
    public final void setTitleOptionalHint(boolean paramBoolean)
    {
      super.setTitleOptionalHint(paramBoolean);
      o.h(o.this).setTitleOptional(paramBoolean);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/app/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */