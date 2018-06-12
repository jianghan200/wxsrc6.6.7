package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.v7.a.a.k;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.lang.ref.WeakReference;

public final class ViewStubCompat
  extends View
{
  private LayoutInflater Bc;
  private int XA;
  private WeakReference<View> XB;
  private a XC;
  private int Xz = 0;
  
  public ViewStubCompat(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ViewStubCompat(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.k.ViewStubCompat, paramInt, 0);
    this.XA = paramContext.getResourceId(a.k.ViewStubCompat_android_inflatedId, -1);
    this.Xz = paramContext.getResourceId(a.k.ViewStubCompat_android_layout, 0);
    setId(paramContext.getResourceId(a.k.ViewStubCompat_android_id, -1));
    paramContext.recycle();
    setVisibility(8);
    setWillNotDraw(true);
  }
  
  protected final void dispatchDraw(Canvas paramCanvas) {}
  
  public final void draw(Canvas paramCanvas) {}
  
  public final int getInflatedId()
  {
    return this.XA;
  }
  
  public final LayoutInflater getLayoutInflater()
  {
    return this.Bc;
  }
  
  public final int getLayoutResource()
  {
    return this.Xz;
  }
  
  public final View inflate()
  {
    Object localObject = getParent();
    if ((localObject != null) && ((localObject instanceof ViewGroup)))
    {
      if (this.Xz != 0)
      {
        ViewGroup localViewGroup = (ViewGroup)localObject;
        int i;
        if (this.Bc != null)
        {
          localObject = this.Bc;
          localObject = ((LayoutInflater)localObject).inflate(this.Xz, localViewGroup, false);
          if (this.XA != -1) {
            ((View)localObject).setId(this.XA);
          }
          i = localViewGroup.indexOfChild(this);
          localViewGroup.removeViewInLayout(this);
          ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
          if (localLayoutParams == null) {
            break label122;
          }
          localViewGroup.addView((View)localObject, i, localLayoutParams);
        }
        for (;;)
        {
          this.XB = new WeakReference(localObject);
          return (View)localObject;
          localObject = LayoutInflater.from(getContext());
          break;
          label122:
          localViewGroup.addView((View)localObject, i);
        }
      }
      throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
    }
    throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(0, 0);
  }
  
  public final void setInflatedId(int paramInt)
  {
    this.XA = paramInt;
  }
  
  public final void setLayoutInflater(LayoutInflater paramLayoutInflater)
  {
    this.Bc = paramLayoutInflater;
  }
  
  public final void setLayoutResource(int paramInt)
  {
    this.Xz = paramInt;
  }
  
  public final void setOnInflateListener(a parama)
  {
    this.XC = parama;
  }
  
  public final void setVisibility(int paramInt)
  {
    if (this.XB != null)
    {
      View localView = (View)this.XB.get();
      if (localView != null) {
        localView.setVisibility(paramInt);
      }
    }
    do
    {
      return;
      throw new IllegalStateException("setVisibility called on un-referenced view");
      super.setVisibility(paramInt);
    } while ((paramInt != 0) && (paramInt != 4));
    inflate();
  }
  
  public static abstract interface a {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/ViewStubCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */