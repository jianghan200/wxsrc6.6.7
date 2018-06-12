package com.tencent.mm.protocal.c;

public final class zc
  extends com.tencent.mm.bk.a
{
  public int hcE;
  public String jQb;
  public int rFj;
  public int rcV;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.jQb != null) {
        paramVarArgs.g(1, this.jQb);
      }
      paramVarArgs.fT(2, this.hcE);
      paramVarArgs.fT(3, this.rcV);
      paramVarArgs.fT(4, this.rFj);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jQb == null) {
        break label284;
      }
    }
    label284:
    for (paramInt = f.a.a.b.b.a.h(1, this.jQb) + 0;; paramInt = 0)
    {
      return paramInt + f.a.a.a.fQ(2, this.hcE) + f.a.a.a.fQ(3, this.rcV) + f.a.a.a.fQ(4, this.rFj);
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
        zc localzc = (zc)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localzc.jQb = locala.vHC.readString();
          return 0;
        case 2: 
          localzc.hcE = locala.vHC.rY();
          return 0;
        case 3: 
          localzc.rcV = locala.vHC.rY();
          return 0;
        }
        localzc.rFj = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/zc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */