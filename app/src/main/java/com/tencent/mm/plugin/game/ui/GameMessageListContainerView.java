package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.mm.a.f;
import com.tencent.mm.plugin.game.f.c;
import com.tencent.mm.plugin.game.model.s;
import com.tencent.mm.plugin.game.model.s.h;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.LinkedList;

public class GameMessageListContainerView
  extends LinearLayout
{
  private Context mContext;
  
  public GameMessageListContainerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mContext = paramContext;
  }
  
  public final void a(s params, LinkedList<s.h> paramLinkedList, int paramInt1, int paramInt2, f<String, Bitmap> paramf)
  {
    if ((params == null) || (bi.cX(paramLinkedList)))
    {
      setVisibility(8);
      return;
    }
    setVisibility(0);
    if (paramInt1 > paramLinkedList.size()) {}
    int j;
    GameMessageListUserIconView localGameMessageListUserIconView;
    for (int i = 1;; i = 2)
    {
      j = this.mContext.getResources().getDimensionPixelSize(f.c.BasicPaddingSize);
      while (getChildCount() < i)
      {
        localGameMessageListUserIconView = new GameMessageListUserIconView(this.mContext);
        if (getChildCount() > 0) {
          localGameMessageListUserIconView.setPadding(0, j, 0, 0);
        }
        localGameMessageListUserIconView.setSourceScene(paramInt2);
        addView(localGameMessageListUserIconView);
      }
    }
    paramInt2 = 0;
    label113:
    if (paramInt2 < getChildCount())
    {
      if (paramInt2 >= i) {
        break label225;
      }
      getChildAt(paramInt2).setVisibility(0);
      localGameMessageListUserIconView = (GameMessageListUserIconView)getChildAt(paramInt2);
      LinkedList localLinkedList = new LinkedList();
      j = paramInt2 * paramInt1;
      while ((j < (paramInt2 + 1) * paramInt1) && (j < paramLinkedList.size()))
      {
        localLinkedList.add(paramLinkedList.get(j));
        j += 1;
      }
      localGameMessageListUserIconView.a(params, localLinkedList, paramf);
    }
    for (;;)
    {
      paramInt2 += 1;
      break label113;
      break;
      label225:
      getChildAt(paramInt2).setVisibility(8);
    }
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameMessageListContainerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */