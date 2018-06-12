package com.tencent.mm.protocal.c;

public final class aqv
  extends com.tencent.mm.bk.a
{
  public String hbL;
  public String hcS;
  public String rEJ;
  public String rqZ;
  public String rra;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.hbL != null) {
        paramVarArgs.g(1, this.hbL);
      }
      if (this.hcS != null) {
        paramVarArgs.g(2, this.hcS);
      }
      if (this.rqZ != null) {
        paramVarArgs.g(3, this.rqZ);
      }
      if (this.rra != null) {
        paramVarArgs.g(4, this.rra);
      }
      if (this.rEJ != null) {
        paramVarArgs.g(5, this.rEJ);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.hbL == null) {
        break label399;
      }
    }
    label399:
    for (int i = f.a.a.b.b.a.h(1, this.hbL) + 0;; i = 0)
    {
      paramInt = i;
      if (this.hcS != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.hcS);
      }
      i = paramInt;
      if (this.rqZ != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rqZ);
      }
      paramInt = i;
      if (this.rra != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rra);
      }
      i = paramInt;
      if (this.rEJ != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.rEJ);
      }
      return i;
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
        aqv localaqv = (aqv)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localaqv.hbL = locala.vHC.readString();
          return 0;
        case 2: 
          localaqv.hcS = locala.vHC.readString();
          return 0;
        case 3: 
          localaqv.rqZ = locala.vHC.readString();
          return 0;
        case 4: 
          localaqv.rra = locala.vHC.readString();
          return 0;
        }
        localaqv.rEJ = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/aqv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */