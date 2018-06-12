package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.c.a.a;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

public class ListViewCompat
  extends ListView
{
  private static final int[] Qw = { 0 };
  int QA = 0;
  int QB = 0;
  protected int QC;
  Field QD;
  private a QE;
  final Rect Qx = new Rect();
  int Qy = 0;
  int Qz = 0;
  
  public ListViewCompat(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ListViewCompat(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    try
    {
      this.QD = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
      this.QD.setAccessible(true);
      return;
    }
    catch (NoSuchFieldException paramContext) {}
  }
  
  public final int S(int paramInt1, int paramInt2)
  {
    int i = getListPaddingTop();
    int k = getListPaddingBottom();
    getListPaddingLeft();
    getListPaddingRight();
    int j = getDividerHeight();
    Object localObject = getDivider();
    ListAdapter localListAdapter = getAdapter();
    if (localListAdapter == null)
    {
      i += k;
      return i;
    }
    i = k + i;
    label66:
    int n;
    label84:
    int m;
    View localView;
    if ((j > 0) && (localObject != null))
    {
      int i2 = localListAdapter.getCount();
      k = 0;
      n = 0;
      localObject = null;
      if (k >= i2) {
        break label259;
      }
      int i1 = localListAdapter.getItemViewType(k);
      m = n;
      if (i1 != n)
      {
        m = i1;
        localObject = null;
      }
      localView = localListAdapter.getView(k, (View)localObject, this);
      ViewGroup.LayoutParams localLayoutParams = localView.getLayoutParams();
      localObject = localLayoutParams;
      if (localLayoutParams == null)
      {
        localObject = generateDefaultLayoutParams();
        localView.setLayoutParams((ViewGroup.LayoutParams)localObject);
      }
      if (((ViewGroup.LayoutParams)localObject).height <= 0) {
        break label249;
      }
      n = View.MeasureSpec.makeMeasureSpec(((ViewGroup.LayoutParams)localObject).height, 1073741824);
      label183:
      localView.measure(paramInt1, n);
      localView.forceLayout();
      if (k <= 0) {
        break label261;
      }
      i += j;
    }
    label249:
    label259:
    label261:
    for (;;)
    {
      n = localView.getMeasuredHeight() + i;
      i = paramInt2;
      if (n >= paramInt2) {
        break;
      }
      k += 1;
      i = n;
      n = m;
      localObject = localView;
      break label84;
      j = 0;
      break label66;
      n = View.MeasureSpec.makeMeasureSpec(0, 0);
      break label183;
      return i;
    }
  }
  
  protected void dispatchDraw(Canvas paramCanvas)
  {
    if (!this.Qx.isEmpty())
    {
      Drawable localDrawable = getSelector();
      if (localDrawable != null)
      {
        localDrawable.setBounds(this.Qx);
        localDrawable.draw(paramCanvas);
      }
    }
    super.dispatchDraw(paramCanvas);
  }
  
  protected void drawableStateChanged()
  {
    int i = 1;
    super.drawableStateChanged();
    setSelectorEnabled(true);
    Drawable localDrawable = getSelector();
    if (localDrawable != null) {
      if ((!fp()) || (!isPressed())) {
        break label48;
      }
    }
    for (;;)
    {
      if (i != 0) {
        localDrawable.setState(getDrawableState());
      }
      return;
      label48:
      i = 0;
    }
  }
  
  protected boolean fp()
  {
    return false;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getAction())
    {
    }
    for (;;)
    {
      return super.onTouchEvent(paramMotionEvent);
      this.QC = pointToPosition((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
    }
  }
  
  public void setSelector(Drawable paramDrawable)
  {
    if (paramDrawable != null) {}
    for (Object localObject = new a(paramDrawable);; localObject = null)
    {
      this.QE = ((a)localObject);
      super.setSelector(this.QE);
      localObject = new Rect();
      if (paramDrawable != null) {
        paramDrawable.getPadding((Rect)localObject);
      }
      this.Qy = ((Rect)localObject).left;
      this.Qz = ((Rect)localObject).top;
      this.QA = ((Rect)localObject).right;
      this.QB = ((Rect)localObject).bottom;
      return;
    }
  }
  
  protected void setSelectorEnabled(boolean paramBoolean)
  {
    if (this.QE != null) {
      this.QE.yr = paramBoolean;
    }
  }
  
  private static final class a
    extends a
  {
    boolean yr = true;
    
    public a(Drawable paramDrawable)
    {
      super();
    }
    
    public final void draw(Canvas paramCanvas)
    {
      if (this.yr) {
        super.draw(paramCanvas);
      }
    }
    
    public final void setHotspot(float paramFloat1, float paramFloat2)
    {
      if (this.yr) {
        super.setHotspot(paramFloat1, paramFloat2);
      }
    }
    
    public final void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      if (this.yr) {
        super.setHotspotBounds(paramInt1, paramInt2, paramInt3, paramInt4);
      }
    }
    
    public final boolean setState(int[] paramArrayOfInt)
    {
      if (this.yr) {
        return super.setState(paramArrayOfInt);
      }
      return false;
    }
    
    public final boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
    {
      if (this.yr) {
        return super.setVisible(paramBoolean1, paramBoolean2);
      }
      return false;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/ListViewCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */