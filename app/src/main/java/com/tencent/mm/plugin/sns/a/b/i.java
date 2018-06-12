package com.tencent.mm.plugin.sns.a.b;

import android.database.Cursor;
import com.tencent.mm.ab.l;
import com.tencent.mm.bt.h;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.q;
import com.tencent.mm.protocal.c.apz;
import com.tencent.mm.protocal.c.bow;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.storage.aa.a;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public final class i
  implements com.tencent.mm.ab.e
{
  public static int njA = 1800;
  public static int njB = 43200;
  public static int njw = 20480;
  public static int njx = 30720;
  public static int njy = 51200;
  public static int njz = 60;
  private long njC = 0L;
  private bow njD = new bow();
  private boolean njE = false;
  private long njF = 0L;
  private int njG = 0;
  private int njv = 0;
  private Random random = new Random(System.currentTimeMillis());
  
  private void bwQ()
  {
    af.byb().post(new i.3(this));
  }
  
  private void bwR()
  {
    af.byb().post(new i.4(this));
  }
  
  public static String n(Object... paramVarArgs)
  {
    if ((paramVarArgs == null) || (paramVarArgs.length <= 0))
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.SnsLogMgr", "vals is null, use '' as value");
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    int j = paramVarArgs.length - 1;
    int i = 0;
    while (i < j)
    {
      localStringBuilder.append(String.valueOf(paramVarArgs[i])).append(',');
      i += 1;
    }
    localStringBuilder.append(String.valueOf(paramVarArgs[j]));
    return localStringBuilder.toString();
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paraml.getType() == 1802) && ((paraml instanceof e)))
    {
      paramString = (e)paraml;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        g.Ek();
        g.Ei().DT().a(aa.a.sQJ, Integer.valueOf((int)(System.currentTimeMillis() / 1000L)));
        bwR();
      }
    }
    else
    {
      return;
    }
    Object localObject = paramString.gxs;
    paramString = af.byh();
    paraml = new bow();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      apz localapz = (apz)((Iterator)localObject).next();
      paraml.rbN.add(localapz);
    }
    paramString.a(paraml);
  }
  
  public final void bwP()
  {
    if (!af.npv) {
      return;
    }
    g.Ek();
    int k = ((Integer)g.Ei().DT().get(aa.a.sQJ, Integer.valueOf(0))).intValue();
    g.Ek();
    int j = ((Integer)g.Ei().DT().get(aa.a.sQI, Integer.valueOf(-1))).intValue();
    if (j <= njB)
    {
      i = j;
      if (j >= 0) {}
    }
    else
    {
      i = njA;
      j = njz;
      i = this.random.nextInt(i - j + 1) + njz;
    }
    if (System.currentTimeMillis() / 1000L - k > i) {}
    for (int i = 1; i == 0; i = 0)
    {
      bwQ();
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SnsLogMgr", "pass report ");
      return;
    }
    Object localObject = af.byh();
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SnsKvReportStg", " getLast " + "select rowid from SnsReportKv order by rowid desc  limit 1");
    localObject = ((q)localObject).dCZ.b("select rowid from SnsReportKv order by rowid desc  limit 1", null, 2);
    if (((Cursor)localObject).moveToFirst()) {}
    for (i = ((Cursor)localObject).getInt(0);; i = 0)
    {
      ((Cursor)localObject).close();
      this.njv = i;
      bwR();
      bwQ();
      return;
    }
  }
  
  public final void h(int paramInt, Object... paramVarArgs)
  {
    af.byb().post(new i.1(this, paramInt, paramVarArgs));
    if (this.njE) {
      return;
    }
    this.njE = true;
    af.byb().postDelayed(new Runnable()
    {
      public final void run()
      {
        i.c(i.this);
        i.this.bwP();
      }
    }, 2000L);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/a/b/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */