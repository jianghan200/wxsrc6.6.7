package com.tencent.mm.protocal.c;

public final class asw
  extends com.tencent.mm.bk.a
{
  public String bIQ;
  public int bMF;
  public String bssid;
  public int jie;
  public int rVe;
  public String rVf;
  public String ssid;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.ssid != null) {
        paramVarArgs.g(1, this.ssid);
      }
      if (this.bssid != null) {
        paramVarArgs.g(2, this.bssid);
      }
      paramVarArgs.fT(3, this.bMF);
      paramVarArgs.fT(4, this.rVe);
      if (this.rVf != null) {
        paramVarArgs.g(5, this.rVf);
      }
      if (this.bIQ != null) {
        paramVarArgs.g(6, this.bIQ);
      }
      paramVarArgs.fT(7, this.jie);
      return 0;
    }
    if (paramInt == 1) {
      if (this.ssid == null) {
        break label461;
      }
    }
    label461:
    for (paramInt = f.a.a.b.b.a.h(1, this.ssid) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.bssid != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.bssid);
      }
      i = i + f.a.a.a.fQ(3, this.bMF) + f.a.a.a.fQ(4, this.rVe);
      paramInt = i;
      if (this.rVf != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.rVf);
      }
      i = paramInt;
      if (this.bIQ != null) {
        i = paramInt + f.a.a.b.b.a.h(6, this.bIQ);
      }
      return i + f.a.a.a.fQ(7, this.jie);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        asw localasw = (asw)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localasw.ssid = locala.vHC.readString();
          return 0;
        case 2: 
          localasw.bssid = locala.vHC.readString();
          return 0;
        case 3: 
          localasw.bMF = locala.vHC.rY();
          return 0;
        case 4: 
          localasw.rVe = locala.vHC.rY();
          return 0;
        case 5: 
          localasw.rVf = locala.vHC.readString();
          return 0;
        case 6: 
          localasw.bIQ = locala.vHC.readString();
          return 0;
        }
        localasw.jie = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/asw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */