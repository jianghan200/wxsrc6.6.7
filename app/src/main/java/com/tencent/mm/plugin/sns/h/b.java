package com.tencent.mm.plugin.sns.h;

import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.protocal.c.bsu;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashSet;
import java.util.Iterator;

public final class b
{
  int cXZ;
  c cXu = new b.1(this);
  public int hpo = 0;
  public boolean nvB = false;
  public long nvC = -1L;
  public long nvD = 0L;
  public int nvE = 0;
  int nvF = 0;
  int nvG = 0;
  int nvH = 0;
  public int nvI = 0;
  public int nvJ = 0;
  int nvK = 0;
  public int nvL = 0;
  public int nvM = 0;
  int nvN = 0;
  public int nvO = 0;
  public int nvP = 0;
  public String nvQ = "";
  public String nvR = "";
  String nvS = "";
  int nvT;
  public int nvU = 0;
  public int nvV = 0;
  public int nvW = 0;
  public int nvX = 0;
  public int nvY = 0;
  public int nvZ = 0;
  long nwA = 0L;
  long nwB = 0L;
  long nwC = 0L;
  long nwD = 0L;
  long nwE = 0L;
  long nwF = 0L;
  long nwG = 0L;
  long nwH = 0L;
  long nwI = 0L;
  long nwJ = 0L;
  long nwK = 0L;
  long nwL = 0L;
  long nwM = 0L;
  long nwN = 0L;
  long nwO = 0L;
  long nwP = 0L;
  String nwQ;
  int nwR;
  long nwS = 0L;
  private long nwT = 0L;
  long nwU = 0L;
  private long nwV = 0L;
  private HashSet<String> nwW = new HashSet();
  HashSet<String> nwX = new HashSet();
  public HashSet<String> nwY = new HashSet();
  HashSet<String> nwZ = new HashSet();
  public int nwa = 0;
  public int nwb = 0;
  int nwc = 0;
  int nwd = 0;
  int nwe = 0;
  int nwf = 0;
  int nwg = 0;
  int nwh = 0;
  public int nwi = 0;
  public int nwj = 0;
  int nwk = 0;
  int nwl = 0;
  public long nwm = 0L;
  public long nwn = 0L;
  long nwo = 0L;
  long nwp = 0L;
  long nwq = 0L;
  long nwr = 0L;
  long nws = 0L;
  long nwt = 0L;
  long nwu = 0L;
  long nwv = 0L;
  long nww = 0L;
  long nwx = 0L;
  long nwy = 0L;
  long nwz = 0L;
  public HashSet<String> nxa = new HashSet();
  HashSet<String> nxb = new HashSet();
  HashSet<String> nxc = new HashSet();
  public HashSet<String> nxd = new HashSet();
  public HashSet<String> nxe = new HashSet();
  HashSet<String> nxf = new HashSet();
  public HashSet<String> nxg = new HashSet();
  private HashSet<String> nxh = new HashSet();
  public HashSet<String> nxi = new HashSet();
  public HashSet<String> nxj = new HashSet();
  public int nxk = Integer.MAX_VALUE;
  public int nxl = 0;
  public HashSet<String> nxm = new HashSet();
  public HashSet<String> nxn = new HashSet();
  public HashSet<String> nxo = new HashSet();
  public HashSet<String> nxp = new HashSet();
  public HashSet<String> nxq = new HashSet();
  public HashSet<String> nxr = new HashSet();
  public HashSet<String> nxs = new HashSet();
  public HashSet<String> nxt = new HashSet();
  public HashSet<String> nxu = new HashSet();
  public HashSet<String> nxv = new HashSet();
  public HashSet<String> nxw = new HashSet();
  public HashSet<String> nxx = new HashSet();
  public long nxy = 0L;
  
  public b()
  {
    a.sFg.b(this.cXu);
  }
  
  public b(int paramInt1, String paramString, int paramInt2)
  {
    this();
    this.cXZ = paramInt1;
    this.nwQ = paramString;
    this.nwR = paramInt2;
  }
  
  static String f(HashSet<String> paramHashSet)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    paramHashSet = paramHashSet.iterator();
    int i = 1;
    while (paramHashSet.hasNext())
    {
      String str = (String)paramHashSet.next();
      if (i != 0)
      {
        localStringBuffer.append(str);
        i = 0;
      }
      else
      {
        localStringBuffer.append("|" + str);
      }
    }
    return localStringBuffer.toString();
  }
  
  public final void a(n paramn, boolean paramBoolean)
  {
    if (paramn == null) {
      return;
    }
    if (paramBoolean) {
      this.nxb.add(i.g(paramn));
    }
    for (;;)
    {
      this.nxf.add(paramn.field_userName);
      this.nvH = this.nxf.size();
      if (!af.bxU().equals(paramn.field_userName)) {
        break;
      }
      hT(true);
      return;
      this.nxc.add(i.g(paramn));
    }
    hU(true);
  }
  
  public final void eE(String paramString1, String paramString2)
  {
    this.nwZ.add(paramString2);
    this.nxh.add(paramString1);
    this.nvK = this.nxh.size();
  }
  
  public final void hS(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.nwp = System.currentTimeMillis();
    }
    while (this.nwp <= 0L) {
      return;
    }
    this.nwo += System.currentTimeMillis() - this.nwp;
    this.nwp = 0L;
  }
  
  public final void hT(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.nwr = System.currentTimeMillis();
    }
    while (this.nwr <= 0L) {
      return;
    }
    this.nwq += System.currentTimeMillis() - this.nwr;
    this.nwr = 0L;
  }
  
  public final void hU(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.nwt = System.currentTimeMillis();
    }
    while (this.nwt <= 0L) {
      return;
    }
    this.nws += System.currentTimeMillis() - this.nwt;
    this.nwt = 0L;
  }
  
  public final void hV(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.nwv = System.currentTimeMillis();
    }
    while (this.nwv <= 0L) {
      return;
    }
    this.nwu += System.currentTimeMillis() - this.nwv;
    this.nwv = 0L;
  }
  
  public final void hW(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.nwx = System.currentTimeMillis();
    }
    while (this.nwx <= 0L) {
      return;
    }
    this.nww += System.currentTimeMillis() - this.nwx;
    this.nwx = 0L;
  }
  
  public final void hX(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.nwz = System.currentTimeMillis();
    }
    while (this.nwz <= 0L) {
      return;
    }
    this.nwy += System.currentTimeMillis() - this.nwz;
    this.nwz = 0L;
  }
  
  public final void hY(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.nwT = System.currentTimeMillis();
    }
    while (this.nwT <= 0L) {
      return;
    }
    this.nwS += System.currentTimeMillis() - this.nwT;
    this.nwT = 0L;
  }
  
  public final void hZ(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.nwV = System.currentTimeMillis();
    }
    while (this.nwV <= 0L) {
      return;
    }
    this.nwU += System.currentTimeMillis() - this.nwV;
    this.nwV = 0L;
  }
  
  public final void ia(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.nwB = System.currentTimeMillis();
    }
    while (this.nwB <= 0L) {
      return;
    }
    this.nwA += System.currentTimeMillis() - this.nwB;
    this.nwB = 0L;
  }
  
  public final void ib(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.nwD = System.currentTimeMillis();
    }
    while (this.nwD <= 0L) {
      return;
    }
    this.nwC += System.currentTimeMillis() - this.nwD;
    this.nwD = 0L;
  }
  
  public final void ic(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.nwF = System.currentTimeMillis();
    }
    while (this.nwF <= 0L) {
      return;
    }
    this.nwE += System.currentTimeMillis() - this.nwF;
    this.nwF = 0L;
  }
  
  public final void id(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.nwH = System.currentTimeMillis();
    }
    while (this.nwH <= 0L) {
      return;
    }
    this.nwG += System.currentTimeMillis() - this.nwH;
    this.nwH = 0L;
  }
  
  public final void ie(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.nwL = System.currentTimeMillis();
    }
    while (this.nwL <= 0L) {
      return;
    }
    this.nwK += System.currentTimeMillis() - this.nwL;
    this.nwL = 0L;
  }
  
  public final void jdMethod_if(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.nwN = System.currentTimeMillis();
    }
    while (this.nwN <= 0L) {
      return;
    }
    this.nwM += System.currentTimeMillis() - this.nwN;
    this.nwN = 0L;
  }
  
  public final void ig(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.nwP = System.currentTimeMillis();
    }
    while (this.nwP <= 0L) {
      return;
    }
    this.nwO += System.currentTimeMillis() - this.nwP;
    this.nwP = 0L;
  }
  
  public final void ih(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i = 1;; i = 0)
    {
      this.nvT = i;
      return;
    }
  }
  
  public final void u(n paramn)
  {
    if (paramn == null) {
      return;
    }
    this.nwW.add(paramn.bBe());
    this.nvF = this.nwW.size();
  }
  
  public final void v(n paramn)
  {
    if (paramn == null) {}
    do
    {
      String str1;
      String str2;
      do
      {
        return;
        str1 = paramn.bBe();
        str2 = i.g(paramn);
      } while (this.nwX.contains(str2));
      x.i("MicroMsg.SnsBrowseInfoHelper", "onClickFeed localId:Td, snsId:%s", new Object[] { str1, str2 });
      this.nvG += 1;
      this.nwX.add(str2);
      if (paramn.xb(32)) {
        this.nwl += 1;
      }
      switch (paramn.field_type)
      {
      }
      for (;;)
      {
        if (!paramn.xb(32)) {
          break label313;
        }
        if ((paramn.bAF() == null) || (!paramn.bAF().bzm())) {
          break;
        }
        hY(true);
        return;
        this.nwe += 1;
        continue;
        this.nwg += 1;
        continue;
        this.nwf += 1;
        continue;
        this.nwh += 1;
        continue;
        this.nwk += 1;
        continue;
        if (!bi.oW(paramn.bAJ().sqd)) {
          this.nwc += 1;
        } else {
          this.nwd += 1;
        }
      }
      if (paramn.field_type == 1)
      {
        id(true);
        return;
      }
    } while (paramn.field_type != 15);
    ie(true);
    return;
    label313:
    if ((paramn.bAJ() != null) && (!bi.oW(paramn.bAJ().ogR)))
    {
      hZ(true);
      return;
    }
    switch (paramn.field_type)
    {
    default: 
      return;
    case 1: 
      hX(true);
      return;
    case 4: 
      ic(true);
      return;
    case 15: 
      ia(true);
      return;
    case 5: 
      ic(true);
      return;
    case 18: 
      ig(true);
      return;
    }
    if (!bi.oW(paramn.bAJ().sqd))
    {
      ib(true);
      return;
    }
    ic(true);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/sns/h/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */