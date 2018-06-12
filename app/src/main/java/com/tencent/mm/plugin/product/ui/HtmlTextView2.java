package com.tencent.mm.plugin.product.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebSettings.LayoutAlgorithm;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.n;
import com.tencent.xweb.p;

public class HtmlTextView2
  extends MMWebView
{
  private p lSd = new HtmlTextView2.2(this);
  
  public HtmlTextView2(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(ad.getContext(), paramAttributeSet);
    initView();
  }
  
  public HtmlTextView2(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(ad.getContext(), paramAttributeSet, paramInt);
    initView();
  }
  
  private void initView()
  {
    setOnTouchListener(new HtmlTextView2.1(this));
    setVerticalScrollBarEnabled(false);
    getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
    getSettings().setDefaultTextEncodingName("utf-8");
  }
  
  public void setText(String paramString)
  {
    setWebViewClient(null);
    loadData(paramString, "text/html", "utf-8");
    setWebViewClient(this.lSd);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/product/ui/HtmlTextView2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */