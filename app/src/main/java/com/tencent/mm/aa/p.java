package com.tencent.mm.aa;

import android.database.Cursor;
import com.tencent.mm.bt.h;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.al.a;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.List;

public final class p
{
  private static List<String> dIg = null;
  private static int dIh = 0;
  private static a dIi = new a(new b());
  
  public static void KB()
  {
    dIh = 0;
    dIi.SO();
  }
  
  public static void k(Runnable paramRunnable)
  {
    if (!g.Eg().Dx()) {}
    ArrayList localArrayList;
    do
    {
      return;
      Object localObject = q.KH();
      localArrayList = new ArrayList();
      localObject = ((k)localObject).dCZ.b("select username from img_flag where username not in (select username from rcontact ) and username not like \"%@qqim\" and username not like \"%@bottle\";", null, 2);
      while (((Cursor)localObject).moveToNext()) {
        localArrayList.add(((Cursor)localObject).getString(0));
      }
      ((Cursor)localObject).close();
      dIg = localArrayList;
    } while (localArrayList.size() <= 0);
    dIi.dIj.dIk = paramRunnable;
    dIi.J(10L, 10L);
  }
  
  static final class a
    extends al
  {
    final p.b dIj;
    
    public a(p.b paramb)
    {
      super(true);
      this.dIj = paramb;
    }
  }
  
  static final class b
    implements al.a
  {
    Runnable dIk;
    
    public final boolean vD()
    {
      int j = p.KC().size();
      x.e("MicroMsg.RemoveAvatarTask", "RemoveOldAvatar left count:" + j);
      if ((j <= 2000) || (p.KD() >= 300))
      {
        if (this.dIk != null) {
          this.dIk.run();
        }
        p.KE();
        return false;
      }
      long l = g.Ei().dqq.dO(Thread.currentThread().getId());
      int i = j - 1;
      while (i >= j - 30)
      {
        p.KF();
        String str = (String)p.KC().get(i);
        p.KC().remove(i);
        q.Kp();
        f.B(str, false);
        q.Kp();
        f.B(str, true);
        q.KH().kd(str);
        i -= 1;
      }
      g.Ei().dqq.gp(l);
      return true;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/aa/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */