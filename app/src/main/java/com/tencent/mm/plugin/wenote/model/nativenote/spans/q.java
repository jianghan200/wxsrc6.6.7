package com.tencent.mm.plugin.wenote.model.nativenote.spans;

import android.text.style.ParagraphStyle;

public enum q
{
  public String qtj;
  public String qtk;
  public boolean qtl;
  public String qtm;
  public String qtn;
  public boolean qto;
  public boolean qtp = false;
  
  private q(String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.qtj = paramString1;
    this.qtk = paramString2;
    this.qtm = paramString3;
    this.qtn = paramString4;
    this.qtl = false;
    this.qto = paramBoolean1;
  }
  
  public static q a(ParagraphStyle paramParagraphStyle)
  {
    if ((paramParagraphStyle instanceof d)) {
      return qtg;
    }
    if ((paramParagraphStyle instanceof m)) {
      return qth;
    }
    if ((paramParagraphStyle instanceof k)) {
      return qti;
    }
    return null;
  }
  
  public final boolean caL()
  {
    return this == qtg;
  }
  
  public final boolean caM()
  {
    return this == qth;
  }
  
  public final boolean caN()
  {
    return this == qti;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wenote/model/nativenote/spans/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */