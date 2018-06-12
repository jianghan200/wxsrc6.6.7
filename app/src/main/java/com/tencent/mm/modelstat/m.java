package com.tencent.mm.modelstat;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.HandlerThread;
import com.tencent.mm.bt.h;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.av;
import com.tencent.mm.sdk.platformtools.av.b;
import com.tencent.mm.sdk.platformtools.av.c;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashSet;
import junit.framework.Assert;

public final class m
  extends j
  implements av.c<Integer, k>
{
  public static final String[] diD = { "CREATE TABLE IF NOT EXISTS netstat ( id INTEGER PRIMARY KEY, peroid INT, textCountIn INT, textBytesIn INT, imageCountIn INT, imageBytesIn INT, voiceCountIn INT, voiceBytesIn INT, videoCountIn INT, videoBytesIn INT, mobileBytesIn INT, wifiBytesIn INT, sysMobileBytesIn INT, sysWifiBytesIn INT, textCountOut INT, textBytesOut INT, imageCountOut INT, imageBytesOut INT, voiceCountOut INT, voiceBytesOut INT, videoCountOut INT, videoBytesOut INT, mobileBytesOut INT, wifiBytesOut INT, sysMobileBytesOut INT, sysWifiBytesOut INT, reserved1 INT, reserved2 INT, reserved3 TEXT, realMobileBytesIn INT, realWifiBytesIn INT, realMobileBytesOut INT, realWifiBytesOut INT) ", "CREATE INDEX IF NOT EXISTS  statInfoIndex ON netstat ( peroid ) " };
  private static final String[] ekB = { "realMobileBytesIn", "realWifiBytesIn", "realMobileBytesOut", "realWifiBytesOut" };
  public h dCZ;
  private long ekA;
  private long eky;
  public av<Integer, k> ekz;
  
  public m(h paramh)
  {
    this.dCZ = paramh;
    this.ekz = new av(this, g.Em().lnJ.getLooper(), 30, 2, 300000L, 1000L);
    paramh = new HashSet();
    Object localObject1 = ekB;
    int k = localObject1.length;
    int i = 0;
    while (i < k)
    {
      paramh.add(localObject1[i]);
      i += 1;
    }
    localObject1 = this.dCZ.b("PRAGMA table_info(netstat);", null, 2);
    i = ((Cursor)localObject1).getColumnIndex("name");
    while (((Cursor)localObject1).moveToNext()) {
      paramh.remove(((Cursor)localObject1).getString(i));
    }
    ((Cursor)localObject1).close();
    localObject1 = ekB;
    k = localObject1.length;
    i = j;
    while (i < k)
    {
      Object localObject2 = localObject1[i];
      if (paramh.contains(localObject2))
      {
        localObject2 = "ALTER TABLE netstat ADD COLUMN " + (String)localObject2 + " INT;";
        this.dCZ.fV("netstat", (String)localObject2);
      }
      i += 1;
    }
    this.ekA = System.currentTimeMillis();
  }
  
  public final long Sb()
  {
    this.ekz.li(true);
    int j = (int)((bi.VF() - 1296000000L) / 86400000L);
    int i = (int)(bi.ciY() / 86400000L);
    Object localObject = "SELECT peroid FROM netstat  WHERE peroid > " + j + " order by peroid limit 1";
    localObject = this.dCZ.b((String)localObject, null, 2);
    if (((Cursor)localObject).moveToFirst()) {
      i = ((Cursor)localObject).getInt(((Cursor)localObject).getColumnIndex("peroid"));
    }
    ((Cursor)localObject).close();
    return i * 86400000L;
  }
  
  public final boolean Sc()
  {
    if (this.dCZ.inTransaction())
    {
      x.i("MicroMsg.NetStat", "summer preAppend inTransaction return false");
      return false;
    }
    this.eky = this.dCZ.dO(Thread.currentThread().getId());
    if (this.eky <= 0L)
    {
      x.i("MicroMsg.NetStat", "summer preAppend ticket: " + this.eky + " return false");
      return false;
    }
    return true;
  }
  
  public final void Sd()
  {
    if (this.eky > 0L) {
      this.dCZ.gp(this.eky);
    }
  }
  
  public final void a(k paramk)
  {
    Assert.assertNotNull(paramk);
    long l = System.currentTimeMillis();
    if (paramk.ejM <= 0) {
      paramk.ejM = ((int)(l / 86400000L));
    }
    if (paramk.ejM <= 0) {
      return;
    }
    k localk = it(paramk.ejM);
    if ((localk != null) && (paramk.ejM == localk.ejM))
    {
      localk.bWA |= 0x1;
      paramk.ejN += localk.ejO;
      paramk.ejO += localk.ejO;
      paramk.ejP += localk.ejQ;
      paramk.ejQ += localk.ejQ;
      paramk.ejR += localk.ejR;
      paramk.ejS += localk.ejS;
      paramk.ejT += localk.ejT;
      paramk.ejU += localk.ejU;
      paramk.ejV += localk.ejV;
      paramk.ejW += localk.ejW;
      paramk.ejX += localk.ejX;
      paramk.ejY += localk.ejY;
      paramk.ejZ += localk.eka;
      paramk.eka += localk.eka;
      paramk.ekb += localk.ekc;
      paramk.ekc += localk.ekc;
      paramk.ekd += localk.ekd;
      paramk.eke += localk.eke;
      paramk.ekf += localk.ekf;
      paramk.ekg += localk.ekg;
      paramk.ekh += localk.ekh;
      paramk.eki += localk.eki;
      paramk.ekj += localk.ekj;
      paramk.ekk += localk.ekk;
      paramk.ekl += localk.ekl;
      paramk.ekm += localk.ekm;
      paramk.ekn += localk.ekn;
      paramk.eko += localk.eko;
      if ((paramk.ejV <= 4096) && (paramk.ejW <= 4096) && (paramk.ekh <= 4096)) {
        int i = paramk.eki;
      }
      paramk.id = localk.id;
      if (l - this.ekA > 300000L) {
        x.i("MicroMsg.NetStat", paramk.toString());
      }
    }
    for (;;)
    {
      this.ekA = l;
      b(paramk);
      return;
      paramk.bWA |= 0x2;
      paramk.id = -1;
      if (localk != null) {
        x.i("MicroMsg.NetStat", localk.toString());
      } else {
        x.i("MicroMsg.NetStat", "NetStat started.");
      }
    }
  }
  
  public final void a(av<Integer, k> paramav, av.b<Integer, k> paramb)
  {
    int i = paramb.sIz;
    paramav = (k)paramb.values;
    if ((paramav != null) && (i == 1))
    {
      i = paramav.ejM;
      int j = paramav.id;
      if (i > 0)
      {
        paramb = new ContentValues();
        if ((paramav.bWA & 0x2) != 0) {
          paramb.put("peroid", Integer.valueOf(paramav.ejM));
        }
        if ((paramav.bWA & 0x4) != 0) {
          paramb.put("textCountIn", Integer.valueOf(paramav.ejN));
        }
        if ((paramav.bWA & 0x8) != 0) {
          paramb.put("textBytesIn", Integer.valueOf(paramav.ejO));
        }
        if ((paramav.bWA & 0x10) != 0) {
          paramb.put("imageCountIn", Integer.valueOf(paramav.ejP));
        }
        if ((paramav.bWA & 0x20) != 0) {
          paramb.put("imageBytesIn", Integer.valueOf(paramav.ejQ));
        }
        if ((paramav.bWA & 0x40) != 0) {
          paramb.put("voiceCountIn", Integer.valueOf(paramav.ejR));
        }
        if ((paramav.bWA & 0x80) != 0) {
          paramb.put("voiceBytesIn", Integer.valueOf(paramav.ejS));
        }
        if ((paramav.bWA & 0x100) != 0) {
          paramb.put("videoCountIn", Integer.valueOf(paramav.ejT));
        }
        if ((paramav.bWA & 0x200) != 0) {
          paramb.put("videoBytesIn", Integer.valueOf(paramav.ejU));
        }
        if ((paramav.bWA & 0x400) != 0) {
          paramb.put("mobileBytesIn", Integer.valueOf(paramav.ejV));
        }
        if ((paramav.bWA & 0x800) != 0) {
          paramb.put("wifiBytesIn", Integer.valueOf(paramav.ejW));
        }
        if ((paramav.bWA & 0x1000) != 0) {
          paramb.put("sysMobileBytesIn", Integer.valueOf(paramav.ejX));
        }
        if ((paramav.bWA & 0x2000) != 0) {
          paramb.put("sysWifiBytesIn", Integer.valueOf(paramav.ejY));
        }
        if ((paramav.bWA & 0x4000) != 0) {
          paramb.put("textCountOut", Integer.valueOf(paramav.ejZ));
        }
        if ((paramav.bWA & 0x8000) != 0) {
          paramb.put("textBytesOut", Integer.valueOf(paramav.eka));
        }
        if ((paramav.bWA & 0x10000) != 0) {
          paramb.put("imageCountOut", Integer.valueOf(paramav.ekb));
        }
        if ((paramav.bWA & 0x20000) != 0) {
          paramb.put("imageBytesOut", Integer.valueOf(paramav.ekc));
        }
        if ((paramav.bWA & 0x40000) != 0) {
          paramb.put("voiceCountOut", Integer.valueOf(paramav.ekd));
        }
        if ((paramav.bWA & 0x80000) != 0) {
          paramb.put("voiceBytesOut", Integer.valueOf(paramav.eke));
        }
        if ((paramav.bWA & 0x100000) != 0) {
          paramb.put("videoCountOut", Integer.valueOf(paramav.ekf));
        }
        if ((paramav.bWA & 0x200000) != 0) {
          paramb.put("videoBytesOut", Integer.valueOf(paramav.ekg));
        }
        if ((paramav.bWA & 0x400000) != 0) {
          paramb.put("mobileBytesOut", Integer.valueOf(paramav.ekh));
        }
        if ((paramav.bWA & 0x800000) != 0) {
          paramb.put("wifiBytesOut", Integer.valueOf(paramav.eki));
        }
        if ((paramav.bWA & 0x1000000) != 0) {
          paramb.put("sysMobileBytesOut", Integer.valueOf(paramav.ekj));
        }
        if ((paramav.bWA & 0x2000000) != 0) {
          paramb.put("sysWifiBytesOut", Integer.valueOf(paramav.ekk));
        }
        if ((paramav.bWA & 0x4000000) != 0) {
          paramb.put("realMobileBytesIn", Integer.valueOf(paramav.ekl));
        }
        if ((paramav.bWA & 0x8000000) != 0) {
          paramb.put("realWifiBytesIn", Integer.valueOf(paramav.ekm));
        }
        if ((paramav.bWA & 0x10000000) != 0) {
          paramb.put("realMobileBytesOut", Integer.valueOf(paramav.ekn));
        }
        if ((paramav.bWA & 0x20000000) != 0) {
          paramb.put("realWifiBytesOut", Integer.valueOf(paramav.eko));
        }
        if (j >= 0) {
          break label781;
        }
        paramav.id = ((int)this.dCZ.insert("netstat", "id", paramb));
      }
    }
    return;
    label781:
    this.dCZ.update("netstat", paramb, "peroid=" + i, null);
  }
  
  public final boolean b(k paramk)
  {
    Assert.assertNotNull(paramk);
    if (paramk.ejM > 0) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      return this.ekz.s(Integer.valueOf(paramk.ejM), paramk);
    }
  }
  
  public final k it(int paramInt)
  {
    k localk1 = (k)this.ekz.get(Integer.valueOf(paramInt));
    Object localObject;
    if (localk1 == null)
    {
      localObject = this.dCZ.a("netstat", null, "peroid = " + paramInt, null, null, null, null, 2);
      if (((Cursor)localObject).moveToFirst())
      {
        localk1 = new k();
        localk1.d((Cursor)localObject);
      }
      ((Cursor)localObject).close();
      if (localk1 != null)
      {
        this.ekz.s(Integer.valueOf(paramInt), localk1);
        localObject = localk1;
      }
    }
    do
    {
      return (k)localObject;
      localObject = this.ekz;
      k localk2 = new k();
      localk2.bWA = 0;
      localk2.id = 0;
      localk2.ejM = 0;
      localk2.ejN = 0;
      localk2.ejO = 0;
      localk2.ejP = 0;
      localk2.ejQ = 0;
      localk2.ejR = 0;
      localk2.ejS = 0;
      localk2.ejT = 0;
      localk2.ejU = 0;
      localk2.ejV = 0;
      localk2.ejW = 0;
      localk2.ejX = 0;
      localk2.ejY = 0;
      localk2.ejZ = 0;
      localk2.eka = 0;
      localk2.ekb = 0;
      localk2.ekc = 0;
      localk2.ekd = 0;
      localk2.eke = 0;
      localk2.ekf = 0;
      localk2.ekg = 0;
      localk2.ekh = 0;
      localk2.eki = 0;
      localk2.ekj = 0;
      localk2.ekk = 0;
      localk2.ekl = 0;
      localk2.ekm = 0;
      localk2.ekn = 0;
      localk2.eko = 0;
      ((av)localObject).s(Integer.valueOf(paramInt), localk2);
      return localk1;
      localObject = localk1;
    } while (localk1.ejM == paramInt);
    return null;
  }
  
  public final k iu(int paramInt)
  {
    k localk = null;
    this.ekz.li(true);
    Object localObject = "SELECT MAX( id), MAX( peroid), SUM( textCountIn), SUM( textBytesIn), SUM( imageCountIn), SUM( imageBytesIn), SUM( voiceCountIn), SUM( voiceBytesIn), SUM( videoCountIn), SUM( videoBytesIn), SUM( mobileBytesIn), SUM( wifiBytesIn), SUM( sysMobileBytesIn), SUM( sysWifiBytesIn), SUM( textCountOut), SUM( textBytesOut), SUM( imageCountOut), SUM( imageBytesOut), SUM( voiceCountOut), SUM( voiceBytesOut), SUM( videoCountOut), SUM( videoBytesOut), SUM( mobileBytesOut), SUM( wifiBytesOut), SUM( sysMobileBytesOut), SUM( sysWifiBytesOut ), SUM( realMobileBytesIn ), SUM( realWifiBytesIn ), SUM( realMobileBytesOut ), SUM( realWifiBytesOut ) FROM netstat WHERE peroid >= " + paramInt;
    localObject = this.dCZ.b((String)localObject, null, 2);
    if (((Cursor)localObject).moveToFirst())
    {
      localk = new k();
      localk.d((Cursor)localObject);
    }
    ((Cursor)localObject).close();
    return localk;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/modelstat/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */