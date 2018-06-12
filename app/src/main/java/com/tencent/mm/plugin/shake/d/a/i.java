package com.tencent.mm.plugin.shake.d.a;

import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.plugin.shake.d.b.a;
import com.tencent.mm.protocal.c.avq;
import com.tencent.mm.protocal.c.bmo;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.io.IOException;

public final class i
{
  public static String bvg()
  {
    if (!au.HX())
    {
      x.w("MicroMsg.ShakeMusicLogic", "getSaveDirPath: acc stg has not set uin");
      return null;
    }
    Object localObject = new StringBuilder();
    au.HU();
    localObject = new File(c.Gq() + "shakemusic/");
    if ((!((File)localObject).exists()) || (!((File)localObject).isDirectory()))
    {
      x.w("MicroMsg.ShakeMusicLogic", "storage dir[%s] not perpare, try to create it", new Object[] { ((File)localObject).getAbsolutePath() });
      ((File)localObject).mkdir();
    }
    File localFile = new File((File)localObject, ".nomedia");
    if (!localFile.exists()) {
      x.w("MicroMsg.ShakeMusicLogic", "no media file[%s] not exists, try to create it", new Object[] { ((File)localObject).getAbsolutePath() });
    }
    try
    {
      localFile.createNewFile();
      if (!((File)localObject).exists())
      {
        x.w("MicroMsg.ShakeMusicLogic", "create storage dir fail");
        return null;
      }
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.ShakeMusicLogic", localIOException, "", new Object[0]);
      }
    }
    return ((File)localObject).getAbsolutePath() + "/";
  }
  
  public static avq c(byte[] paramArrayOfByte, long paramLong)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0)) {
      return null;
    }
    try
    {
      paramArrayOfByte = (bmo)new bmo().aG(paramArrayOfByte);
      avq localavq = new avq();
      localavq.rYj = 4;
      localavq.rsp = String.valueOf(paramArrayOfByte.skL);
      localavq.rYk = paramArrayOfByte.rYk;
      localavq.rYn = ab.b(paramArrayOfByte.rKj);
      localavq.rYo = ab.b(paramArrayOfByte.rKk);
      localavq.rYt = a.JC(localavq.rYo);
      localavq.rgC = paramArrayOfByte.rgC;
      localavq.rYs = ab.b(paramArrayOfByte.rKi);
      localavq.rYl = ab.b(paramArrayOfByte.skM);
      localavq.rYm = ab.b(paramArrayOfByte.skN);
      localavq.rYr = ab.b(paramArrayOfByte.skQ);
      localavq.rYp = ab.b(paramArrayOfByte.skO);
      localavq.rYq = ab.b(paramArrayOfByte.skP);
      localavq.nlo = paramLong;
      return localavq;
    }
    catch (Exception paramArrayOfByte)
    {
      x.printErrStackTrace("MicroMsg.ShakeMusicLogic", paramArrayOfByte, "", new Object[0]);
      x.w("MicroMsg.ShakeMusicLogic", "get music wrapper bytes fail");
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/shake/d/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */