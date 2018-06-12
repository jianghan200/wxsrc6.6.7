package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.f;
import android.support.v4.view.z;
import android.support.v7.a.a.k;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

public class LinearLayoutCompat
  extends ViewGroup
{
  private boolean OQ = true;
  private int OR = -1;
  private int OS = 0;
  private int OT;
  private int OU;
  private float OV;
  private boolean OW;
  private int[] OX;
  private int[] OY;
  private Drawable OZ;
  private int Pa;
  private int Pb;
  private int Pc;
  private int Pd;
  private int rA = 8388659;
  
  public LinearLayoutCompat(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public LinearLayoutCompat(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = ap.a(paramContext, paramAttributeSet, a.k.LinearLayoutCompat, paramInt);
    paramInt = paramContext.getInt(a.k.LinearLayoutCompat_android_orientation, -1);
    if (paramInt >= 0) {
      setOrientation(paramInt);
    }
    paramInt = paramContext.getInt(a.k.LinearLayoutCompat_android_gravity, -1);
    if (paramInt >= 0) {
      setGravity(paramInt);
    }
    boolean bool = paramContext.getBoolean(a.k.LinearLayoutCompat_android_baselineAligned, true);
    if (!bool) {
      setBaselineAligned(bool);
    }
    paramInt = a.k.LinearLayoutCompat_android_weightSum;
    this.OV = paramContext.Ww.getFloat(paramInt, -1.0F);
    this.OR = paramContext.getInt(a.k.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
    this.OW = paramContext.getBoolean(a.k.LinearLayoutCompat_measureWithLargestChild, false);
    setDividerDrawable(paramContext.getDrawable(a.k.LinearLayoutCompat_divider));
    this.Pc = paramContext.getInt(a.k.LinearLayoutCompat_showDividers, 0);
    this.Pd = paramContext.getDimensionPixelSize(a.k.LinearLayoutCompat_dividerPadding, 0);
    paramContext.Ww.recycle();
  }
  
  private void M(int paramInt1, int paramInt2)
  {
    int j = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
    int i = 0;
    while (i < paramInt1)
    {
      View localView = getChildAt(i);
      if (localView.getVisibility() != 8)
      {
        LayoutParams localLayoutParams = (LayoutParams)localView.getLayoutParams();
        if (localLayoutParams.width == -1)
        {
          int k = localLayoutParams.height;
          localLayoutParams.height = localView.getMeasuredHeight();
          measureChildWithMargins(localView, j, 0, paramInt2, 0);
          localLayoutParams.height = k;
        }
      }
      i += 1;
    }
  }
  
  private void N(int paramInt1, int paramInt2)
  {
    this.OU = 0;
    int m = 0;
    int j = 0;
    int i1 = 0;
    int i2 = 0;
    int k = 1;
    float f1 = 0.0F;
    int i10 = getVirtualChildCount();
    int i12 = View.MeasureSpec.getMode(paramInt1);
    int i11 = View.MeasureSpec.getMode(paramInt2);
    int n = 0;
    int i3 = 0;
    if ((this.OX == null) || (this.OY == null))
    {
      this.OX = new int[4];
      this.OY = new int[4];
    }
    Object localObject1 = this.OX;
    Object localObject2 = this.OY;
    localObject1[3] = -1;
    localObject1[2] = -1;
    localObject1[1] = -1;
    localObject1[0] = -1;
    localObject2[3] = -1;
    localObject2[2] = -1;
    localObject2[1] = -1;
    localObject2[0] = -1;
    boolean bool1 = this.OQ;
    boolean bool2 = this.OW;
    if (i12 == 1073741824) {}
    int i;
    int i4;
    Object localObject3;
    int i5;
    for (int i6 = 1;; i6 = 0)
    {
      i = Integer.MIN_VALUE;
      for (i4 = 0;; i4 = i5)
      {
        if (i4 >= i10) {
          break label866;
        }
        localObject3 = getChildAt(i4);
        if (localObject3 != null) {
          break;
        }
        this.OU += 0;
        i5 = i4;
        i4 = m;
        m = i2;
        i5 += 1;
        i2 = m;
        m = i4;
      }
    }
    LayoutParams localLayoutParams;
    label324:
    label345:
    int i7;
    label370:
    int i8;
    int i9;
    if (((View)localObject3).getVisibility() != 8)
    {
      if (bd(i4)) {
        this.OU += this.Pa;
      }
      localLayoutParams = (LayoutParams)((View)localObject3).getLayoutParams();
      f1 += localLayoutParams.weight;
      if ((i12 == 1073741824) && (localLayoutParams.width == 0) && (localLayoutParams.weight > 0.0F)) {
        if (i6 != 0)
        {
          this.OU += localLayoutParams.leftMargin + localLayoutParams.rightMargin;
          if (!bool1) {
            break label623;
          }
          i5 = View.MeasureSpec.makeMeasureSpec(0, 0);
          ((View)localObject3).measure(i5, i5);
          i7 = 0;
          if ((i11 == 1073741824) || (localLayoutParams.height != -1)) {
            break label2251;
          }
          i5 = 1;
          n = 1;
          i7 = localLayoutParams.topMargin + localLayoutParams.bottomMargin;
          i8 = ((View)localObject3).getMeasuredHeight() + i7;
          j = at.combineMeasuredStates(j, z.M((View)localObject3));
          if (bool1)
          {
            int i13 = ((View)localObject3).getBaseline();
            if (i13 != -1)
            {
              if (localLayoutParams.gravity >= 0) {
                break label803;
              }
              i9 = this.rA;
              label437:
              i9 = ((i9 & 0x70) >> 4 & 0xFFFFFFFE) >> 1;
              localObject1[i9] = Math.max(localObject1[i9], i13);
              localObject2[i9] = Math.max(localObject2[i9], i8 - i13);
            }
          }
          i9 = Math.max(m, i8);
          if ((k == 0) || (localLayoutParams.height != -1)) {
            break label813;
          }
          m = 1;
          label510:
          if (localLayoutParams.weight <= 0.0F) {
            break label826;
          }
          if (n == 0) {
            break label819;
          }
          label525:
          k = Math.max(i2, i7);
          n = i3;
          i2 = i9;
          i3 = m;
        }
      }
    }
    for (;;)
    {
      i8 = i4 + 0;
      m = n;
      n = i5;
      i4 = i3;
      i7 = k;
      i5 = i8;
      i3 = m;
      k = i4;
      m = i7;
      i4 = i2;
      break;
      i5 = this.OU;
      this.OU = Math.max(i5, localLayoutParams.leftMargin + i5 + localLayoutParams.rightMargin);
      break label324;
      label623:
      i3 = 1;
      break label345;
      i7 = Integer.MIN_VALUE;
      i5 = i7;
      if (localLayoutParams.width == 0)
      {
        i5 = i7;
        if (localLayoutParams.weight > 0.0F)
        {
          i5 = 0;
          localLayoutParams.width = -2;
        }
      }
      if (f1 == 0.0F)
      {
        i7 = this.OU;
        label681:
        e((View)localObject3, paramInt1, i7, paramInt2, 0);
        if (i5 != Integer.MIN_VALUE) {
          localLayoutParams.width = i5;
        }
        i5 = ((View)localObject3).getMeasuredWidth();
        if (i6 == 0) {
          break label766;
        }
        this.OU += localLayoutParams.leftMargin + i5 + localLayoutParams.rightMargin + 0;
      }
      for (;;)
      {
        if (bool2)
        {
          i = Math.max(i5, i);
          break;
          i7 = 0;
          break label681;
          label766:
          i7 = this.OU;
          this.OU = Math.max(i7, i7 + i5 + localLayoutParams.leftMargin + localLayoutParams.rightMargin + 0);
          continue;
          label803:
          i9 = localLayoutParams.gravity;
          break label437;
          label813:
          m = 0;
          break label510;
          label819:
          i7 = i8;
          break label525;
          label826:
          if (n != 0) {}
          for (;;)
          {
            i1 = Math.max(i1, i7);
            n = i3;
            k = i2;
            i3 = m;
            i2 = i9;
            break;
            i7 = i8;
          }
          label866:
          if ((this.OU > 0) && (bd(i10))) {
            this.OU += this.Pa;
          }
          if ((localObject1[1] != -1) || (localObject1[0] != -1) || (localObject1[2] != -1) || (localObject1[3] != -1)) {}
          for (i4 = Math.max(m, Math.max(localObject1[3], Math.max(localObject1[0], Math.max(localObject1[1], localObject1[2]))) + Math.max(localObject2[3], Math.max(localObject2[0], Math.max(localObject2[1], localObject2[2]))));; i4 = m)
          {
            if ((bool2) && ((i12 == Integer.MIN_VALUE) || (i12 == 0)))
            {
              this.OU = 0;
              m = 0;
              if (m < i10)
              {
                localObject3 = getChildAt(m);
                if (localObject3 == null) {
                  this.OU += 0;
                }
                for (;;)
                {
                  m += 1;
                  break;
                  if (((View)localObject3).getVisibility() == 8)
                  {
                    m += 0;
                  }
                  else
                  {
                    localObject3 = (LayoutParams)((View)localObject3).getLayoutParams();
                    if (i6 != 0)
                    {
                      i5 = this.OU;
                      i7 = ((LayoutParams)localObject3).leftMargin;
                      this.OU = (((LayoutParams)localObject3).rightMargin + (i7 + i) + 0 + i5);
                    }
                    else
                    {
                      i5 = this.OU;
                      i7 = ((LayoutParams)localObject3).leftMargin;
                      this.OU = Math.max(i5, ((LayoutParams)localObject3).rightMargin + (i5 + i + i7) + 0);
                    }
                  }
                }
              }
            }
            this.OU += getPaddingLeft() + getPaddingRight();
            i8 = z.resolveSizeAndState(Math.max(this.OU, getSuggestedMinimumWidth()), paramInt1, 0);
            i5 = (0xFFFFFF & i8) - this.OU;
            if ((i3 != 0) || ((i5 != 0) && (f1 > 0.0F)))
            {
              if (this.OV > 0.0F) {
                f1 = this.OV;
              }
              localObject1[3] = -1;
              localObject1[2] = -1;
              localObject1[1] = -1;
              localObject1[0] = -1;
              localObject2[3] = -1;
              localObject2[2] = -1;
              localObject2[1] = -1;
              localObject2[0] = -1;
              m = -1;
              this.OU = 0;
              i2 = 0;
              i3 = k;
              i = i1;
              k = m;
              m = j;
              j = i3;
              i1 = i5;
              if (i2 < i10)
              {
                localObject3 = getChildAt(i2);
                if ((localObject3 == null) || (((View)localObject3).getVisibility() == 8)) {
                  break label2225;
                }
                localLayoutParams = (LayoutParams)((View)localObject3).getLayoutParams();
                float f2 = localLayoutParams.weight;
                if (f2 <= 0.0F) {
                  break label2222;
                }
                i4 = (int)(i1 * f2 / f1);
                f1 -= f2;
                i3 = i1 - i4;
                i5 = getChildMeasureSpec(paramInt2, getPaddingTop() + getPaddingBottom() + localLayoutParams.topMargin + localLayoutParams.bottomMargin, localLayoutParams.height);
                if ((localLayoutParams.width != 0) || (i12 != 1073741824))
                {
                  i4 += ((View)localObject3).getMeasuredWidth();
                  i1 = i4;
                  if (i4 < 0) {
                    i1 = 0;
                  }
                  label1459:
                  ((View)localObject3).measure(View.MeasureSpec.makeMeasureSpec(i1, 1073741824), i5);
                  m = at.combineMeasuredStates(m, z.M((View)localObject3) & 0xFF000000);
                  i1 = i3;
                  label1493:
                  if (i6 == 0) {
                    break label1754;
                  }
                  this.OU += ((View)localObject3).getMeasuredWidth() + localLayoutParams.leftMargin + localLayoutParams.rightMargin + 0;
                  label1526:
                  if ((i11 == 1073741824) || (localLayoutParams.height != -1)) {
                    break label1794;
                  }
                  i3 = 1;
                  label1545:
                  i7 = localLayoutParams.topMargin + localLayoutParams.bottomMargin;
                  i5 = ((View)localObject3).getMeasuredHeight() + i7;
                  i4 = Math.max(k, i5);
                  if (i3 == 0) {
                    break label1800;
                  }
                  k = i7;
                  label1586:
                  i3 = Math.max(i, k);
                  if ((j == 0) || (localLayoutParams.height != -1)) {
                    break label1807;
                  }
                  i = 1;
                  label1612:
                  if (bool1)
                  {
                    k = ((View)localObject3).getBaseline();
                    if (k != -1)
                    {
                      if (localLayoutParams.gravity >= 0) {
                        break label1813;
                      }
                      j = this.rA;
                      label1644:
                      j = ((j & 0x70) >> 4 & 0xFFFFFFFE) >> 1;
                      localObject1[j] = Math.max(localObject1[j], k);
                      localObject2[j] = Math.max(localObject2[j], i5 - k);
                    }
                  }
                  k = i;
                  j = i3;
                  i = i4;
                }
              }
            }
            for (;;)
            {
              i4 = i2 + 1;
              i2 = k;
              i3 = j;
              k = i;
              j = i2;
              i = i3;
              i2 = i4;
              break;
              if (i4 > 0)
              {
                i1 = i4;
                break label1459;
              }
              i1 = 0;
              break label1459;
              label1754:
              i3 = this.OU;
              this.OU = Math.max(i3, ((View)localObject3).getMeasuredWidth() + i3 + localLayoutParams.leftMargin + localLayoutParams.rightMargin + 0);
              break label1526;
              label1794:
              i3 = 0;
              break label1545;
              label1800:
              k = i5;
              break label1586;
              label1807:
              i = 0;
              break label1612;
              label1813:
              j = localLayoutParams.gravity;
              break label1644;
              this.OU += getPaddingLeft() + getPaddingRight();
              if ((localObject1[1] == -1) && (localObject1[0] == -1) && (localObject1[2] == -1))
              {
                i1 = k;
                if (localObject1[3] == -1) {}
              }
              else
              {
                i1 = Math.max(k, Math.max(localObject1[3], Math.max(localObject1[0], Math.max(localObject1[1], localObject1[2]))) + Math.max(localObject2[3], Math.max(localObject2[0], Math.max(localObject2[1], localObject2[2]))));
              }
              k = j;
              j = m;
              for (m = i1;; m = i4)
              {
                if ((k == 0) && (i11 != 1073741824)) {}
                for (;;)
                {
                  setMeasuredDimension(0xFF000000 & j | i8, z.resolveSizeAndState(Math.max(i + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight()), paramInt2, j << 16));
                  if (n != 0)
                  {
                    i = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                    paramInt2 = 0;
                    while (paramInt2 < i10)
                    {
                      localObject1 = getChildAt(paramInt2);
                      if (((View)localObject1).getVisibility() != 8)
                      {
                        localObject2 = (LayoutParams)((View)localObject1).getLayoutParams();
                        if (((LayoutParams)localObject2).height == -1)
                        {
                          j = ((LayoutParams)localObject2).width;
                          ((LayoutParams)localObject2).width = ((View)localObject1).getMeasuredWidth();
                          measureChildWithMargins((View)localObject1, paramInt1, 0, i, 0);
                          ((LayoutParams)localObject2).width = j;
                        }
                      }
                      paramInt2 += 1;
                      continue;
                      i1 = Math.max(i1, i2);
                      if ((!bool2) || (i12 == 1073741824)) {
                        break label2211;
                      }
                      m = 0;
                      while (m < i10)
                      {
                        localObject1 = getChildAt(m);
                        if ((localObject1 != null) && (((View)localObject1).getVisibility() != 8) && (((LayoutParams)((View)localObject1).getLayoutParams()).weight > 0.0F)) {
                          ((View)localObject1).measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(((View)localObject1).getMeasuredHeight(), 1073741824));
                        }
                        m += 1;
                      }
                    }
                  }
                  return;
                  i = m;
                }
                label2211:
                i = i1;
              }
              label2222:
              break label1493;
              label2225:
              i3 = i;
              i = k;
              k = j;
              j = i3;
            }
          }
          label2251:
          i5 = n;
          n = i7;
          break label370;
        }
      }
      break label345;
      i7 = i3;
      i3 = k;
      k = i2;
      i5 = n;
      n = i7;
      i2 = m;
    }
  }
  
  private void b(Canvas paramCanvas, int paramInt)
  {
    this.OZ.setBounds(getPaddingLeft() + this.Pd, paramInt, getWidth() - getPaddingRight() - this.Pd, this.Pb + paramInt);
    this.OZ.draw(paramCanvas);
  }
  
  private boolean bd(int paramInt)
  {
    if (paramInt == 0) {
      if ((this.Pc & 0x1) == 0) {}
    }
    do
    {
      return true;
      return false;
      if (paramInt != getChildCount()) {
        break;
      }
    } while ((this.Pc & 0x4) != 0);
    return false;
    if ((this.Pc & 0x2) != 0)
    {
      paramInt -= 1;
      for (;;)
      {
        if (paramInt < 0) {
          break label75;
        }
        if (getChildAt(paramInt).getVisibility() != 8) {
          break;
        }
        paramInt -= 1;
      }
    }
    return false;
    label75:
    return false;
  }
  
  private void c(Canvas paramCanvas, int paramInt)
  {
    this.OZ.setBounds(paramInt, getPaddingTop() + this.Pd, this.Pa + paramInt, getHeight() - getPaddingBottom() - this.Pd);
    this.OZ.draw(paramCanvas);
  }
  
  private void e(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    measureChildWithMargins(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  private static void f(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramView.layout(paramInt1, paramInt2, paramInt1 + paramInt3, paramInt2 + paramInt4);
  }
  
  private static int getChildrenSkipCount$5359dca7()
  {
    return 0;
  }
  
  private static int getLocationOffset$3c7ec8d0()
  {
    return 0;
  }
  
  private static int getNextLocationOffset$3c7ec8d0()
  {
    return 0;
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof LayoutParams;
  }
  
  public LayoutParams d(AttributeSet paramAttributeSet)
  {
    return new LayoutParams(getContext(), paramAttributeSet);
  }
  
  protected LayoutParams d(ViewGroup.LayoutParams paramLayoutParams)
  {
    return new LayoutParams(paramLayoutParams);
  }
  
  protected LayoutParams ep()
  {
    if (this.OT == 0) {
      return new LayoutParams(-2, -2);
    }
    if (this.OT == 1) {
      return new LayoutParams(-1, -2);
    }
    return null;
  }
  
  public int getBaseline()
  {
    int i = -1;
    if (this.OR < 0) {
      i = super.getBaseline();
    }
    View localView;
    int j;
    do
    {
      return i;
      if (getChildCount() <= this.OR) {
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
      }
      localView = getChildAt(this.OR);
      j = localView.getBaseline();
      if (j != -1) {
        break;
      }
    } while (this.OR == 0);
    throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
    i = this.OS;
    if (this.OT == 1)
    {
      int k = this.rA & 0x70;
      if (k != 48) {
        switch (k)
        {
        }
      }
    }
    for (;;)
    {
      return ((LayoutParams)localView.getLayoutParams()).topMargin + i + j;
      i = getBottom() - getTop() - getPaddingBottom() - this.OU;
      continue;
      i += (getBottom() - getTop() - getPaddingTop() - getPaddingBottom() - this.OU) / 2;
    }
  }
  
  public int getBaselineAlignedChildIndex()
  {
    return this.OR;
  }
  
  public Drawable getDividerDrawable()
  {
    return this.OZ;
  }
  
  public int getDividerPadding()
  {
    return this.Pd;
  }
  
  public int getDividerWidth()
  {
    return this.Pa;
  }
  
  public int getOrientation()
  {
    return this.OT;
  }
  
  public int getShowDividers()
  {
    return this.Pc;
  }
  
  int getVirtualChildCount()
  {
    return getChildCount();
  }
  
  public float getWeightSum()
  {
    return this.OV;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    if (this.OZ == null) {}
    int i;
    LayoutParams localLayoutParams;
    int k;
    boolean bool;
    label259:
    do
    {
      int j;
      do
      {
        return;
        if (this.OT != 1) {
          break;
        }
        j = getVirtualChildCount();
        i = 0;
        while (i < j)
        {
          localView = getChildAt(i);
          if ((localView != null) && (localView.getVisibility() != 8) && (bd(i)))
          {
            localLayoutParams = (LayoutParams)localView.getLayoutParams();
            b(paramCanvas, localView.getTop() - localLayoutParams.topMargin - this.Pb);
          }
          i += 1;
        }
      } while (!bd(j));
      localView = getChildAt(j - 1);
      if (localView == null) {}
      for (i = getHeight() - getPaddingBottom() - this.Pb;; i = localLayoutParams.bottomMargin + i)
      {
        b(paramCanvas, i);
        return;
        localLayoutParams = (LayoutParams)localView.getLayoutParams();
        i = localView.getBottom();
      }
      k = getVirtualChildCount();
      bool = at.bv(this);
      i = 0;
      if (i < k)
      {
        localView = getChildAt(i);
        if ((localView != null) && (localView.getVisibility() != 8) && (bd(i)))
        {
          localLayoutParams = (LayoutParams)localView.getLayoutParams();
          if (!bool) {
            break label259;
          }
          j = localView.getRight();
        }
        for (j = localLayoutParams.rightMargin + j;; j = localView.getLeft() - localLayoutParams.leftMargin - this.Pa)
        {
          c(paramCanvas, j);
          i += 1;
          break;
        }
      }
    } while (!bd(k));
    View localView = getChildAt(k - 1);
    if (localView == null) {
      if (bool) {
        i = getPaddingLeft();
      }
    }
    for (;;)
    {
      c(paramCanvas, i);
      return;
      i = getWidth() - getPaddingRight() - this.Pa;
      continue;
      localLayoutParams = (LayoutParams)localView.getLayoutParams();
      if (bool)
      {
        i = localView.getLeft() - localLayoutParams.leftMargin - this.Pa;
      }
      else
      {
        i = localView.getRight();
        i = localLayoutParams.rightMargin + i;
      }
    }
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
      paramAccessibilityEvent.setClassName(LinearLayoutCompat.class.getName());
    }
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
      paramAccessibilityNodeInfo.setClassName(LinearLayoutCompat.class.getName());
    }
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i;
    int j;
    int k;
    int m;
    int n;
    int i1;
    label93:
    Object localObject1;
    if (this.OT == 1)
    {
      i = getPaddingLeft();
      j = paramInt3 - paramInt1;
      k = getPaddingRight();
      m = getPaddingRight();
      n = getVirtualChildCount();
      paramInt1 = this.rA;
      i1 = this.rA;
      switch (paramInt1 & 0x70)
      {
      default: 
        paramInt1 = getPaddingTop();
        paramInt3 = 0;
        paramInt2 = paramInt1;
        paramInt1 = paramInt3;
        if (paramInt1 < n)
        {
          localObject1 = getChildAt(paramInt1);
          if (localObject1 == null) {
            paramInt2 += 0;
          }
        }
        break;
      }
    }
    for (;;)
    {
      paramInt1 += 1;
      break label93;
      paramInt1 = getPaddingTop() + paramInt4 - paramInt2 - this.OU;
      break;
      paramInt1 = getPaddingTop() + (paramInt4 - paramInt2 - this.OU) / 2;
      break;
      if (((View)localObject1).getVisibility() != 8)
      {
        int i2 = ((View)localObject1).getMeasuredWidth();
        int i3 = ((View)localObject1).getMeasuredHeight();
        Object localObject2 = (LayoutParams)((View)localObject1).getLayoutParams();
        paramInt4 = ((LayoutParams)localObject2).gravity;
        paramInt3 = paramInt4;
        if (paramInt4 < 0) {
          paramInt3 = 0x800007 & i1;
        }
        switch (f.getAbsoluteGravity(paramInt3, z.I(this)) & 0x7)
        {
        default: 
          paramInt3 = ((LayoutParams)localObject2).leftMargin + i;
        }
        for (;;)
        {
          paramInt4 = paramInt2;
          if (bd(paramInt1)) {
            paramInt4 = paramInt2 + this.Pb;
          }
          paramInt2 = paramInt4 + ((LayoutParams)localObject2).topMargin;
          f((View)localObject1, paramInt3, paramInt2 + 0, i2, i3);
          paramInt2 += ((LayoutParams)localObject2).bottomMargin + i3 + 0;
          paramInt1 += 0;
          break;
          paramInt3 = (j - i - m - i2) / 2 + i + ((LayoutParams)localObject2).leftMargin - ((LayoutParams)localObject2).rightMargin;
          continue;
          paramInt3 = j - k - i2 - ((LayoutParams)localObject2).rightMargin;
        }
        paramBoolean = at.bv(this);
        k = getPaddingTop();
        n = paramInt4 - paramInt2;
        i1 = getPaddingBottom();
        i2 = getPaddingBottom();
        i3 = getVirtualChildCount();
        paramInt2 = this.rA;
        int i4 = this.rA;
        boolean bool = this.OQ;
        localObject1 = this.OX;
        localObject2 = this.OY;
        switch (f.getAbsoluteGravity(paramInt2 & 0x800007, z.I(this)))
        {
        default: 
          paramInt1 = getPaddingLeft();
          i = 0;
          if (paramBoolean) {
            i = i3 - 1;
          }
          break;
        }
        for (paramInt4 = -1;; paramInt4 = 1)
        {
          paramInt2 = 0;
          paramInt3 = paramInt1;
          label510:
          int i7;
          View localView;
          if (paramInt2 < i3)
          {
            i7 = i + paramInt4 * paramInt2;
            localView = getChildAt(i7);
            if (localView == null)
            {
              paramInt3 += 0;
              paramInt1 = paramInt2;
            }
          }
          for (;;)
          {
            paramInt2 = paramInt1 + 1;
            break label510;
            paramInt1 = getPaddingLeft() + paramInt3 - paramInt1 - this.OU;
            break;
            paramInt1 = getPaddingLeft() + (paramInt3 - paramInt1 - this.OU) / 2;
            break;
            if (localView.getVisibility() != 8)
            {
              int i5 = localView.getMeasuredWidth();
              int i6 = localView.getMeasuredHeight();
              paramInt1 = -1;
              LayoutParams localLayoutParams = (LayoutParams)localView.getLayoutParams();
              j = paramInt1;
              if (bool)
              {
                j = paramInt1;
                if (localLayoutParams.height != -1) {
                  j = localView.getBaseline();
                }
              }
              m = localLayoutParams.gravity;
              paramInt1 = m;
              if (m < 0) {
                paramInt1 = i4 & 0x70;
              }
              switch (paramInt1 & 0x70)
              {
              default: 
                paramInt1 = k;
              }
              label715:
              label895:
              for (;;)
              {
                if (bd(i7)) {
                  paramInt3 = this.Pa + paramInt3;
                }
                for (;;)
                {
                  paramInt3 += localLayoutParams.leftMargin;
                  f(localView, paramInt3 + 0, paramInt1, i5, i6);
                  paramInt3 += localLayoutParams.rightMargin + i5 + 0;
                  paramInt1 = paramInt2 + 0;
                  break;
                  m = localLayoutParams.topMargin + k;
                  paramInt1 = m;
                  if (j == -1) {
                    break label895;
                  }
                  paramInt1 = localObject1[1] - j + m;
                  break label715;
                  paramInt1 = (n - k - i2 - i6) / 2 + k + localLayoutParams.topMargin - localLayoutParams.bottomMargin;
                  break label715;
                  m = n - i1 - i6 - localLayoutParams.bottomMargin;
                  paramInt1 = m;
                  if (j == -1) {
                    break label895;
                  }
                  paramInt1 = localView.getMeasuredHeight();
                  paramInt1 = m - (localObject2[2] - (paramInt1 - j));
                  break label715;
                  return;
                }
              }
            }
            paramInt1 = paramInt2;
          }
        }
      }
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int j;
    int i;
    int i1;
    int i2;
    int k;
    float f1;
    int i9;
    int i10;
    int i11;
    int n;
    int i3;
    boolean bool;
    int m;
    int i4;
    Object localObject;
    int i5;
    LayoutParams localLayoutParams;
    label243:
    int i6;
    label459:
    int i7;
    int i8;
    if (this.OT == 1)
    {
      this.OU = 0;
      j = 0;
      i = 0;
      i1 = 0;
      i2 = 0;
      k = 1;
      f1 = 0.0F;
      i9 = getVirtualChildCount();
      i10 = View.MeasureSpec.getMode(paramInt1);
      i11 = View.MeasureSpec.getMode(paramInt2);
      n = 0;
      i3 = 0;
      int i12 = this.OR;
      bool = this.OW;
      m = Integer.MIN_VALUE;
      i4 = 0;
      for (;;)
      {
        if (i4 < i9)
        {
          localObject = getChildAt(i4);
          if (localObject == null)
          {
            this.OU += 0;
            i5 = i4;
            i4 = j;
            j = i2;
            i5 += 1;
            i2 = j;
            j = i4;
            i4 = i5;
          }
          else
          {
            if (((View)localObject).getVisibility() == 8) {
              break label1619;
            }
            if (bd(i4)) {
              this.OU += this.Pb;
            }
            localLayoutParams = (LayoutParams)((View)localObject).getLayoutParams();
            f1 += localLayoutParams.weight;
            if ((i11 == 1073741824) && (localLayoutParams.height == 0) && (localLayoutParams.weight > 0.0F))
            {
              i3 = this.OU;
              this.OU = Math.max(i3, localLayoutParams.topMargin + i3 + localLayoutParams.bottomMargin);
              i3 = 1;
              if ((i12 >= 0) && (i12 == i4 + 1)) {
                this.OS = this.OU;
              }
              if ((i4 < i12) && (localLayoutParams.weight > 0.0F)) {
                throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
              }
            }
            else
            {
              i6 = Integer.MIN_VALUE;
              i5 = i6;
              if (localLayoutParams.height == 0)
              {
                i5 = i6;
                if (localLayoutParams.weight > 0.0F)
                {
                  i5 = 0;
                  localLayoutParams.height = -2;
                }
              }
              if (f1 == 0.0F) {}
              for (i6 = this.OU;; i6 = 0)
              {
                e((View)localObject, paramInt1, 0, paramInt2, i6);
                if (i5 != Integer.MIN_VALUE) {
                  localLayoutParams.height = i5;
                }
                i5 = ((View)localObject).getMeasuredHeight();
                i6 = this.OU;
                this.OU = Math.max(i6, i6 + i5 + localLayoutParams.topMargin + localLayoutParams.bottomMargin + 0);
                if (!bool) {
                  break label1616;
                }
                m = Math.max(i5, m);
                break;
              }
            }
            i6 = 0;
            if ((i10 == 1073741824) || (localLayoutParams.width != -1)) {
              break label1605;
            }
            i5 = 1;
            n = 1;
            i6 = localLayoutParams.leftMargin + localLayoutParams.rightMargin;
            i7 = ((View)localObject).getMeasuredWidth() + i6;
            i8 = Math.max(j, i7);
            i = at.combineMeasuredStates(i, z.M((View)localObject));
            if ((k != 0) && (localLayoutParams.width == -1))
            {
              j = 1;
              label520:
              if (localLayoutParams.weight <= 0.0F) {
                break label626;
              }
              if (n == 0) {
                break label619;
              }
              label535:
              i6 = Math.max(i2, i6);
              k = m;
              n = i3;
              i2 = i8;
              m = i6;
              i3 = j;
            }
          }
        }
      }
    }
    for (;;)
    {
      i7 = i4 + 0;
      j = n;
      n = i5;
      i4 = i3;
      i6 = m;
      i5 = i7;
      m = k;
      i3 = j;
      k = i4;
      j = i6;
      i4 = i2;
      break;
      j = 0;
      break label520;
      label619:
      i6 = i7;
      break label535;
      label626:
      if (n != 0) {}
      for (;;)
      {
        i1 = Math.max(i1, i6);
        k = m;
        n = i3;
        m = i2;
        i3 = j;
        i2 = i8;
        break;
        i6 = i7;
      }
      if ((this.OU > 0) && (bd(i9))) {
        this.OU += this.Pb;
      }
      if ((bool) && ((i11 == Integer.MIN_VALUE) || (i11 == 0)))
      {
        this.OU = 0;
        i4 = 0;
        if (i4 < i9)
        {
          localObject = getChildAt(i4);
          if (localObject == null) {
            this.OU += 0;
          }
          for (;;)
          {
            i4 += 1;
            break;
            if (((View)localObject).getVisibility() == 8)
            {
              i4 += 0;
            }
            else
            {
              localObject = (LayoutParams)((View)localObject).getLayoutParams();
              i5 = this.OU;
              i6 = ((LayoutParams)localObject).topMargin;
              this.OU = Math.max(i5, ((LayoutParams)localObject).bottomMargin + (i5 + m + i6) + 0);
            }
          }
        }
      }
      this.OU += getPaddingTop() + getPaddingBottom();
      i6 = z.resolveSizeAndState(Math.max(this.OU, getSuggestedMinimumHeight()), paramInt2, 0);
      i4 = (0xFFFFFF & i6) - this.OU;
      if ((i3 != 0) || ((i4 != 0) && (f1 > 0.0F)))
      {
        if (this.OV > 0.0F) {
          f1 = this.OV;
        }
        this.OU = 0;
        i3 = 0;
        m = k;
        i2 = i1;
        i1 = i;
        k = j;
        i = i2;
        j = m;
        m = i1;
        i2 = i4;
        if (i3 < i9)
        {
          localObject = getChildAt(i3);
          if (((View)localObject).getVisibility() == 8) {
            break label1582;
          }
          localLayoutParams = (LayoutParams)((View)localObject).getLayoutParams();
          float f2 = localLayoutParams.weight;
          if (f2 <= 0.0F) {
            break label1575;
          }
          i4 = (int)(i2 * f2 / f1);
          i7 = getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight() + localLayoutParams.leftMargin + localLayoutParams.rightMargin, localLayoutParams.width);
          if ((localLayoutParams.height != 0) || (i11 != 1073741824))
          {
            i5 = i4 + ((View)localObject).getMeasuredHeight();
            i1 = i5;
            if (i5 < 0) {
              i1 = 0;
            }
            label1080:
            ((View)localObject).measure(i7, View.MeasureSpec.makeMeasureSpec(i1, 1073741824));
            m = at.combineMeasuredStates(m, z.M((View)localObject) & 0xFF00);
            f1 -= f2;
            i1 = i2 - i4;
            label1122:
            i4 = localLayoutParams.leftMargin + localLayoutParams.rightMargin;
            i5 = ((View)localObject).getMeasuredWidth() + i4;
            i2 = Math.max(k, i5);
            if ((i10 == 1073741824) || (localLayoutParams.width != -1)) {
              break label1320;
            }
            k = 1;
            label1173:
            if (k == 0) {
              break label1326;
            }
            k = i4;
            label1182:
            i4 = Math.max(i, k);
            if ((j == 0) || (localLayoutParams.width != -1)) {
              break label1333;
            }
            i = 1;
            label1208:
            j = this.OU;
            k = ((View)localObject).getMeasuredHeight();
            i5 = localLayoutParams.topMargin;
            this.OU = Math.max(j, localLayoutParams.bottomMargin + (k + j + i5) + 0);
            k = i;
            j = i4;
          }
        }
      }
      for (i = i2;; i = i4)
      {
        i5 = i3 + 1;
        i3 = j;
        i4 = i;
        i2 = i1;
        j = k;
        i = i3;
        k = i4;
        i3 = i5;
        break;
        if (i4 > 0)
        {
          i1 = i4;
          break label1080;
        }
        i1 = 0;
        break label1080;
        label1320:
        k = 0;
        break label1173;
        label1326:
        k = i5;
        break label1182;
        label1333:
        i = 0;
        break label1208;
        this.OU += getPaddingTop() + getPaddingBottom();
        i1 = m;
        m = k;
        k = i1;
        i1 = j;
        j = i;
        for (;;)
        {
          if ((i1 == 0) && (i10 != 1073741824)) {}
          for (;;)
          {
            setMeasuredDimension(z.resolveSizeAndState(Math.max(j + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), paramInt1, k), i6);
            if (n != 0) {
              M(i9, paramInt2);
            }
            return;
            i2 = Math.max(i1, i2);
            if ((!bool) || (i11 == 1073741824)) {
              break;
            }
            i1 = 0;
            while (i1 < i9)
            {
              localObject = getChildAt(i1);
              if ((localObject != null) && (((View)localObject).getVisibility() != 8) && (((LayoutParams)((View)localObject).getLayoutParams()).weight > 0.0F)) {
                ((View)localObject).measure(View.MeasureSpec.makeMeasureSpec(((View)localObject).getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(m, 1073741824));
              }
              i1 += 1;
            }
            N(paramInt1, paramInt2);
            return;
            j = m;
          }
          m = i2;
          i1 = j;
          j = m;
          m = i1;
          i1 = k;
          k = i;
        }
        label1575:
        i1 = i2;
        break label1122;
        label1582:
        i4 = k;
        k = j;
        i1 = i2;
        j = i;
      }
      label1605:
      i5 = n;
      n = i6;
      break label459;
      label1616:
      break label243;
      label1619:
      i5 = m;
      m = i3;
      i3 = k;
      k = i5;
      i5 = n;
      n = m;
      m = i2;
      i2 = j;
    }
  }
  
  public void setBaselineAligned(boolean paramBoolean)
  {
    this.OQ = paramBoolean;
  }
  
  public void setBaselineAlignedChildIndex(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= getChildCount())) {
      throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }
    this.OR = paramInt;
  }
  
  public void setDividerDrawable(Drawable paramDrawable)
  {
    boolean bool = false;
    if (paramDrawable == this.OZ) {
      return;
    }
    this.OZ = paramDrawable;
    if (paramDrawable != null) {
      this.Pa = paramDrawable.getIntrinsicWidth();
    }
    for (this.Pb = paramDrawable.getIntrinsicHeight();; this.Pb = 0)
    {
      if (paramDrawable == null) {
        bool = true;
      }
      setWillNotDraw(bool);
      requestLayout();
      return;
      this.Pa = 0;
    }
  }
  
  public void setDividerPadding(int paramInt)
  {
    this.Pd = paramInt;
  }
  
  public void setGravity(int paramInt)
  {
    if (this.rA != paramInt)
    {
      if ((0x800007 & paramInt) != 0) {
        break label46;
      }
      paramInt = 0x800003 | paramInt;
    }
    label46:
    for (;;)
    {
      int i = paramInt;
      if ((paramInt & 0x70) == 0) {
        i = paramInt | 0x30;
      }
      this.rA = i;
      requestLayout();
      return;
    }
  }
  
  public void setHorizontalGravity(int paramInt)
  {
    paramInt &= 0x800007;
    if ((this.rA & 0x800007) != paramInt)
    {
      this.rA = (paramInt | this.rA & 0xFF7FFFF8);
      requestLayout();
    }
  }
  
  public void setMeasureWithLargestChildEnabled(boolean paramBoolean)
  {
    this.OW = paramBoolean;
  }
  
  public void setOrientation(int paramInt)
  {
    if (this.OT != paramInt)
    {
      this.OT = paramInt;
      requestLayout();
    }
  }
  
  public void setShowDividers(int paramInt)
  {
    if (paramInt != this.Pc) {
      requestLayout();
    }
    this.Pc = paramInt;
  }
  
  public void setVerticalGravity(int paramInt)
  {
    paramInt &= 0x70;
    if ((this.rA & 0x70) != paramInt)
    {
      this.rA = (paramInt | this.rA & 0xFFFFFF8F);
      requestLayout();
    }
  }
  
  public void setWeightSum(float paramFloat)
  {
    this.OV = Math.max(0.0F, paramFloat);
  }
  
  public boolean shouldDelayChildPressedState()
  {
    return false;
  }
  
  public static class LayoutParams
    extends ViewGroup.MarginLayoutParams
  {
    public int gravity = -1;
    public float weight;
    
    public LayoutParams(int paramInt1, int paramInt2)
    {
      super(paramInt2);
      this.weight = 0.0F;
    }
    
    public LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.k.LinearLayoutCompat_Layout);
      this.weight = paramContext.getFloat(a.k.LinearLayoutCompat_Layout_android_layout_weight, 0.0F);
      this.gravity = paramContext.getInt(a.k.LinearLayoutCompat_Layout_android_layout_gravity, -1);
      paramContext.recycle();
    }
    
    public LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/LinearLayoutCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */