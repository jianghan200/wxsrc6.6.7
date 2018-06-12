package com.tencent.matrix.resource.e;

import android.content.Context;
import android.os.Environment;
import com.tencent.matrix.d.b;
import java.io.File;
import java.io.FilenameFilter;

public final class d
{
  protected final int bsI;
  protected final Context mContext;
  
  public d(Context paramContext)
  {
    this(paramContext, (byte)0);
  }
  
  private d(Context paramContext, byte paramByte)
  {
    this.mContext = paramContext;
    this.bsI = 5;
  }
  
  final File tD()
  {
    if ("mounted".equals(Environment.getExternalStorageState())) {}
    for (File localFile1 = this.mContext.getExternalCacheDir();; localFile1 = this.mContext.getCacheDir())
    {
      localFile1 = new File(localFile1, "matrix_resource");
      b.i("Matrix.DumpStorageManager", "path to store hprof and result: %s", new Object[] { localFile1.getAbsolutePath() });
      if ((localFile1.exists()) || ((localFile1.mkdirs()) && (localFile1.canWrite()))) {
        break;
      }
      b.w("Matrix.DumpStorageManager", "failed to allocate new hprof file since path: %s is not writable.", new Object[] { localFile1.getAbsolutePath() });
      return null;
    }
    File[] arrayOfFile = localFile1.listFiles(new FilenameFilter()
    {
      public final boolean accept(File paramAnonymousFile, String paramAnonymousString)
      {
        return paramAnonymousString.endsWith(".hprof");
      }
    });
    if ((arrayOfFile != null) && (arrayOfFile.length > this.bsI))
    {
      int j = arrayOfFile.length;
      int i = 0;
      while (i < j)
      {
        File localFile2 = arrayOfFile[i];
        if ((localFile2.exists()) && (!localFile2.delete())) {
          b.w("Matrix.DumpStorageManager", "faile to delete hprof file: " + localFile2.getAbsolutePath(), new Object[0]);
        }
        i += 1;
      }
    }
    return localFile1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/matrix/resource/e/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */