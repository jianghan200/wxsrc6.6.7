package com.tencent.b.a.a;

import android.content.Context;
import android.provider.Settings.System;

public final class o
  extends q
{
  public o(Context paramContext)
  {
    super(paramContext);
  }
  
  protected final void a(a parama)
  {
    try
    {
      new StringBuilder("write CheckEntity to Settings.System:").append(parama.toString());
      p.aG(this.context).u(s.decode("4kU71lN96TJUomD1vOU9lgj9U+kKmxDPLVM+zzjst5U="), parama.toString());
      return;
    }
    finally {}
  }
  
  protected final String read()
  {
    try
    {
      String str = Settings.System.getString(this.context.getContentResolver(), s.decode("4kU71lN96TJUomD1vOU9lgj9Tw=="));
      return str;
    }
    finally {}
  }
  
  protected final boolean tL()
  {
    return s.o(this.context, "android.permission.WRITE_SETTINGS");
  }
  
  protected final a tM()
  {
    try
    {
      a locala = new a(Settings.System.getString(this.context.getContentResolver(), s.decode("4kU71lN96TJUomD1vOU9lgj9U+kKmxDPLVM+zzjst5U=")));
      new StringBuilder("read readCheckEntity from Settings.System:").append(locala.toString());
      return locala;
    }
    finally {}
  }
  
  protected final void write(String paramString)
  {
    try
    {
      p.aG(this.context).u(s.decode("4kU71lN96TJUomD1vOU9lgj9Tw=="), paramString);
      return;
    }
    finally {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/b/a/a/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */