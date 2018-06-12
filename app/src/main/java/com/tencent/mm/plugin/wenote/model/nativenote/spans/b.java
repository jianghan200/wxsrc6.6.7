package com.tencent.mm.plugin.wenote.model.nativenote.spans;

import android.text.style.StyleSpan;

public final class b
  extends e<Boolean, BoldSpan>
{
  public final boolean bV(Object paramObject)
  {
    return ((paramObject instanceof BoldSpan)) || (((paramObject instanceof StyleSpan)) && (((StyleSpan)paramObject).getStyle() == 1));
  }
  
  public final int caD()
  {
    return 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wenote/model/nativenote/spans/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */