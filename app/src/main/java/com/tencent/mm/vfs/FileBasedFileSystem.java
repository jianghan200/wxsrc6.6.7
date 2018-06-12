package com.tencent.mm.vfs;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.StatFs;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.system.StructStat;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class FileBasedFileSystem
  implements FileSystem
{
  final boolean mReadOnly;
  private final File uRP;
  private final long uRQ;
  
  protected FileBasedFileSystem(Parcel paramParcel)
  {
    this.uRP = abH(paramParcel.readString());
    if (paramParcel.readByte() != 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.mReadOnly = bool;
      this.uRQ = abI(this.uRP.getPath());
      return;
    }
  }
  
  protected FileBasedFileSystem(String paramString)
  {
    this.uRP = abH(paramString);
    this.mReadOnly = false;
    this.uRQ = abI(this.uRP.getPath());
  }
  
  private FileSystem.a U(File paramFile)
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      locala = a.U(paramFile);
      if (locala != null) {
        return locala;
      }
    }
    FileSystem.a locala = new FileSystem.a();
    locala.uRT = paramFile.isDirectory();
    if ((!locala.uRT) && (!paramFile.isFile())) {
      return null;
    }
    locala.fileId = paramFile.getPath();
    locala.name = paramFile.getName();
    locala.size = paramFile.length();
    locala.uRS = paramFile.lastModified();
    locala.uRR = (locala.size + this.uRQ - 1L & (this.uRQ - 1L ^ 0xFFFFFFFFFFFFFFFF));
    return locala;
  }
  
  private static boolean V(File paramFile)
  {
    File[] arrayOfFile = paramFile.listFiles();
    boolean bool2;
    if (arrayOfFile != null)
    {
      int j = arrayOfFile.length;
      int i = 0;
      boolean bool1 = true;
      bool2 = bool1;
      if (i < j)
      {
        File localFile = arrayOfFile[i];
        if (localFile.isDirectory()) {
          bool1 &= V(localFile);
        }
        for (;;)
        {
          i += 1;
          break;
          bool1 &= localFile.delete();
        }
      }
    }
    else
    {
      bool2 = true;
    }
    return (paramFile.delete()) && (bool2);
  }
  
  private static File abH(String paramString)
  {
    File localFile = new File(paramString);
    try
    {
      paramString = localFile.getCanonicalFile();
      if (!paramString.isDirectory())
      {
        if (paramString.exists())
        {
          x.e("VFS.FileBasedFileSystem", "Base directory exists but is not a directory, delete and proceed.Base path: " + paramString.getPath());
          paramString.delete();
        }
        if (!paramString.mkdirs()) {
          x.e("VFS.FileBasedFileSystem", "Base directory cannot be created. Base path: " + paramString.getPath());
        }
      }
      return paramString;
    }
    catch (IOException paramString)
    {
      for (;;)
      {
        paramString = localFile.getAbsoluteFile();
      }
    }
  }
  
  private static long abI(String paramString)
  {
    try
    {
      int i = new StatFs(paramString).getBlockSize();
      if ((i - 1 & i) == 0) {
        return i;
      }
      return 1L;
    }
    catch (RuntimeException paramString) {}
    return 4096L;
  }
  
  public final boolean I(String paramString, boolean paramBoolean)
  {
    paramString = new File(abM(paramString));
    if (!paramString.isDirectory()) {
      return false;
    }
    if (paramBoolean) {
      return V(paramString);
    }
    return paramString.delete();
  }
  
  public final boolean abJ(String paramString)
  {
    paramString = abM(paramString);
    return (paramString != null) && (new File(paramString).exists());
  }
  
  public final FileSystem.a abK(String paramString)
  {
    return U(new File(abM(paramString)));
  }
  
  public final List<FileSystem.a> abL(String paramString)
  {
    Object localObject = new File(abM(paramString));
    if (!((File)localObject).isDirectory()) {}
    do
    {
      return null;
      paramString = new ArrayList();
      localObject = ((File)localObject).listFiles();
    } while (localObject == null);
    int j = localObject.length;
    int i = 0;
    while (i < j)
    {
      FileSystem.a locala = U(localObject[i]);
      if (locala != null) {
        paramString.add(locala);
      }
      i += 1;
    }
    return paramString;
  }
  
  public final String abM(String paramString)
  {
    return this.uRP.getPath() + '/' + paramString;
  }
  
  public final FileSystem.b cBQ()
  {
    StatFs localStatFs = new StatFs(this.uRP.getPath());
    FileSystem.b localb = new FileSystem.b();
    if (Build.VERSION.SDK_INT >= 18)
    {
      localb.sIP = localStatFs.getBlockSizeLong();
      localb.sIO = localStatFs.getAvailableBlocksLong();
    }
    for (localb.sIM = localStatFs.getBlockCountLong();; localb.sIM = localStatFs.getBlockCount())
    {
      localb.uRU = (localb.sIO * localb.sIP);
      localb.uRV = (localb.sIM * localb.sIP);
      return localb;
      localb.sIP = localStatFs.getBlockSize();
      localb.sIO = localStatFs.getAvailableBlocks();
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final boolean gl(String paramString1, String paramString2)
  {
    paramString1 = abM(paramString1);
    paramString2 = abM(paramString2);
    if ((paramString1 == null) || (paramString2 == null)) {
      return false;
    }
    return new File(paramString1).renameTo(new File(paramString2));
  }
  
  public final boolean jy(String paramString)
  {
    paramString = abM(paramString);
    if (paramString == null) {
      return false;
    }
    return new File(paramString).delete();
  }
  
  public final boolean mL(String paramString)
  {
    paramString = abM(paramString);
    if (paramString == null) {
      return false;
    }
    return new File(paramString).mkdirs();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.uRP.getPath());
    if (this.mReadOnly) {}
    for (paramInt = 1;; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      return;
    }
  }
  
  @TargetApi(21)
  private static final class a
  {
    static FileSystem.a U(File paramFile)
    {
      try
      {
        StructStat localStructStat = Os.stat(paramFile.getPath());
        if (localStructStat == null) {
          return null;
        }
        FileSystem.a locala = new FileSystem.a();
        locala.uRT = OsConstants.S_ISDIR(localStructStat.st_mode);
        if ((locala.uRT) || (OsConstants.S_ISREG(localStructStat.st_mode)))
        {
          locala.fileId = paramFile.getPath();
          locala.name = paramFile.getName();
          locala.size = localStructStat.st_size;
          locala.uRS = (localStructStat.st_mtime * 1000L);
          locala.uRR = (localStructStat.st_blocks * 512L);
          return locala;
        }
      }
      catch (ErrnoException paramFile) {}
      return null;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/vfs/FileBasedFileSystem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */