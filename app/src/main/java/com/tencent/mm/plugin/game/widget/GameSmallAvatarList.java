package com.tencent.mm.plugin.game.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.mm.plugin.game.e.e;
import com.tencent.mm.plugin.game.e.e.a.a;
import com.tencent.mm.plugin.game.f.c;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.LinkedList;

public class GameSmallAvatarList
  extends LinearLayout
{
  public GameSmallAvatarList(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public void setData(LinkedList<String> paramLinkedList)
  {
    if (bi.cX(paramLinkedList)) {
      setVisibility(8);
    }
    for (;;)
    {
      return;
      setVisibility(0);
      Object localObject;
      while (getChildCount() < paramLinkedList.size())
      {
        localObject = new ImageView(getContext());
        LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(getResources().getDimensionPixelSize(f.c.GameSmallAvatarSize), getResources().getDimensionPixelSize(f.c.GameSmallAvatarSize));
        localLayoutParams.setMargins(0, 0, getResources().getDimensionPixelSize(f.c.GameMiniPadding), 0);
        ((ImageView)localObject).setLayoutParams(localLayoutParams);
        ((ImageView)localObject).setScaleType(ImageView.ScaleType.FIT_XY);
        addView((View)localObject);
      }
      int i = 0;
      int j;
      for (;;)
      {
        j = i;
        if (i >= paramLinkedList.size()) {
          break;
        }
        localObject = new e.a.a();
        ((e.a.a)localObject).dXW = true;
        e.aVj().a((ImageView)getChildAt(i), (String)paramLinkedList.get(i), ((e.a.a)localObject).aVk());
        getChildAt(i).setVisibility(0);
        i += 1;
      }
      while (j < getChildCount())
      {
        getChildAt(j).setVisibility(8);
        j += 1;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/game/widget/GameSmallAvatarList.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */