package com.tencent.mm.protocal.c;

public final class bqr
  extends com.tencent.mm.bk.a
{
  public String appName;
  public int blZ;
  public String soN;
  public boolean soO;
  public boolean soP;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.soN != null) {
        paramVarArgs.g(1, this.soN);
      }
      if (this.appName != null) {
        paramVarArgs.g(2, this.appName);
      }
      paramVarArgs.fT(3, this.blZ);
      paramVarArgs.av(4, this.soO);
      paramVarArgs.av(5, this.soP);
      return 0;
    }
    if (paramInt == 1) {
      if (this.soN == null) {
        break label333;
      }
    }
    label333:
    for (paramInt = f.a.a.b.b.a.h(1, this.soN) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.appName != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.appName);
      }
      return i + f.a.a.a.fQ(3, this.blZ) + (f.a.a.b.b.a.ec(4) + 1) + (f.a.a.b.b.a.ec(5) + 1);
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
        bqr localbqr = (bqr)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localbqr.soN = locala.vHC.readString();
          return 0;
        case 2: 
          localbqr.appName = locala.vHC.readString();
          return 0;
        case 3: 
          localbqr.blZ = locala.vHC.rY();
          return 0;
        case 4: 
          localbqr.soO = locala.cJQ();
          return 0;
        }
        localbqr.soP = locala.cJQ();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/bqr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */