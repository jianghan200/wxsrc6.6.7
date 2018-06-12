package com.tencent.mm.ui.widget.picker;

public final class f
{
  public static boolean GE(int paramInt)
  {
    return (paramInt >= 0) && (paramInt <= 59);
  }
  
  public static boolean GF(int paramInt)
  {
    return (paramInt >= 0) && (paramInt <= 23);
  }
  
  public static int[] abB(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0)) {}
    int i;
    int j;
    do
    {
      do
      {
        return null;
        paramString = paramString.split(":");
      } while ((paramString == null) || (paramString.length != 2));
      i = abC(paramString[0]);
      j = abC(paramString[1]);
    } while ((!GF(i)) || (!GE(j)));
    return new int[] { i, j };
  }
  
  private static int abC(String paramString)
  {
    try
    {
      int i = Integer.parseInt(paramString, 10);
      return i;
    }
    catch (Exception paramString) {}
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/widget/picker/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */