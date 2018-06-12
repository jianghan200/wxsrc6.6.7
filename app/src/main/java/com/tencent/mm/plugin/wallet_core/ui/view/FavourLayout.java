package com.tencent.mm.plugin.wallet_core.ui.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.bp.a;
import com.tencent.mm.plugin.wxpay.a.d;
import java.util.Iterator;
import java.util.LinkedList;

public class FavourLayout
  extends LinearLayout
{
  public FavourLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public FavourLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public void setWording(LinkedList<String> paramLinkedList)
  {
    removeAllViews();
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext())
    {
      String str = (String)paramLinkedList.next();
      TextView localTextView = new TextView(getContext());
      localTextView.setText(str);
      localTextView.setTextColor(Color.parseColor("#ff891e"));
      localTextView.setTextSize(0, a.ad(getContext(), a.d.SmallTextSize));
      addView(localTextView);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/view/FavourLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */