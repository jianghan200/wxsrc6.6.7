package com.tencent.mm.plugin.appbrand.menu;

public final class l
  extends Enum<l>
{
  public static int ll(int paramInt)
  {
    int[] arrayOfInt = (int[])gjL.clone();
    int j = arrayOfInt.length;
    int i = 0;
    while (i < j)
    {
      int k = arrayOfInt[i];
      if (k - 1 == paramInt) {
        return k;
      }
      i += 1;
    }
    return 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/menu/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */