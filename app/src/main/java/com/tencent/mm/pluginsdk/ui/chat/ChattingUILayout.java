package com.tencent.mm.pluginsdk.ui.chat;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.mm.ui.BasePanelKeybordLayout;
import java.util.ArrayList;
import java.util.List;

public class ChattingUILayout
  extends BasePanelKeybordLayout
{
  private ChatFooterBottom qMJ;
  
  public ChattingUILayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private ChatFooterBottom k(ViewGroup paramViewGroup)
  {
    if (this.qMJ != null) {
      return this.qMJ;
    }
    if ((paramViewGroup == null) || (paramViewGroup.getChildCount() <= 0)) {
      return this.qMJ;
    }
    int i = 0;
    while (i < paramViewGroup.getChildCount())
    {
      View localView = paramViewGroup.getChildAt(i);
      if ((localView instanceof ChatFooterBottom))
      {
        this.qMJ = ((ChatFooterBottom)localView);
        return this.qMJ;
      }
      if (((localView instanceof ViewGroup)) && (k((ViewGroup)localView) != null)) {
        return this.qMJ;
      }
      i += 1;
    }
    return this.qMJ;
  }
  
  protected List<View> getPanelView()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(k(this));
    return localArrayList;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/chat/ChattingUILayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */