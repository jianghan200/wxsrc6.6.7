package com.tencent.mm.protocal.c;

public final class kf
  extends com.tencent.mm.bk.a
{
  public int rlR;
  public int rlS;
  public int rlT;
  public int rlU;
  public int rlV;
  public int rlW;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.rlR);
      paramVarArgs.fT(2, this.rlS);
      paramVarArgs.fT(3, this.rlT);
      paramVarArgs.fT(4, this.rlU);
      paramVarArgs.fT(5, this.rlV);
      paramVarArgs.fT(6, this.rlW);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.fQ(1, this.rlR) + 0 + f.a.a.a.fQ(2, this.rlS) + f.a.a.a.fQ(3, this.rlT) + f.a.a.a.fQ(4, this.rlU) + f.a.a.a.fQ(5, this.rlV) + f.a.a.a.fQ(6, this.rlW);
    }
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
      kf localkf = (kf)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localkf.rlR = locala.vHC.rY();
        return 0;
      case 2: 
        localkf.rlS = locala.vHC.rY();
        return 0;
      case 3: 
        localkf.rlT = locala.vHC.rY();
        return 0;
      case 4: 
        localkf.rlU = locala.vHC.rY();
        return 0;
      case 5: 
        localkf.rlV = locala.vHC.rY();
        return 0;
      }
      localkf.rlW = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/kf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */