package com.tencent.mm.vfs;

import android.os.Parcelable;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

public abstract interface FileSystem
  extends Parcelable
{
  public abstract boolean I(String paramString, boolean paramBoolean);
  
  public abstract boolean abJ(String paramString);
  
  public abstract a abK(String paramString);
  
  public abstract List<a> abL(String paramString);
  
  public abstract String abM(String paramString);
  
  public abstract b cBQ();
  
  public abstract boolean gl(String paramString1, String paramString2);
  
  public abstract boolean jy(String paramString);
  
  public abstract OutputStream mG(String paramString);
  
  public abstract boolean mL(String paramString);
  
  public abstract InputStream openRead(String paramString);
  
  public static final class a
  {
    public String fileId;
    public String name;
    public long size;
    public long uRR;
    public long uRS;
    public boolean uRT;
  }
  
  public static final class b
  {
    public long sIM;
    public long sIO;
    public long sIP;
    public long uRU;
    public long uRV;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/vfs/FileSystem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */