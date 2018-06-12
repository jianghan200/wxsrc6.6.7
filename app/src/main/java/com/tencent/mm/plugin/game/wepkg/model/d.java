package com.tencent.mm.plugin.game.wepkg.model;

import com.tencent.mm.plugin.game.wepkg.c.b;
import com.tencent.mm.protocal.c.cdl;
import com.tencent.mm.protocal.c.xg;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.xweb.m;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.Iterator;
import java.util.LinkedList;

public final class d
{
  private static int keY = 4;
  private static ByteOrder keZ = ByteOrder.BIG_ENDIAN;
  private volatile String cZG = "";
  private File fgV;
  volatile boolean fgX = false;
  private volatile int kfa;
  private volatile int kfb = 0;
  volatile cdl kfc = null;
  private volatile LinkedList<xg> kfd = null;
  private volatile String kfe = "";
  
  public d(File paramFile)
  {
    this.fgV = paramFile;
    if (abX()) {
      bool = true;
    }
    this.fgX = bool;
  }
  
  private boolean a(FileChannel paramFileChannel)
  {
    if (this.kfa <= 0) {}
    for (;;)
    {
      return false;
      try
      {
        paramFileChannel.position(keY);
        ByteBuffer localByteBuffer = ByteBuffer.allocate(this.kfa);
        localByteBuffer.order(keZ);
        paramFileChannel.read(localByteBuffer);
        paramFileChannel = localByteBuffer.array();
        if ((paramFileChannel != null) && (paramFileChannel.length != 0))
        {
          this.kfc = new cdl();
          this.kfc.aG(paramFileChannel);
          this.kfd = this.kfc.syV;
          this.kfe = this.kfc.syW;
          this.cZG = this.kfc.jOS;
          this.kfb = (keY + this.kfa);
          return true;
        }
      }
      catch (Exception paramFileChannel)
      {
        x.e("MicroMsg.Wepkg.WePkgReader", "dealProtoData error, " + paramFileChannel.getMessage());
      }
    }
    return false;
  }
  
  private boolean abX()
  {
    localObject1 = null;
    try
    {
      FileChannel localFileChannel = new RandomAccessFile(this.fgV, "r").getChannel();
      localObject1 = localFileChannel;
    }
    catch (Exception localException1)
    {
      for (;;)
      {
        x.e("MicroMsg.Wepkg.WePkgReader", "openfile failed, " + localException1.getMessage());
      }
      try
      {
        ((FileChannel)localObject1).position(0L);
        ByteBuffer localByteBuffer = ByteBuffer.allocate(keY);
        localByteBuffer.order(keZ);
        ((FileChannel)localObject1).read(localByteBuffer);
        this.kfa = localByteBuffer.getInt(0);
        boolean bool = a((FileChannel)localObject1);
        return bool;
      }
      catch (Exception localException2)
      {
        x.e("MicroMsg.Wepkg.WePkgReader", "parseHeader error, " + localException2.getMessage());
        return false;
      }
      finally
      {
        b((FileChannel)localObject1);
      }
    }
    if (localObject1 == null) {
      return false;
    }
  }
  
  private static void b(FileChannel paramFileChannel)
  {
    if (paramFileChannel != null) {}
    try
    {
      paramFileChannel.close();
      return;
    }
    catch (IOException paramFileChannel) {}
  }
  
  public final m df(String paramString1, String paramString2)
  {
    if ((bi.cX(this.kfd)) || (this.kfb < keY) || (bi.oW(paramString1)))
    {
      x.e("MicroMsg.Wepkg.WePkgReader", "mFileIndexList is null");
      return null;
    }
    Iterator localIterator = this.kfd.iterator();
    while (localIterator.hasNext())
    {
      xg localxg = (xg)localIterator.next();
      if (bi.oV(localxg.rDd).equals(paramString1))
      {
        Object localObject = localxg.rDf;
        if ((!bi.oW((String)localObject)) && ((((String)localObject).startsWith("video/")) || (((String)localObject).startsWith("audio/")))) {}
        for (int i = 1; i != 0; i = 0)
        {
          x.i("MicroMsg.Wepkg.WePkgReader", "filename (%s) is media resource", new Object[] { paramString1 });
          return null;
        }
        if (localxg.hcy <= 5242880L) {
          try
          {
            x.i("MicroMsg.Wepkg.WePkgReader", "rid hit big package. rid:%s", new Object[] { paramString1 });
            localObject = new m(localxg.rDf, paramString2, new b(this.fgV, this.kfb + localxg.rDe, localxg.hcy));
            return (m)localObject;
          }
          catch (IOException localIOException)
          {
            x.e("MicroMsg.Wepkg.WePkgReader", "filename = %s, offset = %d, size = %d, mimeType = %s, e = %s", new Object[] { paramString1, Long.valueOf(localxg.rDe), Integer.valueOf(localxg.hcy), localxg.rDf, localIOException.getMessage() });
          }
        } else {
          x.i("MicroMsg.Wepkg.WePkgReader", "fileSize(%d) > limitSize(%d), filename = %s, offset = %d, mimeType = %s", new Object[] { Integer.valueOf(localxg.hcy), Long.valueOf(5242880L), paramString1, Long.valueOf(localxg.rDe), localxg.rDf });
        }
      }
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/game/wepkg/model/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */