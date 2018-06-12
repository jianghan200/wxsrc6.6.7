package com.tencent.mm.plugin.product.ui;

import android.content.Context;
import android.text.Html.ImageGetter;
import android.text.Html.TagHandler;
import android.util.AttributeSet;
import android.widget.TextView;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ah;

public class HtmlTextView
  extends TextView
{
  Html.ImageGetter lRY = new HtmlTextView.2(this);
  Html.TagHandler lRZ = new HtmlTextView.3(this);
  
  public HtmlTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public HtmlTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public void setText(String paramString)
  {
    g.Em().a(new HtmlTextView.1(this, paramString));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/product/ui/HtmlTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */