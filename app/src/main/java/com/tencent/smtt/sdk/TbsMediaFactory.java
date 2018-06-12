package com.tencent.smtt.sdk;

import android.content.Context;
import com.tencent.smtt.export.external.DexLoader;

public class TbsMediaFactory
{
  private Context a = null;
  private bi b = null;
  private DexLoader c = null;
  
  public TbsMediaFactory(Context paramContext)
  {
    this.a = paramContext.getApplicationContext();
    a();
  }
  
  private void a()
  {
    if (this.a == null) {}
    do
    {
      return;
      if (this.b == null)
      {
        o.a(true).a(this.a, false, false, null);
        this.b = o.a(true).a();
        if (this.b != null) {
          this.c = this.b.b();
        }
      }
    } while ((this.b != null) && (this.c != null));
    throw new RuntimeException("tbs core dex(s) load failure !!!");
  }
  
  public TbsMediaPlayer createPlayer()
  {
    if ((this.b == null) || (this.c == null)) {
      throw new RuntimeException("tbs core dex(s) did not loaded !!!");
    }
    return new TbsMediaPlayer(new ba(this.c, this.a));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/smtt/sdk/TbsMediaFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */