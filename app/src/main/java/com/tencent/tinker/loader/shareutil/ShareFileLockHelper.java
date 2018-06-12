package com.tencent.tinker.loader.shareutil;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public class ShareFileLockHelper
  implements Closeable
{
  private final FileOutputStream vvt;
  private final FileLock vvu;
  
  private ShareFileLockHelper(File paramFile)
  {
    this.vvt = new FileOutputStream(paramFile);
    Throwable localThrowable = null;
    Object localObject1 = null;
    int i = 0;
    Object localObject2;
    for (;;)
    {
      localObject2 = localObject1;
      int j;
      if (i < 3)
      {
        j = i + 1;
        localObject2 = localObject1;
      }
      try
      {
        localObject1 = this.vvt.getChannel().lock();
        if (localObject1 != null) {}
        for (i = 1; i != 0; i = 0)
        {
          localObject2 = localObject1;
          if (localObject2 != null) {
            break label133;
          }
          throw new IOException("Tinker Exception:FileLockHelper lock file failed: " + paramFile.getAbsolutePath(), localThrowable);
        }
        localObject2 = localObject1;
        Thread.sleep(10L);
        i = j;
      }
      catch (Exception localException)
      {
        localObject1 = localObject2;
        i = j;
      }
    }
    label133:
    this.vvu = ((FileLock)localObject2);
  }
  
  public static ShareFileLockHelper ag(File paramFile)
  {
    return new ShareFileLockHelper(paramFile);
  }
  
  public void close()
  {
    try
    {
      if (this.vvu != null) {
        this.vvu.release();
      }
      return;
    }
    finally
    {
      if (this.vvt != null) {
        this.vvt.close();
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/tinker/loader/shareutil/ShareFileLockHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */