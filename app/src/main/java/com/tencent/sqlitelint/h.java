package com.tencent.sqlitelint;

import android.app.Application;
import android.content.Context;
import com.tencent.matrix.b.b;
import com.tencent.matrix.b.c;
import com.tencent.sqlitelint.a.a;
import java.util.List;

public class h
  extends b
{
  public Context mContext;
  public final a vnw;
  
  public h(a parama)
  {
    this.vnw = parama;
  }
  
  public final void a(Application paramApplication, c paramc)
  {
    super.a(paramApplication, paramc);
    e.ay(paramApplication);
    this.mContext = paramApplication.getApplicationContext();
  }
  
  public final String getTag()
  {
    return "SQLiteLint";
  }
  
  public final void start()
  {
    super.start();
    if (!this.brg) {}
    for (;;)
    {
      return;
      e.a(new com.tencent.sqlitelint.behaviour.b.a.a()
      {
        public final void a(SQLiteLintIssue paramAnonymousSQLiteLintIssue)
        {
          if (paramAnonymousSQLiteLintIssue == null) {
            return;
          }
          h.a(h.this, paramAnonymousSQLiteLintIssue);
        }
      });
      List localList = this.vnw.vnW;
      int i = 0;
      while (i < localList.size())
      {
        com.tencent.sqlitelint.a.a.a locala = (com.tencent.sqlitelint.a.a.a)localList.get(i);
        String str = locala.vnX.vnk;
        e.a(this.mContext, locala.vnX, locala.vnY);
        e.dD(str, locala.vnZ);
        e.v(str, locala.voa);
        i += 1;
      }
    }
  }
  
  public final void stop()
  {
    super.stop();
    if (!this.brg) {
      return;
    }
    List localList = this.vnw.vnW;
    int i = 0;
    while (i < localList.size())
    {
      e.acH(((com.tencent.sqlitelint.a.a.a)localList.get(i)).vnX.vnk);
      i += 1;
    }
    e.a(null);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/sqlitelint/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */