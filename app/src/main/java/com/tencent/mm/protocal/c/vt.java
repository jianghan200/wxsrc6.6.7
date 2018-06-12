package com.tencent.mm.protocal.c;

public final class vt
  extends com.tencent.mm.bk.a
{
  public String hbL;
  public String hcS;
  public int hcd;
  public String rwN;
  public String ryZ;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.hbL != null) {
        paramVarArgs.g(1, this.hbL);
      }
      if (this.ryZ != null) {
        paramVarArgs.g(2, this.ryZ);
      }
      if (this.hcS != null) {
        paramVarArgs.g(3, this.hcS);
      }
      if (this.rwN != null) {
        paramVarArgs.g(4, this.rwN);
      }
      paramVarArgs.fT(5, this.hcd);
      return 0;
    }
    if (paramInt == 1) {
      if (this.hbL == null) {
        break label379;
      }
    }
    label379:
    for (int i = f.a.a.b.b.a.h(1, this.hbL) + 0;; i = 0)
    {
      paramInt = i;
      if (this.ryZ != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.ryZ);
      }
      i = paramInt;
      if (this.hcS != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.hcS);
      }
      paramInt = i;
      if (this.rwN != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rwN);
      }
      return paramInt + f.a.a.a.fQ(5, this.hcd);
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
        vt localvt = (vt)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localvt.hbL = locala.vHC.readString();
          return 0;
        case 2: 
          localvt.ryZ = locala.vHC.readString();
          return 0;
        case 3: 
          localvt.hcS = locala.vHC.readString();
          return 0;
        case 4: 
          localvt.rwN = locala.vHC.readString();
          return 0;
        }
        localvt.hcd = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/vt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */