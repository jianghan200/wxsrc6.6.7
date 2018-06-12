package com.tencent.mm.vfs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;

public class RawFileSystem
  extends FileBasedFileSystem
{
  public static final Parcelable.Creator<RawFileSystem> CREATOR = new Parcelable.Creator() {};
  private final boolean uSn;
  
  private RawFileSystem(Parcel paramParcel)
  {
    super(paramParcel);
    if (paramParcel.readByte() != 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.uSn = bool;
      return;
    }
  }
  
  public RawFileSystem(String paramString)
  {
    super(paramString);
    this.uSn = false;
  }
  
  public final OutputStream mG(String paramString)
  {
    if (this.mReadOnly) {
      throw new IOException("Cannot open files for writing on read-only file systems");
    }
    String str = abM(paramString);
    if (str == null) {
      throw new IOException("Invalid path: " + paramString);
    }
    return new FileOutputStream(str);
  }
  
  public final InputStream openRead(String paramString)
  {
    String str = abM(paramString);
    if (str == null) {
      throw new IOException("Invalid path: " + paramString);
    }
    return new a(str);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    if (this.uSn) {}
    for (paramInt = 1;; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      return;
    }
  }
  
  private static final class a
    extends FileInputStream
  {
    private long eey = 0L;
    
    a(String paramString)
    {
      super();
    }
    
    public final void mark(int paramInt)
    {
      try
      {
        this.eey = getChannel().position();
        return;
      }
      catch (IOException localIOException)
      {
        throw new RuntimeException(localIOException);
      }
    }
    
    public final boolean markSupported()
    {
      return true;
    }
    
    public final void reset()
    {
      getChannel().position(this.eey);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/vfs/RawFileSystem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */