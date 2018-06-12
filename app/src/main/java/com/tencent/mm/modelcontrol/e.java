package com.tencent.mm.modelcontrol;

import com.tencent.mm.sdk.platformtools.bi;

public final class e
{
  protected String dQE;
  protected int dQF;
  protected int dQG;
  protected int dQH;
  protected int dQI;
  protected boolean dQJ;
  protected f[] dQK;
  
  protected final boolean NY()
  {
    if (bi.oW(this.dQE)) {
      return true;
    }
    return b.lz(this.dQE);
  }
  
  protected final VideoTransPara NZ()
  {
    Object localObject2 = null;
    Object localObject1 = null;
    if (this.dQK != null)
    {
      f[] arrayOff = this.dQK;
      int j = arrayOff.length;
      int i = 0;
      for (;;)
      {
        localObject2 = localObject1;
        if (i >= j) {
          break;
        }
        f localf = arrayOff[i];
        localObject2 = localObject1;
        if (localf != null)
        {
          localObject2 = localObject1;
          if (localf.dQL <= 0)
          {
            localObject2 = localObject1;
            if (localf.dQM >= 0)
            {
              localObject2 = new VideoTransPara();
              ((VideoTransPara)localObject2).width = localf.dQN;
              ((VideoTransPara)localObject2).height = localf.dQO;
              ((VideoTransPara)localObject2).fps = localf.dQP;
              ((VideoTransPara)localObject2).videoBitrate = localf.dQQ;
              ((VideoTransPara)localObject2).dQG = this.dQG;
              ((VideoTransPara)localObject2).dQF = this.dQF;
              ((VideoTransPara)localObject2).dQH = this.dQH;
              ((VideoTransPara)localObject2).dQI = this.dQI;
            }
          }
        }
        i += 1;
        localObject1 = localObject2;
      }
    }
    return (VideoTransPara)localObject2;
  }
  
  protected final void a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    this.dQE = paramString1;
    this.dQF = bi.getInt(paramString2, 0);
    int i;
    if (this.dQF == 0)
    {
      i = 64000;
      this.dQF = i;
      this.dQG = bi.getInt(paramString3, 10);
      this.dQH = bi.getInt(paramString4, 2);
      this.dQI = bi.getInt(paramString5, 1);
      if (bi.getInt(paramString6, 0) <= 0) {
        break label93;
      }
    }
    label93:
    for (boolean bool = true;; bool = false)
    {
      this.dQJ = bool;
      return;
      i = this.dQF * 1000;
      break;
    }
  }
  
  public final String toString()
  {
    return "[ busyTime " + this.dQE + " audioBitrate " + this.dQF + " iFrame " + this.dQG + " profileIndex " + this.dQH + " presetIndex " + this.dQI + " isStepBr " + this.dQJ + " ]";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/modelcontrol/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */