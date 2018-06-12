package com.tencent.mm.ui.contact;

import java.util.List;

public abstract class o
  extends n
{
  public List<String> gRN;
  public boolean ukn;
  
  public o(l paraml, List<String> paramList, boolean paramBoolean1, boolean paramBoolean2)
  {
    this(paraml, paramList, paramBoolean1, paramBoolean2, 0);
  }
  
  public o(l paraml, List<String> paramList, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    this(paraml, paramList, paramBoolean1, paramBoolean2, paramInt, false);
  }
  
  private o(l paraml, List<String> paramList, boolean paramBoolean1, boolean paramBoolean2, int paramInt, boolean paramBoolean3)
  {
    super(paraml, paramBoolean2, paramInt, paramBoolean3);
    this.gRN = paramList;
    this.ukn = paramBoolean1;
  }
  
  public o(l paraml, List<String> paramList, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    this(paraml, paramList, paramBoolean1, paramBoolean2, 0, paramBoolean3);
  }
  
  public int aaJ(String paramString)
  {
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/contact/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */