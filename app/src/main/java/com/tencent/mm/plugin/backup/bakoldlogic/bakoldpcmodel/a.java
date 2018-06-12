package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.plugin.backup.a.d;

public final class a
  extends d
{
  private static a gZf;
  private e gZg;
  private c gZh;
  private b gZi;
  
  public static a asN()
  {
    if (gZf == null)
    {
      a locala = new a();
      gZf = locala;
      a(locala);
    }
    return gZf;
  }
  
  public final void aqK()
  {
    gZf = null;
  }
  
  public final void aqQ() {}
  
  public final void aqR() {}
  
  public final e asO()
  {
    if (this.gZg == null) {
      this.gZg = new e();
    }
    return this.gZg;
  }
  
  public final c asP()
  {
    if (this.gZh == null) {
      this.gZh = new c();
    }
    return this.gZh;
  }
  
  public final b asQ()
  {
    if (this.gZi == null) {
      this.gZi = new b();
    }
    return this.gZi;
  }
  
  public final void l(Object... paramVarArgs)
  {
    paramVarArgs = (Context)paramVarArgs[0];
    asN().asQ().asR();
    com.tencent.mm.plugin.backup.f.b.clear();
    paramVarArgs.stopService(new Intent().setClassName(paramVarArgs, "com.tencent.mm.plugin.backup.bakoldlogic.bakoldmodel.BakOldUSBService"));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */