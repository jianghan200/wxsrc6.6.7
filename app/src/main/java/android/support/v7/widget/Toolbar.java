package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.m;
import android.support.v4.view.o;
import android.support.v4.view.z;
import android.support.v7.a.a.a;
import android.support.v7.a.a.k;
import android.support.v7.app.ActionBar.LayoutParams;
import android.support.v7.view.c;
import android.support.v7.view.g;
import android.support.v7.view.menu.f.a;
import android.support.v7.view.menu.l.a;
import android.support.v7.view.menu.p;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class Toolbar
  extends ViewGroup
{
  Context Jn;
  ActionMenuView Jo;
  private boolean Js;
  private boolean Jt;
  int KP;
  l.a KR;
  f.a KS;
  private final h Mb;
  private ImageView WA;
  private Drawable WB;
  private CharSequence WC;
  private ImageButton WD;
  View WE;
  int WF;
  int WG;
  private int WH;
  private int WI;
  private int WJ;
  private int WK;
  private int WL;
  private int WM;
  final ag WN = new ag();
  private CharSequence WO;
  private CharSequence WP;
  private int WQ;
  private int WR;
  private final ArrayList<View> WS = new ArrayList();
  final ArrayList<View> WT = new ArrayList();
  private final int[] WU = new int[2];
  private b WV;
  private final ActionMenuView.d WW = new ActionMenuView.d()
  {
    public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
    {
      if (Toolbar.a(Toolbar.this) != null) {
        return Toolbar.a(Toolbar.this).onMenuItemClick(paramAnonymousMenuItem);
      }
      return false;
    }
  };
  private aq WX;
  ActionMenuPresenter WY;
  a WZ;
  TextView Wx;
  TextView Wy;
  private ImageButton Wz;
  private boolean Xa;
  private final Runnable Xb = new Runnable()
  {
    public final void run()
    {
      Toolbar.this.showOverflowMenu();
    }
  };
  private int rA = 8388627;
  
  public Toolbar(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, a.a.toolbarStyle);
  }
  
  public Toolbar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = ap.a(getContext(), paramAttributeSet, a.k.Toolbar, paramInt);
    this.WF = paramContext.getResourceId(a.k.Toolbar_titleTextAppearance, 0);
    this.WG = paramContext.getResourceId(a.k.Toolbar_subtitleTextAppearance, 0);
    paramInt = a.k.Toolbar_android_gravity;
    int i = this.rA;
    this.rA = paramContext.Ww.getInteger(paramInt, i);
    this.WH = 48;
    paramInt = paramContext.getDimensionPixelOffset(a.k.Toolbar_titleMargins, 0);
    this.WM = paramInt;
    this.WL = paramInt;
    this.WK = paramInt;
    this.WJ = paramInt;
    paramInt = paramContext.getDimensionPixelOffset(a.k.Toolbar_titleMarginStart, -1);
    if (paramInt >= 0) {
      this.WJ = paramInt;
    }
    paramInt = paramContext.getDimensionPixelOffset(a.k.Toolbar_titleMarginEnd, -1);
    if (paramInt >= 0) {
      this.WK = paramInt;
    }
    paramInt = paramContext.getDimensionPixelOffset(a.k.Toolbar_titleMarginTop, -1);
    if (paramInt >= 0) {
      this.WL = paramInt;
    }
    paramInt = paramContext.getDimensionPixelOffset(a.k.Toolbar_titleMarginBottom, -1);
    if (paramInt >= 0) {
      this.WM = paramInt;
    }
    this.WI = paramContext.getDimensionPixelSize(a.k.Toolbar_maxButtonHeight, -1);
    paramInt = paramContext.getDimensionPixelOffset(a.k.Toolbar_contentInsetStart, Integer.MIN_VALUE);
    i = paramContext.getDimensionPixelOffset(a.k.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
    int j = paramContext.getDimensionPixelSize(a.k.Toolbar_contentInsetLeft, 0);
    int k = paramContext.getDimensionPixelSize(a.k.Toolbar_contentInsetRight, 0);
    paramAttributeSet = this.WN;
    paramAttributeSet.Tz = false;
    if (j != Integer.MIN_VALUE)
    {
      paramAttributeSet.Tx = j;
      paramAttributeSet.Tu = j;
    }
    if (k != Integer.MIN_VALUE)
    {
      paramAttributeSet.Ty = k;
      paramAttributeSet.Tv = k;
    }
    if ((paramInt != Integer.MIN_VALUE) || (i != Integer.MIN_VALUE)) {
      this.WN.aj(paramInt, i);
    }
    this.WB = paramContext.getDrawable(a.k.Toolbar_collapseIcon);
    this.WC = paramContext.getText(a.k.Toolbar_collapseContentDescription);
    paramAttributeSet = paramContext.getText(a.k.Toolbar_title);
    if (!TextUtils.isEmpty(paramAttributeSet)) {
      setTitle(paramAttributeSet);
    }
    paramAttributeSet = paramContext.getText(a.k.Toolbar_subtitle);
    if (!TextUtils.isEmpty(paramAttributeSet)) {
      setSubtitle(paramAttributeSet);
    }
    this.Jn = getContext();
    setPopupTheme(paramContext.getResourceId(a.k.Toolbar_popupTheme, 0));
    paramAttributeSet = paramContext.getDrawable(a.k.Toolbar_navigationIcon);
    if (paramAttributeSet != null) {
      setNavigationIcon(paramAttributeSet);
    }
    paramAttributeSet = paramContext.getText(a.k.Toolbar_navigationContentDescription);
    if (!TextUtils.isEmpty(paramAttributeSet)) {
      setNavigationContentDescription(paramAttributeSet);
    }
    paramAttributeSet = paramContext.getDrawable(a.k.Toolbar_logo);
    if (paramAttributeSet != null) {
      setLogo(paramAttributeSet);
    }
    paramAttributeSet = paramContext.getText(a.k.Toolbar_logoDescription);
    if (!TextUtils.isEmpty(paramAttributeSet)) {
      setLogoDescription(paramAttributeSet);
    }
    if (paramContext.hasValue(a.k.Toolbar_titleTextColor)) {
      setTitleTextColor(paramContext.bQ(a.k.Toolbar_titleTextColor));
    }
    if (paramContext.hasValue(a.k.Toolbar_subtitleTextColor)) {
      setSubtitleTextColor(paramContext.bQ(a.k.Toolbar_subtitleTextColor));
    }
    paramContext.Ww.recycle();
    this.Mb = h.eJ();
  }
  
  private int a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i = localMarginLayoutParams.leftMargin - paramArrayOfInt[0];
    int j = localMarginLayoutParams.rightMargin - paramArrayOfInt[1];
    int k = Math.max(0, i) + Math.max(0, j);
    paramArrayOfInt[0] = Math.max(0, -i);
    paramArrayOfInt[1] = Math.max(0, -j);
    paramView.measure(getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight() + k + paramInt2, localMarginLayoutParams.width), getChildMeasureSpec(paramInt3, getPaddingTop() + getPaddingBottom() + localMarginLayoutParams.topMargin + localMarginLayoutParams.bottomMargin + paramInt4, localMarginLayoutParams.height));
    return paramView.getMeasuredWidth() + k;
  }
  
  private int a(View paramView, int paramInt1, int[] paramArrayOfInt, int paramInt2)
  {
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    int i = localLayoutParams.leftMargin - paramArrayOfInt[0];
    paramInt1 = Math.max(0, i) + paramInt1;
    paramArrayOfInt[0] = Math.max(0, -i);
    paramInt2 = p(paramView, paramInt2);
    i = paramView.getMeasuredWidth();
    paramView.layout(paramInt1, paramInt2, paramInt1 + i, paramView.getMeasuredHeight() + paramInt2);
    return localLayoutParams.rightMargin + i + paramInt1;
  }
  
  private int b(View paramView, int paramInt1, int[] paramArrayOfInt, int paramInt2)
  {
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    int i = localLayoutParams.rightMargin - paramArrayOfInt[1];
    paramInt1 -= Math.max(0, i);
    paramArrayOfInt[1] = Math.max(0, -i);
    paramInt2 = p(paramView, paramInt2);
    i = paramView.getMeasuredWidth();
    paramView.layout(paramInt1 - i, paramInt2, paramInt1, paramView.getMeasuredHeight() + paramInt2);
    return paramInt1 - (localLayoutParams.leftMargin + i);
  }
  
  private void b(List<View> paramList, int paramInt)
  {
    int i = 1;
    int j = 0;
    if (z.I(this) == 1) {}
    int m;
    int k;
    View localView;
    LayoutParams localLayoutParams;
    for (;;)
    {
      m = getChildCount();
      k = android.support.v4.view.f.getAbsoluteGravity(paramInt, z.I(this));
      paramList.clear();
      paramInt = j;
      if (i == 0) {
        break;
      }
      paramInt = m - 1;
      while (paramInt >= 0)
      {
        localView = getChildAt(paramInt);
        localLayoutParams = (LayoutParams)localView.getLayoutParams();
        if ((localLayoutParams.Xe == 0) && (br(localView)) && (bR(localLayoutParams.gravity) == k)) {
          paramList.add(localView);
        }
        paramInt -= 1;
      }
      i = 0;
    }
    while (paramInt < m)
    {
      localView = getChildAt(paramInt);
      localLayoutParams = (LayoutParams)localView.getLayoutParams();
      if ((localLayoutParams.Xe == 0) && (br(localView)) && (bR(localLayoutParams.gravity) == k)) {
        paramList.add(localView);
      }
      paramInt += 1;
    }
  }
  
  private int bR(int paramInt)
  {
    int j = z.I(this);
    int i = android.support.v4.view.f.getAbsoluteGravity(paramInt, j) & 0x7;
    paramInt = i;
    switch (i)
    {
    case 2: 
    case 4: 
    default: 
      if (j == 1) {
        paramInt = 5;
      }
      break;
    case 1: 
    case 3: 
    case 5: 
      return paramInt;
    }
    return 3;
  }
  
  private boolean br(View paramView)
  {
    return (paramView != null) && (paramView.getParent() == this) && (paramView.getVisibility() != 8);
  }
  
  private static int bs(View paramView)
  {
    paramView = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i = android.support.v4.view.l.a(paramView);
    return android.support.v4.view.l.b(paramView) + i;
  }
  
  private static int bt(View paramView)
  {
    paramView = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i = paramView.topMargin;
    return paramView.bottomMargin + i;
  }
  
  private boolean bu(View paramView)
  {
    return (paramView.getParent() == this) || (this.WT.contains(paramView));
  }
  
  private void d(View paramView, boolean paramBoolean)
  {
    Object localObject = paramView.getLayoutParams();
    if (localObject == null) {
      localObject = new LayoutParams();
    }
    for (;;)
    {
      ((LayoutParams)localObject).Xe = 1;
      if ((!paramBoolean) || (this.WE == null)) {
        break;
      }
      paramView.setLayoutParams((ViewGroup.LayoutParams)localObject);
      this.WT.add(paramView);
      return;
      if (!checkLayoutParams((ViewGroup.LayoutParams)localObject)) {
        localObject = f((ViewGroup.LayoutParams)localObject);
      } else {
        localObject = (LayoutParams)localObject;
      }
    }
    addView(paramView, (ViewGroup.LayoutParams)localObject);
  }
  
  private static LayoutParams f(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof LayoutParams)) {
      return new LayoutParams((LayoutParams)paramLayoutParams);
    }
    if ((paramLayoutParams instanceof ActionBar.LayoutParams)) {
      return new LayoutParams((ActionBar.LayoutParams)paramLayoutParams);
    }
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      return new LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams);
    }
    return new LayoutParams(paramLayoutParams);
  }
  
  private MenuInflater getMenuInflater()
  {
    return new g(getContext());
  }
  
  private void ha()
  {
    if (this.WA == null) {
      this.WA = new ImageView(getContext());
    }
  }
  
  private void hb()
  {
    hc();
    if (this.Jo.bq == null)
    {
      android.support.v7.view.menu.f localf = (android.support.v7.view.menu.f)this.Jo.getMenu();
      if (this.WZ == null) {
        this.WZ = new a((byte)0);
      }
      this.Jo.setExpandedActionViewsExclusive(true);
      localf.a(this.WZ, this.Jn);
    }
  }
  
  private void hd()
  {
    if (this.Wz == null)
    {
      this.Wz = new ImageButton(getContext(), null, a.a.toolbarNavigationButtonStyle);
      LayoutParams localLayoutParams = new LayoutParams();
      localLayoutParams.gravity = (0x800003 | this.WH & 0x70);
      this.Wz.setLayoutParams(localLayoutParams);
    }
  }
  
  protected static LayoutParams he()
  {
    return new LayoutParams();
  }
  
  private void i(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i = getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight() + localMarginLayoutParams.leftMargin + localMarginLayoutParams.rightMargin + paramInt2, localMarginLayoutParams.width);
    paramInt2 = getChildMeasureSpec(paramInt3, getPaddingTop() + getPaddingBottom() + localMarginLayoutParams.topMargin + localMarginLayoutParams.bottomMargin + 0, localMarginLayoutParams.height);
    paramInt3 = View.MeasureSpec.getMode(paramInt2);
    paramInt1 = paramInt2;
    if (paramInt3 != 1073741824)
    {
      paramInt1 = paramInt2;
      if (paramInt4 >= 0)
      {
        paramInt1 = paramInt4;
        if (paramInt3 != 0) {
          paramInt1 = Math.min(View.MeasureSpec.getSize(paramInt2), paramInt4);
        }
        paramInt1 = View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824);
      }
    }
    paramView.measure(i, paramInt1);
  }
  
  private int p(View paramView, int paramInt)
  {
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    int k = paramView.getMeasuredHeight();
    int j;
    int i;
    int m;
    if (paramInt > 0)
    {
      paramInt = (k - paramInt) / 2;
      j = localLayoutParams.gravity & 0x70;
      i = j;
      switch (j)
      {
      default: 
        i = this.rA & 0x70;
      }
      switch (i)
      {
      default: 
        i = getPaddingTop();
        j = getPaddingBottom();
        m = getHeight();
        paramInt = (m - i - j - k) / 2;
        if (paramInt < localLayoutParams.topMargin) {
          paramInt = localLayoutParams.topMargin;
        }
        break;
      }
    }
    for (;;)
    {
      return paramInt + i;
      paramInt = 0;
      break;
      return getPaddingTop() - paramInt;
      return getHeight() - getPaddingBottom() - k - localLayoutParams.bottomMargin - paramInt;
      j = m - j - k - paramInt - i;
      if (j < localLayoutParams.bottomMargin) {
        paramInt = Math.max(0, paramInt - (localLayoutParams.bottomMargin - j));
      }
    }
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return (super.checkLayoutParams(paramLayoutParams)) && ((paramLayoutParams instanceof LayoutParams));
  }
  
  public final void collapseActionView()
  {
    if (this.WZ == null) {}
    for (android.support.v7.view.menu.h localh = null;; localh = this.WZ.Xd)
    {
      if (localh != null) {
        localh.collapseActionView();
      }
      return;
    }
  }
  
  public int getContentInsetEnd()
  {
    ag localag = this.WN;
    if (localag.dx) {
      return localag.Tu;
    }
    return localag.Tv;
  }
  
  public int getContentInsetLeft()
  {
    return this.WN.Tu;
  }
  
  public int getContentInsetRight()
  {
    return this.WN.Tv;
  }
  
  public int getContentInsetStart()
  {
    ag localag = this.WN;
    if (localag.dx) {
      return localag.Tv;
    }
    return localag.Tu;
  }
  
  public Drawable getLogo()
  {
    if (this.WA != null) {
      return this.WA.getDrawable();
    }
    return null;
  }
  
  public CharSequence getLogoDescription()
  {
    if (this.WA != null) {
      return this.WA.getContentDescription();
    }
    return null;
  }
  
  public Menu getMenu()
  {
    hb();
    return this.Jo.getMenu();
  }
  
  public CharSequence getNavigationContentDescription()
  {
    if (this.Wz != null) {
      return this.Wz.getContentDescription();
    }
    return null;
  }
  
  public Drawable getNavigationIcon()
  {
    if (this.Wz != null) {
      return this.Wz.getDrawable();
    }
    return null;
  }
  
  public Drawable getOverflowIcon()
  {
    hb();
    return this.Jo.getOverflowIcon();
  }
  
  public int getPopupTheme()
  {
    return this.KP;
  }
  
  public CharSequence getSubtitle()
  {
    return this.WP;
  }
  
  public CharSequence getTitle()
  {
    return this.WO;
  }
  
  public u getWrapper()
  {
    if (this.WX == null) {
      this.WX = new aq(this, true);
    }
    return this.WX;
  }
  
  final void hc()
  {
    if (this.Jo == null)
    {
      this.Jo = new ActionMenuView(getContext());
      this.Jo.setPopupTheme(this.KP);
      this.Jo.setOnMenuItemClickListener(this.WW);
      this.Jo.a(this.KR, this.KS);
      LayoutParams localLayoutParams = new LayoutParams();
      localLayoutParams.gravity = (0x800005 | this.WH & 0x70);
      this.Jo.setLayoutParams(localLayoutParams);
      d(this.Jo, false);
    }
  }
  
  public final boolean isOverflowMenuShowing()
  {
    if (this.Jo != null)
    {
      ActionMenuView localActionMenuView = this.Jo;
      if ((localActionMenuView.KQ != null) && (localActionMenuView.KQ.isOverflowMenuShowing())) {}
      for (int i = 1; i != 0; i = 0) {
        return true;
      }
    }
    return false;
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    removeCallbacks(this.Xb);
  }
  
  public boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    int i = o.d(paramMotionEvent);
    if (i == 9) {
      this.Jt = false;
    }
    if (!this.Jt)
    {
      boolean bool = super.onHoverEvent(paramMotionEvent);
      if ((i == 9) && (!bool)) {
        this.Jt = true;
      }
    }
    if ((i == 10) || (i == 3)) {
      this.Jt = false;
    }
    return true;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int k;
    int i1;
    int i4;
    int i;
    int i2;
    int i3;
    int i5;
    int[] arrayOfInt;
    int n;
    if (z.I(this) == 1)
    {
      k = 1;
      i1 = getWidth();
      i4 = getHeight();
      i = getPaddingLeft();
      i2 = getPaddingRight();
      i3 = getPaddingTop();
      i5 = getPaddingBottom();
      paramInt4 = i1 - i2;
      arrayOfInt = this.WU;
      arrayOfInt[1] = 0;
      arrayOfInt[0] = 0;
      n = z.T(this);
      if (!br(this.Wz)) {
        break label1717;
      }
      if (k == 0) {
        break label882;
      }
      paramInt4 = b(this.Wz, paramInt4, arrayOfInt, n);
      paramInt1 = i;
    }
    for (;;)
    {
      label111:
      paramInt2 = paramInt4;
      paramInt3 = paramInt1;
      if (br(this.WD))
      {
        if (k != 0)
        {
          paramInt2 = b(this.WD, paramInt4, arrayOfInt, n);
          paramInt3 = paramInt1;
        }
      }
      else
      {
        label151:
        paramInt1 = paramInt2;
        paramInt4 = paramInt3;
        if (br(this.Jo))
        {
          if (k == 0) {
            break label921;
          }
          paramInt4 = a(this.Jo, paramInt3, arrayOfInt, n);
          paramInt1 = paramInt2;
        }
        label191:
        arrayOfInt[0] = Math.max(0, getContentInsetLeft() - paramInt4);
        arrayOfInt[1] = Math.max(0, getContentInsetRight() - (i1 - i2 - paramInt1));
        paramInt3 = Math.max(paramInt4, getContentInsetLeft());
        paramInt4 = Math.min(paramInt1, i1 - i2 - getContentInsetRight());
        paramInt2 = paramInt4;
        paramInt1 = paramInt3;
        if (br(this.WE))
        {
          if (k == 0) {
            break label942;
          }
          paramInt2 = b(this.WE, paramInt4, arrayOfInt, n);
          paramInt1 = paramInt3;
        }
        label293:
        if (!br(this.WA)) {
          break label1709;
        }
        if (k == 0) {
          break label963;
        }
        paramInt3 = b(this.WA, paramInt2, arrayOfInt, n);
        paramInt2 = paramInt1;
      }
      for (;;)
      {
        label326:
        paramBoolean = br(this.Wx);
        boolean bool = br(this.Wy);
        paramInt1 = 0;
        Object localObject1;
        if (paramBoolean)
        {
          localObject1 = (LayoutParams)this.Wx.getLayoutParams();
          paramInt1 = ((LayoutParams)localObject1).topMargin;
          paramInt4 = this.Wx.getMeasuredHeight();
          paramInt1 = ((LayoutParams)localObject1).bottomMargin + (paramInt1 + paramInt4) + 0;
        }
        int j;
        if (bool)
        {
          localObject1 = (LayoutParams)this.Wy.getLayoutParams();
          paramInt4 = ((LayoutParams)localObject1).topMargin;
          j = this.Wy.getMeasuredHeight();
        }
        for (int m = ((LayoutParams)localObject1).bottomMargin + (paramInt4 + j) + paramInt1;; m = paramInt1)
        {
          label464:
          Object localObject2;
          if (!paramBoolean)
          {
            paramInt4 = paramInt3;
            paramInt1 = paramInt2;
            if (!bool) {}
          }
          else
          {
            if (!paramBoolean) {
              break label985;
            }
            localObject1 = this.Wx;
            if (!bool) {
              break label994;
            }
            localObject2 = this.Wy;
            label475:
            localObject1 = (LayoutParams)((View)localObject1).getLayoutParams();
            localObject2 = (LayoutParams)((View)localObject2).getLayoutParams();
            if (((!paramBoolean) || (this.Wx.getMeasuredWidth() <= 0)) && ((!bool) || (this.Wy.getMeasuredWidth() <= 0))) {
              break label1003;
            }
            j = 1;
            label527:
            switch (this.rA & 0x70)
            {
            default: 
              paramInt1 = (i4 - i3 - i5 - m) / 2;
              if (paramInt1 < ((LayoutParams)localObject1).topMargin + this.WL) {
                paramInt1 = ((LayoutParams)localObject1).topMargin + this.WL;
              }
              break;
            }
          }
          label599:
          label604:
          label620:
          label882:
          label921:
          label942:
          label963:
          label985:
          label994:
          label1003:
          label1123:
          label1675:
          label1693:
          label1700:
          for (;;)
          {
            paramInt1 = i3 + paramInt1;
            if (k != 0) {
              if (j != 0)
              {
                paramInt4 = this.WJ;
                paramInt4 -= arrayOfInt[1];
                paramInt3 -= Math.max(0, paramInt4);
                arrayOfInt[1] = Math.max(0, -paramInt4);
                if (!paramBoolean) {
                  break label1693;
                }
                localObject1 = (LayoutParams)this.Wx.getLayoutParams();
                paramInt4 = paramInt3 - this.Wx.getMeasuredWidth();
                k = this.Wx.getMeasuredHeight() + paramInt1;
                this.Wx.layout(paramInt4, paramInt1, paramInt3, k);
                m = this.WK;
                paramInt1 = k + ((LayoutParams)localObject1).bottomMargin;
                paramInt4 -= m;
              }
            }
            for (;;)
            {
              if (bool)
              {
                localObject1 = (LayoutParams)this.Wy.getLayoutParams();
                paramInt1 = ((LayoutParams)localObject1).topMargin + paramInt1;
                k = this.Wy.getMeasuredWidth();
                m = this.Wy.getMeasuredHeight();
                this.Wy.layout(paramInt3 - k, paramInt1, paramInt3, m + paramInt1);
                paramInt1 = this.WK;
                k = ((LayoutParams)localObject1).bottomMargin;
              }
              for (paramInt1 = paramInt3 - paramInt1;; paramInt1 = paramInt3)
              {
                if (j != 0) {}
                for (paramInt1 = Math.min(paramInt4, paramInt1);; paramInt1 = paramInt3)
                {
                  paramInt4 = paramInt1;
                  paramInt1 = paramInt2;
                  b(this.WS, 3);
                  paramInt3 = this.WS.size();
                  paramInt2 = 0;
                  for (;;)
                  {
                    if (paramInt2 < paramInt3)
                    {
                      paramInt1 = a((View)this.WS.get(paramInt2), paramInt1, arrayOfInt, n);
                      paramInt2 += 1;
                      continue;
                      k = 0;
                      break;
                      paramInt1 = a(this.Wz, i, arrayOfInt, n);
                      break label111;
                      paramInt3 = a(this.WD, paramInt1, arrayOfInt, n);
                      paramInt2 = paramInt4;
                      break label151;
                      paramInt1 = b(this.Jo, paramInt2, arrayOfInt, n);
                      paramInt4 = paramInt3;
                      break label191;
                      paramInt1 = a(this.WE, paramInt3, arrayOfInt, n);
                      paramInt2 = paramInt4;
                      break label293;
                      paramInt1 = a(this.WA, paramInt1, arrayOfInt, n);
                      paramInt3 = paramInt2;
                      paramInt2 = paramInt1;
                      break label326;
                      localObject1 = this.Wy;
                      break label464;
                      localObject2 = this.Wx;
                      break label475;
                      j = 0;
                      break label527;
                      paramInt1 = getPaddingTop();
                      paramInt1 = ((LayoutParams)localObject1).topMargin + paramInt1 + this.WL;
                      break label604;
                      paramInt4 = i4 - i5 - m - paramInt1 - i3;
                      if (paramInt4 >= ((LayoutParams)localObject1).bottomMargin + this.WM) {
                        break label1700;
                      }
                      paramInt1 = Math.max(0, paramInt1 - (((LayoutParams)localObject2).bottomMargin + this.WM - paramInt4));
                      break label599;
                      paramInt1 = i4 - i5 - ((LayoutParams)localObject2).bottomMargin - this.WM - m;
                      break label604;
                      paramInt4 = 0;
                      break label620;
                      if (j != 0)
                      {
                        paramInt4 = this.WJ;
                        paramInt4 -= arrayOfInt[0];
                        paramInt2 += Math.max(0, paramInt4);
                        arrayOfInt[0] = Math.max(0, -paramInt4);
                        if (!paramBoolean) {
                          break label1675;
                        }
                        localObject1 = (LayoutParams)this.Wx.getLayoutParams();
                        k = this.Wx.getMeasuredWidth() + paramInt2;
                        paramInt4 = this.Wx.getMeasuredHeight() + paramInt1;
                        this.Wx.layout(paramInt2, paramInt1, k, paramInt4);
                        m = this.WK;
                        paramInt1 = ((LayoutParams)localObject1).bottomMargin;
                        k += m;
                        paramInt1 += paramInt4;
                      }
                    }
                  }
                  for (;;)
                  {
                    if (bool)
                    {
                      localObject1 = (LayoutParams)this.Wy.getLayoutParams();
                      paramInt4 = ((LayoutParams)localObject1).topMargin + paramInt1;
                      paramInt1 = this.Wy.getMeasuredWidth() + paramInt2;
                      m = this.Wy.getMeasuredHeight();
                      this.Wy.layout(paramInt2, paramInt4, paramInt1, m + paramInt4);
                      paramInt4 = this.WK;
                      m = ((LayoutParams)localObject1).bottomMargin;
                    }
                    for (m = paramInt4 + paramInt1;; m = paramInt2)
                    {
                      paramInt4 = paramInt3;
                      paramInt1 = paramInt2;
                      if (j == 0) {
                        break;
                      }
                      paramInt1 = Math.max(k, m);
                      paramInt4 = paramInt3;
                      break;
                      paramInt4 = 0;
                      break label1123;
                      b(this.WS, 5);
                      j = this.WS.size();
                      paramInt3 = 0;
                      paramInt2 = paramInt4;
                      while (paramInt3 < j)
                      {
                        paramInt2 = b((View)this.WS.get(paramInt3), paramInt2, arrayOfInt, n);
                        paramInt3 += 1;
                      }
                      b(this.WS, 1);
                      localObject1 = this.WS;
                      k = arrayOfInt[0];
                      j = arrayOfInt[1];
                      m = ((List)localObject1).size();
                      paramInt4 = 0;
                      paramInt3 = 0;
                      while (paramInt4 < m)
                      {
                        localObject2 = (View)((List)localObject1).get(paramInt4);
                        LayoutParams localLayoutParams = (LayoutParams)((View)localObject2).getLayoutParams();
                        k = localLayoutParams.leftMargin - k;
                        j = localLayoutParams.rightMargin - j;
                        i3 = Math.max(0, k);
                        i4 = Math.max(0, j);
                        k = Math.max(0, -k);
                        j = Math.max(0, -j);
                        i5 = ((View)localObject2).getMeasuredWidth();
                        paramInt4 += 1;
                        paramInt3 += i5 + i3 + i4;
                      }
                      paramInt4 = (i1 - i - i2) / 2 + i - paramInt3 / 2;
                      paramInt3 = paramInt4 + paramInt3;
                      if (paramInt4 < paramInt1) {}
                      for (;;)
                      {
                        paramInt4 = this.WS.size();
                        paramInt3 = 0;
                        paramInt2 = paramInt1;
                        paramInt1 = paramInt3;
                        while (paramInt1 < paramInt4)
                        {
                          paramInt2 = a((View)this.WS.get(paramInt1), paramInt2, arrayOfInt, n);
                          paramInt1 += 1;
                        }
                        paramInt1 = paramInt4;
                        if (paramInt3 > paramInt2) {
                          paramInt1 = paramInt4 - (paramInt3 - paramInt2);
                        }
                      }
                      this.WS.clear();
                      return;
                    }
                    k = paramInt2;
                  }
                }
              }
              paramInt4 = paramInt3;
            }
          }
        }
        label1709:
        paramInt3 = paramInt2;
        paramInt2 = paramInt1;
      }
      label1717:
      paramInt1 = i;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    Object localObject = this.WU;
    int n;
    int i1;
    int i;
    int m;
    int k;
    if (at.bv(this))
    {
      n = 0;
      i1 = 1;
      i = 0;
      if (!br(this.Wz)) {
        break label1008;
      }
      i(this.Wz, paramInt1, 0, paramInt2, this.WI);
      i = this.Wz.getMeasuredWidth() + bs(this.Wz);
      m = Math.max(0, this.Wz.getMeasuredHeight() + bt(this.Wz));
      k = at.combineMeasuredStates(0, z.M(this.Wz));
    }
    for (;;)
    {
      int i2 = i;
      i = k;
      int j = m;
      if (br(this.WD))
      {
        i(this.WD, paramInt1, 0, paramInt2, this.WI);
        i2 = this.WD.getMeasuredWidth() + bs(this.WD);
        j = Math.max(m, this.WD.getMeasuredHeight() + bt(this.WD));
        i = at.combineMeasuredStates(k, z.M(this.WD));
      }
      k = getContentInsetStart();
      int i3 = Math.max(k, i2) + 0;
      localObject[i1] = Math.max(0, k - i2);
      i1 = 0;
      k = i;
      m = j;
      if (br(this.Jo))
      {
        i(this.Jo, paramInt1, i3, paramInt2, this.WI);
        i1 = this.Jo.getMeasuredWidth() + bs(this.Jo);
        m = Math.max(j, this.Jo.getMeasuredHeight() + bt(this.Jo));
        k = at.combineMeasuredStates(i, z.M(this.Jo));
      }
      i = getContentInsetEnd();
      i2 = i3 + Math.max(i, i1);
      localObject[n] = Math.max(0, i - i1);
      n = i2;
      i = k;
      j = m;
      if (br(this.WE))
      {
        n = i2 + a(this.WE, paramInt1, i2, paramInt2, 0, (int[])localObject);
        j = Math.max(m, this.WE.getMeasuredHeight() + bt(this.WE));
        i = at.combineMeasuredStates(k, z.M(this.WE));
      }
      k = n;
      i1 = i;
      m = j;
      if (br(this.WA))
      {
        k = n + a(this.WA, paramInt1, n, paramInt2, 0, (int[])localObject);
        m = Math.max(j, this.WA.getMeasuredHeight() + bt(this.WA));
        i1 = at.combineMeasuredStates(i, z.M(this.WA));
      }
      i2 = getChildCount();
      n = 0;
      i = i1;
      j = m;
      m = n;
      i1 = k;
      label512:
      if (m < i2)
      {
        View localView = getChildAt(m);
        if ((((LayoutParams)localView.getLayoutParams()).Xe != 0) || (!br(localView))) {
          break label995;
        }
        i1 += a(localView, paramInt1, i1, paramInt2, 0, (int[])localObject);
        k = Math.max(j, localView.getMeasuredHeight() + bt(localView));
        j = at.combineMeasuredStates(i, z.M(localView));
      }
      for (i = k;; i = k)
      {
        m += 1;
        k = i;
        i = j;
        j = k;
        break label512;
        n = 1;
        i1 = 0;
        break;
        n = 0;
        m = 0;
        int i4 = this.WL + this.WM;
        int i5 = this.WJ + this.WK;
        k = i;
        if (br(this.Wx))
        {
          a(this.Wx, paramInt1, i1 + i5, paramInt2, i4, (int[])localObject);
          k = this.Wx.getMeasuredWidth();
          n = bs(this.Wx) + k;
          m = this.Wx.getMeasuredHeight() + bt(this.Wx);
          k = at.combineMeasuredStates(i, z.M(this.Wx));
        }
        i3 = m;
        i2 = n;
        i = k;
        if (br(this.Wy))
        {
          i2 = Math.max(n, a(this.Wy, paramInt1, i1 + i5, paramInt2, i4 + m, (int[])localObject));
          i3 = m + (this.Wy.getMeasuredHeight() + bt(this.Wy));
          i = at.combineMeasuredStates(k, z.M(this.Wy));
        }
        k = Math.max(j, i3);
        j = getPaddingLeft();
        i3 = getPaddingRight();
        m = getPaddingTop();
        n = getPaddingBottom();
        j = z.resolveSizeAndState(Math.max(i2 + i1 + (j + i3), getSuggestedMinimumWidth()), paramInt1, 0xFF000000 & i);
        paramInt2 = z.resolveSizeAndState(Math.max(k + (m + n), getSuggestedMinimumHeight()), paramInt2, i << 16);
        if (!this.Xa) {
          paramInt1 = 0;
        }
        for (;;)
        {
          if (paramInt1 != 0) {
            paramInt2 = 0;
          }
          setMeasuredDimension(j, paramInt2);
          return;
          i = getChildCount();
          paramInt1 = 0;
          for (;;)
          {
            if (paramInt1 >= i) {
              break label990;
            }
            localObject = getChildAt(paramInt1);
            if ((br((View)localObject)) && (((View)localObject).getMeasuredWidth() > 0) && (((View)localObject).getMeasuredHeight() > 0))
            {
              paramInt1 = 0;
              break;
            }
            paramInt1 += 1;
          }
          label990:
          paramInt1 = 1;
        }
        label995:
        k = j;
        j = i;
      }
      label1008:
      k = 0;
      m = 0;
    }
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof SavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    SavedState localSavedState = (SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    if (this.Jo != null) {}
    for (paramParcelable = this.Jo.bq;; paramParcelable = null)
    {
      if ((localSavedState.Xf != 0) && (this.WZ != null) && (paramParcelable != null))
      {
        paramParcelable = paramParcelable.findItem(localSavedState.Xf);
        if (paramParcelable != null) {
          m.b(paramParcelable);
        }
      }
      if (!localSavedState.Xg) {
        break;
      }
      removeCallbacks(this.Xb);
      post(this.Xb);
      return;
    }
  }
  
  public void onRtlPropertiesChanged(int paramInt)
  {
    boolean bool = true;
    if (Build.VERSION.SDK_INT >= 17) {
      super.onRtlPropertiesChanged(paramInt);
    }
    ag localag = this.WN;
    if (paramInt == 1) {
      if (bool != localag.dx)
      {
        localag.dx = bool;
        if (!localag.Tz) {
          break label164;
        }
        if (!bool) {
          break label109;
        }
        if (localag.tK == Integer.MIN_VALUE) {
          break label93;
        }
        paramInt = localag.tK;
        label63:
        localag.Tu = paramInt;
        if (localag.Tw == Integer.MIN_VALUE) {
          break label101;
        }
      }
    }
    label93:
    label101:
    for (paramInt = localag.Tw;; paramInt = localag.Ty)
    {
      localag.Tv = paramInt;
      return;
      bool = false;
      break;
      paramInt = localag.Tx;
      break label63;
    }
    label109:
    if (localag.Tw != Integer.MIN_VALUE)
    {
      paramInt = localag.Tw;
      localag.Tu = paramInt;
      if (localag.tK == Integer.MIN_VALUE) {
        break label156;
      }
    }
    label156:
    for (paramInt = localag.tK;; paramInt = localag.Ty)
    {
      localag.Tv = paramInt;
      return;
      paramInt = localag.Tx;
      break;
    }
    label164:
    localag.Tu = localag.Tx;
    localag.Tv = localag.Ty;
  }
  
  protected Parcelable onSaveInstanceState()
  {
    SavedState localSavedState = new SavedState(super.onSaveInstanceState());
    if ((this.WZ != null) && (this.WZ.Xd != null)) {
      localSavedState.Xf = this.WZ.Xd.getItemId();
    }
    localSavedState.Xg = isOverflowMenuShowing();
    return localSavedState;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = o.d(paramMotionEvent);
    if (i == 0) {
      this.Js = false;
    }
    if (!this.Js)
    {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      if ((i == 0) && (!bool)) {
        this.Js = true;
      }
    }
    if ((i == 1) || (i == 3)) {
      this.Js = false;
    }
    return true;
  }
  
  public void setCollapsible(boolean paramBoolean)
  {
    this.Xa = paramBoolean;
    requestLayout();
  }
  
  public void setLogo(int paramInt)
  {
    setLogo(this.Mb.a(getContext(), paramInt, false));
  }
  
  public void setLogo(Drawable paramDrawable)
  {
    if (paramDrawable != null)
    {
      ha();
      if (!bu(this.WA)) {
        d(this.WA, true);
      }
    }
    for (;;)
    {
      if (this.WA != null) {
        this.WA.setImageDrawable(paramDrawable);
      }
      return;
      if ((this.WA != null) && (bu(this.WA)))
      {
        removeView(this.WA);
        this.WT.remove(this.WA);
      }
    }
  }
  
  public void setLogoDescription(int paramInt)
  {
    setLogoDescription(getContext().getText(paramInt));
  }
  
  public void setLogoDescription(CharSequence paramCharSequence)
  {
    if (!TextUtils.isEmpty(paramCharSequence)) {
      ha();
    }
    if (this.WA != null) {
      this.WA.setContentDescription(paramCharSequence);
    }
  }
  
  public void setNavigationContentDescription(int paramInt)
  {
    if (paramInt != 0) {}
    for (CharSequence localCharSequence = getContext().getText(paramInt);; localCharSequence = null)
    {
      setNavigationContentDescription(localCharSequence);
      return;
    }
  }
  
  public void setNavigationContentDescription(CharSequence paramCharSequence)
  {
    if (!TextUtils.isEmpty(paramCharSequence)) {
      hd();
    }
    if (this.Wz != null) {
      this.Wz.setContentDescription(paramCharSequence);
    }
  }
  
  public void setNavigationIcon(int paramInt)
  {
    setNavigationIcon(this.Mb.a(getContext(), paramInt, false));
  }
  
  public void setNavigationIcon(Drawable paramDrawable)
  {
    if (paramDrawable != null)
    {
      hd();
      if (!bu(this.Wz)) {
        d(this.Wz, true);
      }
    }
    for (;;)
    {
      if (this.Wz != null) {
        this.Wz.setImageDrawable(paramDrawable);
      }
      return;
      if ((this.Wz != null) && (bu(this.Wz)))
      {
        removeView(this.Wz);
        this.WT.remove(this.Wz);
      }
    }
  }
  
  public void setNavigationOnClickListener(View.OnClickListener paramOnClickListener)
  {
    hd();
    this.Wz.setOnClickListener(paramOnClickListener);
  }
  
  public void setOnMenuItemClickListener(b paramb)
  {
    this.WV = paramb;
  }
  
  public void setOverflowIcon(Drawable paramDrawable)
  {
    hb();
    this.Jo.setOverflowIcon(paramDrawable);
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
  
  public void setSubtitle(int paramInt)
  {
    setSubtitle(getContext().getText(paramInt));
  }
  
  public void setSubtitle(CharSequence paramCharSequence)
  {
    if (!TextUtils.isEmpty(paramCharSequence))
    {
      if (this.Wy == null)
      {
        Context localContext = getContext();
        this.Wy = new TextView(localContext);
        this.Wy.setSingleLine();
        this.Wy.setEllipsize(TextUtils.TruncateAt.END);
        if (this.WG != 0) {
          this.Wy.setTextAppearance(localContext, this.WG);
        }
        if (this.WR != 0) {
          this.Wy.setTextColor(this.WR);
        }
      }
      if (!bu(this.Wy)) {
        d(this.Wy, true);
      }
    }
    for (;;)
    {
      if (this.Wy != null) {
        this.Wy.setText(paramCharSequence);
      }
      this.WP = paramCharSequence;
      return;
      if ((this.Wy != null) && (bu(this.Wy)))
      {
        removeView(this.Wy);
        this.WT.remove(this.Wy);
      }
    }
  }
  
  public void setSubtitleTextColor(int paramInt)
  {
    this.WR = paramInt;
    if (this.Wy != null) {
      this.Wy.setTextColor(paramInt);
    }
  }
  
  public void setTitle(int paramInt)
  {
    setTitle(getContext().getText(paramInt));
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    if (!TextUtils.isEmpty(paramCharSequence))
    {
      if (this.Wx == null)
      {
        Context localContext = getContext();
        this.Wx = new TextView(localContext);
        this.Wx.setSingleLine();
        this.Wx.setEllipsize(TextUtils.TruncateAt.END);
        if (this.WF != 0) {
          this.Wx.setTextAppearance(localContext, this.WF);
        }
        if (this.WQ != 0) {
          this.Wx.setTextColor(this.WQ);
        }
      }
      if (!bu(this.Wx)) {
        d(this.Wx, true);
      }
    }
    for (;;)
    {
      if (this.Wx != null) {
        this.Wx.setText(paramCharSequence);
      }
      this.WO = paramCharSequence;
      return;
      if ((this.Wx != null) && (bu(this.Wx)))
      {
        removeView(this.Wx);
        this.WT.remove(this.Wx);
      }
    }
  }
  
  public void setTitleTextColor(int paramInt)
  {
    this.WQ = paramInt;
    if (this.Wx != null) {
      this.Wx.setTextColor(paramInt);
    }
  }
  
  public final boolean showOverflowMenu()
  {
    if (this.Jo != null)
    {
      ActionMenuView localActionMenuView = this.Jo;
      if ((localActionMenuView.KQ != null) && (localActionMenuView.KQ.showOverflowMenu())) {}
      for (int i = 1; i != 0; i = 0) {
        return true;
      }
    }
    return false;
  }
  
  public static class LayoutParams
    extends ActionBar.LayoutParams
  {
    int Xe = 0;
    
    public LayoutParams()
    {
      this.gravity = 8388627;
    }
    
    public LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
    }
    
    public LayoutParams(ActionBar.LayoutParams paramLayoutParams)
    {
      super();
    }
    
    public LayoutParams(LayoutParams paramLayoutParams)
    {
      super();
      this.Xe = paramLayoutParams.Xe;
    }
    
    public LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
    
    public LayoutParams(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      super();
      this.leftMargin = paramMarginLayoutParams.leftMargin;
      this.topMargin = paramMarginLayoutParams.topMargin;
      this.rightMargin = paramMarginLayoutParams.rightMargin;
      this.bottomMargin = paramMarginLayoutParams.bottomMargin;
    }
  }
  
  public static class SavedState
    extends View.BaseSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator() {};
    int Xf;
    boolean Xg;
    
    public SavedState(Parcel paramParcel)
    {
      super();
      this.Xf = paramParcel.readInt();
      if (paramParcel.readInt() != 0) {}
      for (boolean bool = true;; bool = false)
      {
        this.Xg = bool;
        return;
      }
    }
    
    public SavedState(Parcelable paramParcelable)
    {
      super();
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(this.Xf);
      if (this.Xg) {}
      for (paramInt = 1;; paramInt = 0)
      {
        paramParcel.writeInt(paramInt);
        return;
      }
    }
  }
  
  private final class a
    implements android.support.v7.view.menu.l
  {
    android.support.v7.view.menu.h Xd;
    android.support.v7.view.menu.f bq;
    
    private a() {}
    
    public final boolean N()
    {
      return false;
    }
    
    public final void a(Context paramContext, android.support.v7.view.menu.f paramf)
    {
      if ((this.bq != null) && (this.Xd != null)) {
        this.bq.h(this.Xd);
      }
      this.bq = paramf;
    }
    
    public final void a(android.support.v7.view.menu.f paramf, boolean paramBoolean) {}
    
    public final boolean a(p paramp)
    {
      return false;
    }
    
    public final boolean b(android.support.v7.view.menu.h paramh)
    {
      Toolbar.b(Toolbar.this);
      if (Toolbar.c(Toolbar.this).getParent() != Toolbar.this) {
        Toolbar.this.addView(Toolbar.c(Toolbar.this));
      }
      Toolbar.this.WE = paramh.getActionView();
      this.Xd = paramh;
      if (Toolbar.this.WE.getParent() != Toolbar.this)
      {
        localObject = Toolbar.he();
        ((Toolbar.LayoutParams)localObject).gravity = (0x800003 | Toolbar.d(Toolbar.this) & 0x70);
        ((Toolbar.LayoutParams)localObject).Xe = 2;
        Toolbar.this.WE.setLayoutParams((ViewGroup.LayoutParams)localObject);
        Toolbar.this.addView(Toolbar.this.WE);
      }
      Object localObject = Toolbar.this;
      int i = ((Toolbar)localObject).getChildCount() - 1;
      while (i >= 0)
      {
        View localView = ((Toolbar)localObject).getChildAt(i);
        if ((((Toolbar.LayoutParams)localView.getLayoutParams()).Xe != 2) && (localView != ((Toolbar)localObject).Jo))
        {
          ((Toolbar)localObject).removeViewAt(i);
          ((Toolbar)localObject).WT.add(localView);
        }
        i -= 1;
      }
      Toolbar.this.requestLayout();
      paramh.O(true);
      if ((Toolbar.this.WE instanceof c)) {
        ((c)Toolbar.this.WE).onActionViewExpanded();
      }
      return true;
    }
    
    public final boolean c(android.support.v7.view.menu.h paramh)
    {
      if ((Toolbar.this.WE instanceof c)) {
        ((c)Toolbar.this.WE).onActionViewCollapsed();
      }
      Toolbar.this.removeView(Toolbar.this.WE);
      Toolbar.this.removeView(Toolbar.c(Toolbar.this));
      Toolbar.this.WE = null;
      Toolbar localToolbar = Toolbar.this;
      int i = localToolbar.WT.size() - 1;
      while (i >= 0)
      {
        localToolbar.addView((View)localToolbar.WT.get(i));
        i -= 1;
      }
      localToolbar.WT.clear();
      this.Xd = null;
      Toolbar.this.requestLayout();
      paramh.O(false);
      return true;
    }
    
    public final int getId()
    {
      return 0;
    }
    
    public final void n(boolean paramBoolean)
    {
      int k = 0;
      int j;
      int m;
      int i;
      if (this.Xd != null)
      {
        j = k;
        if (this.bq != null)
        {
          m = this.bq.size();
          i = 0;
        }
      }
      for (;;)
      {
        j = k;
        if (i < m)
        {
          if (this.bq.getItem(i) == this.Xd) {
            j = 1;
          }
        }
        else
        {
          if (j == 0) {
            c(this.Xd);
          }
          return;
        }
        i += 1;
      }
    }
    
    public final void onRestoreInstanceState(Parcelable paramParcelable) {}
    
    public final Parcelable onSaveInstanceState()
    {
      return null;
    }
  }
  
  public static abstract interface b
  {
    public abstract boolean onMenuItemClick(MenuItem paramMenuItem);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/Toolbar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */