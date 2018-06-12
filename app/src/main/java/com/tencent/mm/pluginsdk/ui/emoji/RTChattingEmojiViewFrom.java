package com.tencent.mm.pluginsdk.ui.emoji;

import android.content.Context;
import android.util.AttributeSet;

public class RTChattingEmojiViewFrom
  extends RTChattingEmojiView
{
  public RTChattingEmojiViewFrom(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    initView();
  }
  
  public RTChattingEmojiViewFrom(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    initView();
  }
  
  public final void initView()
  {
    super.initView();
    this.qOm.gravity = 3;
    addView(this.qOj, this.qOm);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/emoji/RTChattingEmojiViewFrom.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */