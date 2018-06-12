package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent;

import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class s
  implements Serializable
{
  public int bID;
  public float height;
  public String nAW;
  public int nAX;
  public float nAY;
  public float nAZ;
  public float nBa;
  public float nBb;
  public float nBc = -2.0F;
  public float nBd = -2.0F;
  public boolean nBe;
  public String nBf = "";
  public int nBg;
  public int nBh;
  public boolean nBi;
  public boolean nBj;
  public int nBk;
  public boolean nBl;
  public int nBm;
  public String ntU;
  public int type;
  public String uin;
  public float width;
  
  public final void MV(String paramString)
  {
    this.ntU = paramString;
    Iterator localIterator = bzF().iterator();
    while (localIterator.hasNext()) {
      ((s)localIterator.next()).MV(paramString);
    }
  }
  
  public final void MW(String paramString)
  {
    this.uin = paramString;
    Iterator localIterator = bzF().iterator();
    while (localIterator.hasNext()) {
      ((s)localIterator.next()).MW(paramString);
    }
  }
  
  protected List<s> bzF()
  {
    return Collections.emptyList();
  }
  
  public final void ii(boolean paramBoolean)
  {
    this.nBl = paramBoolean;
    Iterator localIterator = bzF().iterator();
    while (localIterator.hasNext()) {
      ((s)localIterator.next()).ii(paramBoolean);
    }
  }
  
  public final void wL(int paramInt)
  {
    this.nBk = paramInt;
    Iterator localIterator = bzF().iterator();
    while (localIterator.hasNext()) {
      ((s)localIterator.next()).wL(paramInt);
    }
  }
  
  public final void wM(int paramInt)
  {
    this.nBm = paramInt;
    Iterator localIterator = bzF().iterator();
    while (localIterator.hasNext()) {
      ((s)localIterator.next()).wM(paramInt);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */