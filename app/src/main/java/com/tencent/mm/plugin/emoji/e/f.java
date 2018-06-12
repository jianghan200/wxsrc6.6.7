package com.tencent.mm.plugin.emoji.e;

import com.tencent.mm.ak.a.a.c.a;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class f
{
  private static final com.tencent.mm.ak.a.a.c ifu;
  
  static
  {
    c.a locala = new c.a();
    locala.dXw = true;
    locala.dXD = 1;
    locala.dXV = false;
    ifu = locala.Pt();
  }
  
  public static com.tencent.mm.ak.a.a.c a(String paramString, int paramInt, Object... paramVarArgs)
  {
    if (!bi.oW(paramString))
    {
      c.a locala = new c.a();
      locala.dXy = true;
      locala.dXA = paramString;
      locala.dXF = paramInt;
      locala.dXE = paramInt;
      locala.dYc = paramVarArgs;
      return locala.Pt();
    }
    x.w("MicroMsg.emoji.EmojiImageLoaderManager", "get emoji loader options failed. path is null.");
    return null;
  }
  
  public static com.tencent.mm.ak.a.a.c aDO()
  {
    c.a locala = new c.a();
    locala.dXw = true;
    locala.dXy = false;
    locala.dXD = 3;
    return locala.Pt();
  }
  
  public static com.tencent.mm.ak.a.a.c c(String paramString1, String paramString2, Object... paramVarArgs)
  {
    au.HU();
    paramString1 = EmojiLogic.K(com.tencent.mm.model.c.Gg(), paramString1, paramString2);
    if (!bi.oW(paramString1))
    {
      paramString2 = new c.a();
      paramString2.dXw = true;
      paramString2.dXy = true;
      paramString2.dXA = paramString1;
      paramString2.dYc = paramVarArgs;
      return paramString2.Pt();
    }
    x.w("MicroMsg.emoji.EmojiImageLoaderManager", "get emoji loader options failed. path is null.");
    return null;
  }
  
  public static com.tencent.mm.ak.a.a.c cr(String paramString1, String paramString2)
  {
    return c(paramString1, paramString2, new Object[0]);
  }
  
  public static com.tencent.mm.ak.a.a.c cs(String paramString1, String paramString2)
  {
    au.HU();
    paramString1 = EmojiLogic.K(com.tencent.mm.model.c.Gg(), paramString1, paramString2);
    if (!bi.oW(paramString1))
    {
      paramString2 = new c.a();
      paramString2.dXw = true;
      paramString2.dXy = true;
      paramString2.dXA = paramString1;
      paramString2.dXW = true;
      return paramString2.Pt();
    }
    x.w("MicroMsg.emoji.EmojiImageLoaderManager", "get emoji loader options failed. path is null.");
    return null;
  }
  
  public static com.tencent.mm.ak.a.a.c ct(String paramString1, String paramString2)
  {
    au.HU();
    paramString1 = EmojiLogic.K(com.tencent.mm.model.c.Gg(), paramString1, paramString2);
    if (!bi.oW(paramString1))
    {
      paramString2 = new c.a();
      paramString2.dXw = true;
      paramString2.dXy = true;
      paramString2.dXA = paramString1;
      paramString2.dXW = false;
      return paramString2.Pt();
    }
    x.w("MicroMsg.emoji.EmojiImageLoaderManager", "get emoji loader options failed. path is null.");
    return null;
  }
  
  public static com.tencent.mm.ak.a.a.c g(String paramString1, String paramString2, Object... paramVarArgs)
  {
    au.HU();
    String str = com.tencent.mm.model.c.Gq();
    au.HU();
    paramString1 = EmojiLogic.K(com.tencent.mm.model.c.Gg(), paramString1, paramString2);
    if (!bi.oW(paramString1))
    {
      paramString2 = new c.a();
      paramString2.dXw = true;
      paramString2.dXy = true;
      paramString2.dXA = paramString1;
      paramString2.dXB = str;
      paramString2.dYc = paramVarArgs;
      return paramString2.Pt();
    }
    x.w("MicroMsg.emoji.EmojiImageLoaderManager", "get emoji loader options failed. path is null.");
    return null;
  }
  
  public static com.tencent.mm.ak.a.a.c h(String paramString1, String paramString2, Object... paramVarArgs)
  {
    au.HU();
    paramString1 = EmojiLogic.K(com.tencent.mm.model.c.Gg(), paramString1, paramString2);
    if (!bi.oW(paramString1))
    {
      paramString2 = new c.a();
      paramString2.dXw = false;
      paramString2.dXy = true;
      paramString2.dXA = paramString1;
      paramString2.dYc = paramVarArgs;
      return paramString2.Pt();
    }
    x.w("MicroMsg.emoji.EmojiImageLoaderManager", "get emoji loader options failed. path is null.");
    return null;
  }
  
  public static com.tencent.mm.ak.a.a.c j(String paramString1, String paramString2, Object... paramVarArgs)
  {
    au.HU();
    paramString1 = EmojiLogic.K(com.tencent.mm.model.c.Gg(), paramString1, paramString2);
    if (!bi.oW(paramString1))
    {
      paramString2 = new c.a();
      paramString2.dXw = true;
      paramString2.dXy = true;
      paramString2.dXA = paramString1;
      paramString2.dYc = paramVarArgs;
      return paramString2.Pt();
    }
    x.w("MicroMsg.emoji.EmojiImageLoaderManager", "get emoji loader options failed. path is null.");
    return null;
  }
  
  public static com.tencent.mm.ak.a.a.c o(String paramString, Object... paramVarArgs)
  {
    if (!bi.oW(paramString))
    {
      c.a locala = new c.a();
      locala.dXy = true;
      locala.dXA = paramString;
      locala.dYc = paramVarArgs;
      return locala.Pt();
    }
    x.w("MicroMsg.emoji.EmojiImageLoaderManager", "get emoji loader options failed. path is null.");
    return null;
  }
  
  public static com.tencent.mm.ak.a.a.c p(String paramString, Object... paramVarArgs)
  {
    if (!bi.oW(paramString))
    {
      c.a locala = new c.a();
      locala.dXy = true;
      locala.dXA = paramString;
      locala.dXZ = false;
      locala.dYc = paramVarArgs;
      return locala.Pt();
    }
    x.w("MicroMsg.emoji.EmojiImageLoaderManager", "get emoji loader options failed. path is null.");
    return null;
  }
  
  public static com.tencent.mm.ak.a.a.c r(String paramString1, String paramString2, int paramInt)
  {
    au.HU();
    paramString1 = EmojiLogic.K(com.tencent.mm.model.c.Gg(), paramString1, paramString2);
    if (!bi.oW(paramString1))
    {
      paramString2 = new c.a();
      paramString2.dXw = true;
      paramString2.dXy = true;
      paramString2.dXA = paramString1;
      paramString2.dXF = paramInt;
      paramString2.dXE = paramInt;
      return paramString2.Pt();
    }
    x.w("MicroMsg.emoji.EmojiImageLoaderManager", "get emoji loader options failed. path is null.");
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/emoji/e/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */