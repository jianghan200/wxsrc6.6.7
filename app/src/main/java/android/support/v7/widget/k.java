package android.support.v7.widget;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

final class k
  extends j
{
  private static final int[] HN = { 16843074 };
  private final SeekBar MN;
  
  k(SeekBar paramSeekBar, h paramh)
  {
    super(paramSeekBar, paramh);
    this.MN = paramSeekBar;
  }
  
  final void b(AttributeSet paramAttributeSet, int paramInt)
  {
    super.b(paramAttributeSet, paramInt);
    paramAttributeSet = ap.a(this.MN.getContext(), paramAttributeSet, HN, paramInt);
    Drawable localDrawable = paramAttributeSet.bP(0);
    if (localDrawable != null) {
      this.MN.setThumb(localDrawable);
    }
    paramAttributeSet.Ww.recycle();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */