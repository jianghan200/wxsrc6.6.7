package com.tencent.mm.plugin.music.d;

import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.c.avq;
import com.tencent.mm.sdk.platformtools.ac;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;

public final class a
{
  public static String IE(String paramString)
  {
    return "piece" + ac.ce(new StringBuilder().append(paramString.hashCode()).toString());
  }
  
  public static String IF(String paramString)
  {
    File localFile = new File(com.tencent.mm.plugin.music.cache.e.Gq(), "music");
    if (!localFile.exists()) {
      localFile.mkdirs();
    }
    paramString = IE(paramString);
    localFile = new File(localFile, paramString);
    x.d("MicroMsg.Music.MusicFileUtil", "getMusicPieceFilePath music name %s path %s", new Object[] { paramString, localFile.getAbsoluteFile() });
    return localFile.getAbsolutePath();
  }
  
  public static String g(com.tencent.mm.an.a parama, boolean paramBoolean)
  {
    File localFile = new File(g.Ei().dqp, "music");
    if (!localFile.exists()) {
      x.i("MicroMsg.Music.MusicFileUtil", "create file folder:%b for path:%s", new Object[] { Boolean.valueOf(localFile.mkdirs()), localFile.getAbsolutePath() });
    }
    if (paramBoolean) {}
    for (parama = ac.ce(new StringBuilder().append(parama.field_musicId).append("temp").toString()) + "-wifi";; parama = ac.ce(parama.field_musicId + "temp"))
    {
      localFile = new File(localFile, parama);
      x.d("MicroMsg.Music.MusicFileUtil", "music name %s path %s", new Object[] { parama, localFile.getAbsoluteFile() });
      return localFile.getAbsolutePath();
    }
  }
  
  public static String h(com.tencent.mm.an.a parama, boolean paramBoolean)
  {
    return g(parama, false) + "-thumb-" + paramBoolean;
  }
  
  public static String x(avq paramavq)
  {
    if (paramavq.rYj == 6) {
      return "6_" + ac.ce(paramavq.rsp);
    }
    return "0_" + ac.ce(paramavq.rsp);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/music/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */