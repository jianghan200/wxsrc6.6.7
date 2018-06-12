package com.tencent.mm.protocal.c;

public final class gt
  extends com.tencent.mm.bk.a
{
  public int rgY;
  public int rgZ;
  public int rgt;
  public int rha;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.rgt);
      paramVarArgs.fT(2, this.rgY);
      paramVarArgs.fT(3, this.rgZ);
      paramVarArgs.fT(4, this.rha);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.fQ(1, this.rgt) + 0 + f.a.a.a.fQ(2, this.rgY) + f.a.a.a.fQ(3, this.rgZ) + f.a.a.a.fQ(4, this.rha);
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
      gt localgt = (gt)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localgt.rgt = locala.vHC.rY();
        return 0;
      case 2: 
        localgt.rgY = locala.vHC.rY();
        return 0;
      case 3: 
        localgt.rgZ = locala.vHC.rY();
        return 0;
      }
      localgt.rha = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/gt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */