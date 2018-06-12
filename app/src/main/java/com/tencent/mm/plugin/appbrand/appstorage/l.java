package com.tencent.mm.plugin.appbrand.appstorage;

import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public abstract interface l
{
  public abstract j a(String paramString, FileStructStat paramFileStructStat);
  
  public abstract j a(String paramString, com.tencent.mm.plugin.appbrand.q.h<ByteBuffer> paramh);
  
  public abstract j a(String paramString, File paramFile, boolean paramBoolean);
  
  public abstract j a(String paramString, InputStream paramInputStream, boolean paramBoolean);
  
  public abstract j b(String paramString, com.tencent.mm.plugin.appbrand.q.h<List<h>> paramh);
  
  public abstract boolean bV(String paramString);
  
  public abstract void initialize();
  
  public abstract j ra(String paramString);
  
  public abstract File rb(String paramString);
  
  public abstract void release();
  
  public abstract j rf(String paramString);
  
  public abstract j rg(String paramString);
  
  public abstract j rh(String paramString);
  
  public abstract j ri(String paramString);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appstorage/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */