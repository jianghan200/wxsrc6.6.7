package com.tencent.mm.protocal.c;

public final class byo
  extends com.tencent.mm.bk.a
{
  public int rdY;
  public int rdZ;
  public int rea;
  public int reb;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.rdY);
      paramVarArgs.fT(2, this.rdZ);
      paramVarArgs.fT(3, this.rea);
      paramVarArgs.fT(4, this.reb);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.fQ(1, this.rdY) + 0 + f.a.a.a.fQ(2, this.rdZ) + f.a.a.a.fQ(3, this.rea) + f.a.a.a.fQ(4, this.reb);
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
      byo localbyo = (byo)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localbyo.rdY = locala.vHC.rY();
        return 0;
      case 2: 
        localbyo.rdZ = locala.vHC.rY();
        return 0;
      case 3: 
        localbyo.rea = locala.vHC.rY();
        return 0;
      }
      localbyo.reb = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/protocal/c/byo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */