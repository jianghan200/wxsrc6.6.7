package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.design.a.i;
import android.support.v7.widget.ap;
import android.util.AttributeSet;
import android.view.View;

public final class TabItem
  extends View
{
  final Drawable hh;
  final int hi;
  final CharSequence mText;
  
  public TabItem(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = ap.a(paramContext, paramAttributeSet, a.i.TabItem);
    this.mText = paramContext.getText(a.i.TabItem_android_text);
    this.hh = paramContext.getDrawable(a.i.TabItem_android_icon);
    this.hi = paramContext.getResourceId(a.i.TabItem_android_layout, 0);
    paramContext.Ww.recycle();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/android/support/design/widget/TabItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */