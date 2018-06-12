package com.tencent.mm.protocal.c;

public final class kk
  extends com.tencent.mm.bk.a
{
  public String rgp;
  public String rmD;
  public int rmE;
  public String rmF;
  public String rmG;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rmD != null) {
        paramVarArgs.g(1, this.rmD);
      }
      paramVarArgs.fT(2, this.rmE);
      if (this.rmF != null) {
        paramVarArgs.g(3, this.rmF);
      }
      if (this.rgp != null) {
        paramVarArgs.g(4, this.rgp);
      }
      if (this.rmG != null) {
        paramVarArgs.g(5, this.rmG);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.rmD == null) {
        break label383;
      }
    }
    label383:
    for (paramInt = f.a.a.b.b.a.h(1, this.rmD) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.rmE);
      paramInt = i;
      if (this.rmF != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.rmF);
      }
      i = paramInt;
      if (this.rgp != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.rgp);
      }
      paramInt = i;
      if (this.rmG != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.rmG);
      }
      return paramInt;
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
        kk localkk = (kk)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localkk.rmD = locala.vHC.readString();
          return 0;
        case 2: 
          localkk.rmE = locala.vHC.rY();
          return 0;
        case 3: 
          localkk.rmF = locala.vHC.readString();
          return 0;
        case 4: 
          localkk.rgp = locala.vHC.readString();
          return 0;
        }
        localkk.rmG = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/kk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */