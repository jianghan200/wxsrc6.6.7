package com.tencent.mm.plugin.chatroom.f;

public final class a
{
  public static int cn(int paramInt1, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      throw new IllegalArgumentException("Invalid Month");
    case 0: 
    case 2: 
    case 4: 
    case 6: 
    case 7: 
    case 9: 
    case 11: 
      return 31;
    case 3: 
    case 5: 
    case 8: 
    case 10: 
      return 30;
    }
    if (((paramInt2 % 4 == 0) && (paramInt2 % 100 != 0)) || (paramInt2 % 400 == 0)) {
      return 29;
    }
    return 28;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/chatroom/f/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */