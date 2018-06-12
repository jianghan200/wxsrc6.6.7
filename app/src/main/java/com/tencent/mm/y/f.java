package com.tencent.mm.y;

import android.util.Base64;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.protocal.c.bqu;
import com.tencent.mm.protocal.c.bqw;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;
import java.util.Map;

public final class f
  extends d
{
  public final d FD()
  {
    return new f();
  }
  
  public final void a(StringBuilder paramStringBuilder, g.a parama, String paramString, keep_SceneResult paramkeep_SceneResult, int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte;
    if (!bi.oW(parama.appId))
    {
      paramString = parama.bZN;
      paramkeep_SceneResult = new bqw();
      if (paramString != null) {
        arrayOfByte = Base64.decode(paramString, 0);
      }
    }
    try
    {
      paramkeep_SceneResult.aG(arrayOfByte);
      paramkeep_SceneResult.soY = new bqu();
      paramkeep_SceneResult.soY.jLY = parama.appId;
      try
      {
        paramkeep_SceneResult = Base64.encodeToString(paramkeep_SceneResult.toByteArray(), 0);
        paramString = paramkeep_SceneResult;
        paramkeep_SceneResult = paramkeep_SceneResult.replace("\n", "");
        paramString = paramkeep_SceneResult;
      }
      catch (IOException paramkeep_SceneResult)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.AppContentStatExtStrPiece", paramkeep_SceneResult, "", new Object[0]);
        }
      }
      parama.bZN = paramString;
      paramStringBuilder.append("<statextstr>" + bi.WS(parama.bZN) + "</statextstr>");
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.AppContentStatExtStrPiece", localException, "", new Object[0]);
      }
    }
  }
  
  public final void a(Map<String, String> paramMap, g.a parama) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/y/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */