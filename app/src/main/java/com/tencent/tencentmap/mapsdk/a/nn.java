package com.tencent.tencentmap.mapsdk.a;

import android.graphics.Bitmap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class nn
{
  private a<String, Bitmap> a;
  
  public nn(int paramInt)
  {
    this.a = new a(paramInt);
  }
  
  public Bitmap a(String paramString)
  {
    return (Bitmap)this.a.a(paramString);
  }
  
  public void a()
  {
    this.a.a();
  }
  
  public void a(String paramString, Bitmap paramBitmap)
  {
    this.a.a(paramString, paramBitmap);
  }
  
  static class a<K, V>
  {
    byte[] a = new byte[0];
    private LinkedHashMap<K, V> b;
    private int c;
    
    public a(int paramInt)
    {
      this.c = paramInt;
      this.b = new LinkedHashMap((int)Math.ceil(paramInt / 0.75F) + 1, 0.75F, true)
      {
        protected boolean removeEldestEntry(Map.Entry<K, V> paramAnonymousEntry)
        {
          return size() > nn.a.a(nn.a.this);
        }
      };
    }
    
    public V a(K paramK)
    {
      synchronized (this.a)
      {
        paramK = this.b.get(paramK);
        return paramK;
      }
    }
    
    public void a()
    {
      synchronized (this.a)
      {
        this.b.clear();
        return;
      }
    }
    
    public void a(K paramK, V paramV)
    {
      synchronized (this.a)
      {
        this.b.put(paramK, paramV);
        return;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/nn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */