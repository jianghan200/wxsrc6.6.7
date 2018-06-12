package android.support.v7.widget;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.ai;
import android.support.v4.view.am;
import android.support.v4.view.an;
import android.support.v4.view.r;
import android.support.v4.view.s;
import android.support.v4.view.z;
import android.support.v4.widget.q;
import android.support.v7.a.a.a;
import android.support.v7.a.a.f;
import android.support.v7.view.menu.l.a;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window.Callback;

public class ActionBarOverlayLayout
  extends ViewGroup
  implements r, t
{
  static final int[] vA = { a.a.actionBarSize, 16842841 };
  private final s AR;
  private u Fs;
  private boolean Gk;
  private int JP;
  private int JQ = 0;
  private ContentFrameLayout JR;
  private ActionBarContainer JS;
  private Drawable JT;
  private boolean JU;
  public boolean JV;
  private boolean JW;
  private boolean JX;
  private int JY;
  private int JZ;
  private final Rect Ka = new Rect();
  private final Rect Kb = new Rect();
  private final Rect Kc = new Rect();
  private final Rect Kd = new Rect();
  private final Rect Ke = new Rect();
  private final Rect Kf = new Rect();
  private a Kg;
  private final int Kh = 600;
  private q Ki;
  private ai Kj;
  private final am Kk = new an()
  {
    public final void ar(View paramAnonymousView)
    {
      ActionBarOverlayLayout.a(ActionBarOverlayLayout.this, null);
      ActionBarOverlayLayout.a(ActionBarOverlayLayout.this);
    }
    
    public final void q(View paramAnonymousView)
    {
      ActionBarOverlayLayout.a(ActionBarOverlayLayout.this, null);
      ActionBarOverlayLayout.a(ActionBarOverlayLayout.this);
    }
  };
  private final Runnable Kl = new Runnable()
  {
    public final void run()
    {
      ActionBarOverlayLayout.b(ActionBarOverlayLayout.this);
      ActionBarOverlayLayout.a(ActionBarOverlayLayout.this, z.U(ActionBarOverlayLayout.d(ActionBarOverlayLayout.this)).v(0.0F).a(ActionBarOverlayLayout.c(ActionBarOverlayLayout.this)));
    }
  };
  private final Runnable Km = new Runnable()
  {
    public final void run()
    {
      ActionBarOverlayLayout.b(ActionBarOverlayLayout.this);
      ActionBarOverlayLayout.a(ActionBarOverlayLayout.this, z.U(ActionBarOverlayLayout.d(ActionBarOverlayLayout.this)).v(-ActionBarOverlayLayout.d(ActionBarOverlayLayout.this).getHeight()).a(ActionBarOverlayLayout.c(ActionBarOverlayLayout.this)));
    }
  };
  
  public ActionBarOverlayLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext);
    this.AR = new s(this);
  }
  
  private static boolean a(View paramView, Rect paramRect, boolean paramBoolean)
  {
    boolean bool = false;
    paramView = (LayoutParams)paramView.getLayoutParams();
    if (paramView.leftMargin != paramRect.left)
    {
      paramView.leftMargin = paramRect.left;
      bool = true;
    }
    if (paramView.topMargin != paramRect.top)
    {
      paramView.topMargin = paramRect.top;
      bool = true;
    }
    if (paramView.rightMargin != paramRect.right)
    {
      paramView.rightMargin = paramRect.right;
      bool = true;
    }
    if ((paramBoolean) && (paramView.bottomMargin != paramRect.bottom))
    {
      paramView.bottomMargin = paramRect.bottom;
      return true;
    }
    return bool;
  }
  
  private void ed()
  {
    if (this.JR == null)
    {
      this.JR = ((ContentFrameLayout)findViewById(a.f.action_bar_activity_content));
      this.JS = ((ActionBarContainer)findViewById(a.f.action_bar_container));
      localObject = findViewById(a.f.action_bar);
      if (!(localObject instanceof u)) {
        break label61;
      }
    }
    for (Object localObject = (u)localObject;; localObject = ((Toolbar)localObject).getWrapper())
    {
      this.Fs = ((u)localObject);
      return;
      label61:
      if (!(localObject instanceof Toolbar)) {
        break;
      }
    }
    throw new IllegalStateException("Can't make a decor toolbar out of " + localObject.getClass().getSimpleName());
  }
  
  private void ee()
  {
    removeCallbacks(this.Kl);
    removeCallbacks(this.Km);
    if (this.Kj != null) {
      this.Kj.cancel();
    }
  }
  
  private void init(Context paramContext)
  {
    boolean bool2 = true;
    TypedArray localTypedArray = getContext().getTheme().obtainStyledAttributes(vA);
    this.JP = localTypedArray.getDimensionPixelSize(0, 0);
    this.JT = localTypedArray.getDrawable(1);
    if (this.JT == null)
    {
      bool1 = true;
      setWillNotDraw(bool1);
      localTypedArray.recycle();
      if (paramContext.getApplicationInfo().targetSdkVersion >= 19) {
        break label91;
      }
    }
    label91:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.JU = bool1;
      this.Ki = q.a(paramContext, null);
      return;
      bool1 = false;
      break;
    }
  }
  
  public final void a(Menu paramMenu, l.a parama)
  {
    ed();
    this.Fs.a(paramMenu, parama);
  }
  
  public final void aJ(int paramInt)
  {
    ed();
    switch (paramInt)
    {
    case 2: 
    case 5: 
    default: 
      return;
    }
    setOverlayMode(true);
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof LayoutParams;
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    if ((this.JT != null) && (!this.JU)) {
      if (this.JS.getVisibility() != 0) {
        break label82;
      }
    }
    label82:
    for (int i = (int)(this.JS.getBottom() + z.R(this.JS) + 0.5F);; i = 0)
    {
      this.JT.setBounds(0, i, getWidth(), this.JT.getIntrinsicHeight() + i);
      this.JT.draw(paramCanvas);
      return;
    }
  }
  
  public final boolean ef()
  {
    ed();
    return this.Fs.ef();
  }
  
  public final boolean eg()
  {
    ed();
    return this.Fs.eg();
  }
  
  public final void eh()
  {
    ed();
    this.Fs.eh();
  }
  
  public final void ei()
  {
    ed();
    this.Fs.dismissPopupMenus();
  }
  
  protected boolean fitSystemWindows(Rect paramRect)
  {
    ed();
    z.X(this);
    boolean bool = a(this.JS, paramRect, false);
    this.Kd.set(paramRect);
    at.a(this, this.Kd, this.Ka);
    if (!this.Kb.equals(this.Ka))
    {
      this.Kb.set(this.Ka);
      bool = true;
    }
    if (bool) {
      requestLayout();
    }
    return true;
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return new LayoutParams(paramLayoutParams);
  }
  
  public int getActionBarHideOffset()
  {
    if (this.JS != null) {
      return -(int)z.R(this.JS);
    }
    return 0;
  }
  
  public int getNestedScrollAxes()
  {
    return this.AR.uX;
  }
  
  public CharSequence getTitle()
  {
    ed();
    return this.Fs.getTitle();
  }
  
  public final boolean hideOverflowMenu()
  {
    ed();
    return this.Fs.hideOverflowMenu();
  }
  
  public final boolean isOverflowMenuShowing()
  {
    ed();
    return this.Fs.isOverflowMenuShowing();
  }
  
  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    if (Build.VERSION.SDK_INT >= 8) {
      super.onConfigurationChanged(paramConfiguration);
    }
    init(getContext());
    z.Y(this);
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    ee();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt2 = getChildCount();
    paramInt3 = getPaddingLeft();
    getPaddingRight();
    paramInt4 = getPaddingTop();
    getPaddingBottom();
    paramInt1 = 0;
    while (paramInt1 < paramInt2)
    {
      View localView = getChildAt(paramInt1);
      if (localView.getVisibility() != 8)
      {
        LayoutParams localLayoutParams = (LayoutParams)localView.getLayoutParams();
        int i = localView.getMeasuredWidth();
        int j = localView.getMeasuredHeight();
        int k = localLayoutParams.leftMargin + paramInt3;
        int m = localLayoutParams.topMargin + paramInt4;
        localView.layout(k, m, i + k, j + m);
      }
      paramInt1 += 1;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    ed();
    measureChildWithMargins(this.JS, paramInt1, 0, paramInt2, 0);
    Object localObject = (LayoutParams)this.JS.getLayoutParams();
    int i1 = Math.max(0, this.JS.getMeasuredWidth() + ((LayoutParams)localObject).leftMargin + ((LayoutParams)localObject).rightMargin);
    int i = this.JS.getMeasuredHeight();
    int j = ((LayoutParams)localObject).topMargin;
    int n = Math.max(0, ((LayoutParams)localObject).bottomMargin + (i + j));
    int m = at.combineMeasuredStates(0, z.M(this.JS));
    int k;
    if ((z.X(this) & 0x100) != 0)
    {
      j = 1;
      if (j == 0) {
        break label444;
      }
      k = this.JP;
      i = k;
      if (this.JW)
      {
        i = k;
        if (this.JS.getTabContainer() != null) {
          i = k + this.JP;
        }
      }
    }
    for (;;)
    {
      label153:
      this.Kc.set(this.Ka);
      this.Ke.set(this.Kd);
      if ((!this.JV) && (j == 0))
      {
        localObject = this.Kc;
        ((Rect)localObject).top = (i + ((Rect)localObject).top);
        localObject = this.Kc;
      }
      for (((Rect)localObject).bottom += 0;; ((Rect)localObject).bottom += 0)
      {
        a(this.JR, this.Kc, true);
        if (!this.Kf.equals(this.Ke))
        {
          this.Kf.set(this.Ke);
          this.JR.g(this.Ke);
        }
        measureChildWithMargins(this.JR, paramInt1, 0, paramInt2, 0);
        localObject = (LayoutParams)this.JR.getLayoutParams();
        i = Math.max(i1, this.JR.getMeasuredWidth() + ((LayoutParams)localObject).leftMargin + ((LayoutParams)localObject).rightMargin);
        j = this.JR.getMeasuredHeight();
        k = ((LayoutParams)localObject).topMargin;
        j = Math.max(n, ((LayoutParams)localObject).bottomMargin + (j + k));
        k = at.combineMeasuredStates(m, z.M(this.JR));
        m = getPaddingLeft();
        n = getPaddingRight();
        j = Math.max(j + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight());
        setMeasuredDimension(z.resolveSizeAndState(Math.max(i + (m + n), getSuggestedMinimumWidth()), paramInt1, k), z.resolveSizeAndState(j, paramInt2, k << 16));
        return;
        j = 0;
        break;
        label444:
        if (this.JS.getVisibility() == 8) {
          break label506;
        }
        i = this.JS.getMeasuredHeight();
        break label153;
        localObject = this.Ke;
        ((Rect)localObject).top = (i + ((Rect)localObject).top);
        localObject = this.Ke;
      }
      label506:
      i = 0;
    }
  }
  
  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    int i = 0;
    if ((!this.Gk) || (!paramBoolean)) {
      return false;
    }
    this.Ki.b(0, 0, (int)paramFloat2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
    if (this.Ki.getFinalY() > this.JS.getHeight()) {
      i = 1;
    }
    if (i != 0)
    {
      ee();
      this.Km.run();
    }
    for (;;)
    {
      this.JX = true;
      return true;
      ee();
      this.Kl.run();
    }
  }
  
  public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2)
  {
    return false;
  }
  
  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt) {}
  
  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.JY += paramInt2;
    setActionBarHideOffset(this.JY);
  }
  
  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt)
  {
    this.AR.uX = paramInt;
    this.JY = getActionBarHideOffset();
    ee();
    if (this.Kg != null) {
      this.Kg.dp();
    }
  }
  
  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt)
  {
    if (((paramInt & 0x2) == 0) || (this.JS.getVisibility() != 0)) {
      return false;
    }
    return this.Gk;
  }
  
  public void onStopNestedScroll(View paramView)
  {
    if ((this.Gk) && (!this.JX))
    {
      if (this.JY <= this.JS.getHeight())
      {
        ee();
        postDelayed(this.Kl, 600L);
      }
    }
    else {
      return;
    }
    ee();
    postDelayed(this.Km, 600L);
  }
  
  public void onWindowSystemUiVisibilityChanged(int paramInt)
  {
    boolean bool = true;
    if (Build.VERSION.SDK_INT >= 16) {
      super.onWindowSystemUiVisibilityChanged(paramInt);
    }
    ed();
    int k = this.JZ;
    this.JZ = paramInt;
    int i;
    int j;
    if ((paramInt & 0x4) == 0)
    {
      i = 1;
      if ((paramInt & 0x100) == 0) {
        break label120;
      }
      j = 1;
      label49:
      if (this.Kg != null)
      {
        a locala = this.Kg;
        if (j != 0) {
          break label125;
        }
        label66:
        locala.G(bool);
        if ((i == 0) && (j != 0)) {
          break label131;
        }
        this.Kg.dn();
      }
    }
    for (;;)
    {
      if ((((k ^ paramInt) & 0x100) != 0) && (this.Kg != null)) {
        z.Y(this);
      }
      return;
      i = 0;
      break;
      label120:
      j = 0;
      break label49;
      label125:
      bool = false;
      break label66;
      label131:
      this.Kg.jdMethod_do();
    }
  }
  
  protected void onWindowVisibilityChanged(int paramInt)
  {
    super.onWindowVisibilityChanged(paramInt);
    this.JQ = paramInt;
    if (this.Kg != null) {
      this.Kg.onWindowVisibilityChanged(paramInt);
    }
  }
  
  public void setActionBarHideOffset(int paramInt)
  {
    ee();
    paramInt = Math.max(0, Math.min(paramInt, this.JS.getHeight()));
    z.c(this.JS, -paramInt);
  }
  
  public void setActionBarVisibilityCallback(a parama)
  {
    this.Kg = parama;
    if (getWindowToken() != null)
    {
      this.Kg.onWindowVisibilityChanged(this.JQ);
      if (this.JZ != 0)
      {
        onWindowSystemUiVisibilityChanged(this.JZ);
        z.Y(this);
      }
    }
  }
  
  public void setHasNonEmbeddedTabs(boolean paramBoolean)
  {
    this.JW = paramBoolean;
  }
  
  public void setHideOnContentScrollEnabled(boolean paramBoolean)
  {
    if (paramBoolean != this.Gk)
    {
      this.Gk = paramBoolean;
      if (!paramBoolean)
      {
        ee();
        setActionBarHideOffset(0);
      }
    }
  }
  
  public void setIcon(int paramInt)
  {
    ed();
    this.Fs.setIcon(paramInt);
  }
  
  public void setIcon(Drawable paramDrawable)
  {
    ed();
    this.Fs.setIcon(paramDrawable);
  }
  
  public void setLogo(int paramInt)
  {
    ed();
    this.Fs.setLogo(paramInt);
  }
  
  public void setOverlayMode(boolean paramBoolean)
  {
    this.JV = paramBoolean;
    if ((paramBoolean) && (getContext().getApplicationInfo().targetSdkVersion < 19)) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      this.JU = paramBoolean;
      return;
    }
  }
  
  public void setShowingForActionMode(boolean paramBoolean) {}
  
  public void setUiOptions(int paramInt) {}
  
  public void setWindowCallback(Window.Callback paramCallback)
  {
    ed();
    this.Fs.setWindowCallback(paramCallback);
  }
  
  public void setWindowTitle(CharSequence paramCharSequence)
  {
    ed();
    this.Fs.setWindowTitle(paramCharSequence);
  }
  
  public boolean shouldDelayChildPressedState()
  {
    return false;
  }
  
  public final boolean showOverflowMenu()
  {
    ed();
    return this.Fs.showOverflowMenu();
  }
  
  public static class LayoutParams
    extends ViewGroup.MarginLayoutParams
  {
    public LayoutParams()
    {
      super(-1);
    }
    
    public LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
    }
    
    public LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
  }
  
  public static abstract interface a
  {
    public abstract void G(boolean paramBoolean);
    
    public abstract void dn();
    
    public abstract void jdMethod_do();
    
    public abstract void dp();
    
    public abstract void onWindowVisibilityChanged(int paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/ActionBarOverlayLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */