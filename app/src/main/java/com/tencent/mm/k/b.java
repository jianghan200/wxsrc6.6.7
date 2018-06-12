package com.tencent.mm.k;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class b
{
  public static int AA()
  {
    try
    {
      int i = bi.getInt(g.AT().getValue("InputLimitSendAppMsgEmotionBufSize"), 5242880);
      return i;
    }
    catch (Exception localException)
    {
      x.k("MicroMsg.BoundaryConfig", "getAppEmojiMsgMaxSize:%s", new Object[] { localException });
    }
    return 5242880;
  }
  
  public static int AB()
  {
    return bi.getInt(g.AT().getValue("InputLimitFavImageSize"), 26214400);
  }
  
  public static int AC()
  {
    return bi.getInt(g.AT().getValue("InputLimitVideoSize"), 26214400);
  }
  
  public static String AD()
  {
    return g.AT().getValue("InputLimitForbiddenChar");
  }
  
  public static int Au()
  {
    return bi.getInt(g.AT().getValue("InputLimitSessionTextMsg"), 8192) * 2;
  }
  
  public static int Av()
  {
    return bi.getInt(g.AT().getValue("InputLimitSNSObjectText"), 2000) * 2;
  }
  
  public static int Aw()
  {
    return bi.getInt(g.AT().getValue("SnsCommentMaxSize"), 1000) * 2;
  }
  
  public static int Ax()
  {
    return bi.getInt(g.AT().getValue("InputLimitFavText"), 100000) * 2;
  }
  
  public static int Ay()
  {
    return bi.getInt(g.AT().getValue("InputLimitSendEmotionBufSize"), 1048576);
  }
  
  public static int Az()
  {
    try
    {
      int i = bi.getInt(g.AT().getValue("InputLimitSendEmotionWidth"), 1024);
      return i;
    }
    catch (Exception localException)
    {
      x.k("MicroMsg.BoundaryConfig", "getCustomEmojiMaxWidthAndHeight:%s", new Object[] { localException });
    }
    return 1024;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/k/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */