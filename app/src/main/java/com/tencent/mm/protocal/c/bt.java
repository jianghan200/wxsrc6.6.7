package com.tencent.mm.protocal.c;

public final class bt
  extends com.tencent.mm.bk.a
{
  public int hcE;
  public int rbY;
  public int rbZ;
  public int rca;
  public int rcb;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.rbY);
      paramVarArgs.fT(2, this.hcE);
      paramVarArgs.fT(3, this.rbZ);
      paramVarArgs.fT(4, this.rca);
      paramVarArgs.fT(5, this.rcb);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.fQ(1, this.rbY) + 0 + f.a.a.a.fQ(2, this.hcE) + f.a.a.a.fQ(3, this.rbZ) + f.a.a.a.fQ(4, this.rca) + f.a.a.a.fQ(5, this.rcb);
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
      bt localbt = (bt)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localbt.rbY = locala.vHC.rY();
        return 0;
      case 2: 
        localbt.hcE = locala.vHC.rY();
        return 0;
      case 3: 
        localbt.rbZ = locala.vHC.rY();
        return 0;
      case 4: 
        localbt.rca = locala.vHC.rY();
        return 0;
      }
      localbt.rcb = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/bt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */