package com.tencent.mm.plugin.sns.a.b;

import android.os.SystemClock;
import com.tencent.mm.plugin.sns.a.b.a.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.LinkedList;

public final class h
{
  public String TAG = "MicroMsg.SnsAdVideoStatistic";
  public long egO = 0L;
  public long egP = 0L;
  public int njk = 0;
  public int njl = 0;
  public long njm = 0L;
  public int njn = 0;
  public int njo = 0;
  public int njp = 0;
  public int njq = 0;
  public boolean njr = false;
  public a njs = new a();
  public LinkedList<a> njt = new LinkedList();
  public long nju = 0L;
  
  public h() {}
  
  public h(String paramString)
  {
    this.TAG = ("MicroMsg.SnsAdVideoStatistic:" + paramString);
  }
  
  public final String bwN()
  {
    if (this.njm == 0L) {}
    StringBuffer localStringBuffer;
    a locala;
    for (int i = 0;; i = (int)bi.bI(this.njm))
    {
      this.njl = i;
      x.d(this.TAG, "__staytotaltime " + this.njm + " " + this.njl + " clock: " + SystemClock.elapsedRealtime());
      localStringBuffer = new StringBuffer();
      localStringBuffer.append("<viewinfo>");
      localStringBuffer.append("<downloadstatus>");
      localStringBuffer.append(this.njk);
      localStringBuffer.append("</downloadstatus>");
      localStringBuffer.append("<staytotaltime>");
      localStringBuffer.append(this.njl);
      localStringBuffer.append("</staytotaltime>");
      if (this.njn > 0)
      {
        localStringBuffer.append("<masktotaltime>");
        localStringBuffer.append(this.njn);
        localStringBuffer.append("</masktotaltime>");
      }
      localObject = this.njt;
      if ((!this.njr) || (this.njt.size() <= 1)) {
        break label570;
      }
      locala = new a();
      i = 0;
      while (i < this.njt.size())
      {
        localObject = (a)this.njt.get(i);
        if (i == 0)
        {
          locala.nkr = ((a)localObject).nkr;
          locala.nks = ((a)localObject).nks;
          locala.nkt = ((a)localObject).nkt;
        }
        locala.nkp += ((a)localObject).nkp;
        int j = locala.nkq;
        locala.nkq = (((a)localObject).nkq + j);
        i += 1;
      }
    }
    Object localObject = new LinkedList();
    ((LinkedList)localObject).add(locala);
    label570:
    for (;;)
    {
      localStringBuffer.append(String.format("<playitemlist count=\"%d\">", new Object[] { Integer.valueOf(((LinkedList)localObject).size()) }));
      i = 0;
      while (i < ((LinkedList)localObject).size())
      {
        locala = (a)((LinkedList)localObject).get(i);
        localStringBuffer.append("<playitem>");
        localStringBuffer.append(String.format("<playcount>%d</playcount>", new Object[] { Integer.valueOf(locala.nkp) }));
        localStringBuffer.append(String.format("<playtotaltime>%d</playtotaltime>", new Object[] { Integer.valueOf(locala.nkq) }));
        localStringBuffer.append(String.format("<videototaltime>%d</videototaltime>", new Object[] { Integer.valueOf(locala.nkr * 1000) }));
        localStringBuffer.append(String.format("<playmode>%d</playmode>", new Object[] { Integer.valueOf(locala.nks) }));
        localStringBuffer.append(String.format("<playorientation>%d</playorientation>", new Object[] { Integer.valueOf(locala.nkt) }));
        localStringBuffer.append("</playitem>");
        i += 1;
      }
      localStringBuffer.append("</playitemlist>");
      localStringBuffer.append("</viewinfo>");
      localObject = localStringBuffer.toString();
      x.i(this.TAG, "xml " + (String)localObject);
      return (String)localObject;
    }
  }
  
  public final void bwO()
  {
    this.njo = 0;
    this.njp = 0;
    this.njq = 0;
    Iterator localIterator = this.njt.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      this.njo += locala.nko;
      this.njp += locala.nkp;
      int i = this.njq;
      this.njq = (locala.nkq + i);
    }
    if ((this.njs != null) && (!this.njt.contains(this.njs)))
    {
      this.njo += this.njs.nko;
      this.njp += this.njs.nkp;
      this.njq += this.njs.nkq;
    }
  }
  
  public final void onResume()
  {
    if (this.egO == 0L) {}
    long l;
    do
    {
      return;
      l = bi.bI(this.egO);
      this.egP += l;
      this.egO = 0L;
    } while (this.njs == null);
    a locala = this.njs;
    locala.nkv = (l + locala.nkv);
  }
  
  public final void wh(int paramInt)
  {
    a locala;
    if (this.njs.nkq <= 0)
    {
      locala = this.njs;
      if (this.njs.nku != 0L) {
        break label120;
      }
    }
    label120:
    for (int i = 0;; i = (int)bi.bI(this.njs.nku))
    {
      locala.nkq = i;
      if (paramInt != 0)
      {
        this.njs.nkr = paramInt;
        this.nju = paramInt;
      }
      x.i(this.TAG, "pushplayitem duration " + this.njs.nkq + " " + this.njs.nkt);
      this.njt.add(this.njs);
      this.njs = new a();
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/a/b/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */