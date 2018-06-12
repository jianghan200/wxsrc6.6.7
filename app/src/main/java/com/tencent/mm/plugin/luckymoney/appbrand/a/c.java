package com.tencent.mm.plugin.luckymoney.appbrand.a;

import com.tencent.mm.protocal.c.bed;
import com.tencent.mm.protocal.c.bee;

public final class c
  extends a<bed, bee>
{
  public c(String paramString1, String paramString2, int paramInt)
  {
    bed localbed = new bed();
    localbed.bPS = paramString1;
    localbed.sbb = paramString2;
    localbed.offset = paramInt;
    this.kKM = localbed;
  }
  
  protected final int If()
  {
    return 2949;
  }
  
  protected final String getUri()
  {
    return "/cgi-bin/mmbiz-bin/wxahb/querywxaapphbdetail";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/appbrand/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */