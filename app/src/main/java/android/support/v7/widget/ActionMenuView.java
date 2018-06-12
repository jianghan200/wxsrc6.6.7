package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.view.menu.f;
import android.support.v7.view.menu.f.a;
import android.support.v7.view.menu.f.b;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.l.a;
import android.support.v7.view.menu.m;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;

public class ActionMenuView
  extends LinearLayoutCompat
  implements f.b, m
{
  private Context Jn;
  private int KA;
  private int KP;
  ActionMenuPresenter KQ;
  private l.a KR;
  private f.a KS;
  private boolean KT;
  private int KU;
  private int KV;
  private d KW;
  boolean Kr;
  f bq;
  
  public ActionMenuView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ActionMenuView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setBaselineAligned(false);
    float f = paramContext.getResources().getDisplayMetrics().density;
    this.KA = ((int)(56.0F * f));
    this.KV = ((int)(f * 4.0F));
    this.Jn = paramContext;
    this.KP = 0;
  }
  
  private boolean aK(int paramInt)
  {
    boolean bool2 = false;
    if (paramInt == 0) {
      return false;
    }
    View localView1 = getChildAt(paramInt - 1);
    View localView2 = getChildAt(paramInt);
    boolean bool1 = bool2;
    if (paramInt < getChildCount())
    {
      bool1 = bool2;
      if ((localView1 instanceof a)) {
        bool1 = ((a)localView1).dA() | false;
      }
    }
    if ((paramInt > 0) && ((localView2 instanceof a))) {
      return ((a)localView2).dz() | bool1;
    }
    return bool1;
  }
  
  private LayoutParams c(AttributeSet paramAttributeSet)
  {
    return new LayoutParams(getContext(), paramAttributeSet);
  }
  
  protected static LayoutParams c(ViewGroup.LayoutParams paramLayoutParams)
  {
    if (paramLayoutParams != null)
    {
      if ((paramLayoutParams instanceof LayoutParams)) {}
      for (paramLayoutParams = new LayoutParams((LayoutParams)paramLayoutParams);; paramLayoutParams = new LayoutParams(paramLayoutParams))
      {
        if (paramLayoutParams.gravity <= 0) {
          paramLayoutParams.gravity = 16;
        }
        return paramLayoutParams;
      }
    }
    return en();
  }
  
  static int d(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool2 = false;
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    int i = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt3) - paramInt4, View.MeasureSpec.getMode(paramInt3));
    ActionMenuItemView localActionMenuItemView;
    if ((paramView instanceof ActionMenuItemView))
    {
      localActionMenuItemView = (ActionMenuItemView)paramView;
      if ((localActionMenuItemView == null) || (!localActionMenuItemView.hasText())) {
        break label184;
      }
      paramInt4 = 1;
      label57:
      if ((paramInt2 <= 0) || ((paramInt4 != 0) && (paramInt2 < 2))) {
        break label190;
      }
      paramView.measure(View.MeasureSpec.makeMeasureSpec(paramInt1 * paramInt2, Integer.MIN_VALUE), i);
      int j = paramView.getMeasuredWidth();
      paramInt3 = j / paramInt1;
      paramInt2 = paramInt3;
      if (j % paramInt1 != 0) {
        paramInt2 = paramInt3 + 1;
      }
      paramInt3 = paramInt2;
      if (paramInt4 != 0)
      {
        paramInt3 = paramInt2;
        if (paramInt2 >= 2) {}
      }
    }
    label184:
    label190:
    for (paramInt3 = 2;; paramInt3 = 0)
    {
      boolean bool1 = bool2;
      if (!localLayoutParams.KY)
      {
        bool1 = bool2;
        if (paramInt4 != 0) {
          bool1 = true;
        }
      }
      localLayoutParams.Lb = bool1;
      localLayoutParams.KZ = paramInt3;
      paramView.measure(View.MeasureSpec.makeMeasureSpec(paramInt3 * paramInt1, 1073741824), i);
      return paramInt3;
      localActionMenuItemView = null;
      break;
      paramInt4 = 0;
      break label57;
    }
  }
  
  private static LayoutParams en()
  {
    LayoutParams localLayoutParams = new LayoutParams();
    localLayoutParams.gravity = 16;
    return localLayoutParams;
  }
  
  public static LayoutParams eo()
  {
    LayoutParams localLayoutParams = en();
    localLayoutParams.KY = true;
    return localLayoutParams;
  }
  
  public final void a(f paramf)
  {
    this.bq = paramf;
  }
  
  public final void a(l.a parama, f.a parama1)
  {
    this.KR = parama;
    this.KS = parama1;
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return (paramLayoutParams != null) && ((paramLayoutParams instanceof LayoutParams));
  }
  
  public final void dismissPopupMenus()
  {
    if (this.KQ != null) {
      this.KQ.ek();
    }
  }
  
  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    return false;
  }
  
  public final boolean f(h paramh)
  {
    return this.bq.a(paramh, null, 0);
  }
  
  public Menu getMenu()
  {
    ActionMenuPresenter localActionMenuPresenter;
    if (this.bq == null)
    {
      localObject = getContext();
      this.bq = new f((Context)localObject);
      this.bq.a(new c((byte)0));
      this.KQ = new ActionMenuPresenter((Context)localObject);
      this.KQ.ej();
      localActionMenuPresenter = this.KQ;
      if (this.KR == null) {
        break label109;
      }
    }
    label109:
    for (Object localObject = this.KR;; localObject = new b((byte)0))
    {
      localActionMenuPresenter.bp = ((l.a)localObject);
      this.bq.a(this.KQ, this.Jn);
      this.KQ.a(this);
      return this.bq;
    }
  }
  
  public Drawable getOverflowIcon()
  {
    getMenu();
    ActionMenuPresenter localActionMenuPresenter = this.KQ;
    if (localActionMenuPresenter.Ko != null) {
      return localActionMenuPresenter.Ko.getDrawable();
    }
    if (localActionMenuPresenter.Kq) {
      return localActionMenuPresenter.Kp;
    }
    return null;
  }
  
  public int getPopupTheme()
  {
    return this.KP;
  }
  
  public int getWindowAnimations()
  {
    return 0;
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    if (Build.VERSION.SDK_INT >= 8) {
      super.onConfigurationChanged(paramConfiguration);
    }
    if (this.KQ != null)
    {
      this.KQ.n(false);
      if (this.KQ.isOverflowMenuShowing())
      {
        this.KQ.hideOverflowMenu();
        this.KQ.showOverflowMenu();
      }
    }
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    dismissPopupMenus();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (!this.KT)
    {
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    }
    int i1 = getChildCount();
    int n = (paramInt4 - paramInt2) / 2;
    int i2 = getDividerWidth();
    paramInt2 = 0;
    paramInt4 = paramInt3 - paramInt1 - getPaddingRight() - getPaddingLeft();
    int j = 0;
    paramBoolean = at.bv(this);
    int i = 0;
    label68:
    View localView;
    LayoutParams localLayoutParams;
    int k;
    int m;
    if (i < i1)
    {
      localView = getChildAt(i);
      if (localView.getVisibility() == 8) {
        break label669;
      }
      localLayoutParams = (LayoutParams)localView.getLayoutParams();
      if (localLayoutParams.KY)
      {
        k = localView.getMeasuredWidth();
        j = k;
        if (aK(i)) {
          j = k + i2;
        }
        int i3 = localView.getMeasuredHeight();
        if (paramBoolean)
        {
          k = getPaddingLeft();
          k = localLayoutParams.leftMargin + k;
          m = k + j;
          label172:
          int i4 = n - i3 / 2;
          localView.layout(k, i4, m, i3 + i4);
          k = paramInt4 - j;
          j = 1;
          paramInt4 = paramInt2;
          paramInt2 = k;
        }
      }
    }
    for (;;)
    {
      k = i + 1;
      i = paramInt4;
      paramInt4 = paramInt2;
      paramInt2 = i;
      i = k;
      break label68;
      m = getWidth() - getPaddingRight() - localLayoutParams.rightMargin;
      k = m - j;
      break label172;
      k = localView.getMeasuredWidth();
      m = localLayoutParams.leftMargin;
      paramInt4 -= localLayoutParams.rightMargin + (k + m);
      aK(i);
      k = paramInt2 + 1;
      paramInt2 = paramInt4;
      paramInt4 = k;
      continue;
      if ((i1 == 1) && (j == 0))
      {
        localView = getChildAt(0);
        paramInt2 = localView.getMeasuredWidth();
        paramInt4 = localView.getMeasuredHeight();
        paramInt1 = (paramInt3 - paramInt1) / 2 - paramInt2 / 2;
        paramInt3 = n - paramInt4 / 2;
        localView.layout(paramInt1, paramInt3, paramInt2 + paramInt1, paramInt4 + paramInt3);
        return;
      }
      if (j != 0)
      {
        paramInt1 = 0;
        label390:
        paramInt1 = paramInt2 - paramInt1;
        if (paramInt1 <= 0) {
          break label541;
        }
        paramInt1 = paramInt4 / paramInt1;
        label403:
        paramInt3 = Math.max(0, paramInt1);
        if (!paramBoolean) {
          break label546;
        }
        paramInt1 = getWidth() - getPaddingRight();
        paramInt2 = 0;
        label426:
        if (paramInt2 < i1)
        {
          localView = getChildAt(paramInt2);
          localLayoutParams = (LayoutParams)localView.getLayoutParams();
          if ((localView.getVisibility() == 8) || (localLayoutParams.KY)) {
            break label666;
          }
          paramInt1 -= localLayoutParams.rightMargin;
          paramInt4 = localView.getMeasuredWidth();
          i = localView.getMeasuredHeight();
          j = n - i / 2;
          localView.layout(paramInt1 - paramInt4, j, paramInt1, i + j);
          paramInt1 -= localLayoutParams.leftMargin + paramInt4 + paramInt3;
        }
      }
      label541:
      label546:
      label553:
      label663:
      label666:
      for (;;)
      {
        paramInt2 += 1;
        break label426;
        break;
        paramInt1 = 1;
        break label390;
        paramInt1 = 0;
        break label403;
        paramInt1 = getPaddingLeft();
        paramInt2 = 0;
        if (paramInt2 < i1)
        {
          localView = getChildAt(paramInt2);
          localLayoutParams = (LayoutParams)localView.getLayoutParams();
          if ((localView.getVisibility() == 8) || (localLayoutParams.KY)) {
            break label663;
          }
          paramInt1 += localLayoutParams.leftMargin;
          paramInt4 = localView.getMeasuredWidth();
          i = localView.getMeasuredHeight();
          j = n - i / 2;
          localView.layout(paramInt1, j, paramInt1 + paramInt4, i + j);
          paramInt1 = localLayoutParams.rightMargin + paramInt4 + paramInt3 + paramInt1;
        }
        for (;;)
        {
          paramInt2 += 1;
          break label553;
          break;
        }
      }
      label669:
      k = paramInt2;
      paramInt2 = paramInt4;
      paramInt4 = k;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    boolean bool2 = this.KT;
    if (View.MeasureSpec.getMode(paramInt1) == 1073741824) {}
    int i;
    int i6;
    int i5;
    int i3;
    int i7;
    int i8;
    for (boolean bool1 = true;; bool1 = false)
    {
      this.KT = bool1;
      if (bool2 != this.KT) {
        this.KU = 0;
      }
      i = View.MeasureSpec.getSize(paramInt1);
      if ((this.KT) && (this.bq != null) && (i != this.KU))
      {
        this.KU = i;
        this.bq.p(true);
      }
      j = getChildCount();
      if ((!this.KT) || (j <= 0)) {
        break label1236;
      }
      i6 = View.MeasureSpec.getMode(paramInt2);
      paramInt1 = View.MeasureSpec.getSize(paramInt1);
      i5 = View.MeasureSpec.getSize(paramInt2);
      i = getPaddingLeft();
      j = getPaddingRight();
      i3 = getPaddingTop() + getPaddingBottom();
      i7 = getChildMeasureSpec(paramInt2, i3, -2);
      i8 = paramInt1 - (i + j);
      paramInt1 = i8 / this.KA;
      paramInt2 = this.KA;
      if (paramInt1 != 0) {
        break;
      }
      setMeasuredDimension(i8, 0);
      return;
    }
    int i9 = this.KA + i8 % paramInt2 / paramInt1;
    int j = 0;
    int i1 = 0;
    int k = 0;
    int m = 0;
    paramInt2 = 0;
    long l1 = 0L;
    int i10 = getChildCount();
    int n = 0;
    Object localObject;
    LayoutParams localLayoutParams;
    label351:
    label369:
    int i4;
    label407:
    label417:
    int i2;
    if (n < i10)
    {
      localObject = getChildAt(n);
      if (((View)localObject).getVisibility() == 8) {
        break label1331;
      }
      bool1 = localObject instanceof ActionMenuItemView;
      m += 1;
      if (bool1) {
        ((View)localObject).setPadding(this.KV, 0, this.KV, 0);
      }
      localLayoutParams = (LayoutParams)((View)localObject).getLayoutParams();
      localLayoutParams.Ld = false;
      localLayoutParams.La = 0;
      localLayoutParams.KZ = 0;
      localLayoutParams.Lb = false;
      localLayoutParams.leftMargin = 0;
      localLayoutParams.rightMargin = 0;
      if ((bool1) && (((ActionMenuItemView)localObject).hasText()))
      {
        bool1 = true;
        localLayoutParams.Lc = bool1;
        if (!localLayoutParams.KY) {
          break label483;
        }
        i = 1;
        i4 = d((View)localObject, i9, i, i7, i3);
        i1 = Math.max(i1, i4);
        if (!localLayoutParams.Lb) {
          break label1324;
        }
        i = k + 1;
        if (!localLayoutParams.KY) {
          break label1321;
        }
        paramInt2 = 1;
        i2 = paramInt1 - i4;
        j = Math.max(j, ((View)localObject).getMeasuredHeight());
        if (i4 != 1) {
          break label1307;
        }
        l1 = 1 << n | l1;
        k = i;
        i = i2;
        paramInt1 = m;
      }
    }
    for (;;)
    {
      n += 1;
      m = paramInt1;
      paramInt1 = i;
      break;
      bool1 = false;
      break label351;
      label483:
      i = paramInt1;
      break label369;
      long l3;
      long l2;
      if ((paramInt2 != 0) && (m == 2))
      {
        i2 = 1;
        i = 0;
        n = paramInt1;
        paramInt1 = i;
        l3 = l1;
        if (k <= 0) {
          break label809;
        }
        l3 = l1;
        if (n <= 0) {
          break label809;
        }
        i3 = Integer.MAX_VALUE;
        l2 = 0L;
        i = 0;
        i4 = 0;
        label543:
        if (i4 >= i10) {
          break label643;
        }
        localObject = (LayoutParams)getChildAt(i4).getLayoutParams();
        if (!((LayoutParams)localObject).Lb) {
          break label1304;
        }
        if (((LayoutParams)localObject).KZ >= i3) {
          break label614;
        }
        i3 = ((LayoutParams)localObject).KZ;
        l2 = 1 << i4;
        i = 1;
      }
      label614:
      label643:
      label667:
      label809:
      label970:
      label973:
      label1077:
      label1141:
      label1144:
      label1147:
      label1236:
      label1295:
      label1301:
      label1304:
      for (;;)
      {
        i4 += 1;
        break label543;
        i2 = 0;
        break;
        if (((LayoutParams)localObject).KZ == i3)
        {
          l2 |= 1 << i4;
          i += 1;
          continue;
          l1 |= l2;
          l3 = l1;
          if (i <= n)
          {
            i = 0;
            paramInt1 = n;
            if (i < i10)
            {
              localObject = getChildAt(i);
              localLayoutParams = (LayoutParams)((View)localObject).getLayoutParams();
              if ((1 << i & l2) == 0L)
              {
                if (localLayoutParams.KZ != i3 + 1) {
                  break label1301;
                }
                l1 |= 1 << i;
              }
            }
          }
          for (;;)
          {
            i += 1;
            break label667;
            if ((i2 != 0) && (localLayoutParams.Lc) && (paramInt1 == 1)) {
              ((View)localObject).setPadding(this.KV + i9, 0, this.KV, 0);
            }
            localLayoutParams.KZ += 1;
            localLayoutParams.Ld = true;
            paramInt1 -= 1;
            continue;
            i = 1;
            n = paramInt1;
            paramInt1 = i;
            break;
            float f2;
            float f1;
            if ((paramInt2 == 0) && (m == 1))
            {
              paramInt2 = 1;
              if ((n <= 0) || (l3 == 0L) || ((n >= m - 1) && (paramInt2 == 0) && (i1 <= 1))) {
                break label1144;
              }
              float f3 = Long.bitCount(l3);
              f2 = f3;
              if (paramInt2 != 0) {
                break label1295;
              }
              f1 = f3;
              if ((1L & l3) != 0L)
              {
                f1 = f3;
                if (!((LayoutParams)getChildAt(0).getLayoutParams()).Lc) {
                  f1 = f3 - 0.5F;
                }
              }
              f2 = f1;
              if ((1 << i10 - 1 & l3) == 0L) {
                break label1295;
              }
              f2 = f1;
              if (((LayoutParams)getChildAt(i10 - 1).getLayoutParams()).Lc) {
                break label1295;
              }
            }
            for (f1 -= 0.5F;; f1 = f2)
            {
              if (f1 > 0.0F)
              {
                paramInt2 = (int)(n * i9 / f1);
                i = 0;
                k = paramInt1;
                if (i >= i10) {
                  break label1147;
                }
                if ((1 << i & l3) == 0L) {
                  break label1141;
                }
                localObject = getChildAt(i);
                localLayoutParams = (LayoutParams)((View)localObject).getLayoutParams();
                if (!(localObject instanceof ActionMenuItemView)) {
                  break label1077;
                }
                localLayoutParams.La = paramInt2;
                localLayoutParams.Ld = true;
                if ((i == 0) && (!localLayoutParams.Lc)) {
                  localLayoutParams.leftMargin = (-paramInt2 / 2);
                }
                paramInt1 = 1;
              }
              for (;;)
              {
                i += 1;
                break label973;
                paramInt2 = 0;
                break;
                paramInt2 = 0;
                break label970;
                if (localLayoutParams.KY)
                {
                  localLayoutParams.La = paramInt2;
                  localLayoutParams.Ld = true;
                  localLayoutParams.rightMargin = (-paramInt2 / 2);
                  paramInt1 = 1;
                }
                else
                {
                  if (i != 0) {
                    localLayoutParams.leftMargin = (paramInt2 / 2);
                  }
                  if (i != i10 - 1) {
                    localLayoutParams.rightMargin = (paramInt2 / 2);
                  }
                }
              }
              k = paramInt1;
              if (k != 0)
              {
                paramInt1 = 0;
                while (paramInt1 < i10)
                {
                  localObject = getChildAt(paramInt1);
                  localLayoutParams = (LayoutParams)((View)localObject).getLayoutParams();
                  if (localLayoutParams.Ld)
                  {
                    paramInt2 = localLayoutParams.KZ;
                    ((View)localObject).measure(View.MeasureSpec.makeMeasureSpec(localLayoutParams.La + paramInt2 * i9, 1073741824), i7);
                  }
                  paramInt1 += 1;
                }
              }
              if (i6 != 1073741824) {}
              for (;;)
              {
                setMeasuredDimension(i8, j);
                return;
                i = 0;
                while (i < j)
                {
                  localObject = (LayoutParams)getChildAt(i).getLayoutParams();
                  ((LayoutParams)localObject).rightMargin = 0;
                  ((LayoutParams)localObject).leftMargin = 0;
                  i += 1;
                }
                super.onMeasure(paramInt1, paramInt2);
                return;
                j = i5;
              }
            }
          }
        }
      }
      label1307:
      k = i;
      paramInt1 = m;
      i = i2;
      continue;
      label1321:
      break label417;
      label1324:
      i = k;
      break label407;
      label1331:
      i = paramInt1;
      paramInt1 = m;
    }
  }
  
  public void setExpandedActionViewsExclusive(boolean paramBoolean)
  {
    this.KQ.Kz = paramBoolean;
  }
  
  public void setOnMenuItemClickListener(d paramd)
  {
    this.KW = paramd;
  }
  
  public void setOverflowIcon(Drawable paramDrawable)
  {
    getMenu();
    ActionMenuPresenter localActionMenuPresenter = this.KQ;
    if (localActionMenuPresenter.Ko != null)
    {
      localActionMenuPresenter.Ko.setImageDrawable(paramDrawable);
      return;
    }
    localActionMenuPresenter.Kq = true;
    localActionMenuPresenter.Kp = paramDrawable;
  }
  
  public void setOverflowReserved(boolean paramBoolean)
  {
    this.Kr = paramBoolean;
  }
  
  public void setPopupTheme(int paramInt)
  {
    if (this.KP != paramInt)
    {
      this.KP = paramInt;
      if (paramInt == 0) {
        this.Jn = getContext();
      }
    }
    else
    {
      return;
    }
    this.Jn = new ContextThemeWrapper(getContext(), paramInt);
  }
  
  public void setPresenter(ActionMenuPresenter paramActionMenuPresenter)
  {
    this.KQ = paramActionMenuPresenter;
    this.KQ.a(this);
  }
  
  public static class LayoutParams
    extends LinearLayoutCompat.LayoutParams
  {
    @ViewDebug.ExportedProperty
    public boolean KY;
    @ViewDebug.ExportedProperty
    public int KZ;
    @ViewDebug.ExportedProperty
    public int La;
    @ViewDebug.ExportedProperty
    public boolean Lb;
    @ViewDebug.ExportedProperty
    public boolean Lc;
    boolean Ld;
    
    public LayoutParams()
    {
      super(-2);
      this.KY = false;
    }
    
    public LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
    }
    
    public LayoutParams(LayoutParams paramLayoutParams)
    {
      super();
      this.KY = paramLayoutParams.KY;
    }
    
    public LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
  }
  
  public static abstract interface a
  {
    public abstract boolean dA();
    
    public abstract boolean dz();
  }
  
  private final class b
    implements l.a
  {
    private b() {}
    
    public final void a(f paramf, boolean paramBoolean) {}
    
    public final boolean d(f paramf)
    {
      return false;
    }
  }
  
  private final class c
    implements f.a
  {
    private c() {}
    
    public final boolean a(f paramf, MenuItem paramMenuItem)
    {
      return (ActionMenuView.b(ActionMenuView.this) != null) && (ActionMenuView.b(ActionMenuView.this).onMenuItemClick(paramMenuItem));
    }
    
    public final void b(f paramf)
    {
      if (ActionMenuView.c(ActionMenuView.this) != null) {
        ActionMenuView.c(ActionMenuView.this).b(paramf);
      }
    }
  }
  
  public static abstract interface d
  {
    public abstract boolean onMenuItemClick(MenuItem paramMenuItem);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/ActionMenuView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */