package com.tencent.mm.vending.g;

import java.util.Stack;

final class f
{
  private static f uRz = new f();
  ThreadLocal<Stack<c>> uRA = new ThreadLocal();
  
  public static f cBJ()
  {
    return uRz;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/vending/g/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */