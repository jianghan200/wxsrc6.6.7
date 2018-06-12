package com.tencent.mm.z;

import com.tencent.mm.g.a.s;
import com.tencent.mm.g.a.s.a;
import com.tencent.mm.g.a.s.b;
import com.tencent.mm.sdk.platformtools.ac;

public final class b
{
  public static String Km()
  {
    return "audio" + ac.ce(new StringBuilder().append(System.nanoTime()).toString());
  }
  
  public static boolean jD(String paramString)
  {
    s locals = new s();
    locals.bGU.action = 7;
    locals.bGU.bGW = paramString;
    com.tencent.mm.sdk.b.a.sFg.m(locals);
    return locals.bGV.bGZ;
  }
  
  public static a jE(String paramString)
  {
    s locals = new s();
    locals.bGU.action = 16;
    locals.bGU.bGW = paramString;
    com.tencent.mm.sdk.b.a.sFg.m(locals);
    return locals.bGU.bGY;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/z/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */