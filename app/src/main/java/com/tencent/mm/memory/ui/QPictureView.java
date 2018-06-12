package com.tencent.mm.memory.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.tencent.mm.memory.a.a;
import com.tencent.mm.memory.i;
import com.tencent.mm.memory.n;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.widget.QImageView;

public class QPictureView
  extends QImageView
{
  private boolean DEBUG = false;
  private i dvx = null;
  private boolean dvy = false;
  private Runnable dvz = new QPictureView.1(this);
  
  public QPictureView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public QPictureView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  private void FC()
  {
    if (this.DEBUG) {
      x.i("MicroMsg.QPictureView", "onAttach" + hashCode() + " " + bi.cjd().toString());
    }
    removeCallbacks(this.dvz);
    if (this.dvy) {
      return;
    }
    this.dvy = true;
  }
  
  private static String aT(Object paramObject)
  {
    if (paramObject == null) {
      return "NULL";
    }
    if ((paramObject instanceof a)) {
      return paramObject + " hashcode " + paramObject.hashCode() + " " + ((a)paramObject).FB() + " " + ((a)paramObject).FB().hashCode();
    }
    return String.valueOf(paramObject);
  }
  
  private static void aU(Object paramObject)
  {
    if ((paramObject != null) && ((paramObject instanceof i))) {
      ((i)paramObject).Fs();
    }
  }
  
  private static void aV(Object paramObject)
  {
    if ((paramObject != null) && ((paramObject instanceof i))) {
      ((i)paramObject).Ft();
    }
  }
  
  private void onDetach()
  {
    if (this.DEBUG) {
      x.i("MicroMsg.QPictureView", "onDetach " + hashCode() + " " + bi.cjd().toString());
    }
    if (!this.dvy) {
      return;
    }
    this.dvy = false;
    removeCallbacks(this.dvz);
    postDelayed(this.dvz, 500L);
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    FC();
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    onDetach();
  }
  
  public void onFinishTemporaryDetach()
  {
    super.onFinishTemporaryDetach();
    FC();
  }
  
  public void onStartTemporaryDetach()
  {
    super.onStartTemporaryDetach();
    onDetach();
  }
  
  public void setImageDrawable(Drawable paramDrawable)
  {
    removeCallbacks(this.dvz);
    if ((paramDrawable == null) || (paramDrawable.equals(this.dvx))) {
      return;
    }
    if (this.DEBUG) {
      x.i("MicroMsg.QPictureView", "setImageDrawable " + hashCode() + " old: " + aT(this.dvx) + " new:" + aT(paramDrawable) + " " + bi.cjd().toString());
    }
    aV(this.dvx);
    if ((paramDrawable instanceof i)) {}
    for (this.dvx = ((i)paramDrawable);; this.dvx = null)
    {
      aU(paramDrawable);
      super.setImageDrawable(paramDrawable);
      return;
    }
  }
  
  public void setReleasableBitmap(n paramn)
  {
    if ((paramn == null) || (paramn.equals(this.dvx))) {
      return;
    }
    setImageBitmap(paramn.Fx());
    this.dvx = paramn;
    aU(this.dvx);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/memory/ui/QPictureView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */