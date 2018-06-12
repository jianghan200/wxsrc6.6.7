package com.tencent.d.b.f;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.util.SparseArray;
import com.tencent.d.a.c.b;
import com.tencent.d.a.c.c;
import com.tencent.d.a.c.f;
import com.tencent.d.a.c.g.a;
import com.tencent.d.b.e.d.a;
import java.nio.charset.Charset;

public class i
  extends d
{
  private static final String vmU = "soter_triggered_oom" + f.u(com.tencent.d.a.a.cFF().getBytes(Charset.forName("UTF-8")));
  private boolean vmV = false;
  private String vmW = "";
  private g.a vmX = new i.1(this);
  private com.tencent.d.b.e.d vmp;
  private String vmq = "";
  private int[] vmr;
  
  public i(Context paramContext, e parame)
  {
    Object localObject = parame.vms;
    if (localObject != null) {
      c.a((b)localObject);
    }
    localObject = com.tencent.d.b.b.a.cFO();
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("soter_status", 0);
    try
    {
      ((com.tencent.d.b.b.a)localObject).vlQ = localSharedPreferences;
      com.tencent.d.a.c.g.a(this.vmX);
      com.tencent.d.a.a.setUp();
      boolean bool1 = bool2;
      if (com.tencent.d.a.a.cFz())
      {
        bool1 = bool2;
        if (com.tencent.d.a.a.hy(paramContext)) {
          bool1 = true;
        }
      }
      this.vmV = bool1;
      this.vmp = parame.vmp;
      this.vmr = parame.vmr;
      this.vmq = parame.vmq;
      this.vmW = parame.vmt;
      return;
    }
    finally {}
  }
  
  private static boolean Hr(int paramInt)
  {
    return (paramInt == 2) || (paramInt == 1);
  }
  
  @SuppressLint({"DefaultLocale"})
  public void b(String paramString, int[] paramArrayOfInt)
  {
    int j = paramArrayOfInt.length;
    int i = 0;
    while (i < j)
    {
      int k = paramArrayOfInt[i];
      String str = String.format("%suid%d_%s_scene%d", new Object[] { "Wechat", Integer.valueOf(Process.myUid()), f.oV(paramString), Integer.valueOf(k) });
      com.tencent.d.b.b.a.cFO().cFQ().put(k, str);
      i += 1;
    }
  }
  
  final boolean cFX()
  {
    Object localObject = this.vmr;
    if ((localObject == null) || (localObject.length <= 0)) {}
    for (int i = 1; i != 0; i = 0)
    {
      c.e("Soter.TaskInit", "soter: the salt string used to distinguish is longer than 24", new Object[0]);
      b(new com.tencent.d.b.a.d(27, "no business scene provided"));
      return true;
    }
    if (f.oV(this.vmq).length() > 16)
    {
      c.w("Soter.TaskInit", "soter: the salt string used to distinguish is longer than 24. soter will try to make it compat", new Object[0]);
      localObject = f.u(this.vmq.getBytes(Charset.forName("UTF-8")));
      if ((!f.oW((String)localObject)) && (((String)localObject).length() >= 16)) {}
      for (localObject = ((String)localObject).substring(0, 16); f.oW((String)localObject); localObject = null)
      {
        c.w("Soter.TaskInit", "soter: saltlen compat failed!!", new Object[0]);
        b(new com.tencent.d.b.a.d(28, "the account salt length is too long"));
        return true;
      }
      this.vmq = ((String)localObject);
    }
    if ((!f.oW(this.vmW)) && (this.vmW.length() > 24))
    {
      c.e("Soter.TaskInit", "soter: the passed ask name is too long (larger than 24).", new Object[0]);
      b(new com.tencent.d.b.a.d(29, "the passed ask name is too long (larger than 24)"));
      return true;
    }
    if (this.vmp == null) {
      c.w("Soter.TaskInit", "soter: it is strongly recommended to check device support from server, so you'd better provider a net wrapper to check it", new Object[0]);
    }
    if (!f.oW(this.vmW))
    {
      c.i("Soter.TaskInit", "soter: provided valid ASK name", new Object[0]);
      com.tencent.d.a.c.d.cFJ().vly = this.vmW;
    }
    g.cGb().C(new i.2(this));
    return false;
  }
  
  final void cFY() {}
  
  final void execute()
  {
    if (this.vmV)
    {
      if (this.vmp == null)
      {
        com.tencent.d.b.b.a.cFO().mQ(true);
        com.tencent.d.b.b.a.cFO().cFP();
        b(new com.tencent.d.b.a.d(0));
        return;
      }
      String str = com.tencent.d.a.a.cFF();
      this.vmp.bx(new d.a(str));
      this.vmp.a(new i.3(this));
      this.vmp.execute();
      return;
    }
    b(new com.tencent.d.b.a.d(2));
    try
    {
      com.tencent.d.b.b.a.cFO().mQ(false);
      com.tencent.d.b.b.a.cFO().cFP();
      return;
    }
    finally {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/d/b/f/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */