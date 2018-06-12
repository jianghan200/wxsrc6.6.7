package com.tencent.mm.plugin.wenote.model.nativenote.spans;

import android.text.style.ParagraphStyle;

public final class r
  implements ParagraphStyle
{
  public final q qsK;
  public final ParagraphStyle qtr;
  
  public r(q paramq, ParagraphStyle paramParagraphStyle)
  {
    this.qsK = paramq;
    this.qtr = paramParagraphStyle;
  }
  
  public final String toString()
  {
    return this.qsK.name() + " - " + this.qtr.getClass().getSimpleName();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wenote/model/nativenote/spans/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */