package com.tencent.d.b.a;

import com.tencent.d.a.c.f;

public abstract class e<T>
  extends com.tencent.d.a.c.e
{
  public T vlN = null;
  
  e()
  {
    super(-1);
  }
  
  protected e(int paramInt)
  {
    this(paramInt, "", null);
  }
  
  protected e(int paramInt, String paramString)
  {
    this(paramInt, paramString, null);
  }
  
  protected e(int paramInt, String paramString, T paramT)
  {
    super(paramInt, paramString);
    switch (paramInt)
    {
    }
    for (;;)
    {
      if (!f.oW(paramString)) {
        this.Yy = paramString;
      }
      this.vlN = paramT;
      return;
      this.Yy = "get support soter failed remotely";
      continue;
      this.Yy = "upload app secure key";
      continue;
      this.Yy = "upload auth key failed";
      continue;
      this.Yy = "not initialized yet. please make sure you've already called SoterWrapperApi.init(...) and call backed";
      continue;
      this.Yy = "context instance already released. should not happen normally, you can try to call again";
      continue;
      this.Yy = "there must be at least 1 fingerprint enrolled in system to complete this process. please check it previously";
      continue;
      this.Yy = "get challenge failed";
      continue;
      this.Yy = "upload or verify signature in server side failed";
    }
  }
  
  protected e(T paramT)
  {
    this(0, "", paramT);
  }
  
  public String toString()
  {
    if (this.vlN == null) {
      return super.toString();
    }
    return String.format("total: %s, extData: %s", new Object[] { super.toString(), this.vlN.toString() });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/d/b/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */