package com.tencent.mm.protocal.c;

public final class aqj
  extends com.tencent.mm.bk.a
{
  public int qZk;
  public String rMD;
  public String rSK;
  public boolean rSL;
  public String rSM;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    int i;
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.qZk);
      if (this.rSK != null) {
        paramVarArgs.g(2, this.rSK);
      }
      paramVarArgs.av(3, this.rSL);
      if (this.rSM != null) {
        paramVarArgs.g(4, this.rSM);
      }
      if (this.rMD != null) {
        paramVarArgs.g(5, this.rMD);
      }
      i = 0;
    }
    do
    {
      return i;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.fQ(1, this.qZk) + 0;
      paramInt = i;
      if (this.rSK != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rSK);
      }
      i = paramInt + (f.a.a.b.b.a.ec(3) + 1);
      paramInt = i;
      if (this.rSM != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rSM);
      }
      i = paramInt;
    } while (this.rMD == null);
    return paramInt + f.a.a.b.b.a.h(5, this.rMD);
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      return 0;
    }
    if (paramInt == 3)
    {
      f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
      aqj localaqj = (aqj)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localaqj.qZk = locala.vHC.rY();
        return 0;
      case 2: 
        localaqj.rSK = locala.vHC.readString();
        return 0;
      case 3: 
        localaqj.rSL = locala.cJQ();
        return 0;
      case 4: 
        localaqj.rSM = locala.vHC.readString();
        return 0;
      }
      localaqj.rMD = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/aqj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */