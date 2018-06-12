package com.tencent.mm.plugin.game.widget;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.plugin.game.f.b;
import com.tencent.mm.plugin.game.f.c;
import com.tencent.mm.plugin.game.f.d;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public class GameTagListView
  extends LinearLayout
{
  private int textColor;
  private int textSize;
  
  public GameTagListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public final void e(LinkedList<String> paramLinkedList, int paramInt)
  {
    if (bi.cX(paramLinkedList))
    {
      setVisibility(8);
      return;
    }
    setVisibility(0);
    Object localObject1;
    Object localObject2;
    while (getChildCount() < paramLinkedList.size())
    {
      localObject1 = new TextView(getContext());
      ((TextView)localObject1).setBackgroundResource(f.d.game_tag_text_style);
      ((TextView)localObject1).setMaxLines(1);
      ((TextView)localObject1).setTextColor(this.textColor);
      ((TextView)localObject1).setTextSize(0, this.textSize);
      localObject2 = new LinearLayout.LayoutParams(-2, -2);
      ((LinearLayout.LayoutParams)localObject2).setMargins(0, 0, getResources().getDimensionPixelSize(f.c.GameMiniPadding), 0);
      ((TextView)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
      addView((View)localObject1);
    }
    int i = 0;
    float f1 = 0.0F;
    for (;;)
    {
      int j = i;
      if (i < paramLinkedList.size())
      {
        localObject1 = (String)paramLinkedList.get(i);
        x.d("MicroMsg.GameTagListView", (String)localObject1);
        localObject2 = (TextView)getChildAt(i);
        ((TextView)localObject2).setVisibility(0);
        ((TextView)localObject2).setText((CharSequence)localObject1);
        float f2 = ((TextView)localObject2).getPaint().measureText((String)localObject1);
        float f3 = ((TextView)localObject2).getPaddingLeft();
        float f4 = ((TextView)localObject2).getPaddingRight();
        f1 = getResources().getDimensionPixelSize(f.c.GameMiniPadding) + (f2 + f3 + f4 + f1);
        if (f1 > paramInt)
        {
          ((TextView)localObject2).setVisibility(8);
          j = i;
        }
      }
      else
      {
        while (j < getChildCount())
        {
          getChildAt(j).setVisibility(8);
          j += 1;
        }
        break;
      }
      i += 1;
    }
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.textColor = getResources().getColor(f.b.game_title_color);
    this.textSize = getResources().getDimensionPixelSize(f.c.GameNormalTextSize);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/game/widget/GameTagListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */